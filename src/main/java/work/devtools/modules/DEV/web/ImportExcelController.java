package work.devtools.modules.DEV.web;

import lombok.extern.slf4j.Slf4j;
import org.apache.poi.hssf.usermodel.HSSFRow;
import org.apache.poi.hssf.usermodel.HSSFSheet;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.poifs.filesystem.POIFSFileSystem;
import org.apache.poi.ss.usermodel.Row;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import work.devtools.common.utils.JdbcUtil;
import work.devtools.common.utils.LoadExcelUtil;
import work.devtools.common.utils.StringUtil;
import work.devtools.common.utils.poi.ExportExcel;
import work.devtools.common.utils.poi.ImportExcel;
import work.devtools.modules.DEV.pojo.dto.Dev_dbtable;
import work.devtools.modules.DEV.service.GenerateService;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.net.URLEncoder;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc:
 * @create: 2019-04-22
 **/
@RestController
@RequestMapping("/import")
@Slf4j
public class ImportExcelController {

    @Autowired
    private GenerateService generateService;




    /**
     * 导入CreateSQL
     * @param inputFile
     * @return
     */
    @RequestMapping("/import_createSql")
    public String importCreateSql(MultipartFile inputFile) throws SQLException, IOException {
        //获取Excel数据
        String createSql = excelToData(inputFile);
        //执行SQL 生成表
        executeSQL(createSql);
        return "success to import";
    }



    private String excelToData(MultipartFile inputFile) throws IOException {
        // 解析excal表
        POIFSFileSystem fs = new POIFSFileSystem(inputFile.getInputStream());
        HSSFWorkbook workbook = new HSSFWorkbook(fs);
        //第一个Sheet
        HSSFSheet sheet = workbook.getSheetAt(0);
        int totalRow = sheet.getLastRowNum();
        //表
        String table = String.valueOf(sheet.getRow(0).getCell(1)==null? "" : sheet.getRow(0).getCell(1));
        //表名
        String tableName = String.valueOf(sheet.getRow(1).getCell(1)==null? "" : sheet.getRow(0).getCell(1));
        //归属模块
        String module = String.valueOf(sheet.getRow(2).getCell(1)==null? "" : sheet.getRow(0).getCell(1));
        //国际化
        String lang = String.valueOf(sheet.getRow(3).getCell(1)==null? "" : sheet.getRow(0).getCell(1));
        //备注
        String tableRemark = String.valueOf(sheet.getRow(4).getCell(1)==null? "" : sheet.getRow(0).getCell(1));
        String createTable = String.valueOf(sheet.getRow(7).getCell(0));
        StringBuilder sb = new StringBuilder();
        sb.append(createTable);
        for (int i = 8; i < totalRow-3; i++) {
            HSSFRow row = sheet.getRow(i);
            if(null == row){
                break;
            }

            if (null == row.getCell(0) || StringUtil.isBlank(row.getCell(0).getStringCellValue())) {
                //TODO  抛出具体的报错信息给前端
                break;
            }
            if(null == row.getCell(1) || StringUtil.isBlank(row.getCell(1).getStringCellValue())){
                //TODO 抛出报错信息给前端
                break;
            }
            //字段
            String field = String.valueOf(row.getCell(0));
            //字段类型
            String fieldType = String.valueOf(row.getCell(1));
            //字段长度  TODO ：StringUtil.isBlank(row.getCell(2).getStringCellValue())的判断
            String fieldLength = String.valueOf(row.getCell(2)==null? "": row.getCell(2));
            String fieldLenStr = "";
            if(StringUtil.isNotBlank(fieldLength)){
                if(fieldLength.indexOf(".")>0){
                    fieldLenStr = "("+Integer.valueOf(fieldLength.substring(0,fieldLength.indexOf(".")))+")";
                }

            }
            String nullFlag = String.valueOf(row.getCell(4)==null? "": row.getCell(4));
            String defaultValue = String.valueOf(row.getCell(5)==null? "": row.getCell(5));
            //备注
            String remark = String.valueOf(row.getCell(6)==null? "": row.getCell(6));
            if(StringUtil.isBlank(defaultValue)){
                defaultValue = "";
            }else{
                defaultValue = " default '"+defaultValue+"' ";
            }
            if(StringUtil.isBlank(remark)){
                remark = "";
            }else{
                remark = " comment '"+remark+"'";
            }
            sb.append(field + " " + fieldType + fieldLenStr+" "+nullFlag+" "+defaultValue + remark+",");
        }
        //最后三行是
        //索引信息
        String indeStr = String.valueOf(sheet.getRow(totalRow-2).getCell(0)==null? "" : sheet.getRow(totalRow-2).getCell(0));
        //唯一索引
        String uniqueStr = String.valueOf(sheet.getRow(totalRow-1).getCell(0)==null? "" : sheet.getRow(totalRow-1).getCell(0));
        //授权信息
        String engineStr = String.valueOf(sheet.getRow(totalRow).getCell(0)==null? "" : sheet.getRow(totalRow).getCell(0));
        sb.append(indeStr+" "+uniqueStr+" "+engineStr);
        log.info("createSql:============: "+sb.toString());
        return sb.toString();

    }


    private void executeSQL(String createSql) throws SQLException {
        int i = JdbcUtil.executeSql(createSql);
    }

    //查询导入的SQL

    //点击执行按钮执行导入的SQL  po dao 的生成

    /**
     * 生成代码
     * @param table
     * @return
     */
    @GetMapping("/generaterCode/{table}")
    public  String  generaterCode(@PathVariable("table") String table){
        generateService.generateCode(table);
        return "success to generate!";
    }

