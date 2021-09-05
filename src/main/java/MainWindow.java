import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame implements ActionListener {

    /***
     *
     * Made by Bur1y
     * Last update 05.09.2021
     *
     */

    public MainWindow() {
        super("Калькулятор");

        // Get Screen size
        Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();
        double width = screenSize.getWidth();
        double height = screenSize.getHeight();

        // Custom window
        setSize((int) width / 5, (int)height / 2);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(true);

        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }

    public static void main(String[] args) {
        new MainWindow();
    }
}
