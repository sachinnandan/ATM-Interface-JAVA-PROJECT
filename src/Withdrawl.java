package javaProject;
import java.util.Scanner;

public  class Withdrawl {
    public static void withdraw(){
        int present_amount=50000;
        System.out.println("");
        System.out.println("Fast Cash:");
        System.out.println("Custeme cash:");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice){
            case 1:
               fastCash(present_amount);
               break;
            case 2:
                customeCash(present_amount);
                break;
        }
    }
    public static void fastCash(int pamount)
    {
        System.out.println("");
        System.out.println("=> 500");
        System.out.println("=> 1000");
        System.out.println("=> 1500");
        System.out.println("=> 2000");
        System.out.println("=> 5000");
        System.out.println("");
        System.out.println("Enter Your Choice:-");
        Scanner sc=new Scanner(System.in);
        int choice=sc.nextInt();
        switch(choice){
            case 1:
                System.out.println("Please Collect Your Cash....");
                int amount=pamount-500;
                System.out.println("Present amount in your account now is:-"+amount);
                System.out.println("");
                Atm.quit();
                break;
            case 2:
                System.out.println("Please Collect Your Cash....");
                amount=pamount-1000;
                System.out.println("Present amount in your account now is:-"+amount);
                System.out.println("");
                Atm.quit();
                break;
            case 3:
                System.out.println("Please Collect Your Cash....");
                amount=pamount-1500;
                System.out.println("Present amount in your account now is:-"+amount);
                System.out.println("");
                Atm.quit();
                break;
            case 4:
                System.out.println("Please Collect Your Cash....");
                amount=pamount-2000;
                System.out.println("Present amount in your account now is:-"+amount);
                System.out.println("");
                Atm.quit();
                break;
            case 5:
                System.out.println("Please Collect Your Cash....");
                amount=pamount-5000;
                System.out.println("Present amount in your account now is:-"+amount);
                System.out.println("");
                Atm.quit();
                break;
            default:
                System.out.println("Wrong Choice.");

        }

    }
    public static void customeCash(int pamount)
    {
        System.out.println("");
        System.out.println("Enter Amount:-");
        Scanner sc=new Scanner(System.in);
        int amount=sc.nextInt();
        System.out.println("Please take your cash....");
        int final_amount=pamount-amount;
        System.out.println("Present Amount in your Account is:"+final_amount);
        System.out.println("");
        Atm.quit();
    }
}
