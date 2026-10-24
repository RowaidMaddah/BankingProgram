import java.util.ArrayList;
import java.util.Scanner;

public class BankingProg{
    public static void main(String[] args){

        try (Scanner scanner = new Scanner(System.in)) {
            @SuppressWarnings("unused")
            int balance = 0;
            
            System.out.println("---------------------");
            System.out.println("Welcome to the bank.");
            System.out.println("---------------------");

        Boolean using = true;
            
            while(using){
                ArrayList<String> options = new ArrayList<>();
                options.add("1. Withdraw");
                options.add("2. Deposit");
                options.add("3. View Balance");
                options.add("4. Exit");
                
                System.out.println(options);

                System.out.println("What would you like to do?: ");
                int choice = scanner.nextInt();

                switch(choice){

                    case 1 -> { 
                        withdraw(balance);
                    }
                    case 2 -> {
                        deposit(balance);
                    }
                    case 3 -> {
                        viewBalance(balance);
                    }
                    case 4 -> {
                        System.out.println("Thank you for visiting.");
                        break;
                    }
                    default -> {
                        System.out.println("Something went wrong.");
                    }

                }
            }
        }

    }

    @SuppressWarnings("unused")
    static int withdraw(int balance){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much would you like to withdraw?: ");
        int withdraw = scanner.nextInt();
        if (withdraw > balance){
            System.out.println("Insufficient funds.");
        }
        else{
            balance -= withdraw;
        }
        return balance;
    }

    @SuppressWarnings("unused")
    static int deposit(int balance){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How much would you like to deposit?: ");
        int deposit = scanner.nextInt();

        balance += deposit;
        System.out.println("The amount has been deposited into you account.");
        return balance;
    }

    @SuppressWarnings("unused")
    static int viewBalance(int balance){
        System.out.println("Your balance is: " + balance);
        return balance;
    }
}
