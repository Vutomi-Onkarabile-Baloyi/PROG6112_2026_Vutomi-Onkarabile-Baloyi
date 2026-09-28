
package com.mycompany.t_q_2;


public class RunApplication extends ConsoleSales
{
    public RunApplication (String consoleType,String storeName, int salesTotal)
  {
   super(consoleType, storeName,salesTotal);
  }
    
  // Method to print the accident report
  /*Basically just a display class for the class, 
  even if there is only one display meythod*/
    
    
    public void printAccidentReport() 
    {
    System.out.println();
    System.out.println("CONSOLE SALES REPORT");
    System.out.println("************************");
    System.out.println("CONSOLE TYPE: " + getConsoleType());
    System.out.println("STORE NAME: " + getStore());
    System.out.println("TOTAL SALES: " + getTotalSales());
   
    } 
    
}
