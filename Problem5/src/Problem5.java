import javax.swing.*;

public class Problem5 {
    public static void main(String[] args) {

        int a =1, b= 6, c = -16;


        JOptionPane.showMessageDialog(null,"Root variable of x if it is negative is "+rootNegative(a,b,c)+
        "\nRoot variable of x if it is positive is "+rootPositive(a,b,c),"Root calculator",JOptionPane.WARNING_MESSAGE);
    }

    private static double rootPositive(int a, int b, int c ) {

        double x,y;

        y=Math.sqrt(b)-(4*a*c);
        x=(b+y)/2*a;

        return x;
    }

    private static double rootNegative(int a, int b, int c ) {

        double x,y;

        y=Math.sqrt(b)-(4*a*c);
        x=(b-y)/2*a;

        return x;


    }
}
