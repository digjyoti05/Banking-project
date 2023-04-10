import java.util.Scanner;

public class BankingApp {
    public static void main(String[] args) {
        double Balance=0;
        Scanner sc=new Scanner(System.in);
        while (true){
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            int choice= sc.nextInt();

            if(choice==1){
                System.out.println("Your balance is: " + Balance);

            }
            else if(choice==2){
                System.out.println("Enter deposit Amount....");
                double amount= sc.nextDouble();
                Balance += amount;
                System.out.println("Deposit successful. Your balance is now: " + Balance);
            }
            else if (choice==3) {
                System.out.println("Enter withdraw Amount.....");
                double amount= sc.nextDouble();
                if(amount >=1 && amount<Balance) {

                    Balance -= amount;
                    System.out.println("Withdraw successful. Your balance is now: " + Balance);
                }
                else {
                    System.out.println("Insufficent amount");
                }

            }
            else
            {
               break;
            }




        }


    }
}
