import javax.swing.*;
import java.awt.*;

public class Problem3 {
    public static void main(String[] args) {

        String name,lengthAsString, widthAsString, costAsString;
        double length, width, cost;

        name = JOptionPane.showInputDialog("Please enter your name: ");
        lengthAsString = JOptionPane.showInputDialog("Please enter your room length: ");
        length = Double.parseDouble(lengthAsString);
        widthAsString = JOptionPane.showInputDialog("Please enter your room width: ");
        width = Double.parseDouble(widthAsString);
        costAsString = JOptionPane.showInputDialog("Please enter carpet price: ");
        cost = Double.parseDouble(costAsString);

        JOptionPane.showMessageDialog(null, showTable(length,width,cost,name),"Quotation results for "+name,JOptionPane.INFORMATION_MESSAGE );
    }

    private static Object showTable(double length,double width,double cost,String name) {

        String text = "";
        double area;

        area = length*width;

        Font textAreaFont = new Font("Monospaced", Font.PLAIN, 12);

        JTextArea table = new JTextArea(25,25);

        table.setFont(textAreaFont);

        text+=String.format("%-45s%-45s","Quotation results for "+name,"");
        text+=String.format("%-45s%-45s","\nLength of the room",length);
        text+=String.format("%-45s%-45s","\nWidth of the room",width);
        text+=String.format("%-45s%.2f","\nTotal area of the room",area);
        text+=String.format("%-45s%.2f","\nTotal cost of the carpet",totalCost(area,cost));
        table.append(text);

        return table;

    }

    private static Object totalCost(double area, double cost) {

        double total;

        total = area*cost;
        return total;
    }


}
