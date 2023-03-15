package javaProject;

import java.util.Scanner;

public class TransactionHistory {
    public static void transHistory(String name)
    {
        int anumber= 4545;
        System.out.println("Name: "+" "+name);
        System.out.println("Account Number: "+" "+anumber);
        System.out.println("Enter How long Details you want to see.");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println("**************************************");
        System.out.println("TRANSACTION DETAILS:-");
        for(int i=1;i<n*2;i++) {
            System.out.println("Cost:");
            System.out.println("Transfer to:");
            System.out.println("Date:");
            System.out.println("");
        }
        Atm.quit();
    }
}
