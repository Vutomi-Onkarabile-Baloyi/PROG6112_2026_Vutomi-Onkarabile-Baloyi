

package com.mycompany.console_sales;


public class Console_Sales 
{

    public static void main(String[] args) 
    {
        //1D array for Cities data is sourced from
        String[] Cities = {"Cape Town", "Port Eliz", "Pretoria"};

       //2D array for the sales of the various consoles per City
       int[][] Consoles = 
       {
        {1000, 2000, 3000},  // Cape Town sales
        {2000, 3000, 4000},  // Port Elizabeth Sales
        {1500, 1100, 1200},  // Pretoria Sales
       };

       // Display heading
       System.out.println("------------------------------------------------");
       System.out.println("Gaming Console Report");
       System.out.println("------------------------------------------------");
       System.out.printf("%-10s%-15s%-15s%-10s%n", "", "PS5", "XBOX", "SWITCH");
       System.out.println("------------------------------------------------");
        
       // Display Console Sales Table
      for (int i = 0; i < Consoles.length; i++) 
      {
       System.out.printf("%-10s%-15d%-15d%-10d%n", Cities[i],Consoles[i][0],Consoles[i][1],Consoles[i][2]);
      }

       System.out.println("------------------------------------------------");
       System.out.println("Console Sale Totals For Each City");
    

       
       // Calculate and display Sales totals on city specific basis
    
        int[] Totals = new int[Cities.length];

        for (int x = 0; x < Cities.length; x++) 
        {
         Totals[x] = Consoles[x][0] + Consoles[x][1] + Consoles[x][2];
         
         System.out.printf("%-10s%-10d", Cities[x], Totals[x]);
         
        System.out.println("------------------------------------------------");
        }
        
    
       
       // Isolate the city with the highest number of Sales
        int highestIndex = 0;
        for (int x = 1; x < Totals.length; x++) 
        {
         if (Totals[x] > Totals[highestIndex]) 
         {
           highestIndex = x;
         }
        }
       
       
       
        
         // Display city with highest Sales
        System.out.println();
        System.out.println("---------------------------------------------");
        System.out.println("CITY WITH THE MOST Sales: " + Cities[highestIndex]);
        System.out.println("---------------------------------------------");

        
    }
    
    
}