    /**
     * 导入AlterSQL
     * @param inputFile
     * @return
     */
    @RequestMapping("/import_alterSql")
    public String importAlterSql(MultipartFile inputFile) throws IOException, SQLException {

        //获取Excel数据 TODO 
        String createSql = excelToData(inputFile);
        //执行SQL 生成表
        executeSQL(createSql);
        return "success to import";
    }

    /**
     * 下载模板
     * @return
     */
    @RequestMapping("/downloadExcel")
    public  String downloadExcel(HttpServletResponse response,HttpServletRequest request) throws IOException {
        String filePath = getClass().getResource("/templates/excel/createSql-template.xls").getPath();
        InputStream bis = new BufferedInputStream(new FileInputStream(new File(filePath)));

        String filename = "table-create sql模板.xls";
        filename = URLEncoder.encode(filename, "UTF-8");
        //设置文件下载头
        response.addHeader("Content-Disposition", "attachment;filename=" + filename);
        //设置文件ContentType类型，这样设置，会自动判断下载文件类型
        response.setContentType("multipart/form-data");
        BufferedOutputStream out = new BufferedOutputStream(response.getOutputStream());
        int len = 0;
        while ((len = bis.read()) != -1) {
            out.write(len);
            out.flush();
        }
        out.close();
        return "succcess to download module!";
    }


    /**
     * 导出数据
     * @param table
     * @param response
     * @return
     */
    @RequestMapping("/export/{table}")
    public String exportExcel(@PathVariable("table") String table, HttpServletResponse response){
        OutputStream outStream = null;
        //TODO 文件名称规则：
        String fileName = "";

        try {
            List<Map<String,String>> list = generateService.findTableInfo(table);
            if(table ==  null){
                //TODO 抛出异常
                throw new Exception("table名称不能为空！");
            }else{
                fileName = table +"-sql.xls";
                fileName = java.net.URLEncoder.encode(fileName, "UTF-8");
            }
            LoadExcelUtil loadExcelUtil = new LoadExcelUtil(list);
            response.setHeader("Content-disposition",
                    "attachment;filename=" + fileName);
            //导出数据
            loadExcelUtil.exportExcel(response.getOutputStream());

        } catch (Exception e) {
            log.error(e.getMessage(), e);
        } finally {
            if (outStream != null) {
                try {
                    outStream.flush();
                    outStream.close();
                } catch (IOException e) {
                    log.error(e.getMessage(), e);
                }
            }
        }
        return "success to download data";

    }

    /**
     * 导出测试
     * @param table
     * @param response
     * @return
     */
    @RequestMapping("/exportTest/{table}")
    public String exportTest(@PathVariable("table") String table, HttpServletResponse response) throws IOException {
        List<String> headerList = new ArrayList<>();
        String fileName = URLEncoder.encode("测试表.xlsx", "utf-8");
        try {
            List<Map<String,String>> list = generateService.findTableInfo(table);
            ExportExcel exportExcel = new ExportExcel("", headerList);
            //将Java数据塞入表格中
            for(int i=0; i<list.size();i++){
                Map<String, String> map = list.get(i);
                Row row = exportExcel.addRow();
                exportExcel.addCell(row,0,map.get("dbtable01"));
                exportExcel.addCell(row,1,map.get("dbtable02"));
                exportExcel.addCell(row,2,map.get("dbtable03"));
                exportExcel.addCell(row,3,map.get("dbtable04"));
                exportExcel.addCell(row,4,map.get("dbtable05"));
                exportExcel.addCell(row,5,map.get("dbtable06"));

                exportExcel.addCell(row,6,map.get("dbtable07"));
                exportExcel.addCell(row,7,map.get("dbfield02"));
                exportExcel.addCell(row,8,map.get("dbfield03"));
                exportExcel.addCell(row,8,map.get("dbfield04"));
                exportExcel.addCell(row,8,map.get("dbfield05"));
                exportExcel.addCell(row,8,map.get("dbfield06"));
                exportExcel.addCell(row,8,map.get("dbfield07"));

            }
            exportExcel.write(response,fileName);
        }catch (Exception e){
            e.printStackTrace();
            log.error("导出错误");
        }

        return "success to export!";
    }

    /**
     * 导入测试
     * @param file
     * @return
     * @throws Exception
     */
    @RequestMapping("/importTest")
    public String importTest(MultipartFile file) throws Exception {
        Map<String,Object> map = new HashMap<>();
        int successNum = 0;
        int failureNum = 0;
        int totalNum = 0;
        StringBuilder failureMsg = new StringBuilder();
        ImportExcel importExcel = new ImportExcel(file, 1, 0);
        //重写getDataList  根据表格excel里面的内容格式获取，然后将表格数据转换为Java数据
        List<Dev_dbtable> dataList = new ArrayList<>();
        //获取excel里面的数据转化为Java类型的数据
        for (int i = importExcel.getDataRowNum(); i < importExcel.getLastDataRowNum(); i++) {
            Row row = importExcel.getRow(i);
            Dev_dbtable dbtable = new Dev_dbtable();
            dbtable.setDbtable01(String.valueOf(importExcel.getCellValue(row, 0)));
            dbtable.setDbtable02(String.valueOf(importExcel.getCellValue(row, 1)));
            dbtable.setDbtable03(String.valueOf(importExcel.getCellValue(row, 2)));
            dbtable.setDbtable04(String.valueOf(importExcel.getCellValue(row, 3)));
            dataList.add(dbtable);
        }
        //TODO 数据校验 BeanValidators ,得到错误信息
        // TODO 保存这些数据到数据库

        return "success to import! ";
    }




}
