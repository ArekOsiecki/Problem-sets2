import javax.swing.*;

public class Problem4 {
    public static void main(String[] args) {

        String fullName,uppercaseName, surname;
        char initial;
        int index;

        fullName = JOptionPane.showInputDialog("Please enter your name, middle name and surname");
        uppercaseName = fullName.toUpperCase();
        initial = fullName.charAt(0);
        index = fullName.lastIndexOf(' ');
        surname = fullName.substring(index);

        JOptionPane.showMessageDialog(null, "Total number of characters in your name is "+fullName.length()+"\nFirst name initial is "+initial
                +"\nYour name in uppercase is "+uppercaseName+"\nYour surname is "+surname,"String manipulator",JOptionPane.INFORMATION_MESSAGE);
    }
}
