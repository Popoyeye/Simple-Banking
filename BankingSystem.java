package ReviewExercise;

import java.util.Scanner;

    public class BankingSystem {
        public static void main(String[] args) {

            //variable declaration
            Scanner scanner = new Scanner(System.in);
            double balance = 0.0;
            boolean exit = false;

            //menu driven loop
            while (!exit) {

                //display menu
                System.out.println("Welcome to the Easy Banking System");
                System.out.println("1. Check Balance");
                System.out.println("2. Deposit Money");
                System.out.println("3. Withdraw Money");
                System.out.println("4. Exit");
                System.out.println("Enter your choice: ");

                //user input
                int choice = scanner.nextInt();

                //switch statement
                switch (choice) {
                    case 1:
                        System.out.println("Your current balance is: RM " + balance);
                        break;
                    case 2:
                        System.out.print("Enter amount to deposit: RM ");
                        double depositAmount = scanner.nextDouble();
                        if (depositAmount > 0) {
                            balance += depositAmount;
                            System.out.println("Deposit successful.");
                            System.out.println("Your new balance is: RM " + balance);
                        } else {
                            System.out.println("Invalid amount. Please enter a positive value.");
                        }
                        break;
                    case 3:
                        System.out.print("Enter amount to withdraw: RM ");
                        double withdrawAmount = scanner.nextDouble();
                        if (withdrawAmount > 0 && withdrawAmount <= balance) {
                            balance -= withdrawAmount;
                            System.out.println("Withdrawal successful.");
                            System.out.println("Your new balance is: RM " + balance);
                        } else if (withdrawAmount > balance) {
                            System.out.println("Insufficient balance.");
                        } else {
                            System.out.println("Invalid amount. Please enter a positive value.");
                        }
                        break;
                    case 4:
                        System.out.println("Thank you for using the Easy Banking System.");
                        System.out.println("Goodbye!");
                        exit = true;
                        break;
                    default:
                        System.out.println("Invalid choice.");
                        System.out.println("Please enter a number between 1 and 4.");
                }
                System.out.println();
            }
            scanner.close();
        }
    }

