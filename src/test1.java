import javax.swing.*;

public class test1 {
    public static void main(String[] args) {
        String s = JOptionPane.showInputDialog("Skriv ett årtal");

        int år = Integer.parseInt(s);
        if ((år % 4 == 0 && år % 100 !=0) || år % 400 == 0)
            JOptionPane.showMessageDialog(null, "Skottår");
        else
            JOptionPane.showMessageDialog(null, "inte skottår");

    }
}