import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by magnus on 2018-05-02.
 */
public class NotePad {
    public NotePad() {
        öppnaButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

            }
        });
        nyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Text.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("NotePad");
        frame.setContentPane(new NotePad().NotePadPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setSize(new Dimension(600,480));
        frame.setTitle("Unsaved document");
        frame.setVisible(true);
    }

    private JButton öppnaButton;
    private JButton button2;
    private JButton nyButton;
    private JTextArea Text;
    private JPanel NotePadPanel;
}
