package work.devtools.common.utils;

import java.io.OutputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import lombok.Data;
import org.apache.poi.hssf.usermodel.*;


/**
 * @author Huxiaoxue
 * @version V1.0
 * @ClassName
 * @desc: 导出Excel
 * @create: 2019-04-25
 **/
@Data
public class LoadExcelUtil {

    //Excel每个sheet的行数  注：创建SQL的sheet默认只有17行
    private  int SPLIT_COUNT = 17;

    //excel标题数据集
    private String fieldName = null;
    //excel数据内容
    private List<Map<String, String>> fieldData = null;

    private HSSFWorkbook workBook = null;


    public LoadExcelUtil(List<Map<String, String>> fieldData) {
        this.fieldData = fieldData;
    }

    /**
     * 创建HSSFWorkbook对象
     * @return HSSFWorkbook
     */
    public HSSFWorkbook createWorkbook() {
        //创建一个工作薄对象
        workBook = new HSSFWorkbook();
        //总的记录数
        int rows = fieldData.size();
        //指定sheet的页数
        int sheetNum = 0;

        if (rows % SPLIT_COUNT == 0) {
            sheetNum = rows / SPLIT_COUNT;
        } else {
            sheetNum = rows / SPLIT_COUNT + 1;
        }

        for (int i = 1; i <= sheetNum; i++) {
            //使用workbook对象创建sheet对象
            HSSFSheet sheet = workBook.createSheet("sheet " + i);

            //分页处理excel的数据，遍历所有的结果
            for (int k = 0; k < (rows < SPLIT_COUNT ? rows : SPLIT_COUNT); k++) {
                //如果数据超出总的记录数的时候，就退出循环
                if (((i - 1) * SPLIT_COUNT + k) >= rows)
                    break;
                //创建1行
                HSSFRow row = sheet.createRow((short) (k + 1));
                //分页处理，获取每页的结果集，并将数据内容放入excel单元格
                ArrayList<String> rowList = (ArrayList<String>) fieldData.get((i - 1) * SPLIT_COUNT + k);
                //遍历某一行的结果
                for (int n = 0; n < rowList.size(); n++) {
                    //使用行创建列对象
                    HSSFCell cell1 = row.createCell( n)
                            ;

                    if(rowList.get(n) != null){
                        cell1.setCellValue((String) rowList.get(n).toString());
                    }else{
                        cell1.setCellValue("");
                    }
                }
            }
        }
        return workBook;
    }

    public void  exportExcel(OutputStream os) throws Exception {
        workBook = createWorkbook();
        //将excel中的数据写到输出流中，用于文件的输出
        workBook.write(os);
        os.close();
    }


}
