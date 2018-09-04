package com.pom.util;

public class TestUtil {

    public static void main(String[] args) {
        XLS_Reader xls = new XLS_Reader("/Users/shilpa/IdeaProjects/MavenPOMProject/src/test/java/com/pom/testdata/testdata.xlsx");
       // getTestData(xls, "Registration");
        System.out.println(isExecutable(xls, "Registration"));
    }



    //get data function:                 //Excel file address, sheetname(these are the parameters)
    public static Object[][] getTestData(XLS_Reader xls, String sheetName){
        if(!xls.isSheetExist(sheetName)){
            System.out.println("Test data sheet not found ");
        }

        //to get the total rows:
        int rows = xls.getRowCount(sheetName);
        System.out.println("Total Rows: "+rows);
        //to get the total cols:
        int cols = xls.getColumnCount(sheetName);
        System.out.println("Total cols: "+cols);

        //declaring one object array and storing the testdata
        Object[][] data = new Object[rows-1][cols-1];  //array size declaration
        //delcaring two forloops one for rows and another one for columns:
        for(int rowNum=2;rowNum <= rows;rowNum++){
            for(int colNum=0;colNum<cols-1;colNum++){
                System.out.print(xls.getCellData(sheetName,colNum,rowNum)+"|");
                //array values declaration:
                data[rowNum-2][colNum] = xls.getCellData(sheetName, colNum,rowNum);

            }
            System.out.println();
        }
        return  data;

    }

    //Verify the runmode of the test case:
    public static boolean isExecutable(XLS_Reader xls, String testcaseName){
        for(int i=2;i<=xls.getRowCount("Testcases");i++) {
            if (xls.getCellData("Testcases","TCID",i).equalsIgnoreCase(testcaseName)){
                if(xls.getCellData("Testcases","Runmode",i).equalsIgnoreCase("yes")){
                    return true;
                }else {
                    return false;
                }
            }

        }
        return false;
    }





}
