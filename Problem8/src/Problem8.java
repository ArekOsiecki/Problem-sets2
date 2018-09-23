import java.util.Scanner;

public class Problem8 {
    public static void main(String[] args) {

        int [] numbers = new int[10];

        Scanner input  = new Scanner(System.in);

        for(int i =0;i<numbers.length; i++){

            System.out.print("Please enter an integer: ");
            numbers[i] = input.nextInt();


        }

        System.out.print("The first value in the array is : "+numbers[0]);
        System.out.print("\nThe fifth value in the array is : "+numbers[4]);




    }
}
