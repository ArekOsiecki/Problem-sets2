import java.util.Scanner;

public class Problem1 {
    public static void main(String[] args) {

        double eRate;
        float  amount;

        Scanner input  = new Scanner(System.in);

        System.out.print("Please enter today's exchange rate ");

        eRate = input.nextDouble();

        do{
            System.out.print("Please enter the amount of GBP that you wish to convert to Euro ");

            amount = input.nextFloat();

            System.out.println("Exchange rate is " + eRate + "\n€" + String.format("%.2f", (amount / eRate)) + "\nequals to" + "\n£" + String.format("%.2f", (amount * eRate)));

        }while(amount!=0)


    }
}
