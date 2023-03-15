package javaProject;

import java.util.Scanner;

public class Main {
    public static void main(String args[])
    {
        System.out.println("New Registeration.");
        System.out.println("Login.");
        System.out.println("Enter Your Choice:-");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        Atm.Register person=new Atm.Register();
        switch(choice){
            case 1:
                person.registeration();
                break;
            case 2:
                System.out.println("Please Register First.");
                person.registeration();
                break;
            default:
                System.out.println("Wrong Choice....");
        }

    }
}
