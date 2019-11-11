package work.devtools.common.utils.poi;

import com.alibaba.fastjson.JSON;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.web.multipart.MultipartFile;
import work.devtools.modules.DEV.pojo.dto.Dev_dbtable;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.List;

/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 导入Excel  支持 *.XLS 格式和 *.XLSX 格式
 * @create: 2019-04-27
 **/
@Slf4j
public class ImportExcel<T> {
	

	/**
	 * 工作薄对象
	 */
	private Workbook wb;
	
	/**
	 * 工作表对象
	 */
	private Sheet sheet;
	
	/**
	 * 标题行号
	 */
	private int headerNum;
	
	/**
	 * 构造函数
	 * @param headerNum 标题行号，数据行号=标题行号+1
	 * @throws InvalidFormatException
	 * @throws IOException 
	 */
	public ImportExcel(String fileName, int headerNum) throws Exception {
		this(new File(fileName), headerNum);
	}
	
	/**
	 * 构造函数
	 * @param headerNum 标题行号，数据行号=标题行号+1
	 * @throws InvalidFormatException
	 * @throws IOException 
	 */
	public ImportExcel(File file, int headerNum) throws Exception {
		this(file, headerNum, 0);
	}

	/**
	 * 构造函数
	 * @param headerNum 标题行号，数据行号=标题行号+1
	 * @param sheetIndex 工作表编号
	 * @throws InvalidFormatException
	 * @throws IOException 
	 */
	public ImportExcel(String fileName, int headerNum, int sheetIndex) throws Exception {
		this(new File(fileName), headerNum, sheetIndex);
	}
	
	/**
	 * 构造函数
	 * @param headerNum 标题行号，数据行号=标题行号+1
	 * @param sheetIndex 工作表编号
	 * @throws InvalidFormatException
	 * @throws IOException 
	 */
	public ImportExcel(File file, int headerNum, int sheetIndex) throws Exception {
		this(file.getName(), new FileInputStream(file), headerNum, sheetIndex);
	}
	
	/**
	 * 构造函数
	 * @param headerNum 标题行号，数据行号=标题行号+1
	 * @param sheetIndex 工作表编号
	 * @throws InvalidFormatException
	 * @throws IOException 
	 */
	public ImportExcel(MultipartFile multipartFile, int headerNum, int sheetIndex) throws Exception {
		this(multipartFile.getOriginalFilename(), multipartFile.getInputStream(), headerNum, sheetIndex);
	}

	/**
	 * 构造函数
	 * @param headerNum 标题行号，数据行号=标题行号+1
	 * @param sheetIndex 工作表编号
	 * @throws InvalidFormatException
	 * @throws IOException 
	 */
	public ImportExcel(String fileName, InputStream is, int headerNum, int sheetIndex) throws Exception {
		if (StringUtils.isBlank(fileName)){
			throw new Exception("导入文档为空!");
		}else if(fileName.toLowerCase().endsWith("xls")){    
			this.wb = new HSSFWorkbook(is);
        }else if(fileName.toLowerCase().endsWith("xlsx")){  
        	this.wb = new XSSFWorkbook(is);
        }else{  
        	throw new Exception("文档格式不正确!");
        }  
		if (this.wb.getNumberOfSheets()<sheetIndex){
			throw new Exception("文档中没有工作表!");
		}
		this.sheet = this.wb.getSheetAt(sheetIndex);
		this.headerNum = headerNum;
		log.debug("Initialize success.");
	}
	
	/**
	 * 获取行对象
	 * @param rownum
	 * @return
	 */
	public Row getRow(int rownum){
		return this.sheet.getRow(rownum);
	}

	/**
	 * 获取数据行号
	 * @return
	 */
	public int getDataRowNum(){
		return headerNum+1;
	}
	
	/**
	 * 获取最后一个数据行号
	 * @return
	 */
	public int getLastDataRowNum(){
		return this.sheet.getLastRowNum()+headerNum;
	}
	
	/**
	 * 获取最后一个列号
	 * @return
	 */
	public int getLastCellNum(){
		return this.getRow(headerNum).getLastCellNum();
	}
	
	/**
	 * 获取单元格值
	 * @param row 获取的行
	 * @param column 获取单元格列号
	 * @return 单元格值
	 */
	public Object getCellValue(Row row, int column){
		Object val = "";
		try{
			Cell cell = row.getCell(column);
			if (cell != null){
				if (cell.getCellType() == Cell.CELL_TYPE_NUMERIC){
					val = cell.getNumericCellValue();
				}else if (cell.getCellType() == Cell.CELL_TYPE_STRING){
					val = cell.getStringCellValue();
				}else if (cell.getCellType() == Cell.CELL_TYPE_FORMULA){
					val = cell.getCellFormula();
				}else if (cell.getCellType() == Cell.CELL_TYPE_BOOLEAN){
					val = cell.getBooleanCellValue();
				}else if (cell.getCellType() == Cell.CELL_TYPE_ERROR){
					val = cell.getErrorCellValue();
				}
			}
		}catch (Exception e) {
			return val;
		}
		return val;
	}
	
	/**
	 * 获取导入数据列表
	 */
	public List<T> getDataList(){
		List<T> dataList = new ArrayList<T>();
		for (int i = this.getDataRowNum(); i < this.getLastDataRowNum(); i++) {
			Row row = this.getRow(i);
			//TODO
			//dataList.add();
		}
		return dataList;
	}

	/**
	 * 导入测试
	 */
	public static void main(String[] args) throws Throwable {

		String filePath = "target/import.xlsx";
		FileInputStream in = new FileInputStream(filePath);
		XSSFWorkbook wb = new XSSFWorkbook(in);
		System.out.println("sheet个数："+wb.getNumberOfSheets());
		System.out.println("sheet名字："+wb.getSheetName(0));
		ImportExcel importExcel = new ImportExcel(filePath, 1);
		List<Dev_dbtable> dataList = new ArrayList<>();
		//获取excel里面的数据转化为Java类型的数据
		for (int i = importExcel.getDataRowNum(); i < importExcel.getLastDataRowNum(); i++) {
			Row row = importExcel.getRow(i);
			Dev_dbtable dbtable = new Dev_dbtable();
			dbtable.setDbtable01(String.valueOf(importExcel.getCellValue(row, 0)));
			dbtable.setDbtable02(String.valueOf(importExcel.getCellValue(row, 0)));
			dbtable.setDbtable03(String.valueOf(importExcel.getCellValue(row, 1)));
			dbtable.setDbtable04(String.valueOf(importExcel.getCellValue(row, 1)));
			dataList.add(dbtable);
		}
		/*List<UserVo> dataList = importExcel.getDataList();
		dataList.forEach(user -> {
			System.out.println(JSON.toJSONString(user));
		});*/
	}
}
