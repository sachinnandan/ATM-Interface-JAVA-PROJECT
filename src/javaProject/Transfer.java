package javaProject;

import java.util.Scanner;

public class Transfer {
    public static void transferTo(String name)
    {
        System.out.print("Name: "+name);
        System.out.print("     ");
        System.out.println("Account Number:"+4554);
        int present_amount=50000;
        System.out.println("Enter Account Number:");
        Scanner sc=new Scanner(System.in);
        int a_number=sc.nextInt();
        System.out.println("Enter Amount:");
        int amount=sc.nextInt();
        int current_amount=present_amount-amount;
        System.out.println("Money Transfer Successfully....");
        System.out.println("Current amount in your account:"+current_amount);
        System.out.println("");
        Atm.quit();

    }
}
