import javax.swing.*;


public class Problem7{
    public static void main(String[] args) {

        String numberAsString;
        int number;


        numberAsString = JOptionPane.showInputDialog("Please enter a whole number(-1 to exit)");
        number = Integer.parseInt(numberAsString);



        while(number!=-1){

            numberAsString = JOptionPane.showInputDialog("Please enter a whole number(-1 to exit)");
            number = Integer.parseInt(numberAsString);


            if (isThisEven(number)){
                JOptionPane.showMessageDialog(null,number+" is an even number", "Is this even number?", JOptionPane.INFORMATION_MESSAGE);
            }
            else {
                JOptionPane.showMessageDialog(null,number+" is not an even number", "Is this even number?", JOptionPane.WARNING_MESSAGE);
            }

        }
        JOptionPane.showMessageDialog(null,"Thank you for using the program","Thank you!",JOptionPane.OK_OPTION);


    }

    public static boolean isThisEven(int number) {

        boolean even;

        if(number % 2 == 0){
            even = true;

        }else{
            even = false;
        }
        return even;
    }

}
