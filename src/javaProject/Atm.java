package javaProject;

import java.net.StandardSocketOptions;
import java.util.Scanner;

public class Atm {
    static class Register {
        private String name;
        private String username;
        private int password;

        public void registeration() {
            System.out.println("Enter Your Name:-");
            Scanner sc = new Scanner(System.in);
            String name = sc.nextLine();
            this.name = name;
            System.out.println("Enter Username:-");
            String uname = sc.nextLine();
            this.username = uname;
            System.out.println("Enter Password:-");
            int pass = sc.nextInt();
            this.password = pass;
            login(username, password);
        }

        public void login(String username, int password) {
            System.out.println("");
            System.out.println("WELCOME TO OUR ATM.......");
            System.out.println("Enter Username:-");
            Scanner sc = new Scanner(System.in);
            String usern = sc.nextLine();
            System.out.println("Enter Password:-");
            int pass = sc.nextInt();
            if (usern.equals(username) && pass == password) {
                afterLogin(name);
            } else if (usern.equals(username)) {
                System.out.println("Wrong Password.");
            } else {
                System.out.println("Wrong Username.");

            }
        }

        public void afterLogin(String name)
        {
            System.out.println("");
            System.out.println("What do you want....");
            System.out.println("");
            System.out.println("1. Transaction History.");
            System.out.println("2. Withdraw.");
            System.out.println("3. Deposite.");
            System.out.println("4. Transfer.");
            System.out.println("5. Quit.");
            Scanner sc=new Scanner(System.in);
            int choice=sc.nextInt();
            switch(choice){
                case 1:
                    TransactionHistory.transHistory(name);
                    break;
                case 2:
                    javaProject.Withdrawl.withdraw();
                    break;
                case 3:
                    javaProject.Deposite.deposite(name);
                    break;
                case 4:
                    Transfer.transferTo(name);
                    break;
                case 5:
                    System.out.println("");
                    quit();
                    break;
            }
        }
    }
    public static void quit()
    {
        System.out.println("");
        System.out.println("Thakyou for using the ATM....");
    }
}
