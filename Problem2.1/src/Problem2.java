import javax.swing.*;
import java.awt.*;

public class Problem2 {
    public static void main(String[] args) {


        showTable();

    }

    private static void showTable() {

        String text ="";
        int yard=1;

        Font textAreaFont = new Font ("Monospaced", Font.PLAIN,12);

        JTextArea table = new JTextArea(5, 20);

        table.setFont(textAreaFont);

        text+=String.format("%-15s%-15s","Yards","Inches");
        text+=String.format("\n%-15s%-15s","-----","------");

        for(int i = 0;i<10;i++){
            text+=String.format("\n%-15s%-15s",yard,yard*12);
            yard++;
        }
    }
}
