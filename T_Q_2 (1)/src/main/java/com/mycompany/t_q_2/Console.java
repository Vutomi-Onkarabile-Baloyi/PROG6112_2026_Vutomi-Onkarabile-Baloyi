
package com.mycompany.t_q_2;


public abstract class Console implements IConsoles 
{
   private String consoleType;
   private String storeName;
   private int salesTotal;

    // Constructor
    public Console(String consoleType,String storeName, int salesTotal) 
    {
      this.consoleType = consoleType;
      this.storeName = storeName;
      this.salesTotal = salesTotal;
    }

    @Override
    public String getConsoleType() 
    {
     return consoleType;
    }
    
    @Override
    public String getStore() 
    {
     return storeName;
    }
    
    
    @Override
    public int getTotalSales() 
    {
     return salesTotal;
    }
    
    
}
