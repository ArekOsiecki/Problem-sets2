import javax.swing.*;

public class Problem9 {
    public static void main(String[] args) {

        String weightsAsString;
        double weights[] = new double [10];

        for(int i = 0; i < weights.length; i++){
            weightsAsString = JOptionPane.showInputDialog("Please enter weight of an animal in kilograms");
            weights[i] =Double.parseDouble(weightsAsString);

        }

        JOptionPane.showMessageDialog(null,"All weights entered: "+weightsAll(weights)+
                "\nNumber of animals over a quintal: "+overQuint(weights)+"\nPercentage of animals over 400 Kg: "+over400(weights)+" %" +
                "\nThe lightest animal: "+lightestAnimal(weights)+" Kg"+"\nAverage weight is: "+avgWeight(weights)+" Kg","Farm animals",JOptionPane.INFORMATION_MESSAGE);


    }

    private static double lightestAnimal(double[] weights) {

        double lightest = 999;

        for(int i = 0; i<weights.length; i++){
            if(weights[i]<lightest){
                lightest = weights[i];
            }
        }
        return lightest;

    }

    private static String avgWeight(double[] weights) {


        String average;
        double cumulative = 0;


        for(int i = 0; i<weights.length; i++){

            cumulative = cumulative+weights[i];

        }

        average = String.format("%.1f",cumulative/weights.length);
        return average;

    }

    private static int over400(double[] weights) {

        int ov400 = 0, percentage;

        for(int i = 0; i<weights.length; i++){

            if(weights[i]>400){
                ov400++;
            }

        }
        percentage = 100/weights.length*ov400;
        return percentage;



    }

    private static int overQuint(double weights[]) {

        int overQuint=0;

        for(int i = 0; i<weights.length; i++){
            if(weights[i]>= 250.01){
                overQuint++;
            }
        }
        return overQuint;
    }

    private static String weightsAll(double weights[]) {

        String all="";

        for(int i = 0; i<weights.length; i++){
            all += weights[i]+" ,";
        }
        return all;
    }
}
