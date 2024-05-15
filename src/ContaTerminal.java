import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Hello, welcome to Santander");
        System.out.println("What's your name:");
        String name = reader.nextLine();

        System.out.println("Agency Number");
        String agency = reader.next();

        System.out.println("Account Number");
        int account = reader.nextInt();

        System.out.println("Balance Number");
        double balance = reader.nextDouble();

        System.out.println("Hello "+ name +", thank you for creating an account with our bank,\n" +
                " your branch is " + agency + ", account " + account + " and your balance " + balance + " is now available for withdrawal.");


    }
}