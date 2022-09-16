
package payroll;

import java.io.File;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;


public class Payroll {

    public static void main(String[] args) {
        ArrayList<String[]> employeeList = new ArrayList<>();
        NumberFormat currency = NumberFormat.getCurrencyInstance();
        File db = new File("database.csv");
        try{
            Scanner fileScan = new Scanner(db);
            while(fileScan.hasNextLine()){
                String[] employee = fileScan.nextLine().split(",");
                employeeList.add(employee);
            }
        }//end try
        catch(Exception e){
            e.getStackTrace();
        }
        
        
        employeeList.forEach(employee -> {
            String employeeName = employee[0];
            System.out.print(employeeName + "\thours: " );
            
            Scanner keyboard = new Scanner(System.in);
            double hours = keyboard.nextDouble();
            System.out.println("\t" + new Date());
                    //messy way this is only hard for the programmer to debug
            //double netPay = (hours > 40) ? (hours * Double.parseDouble(employee[1]) * 1.5) : (hours * Double.parseDouble(employee[1]));
                    //clean way same processing, but much easier to debug
            double rateOfPay = Double.parseDouble(employee[1]);
            double netPay;
            if(hours > 40){
                netPay = hours * rateOfPay * 1.5;
            }
            else{
                netPay = hours * rateOfPay;
            }
            
            
            double deductionsPercent = Double.parseDouble(employee[2]);
            double deductions = netPay * deductionsPercent;
            
            double grossPay = netPay - deductions;
            
            System.out.println("Employee Name\tNet Pay\tDeductions\tGross Pay");
            System.out.println(employeeName + "\t\t" + currency.format(netPay) + "\t" + currency.format(deductions) + "\t\t" + currency.format(grossPay));
            System.out.println("\n\n\n");
        });
        
        
        
        
    }//end main()
    
}
