package javaProject;

import java.util.Scanner;

public class Deposite {
    public static void deposite(String name)
    {
        int anumber=4545;
        System.out.print(name);
        System.out.print("     ");
        System.out.println("Account Number:"+" "+anumber);
        int present_amount=50000;
        System.out.println("");
        System.out.println("Enter Amount:");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt() ;
        int final_amount=present_amount+amount;
        System.out.println("Money Deposite Successfully....");
        System.out.println("Present Amount:"+" "+final_amount+"/-");
        System.out.println("");
        Atm.quit();

    }
}
