import javax.swing.*;
import java.awt.*;

public class Problem6 {
    public static void main(String[] args) {

        int startingValue =1,cubeValue;


        System.out.print(String.format("%-10s%-10s","\nNumber","Cube"));
        while(startingValue<=15) {
            System.out.print(String.format("%-10s%-10s","\n" + startingValue, cube(startingValue)));
            startingValue++;
        }




    }

    private static int cube(int startingValue) {

        int cube = (int) Math.pow(startingValue,3);
        return cube;
    }
}
