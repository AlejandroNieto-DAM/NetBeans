
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author alejandronieto
 */
public class yeye extends JFrame implements ActionListener {

    JFrame principalWindows = new JFrame();
    
    JButton converterButton = new JButton();
    JLabel celsius = new JLabel();
    JLabel farenheit = new JLabel();
    JTextPane celsiusIn = new JTextPane();
    
    principalWindows.setVisible(true);
    
    principalWindows.setDefaultCloseOperation(EXIT_ON_CLOSE);

    
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
