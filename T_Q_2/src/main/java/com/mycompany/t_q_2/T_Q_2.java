

package com.mycompany.t_q_2;

import java.util.Scanner;

public class T_Q_2 {

    public static void main(String[] args) 
    {
      Scanner input = new Scanner(System.in);

       //Console type
       System.out.print("Enter the Console type: ");
       String consoleType = input.nextLine();

       //Promt user for city
       System.out.print("Enter the Store: ");
       String storeName = input.nextLine();

       // Calculate accident total
       System.out.print("Enter the total sales of " + consoleType + " consoles for " + storeName + ": ");
       int salesTotal = input.nextInt();

       // Instantiate RoadAccidentReport object
       RunApplication report = new RunApplication(consoleType, storeName,salesTotal);

       // Print report
       report.printAccidentReport();

       input.close();  
    }
}
