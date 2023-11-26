package index;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class tela_principal extends JFrame implements ActionListener {
    JPanel tela = new JPanel();
    // n funciona -- ImageIcon icon = new ImageIcon("../../images/iconeapp.png");
    public tela_principal(){
        getContentPane().add(tela);
        tela.setBackground(new Color(0x343541));
        setTitle("Suas Finanças");
        setSize(1080, 720);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
        setLocationRelativeTo(null);

        //setIconImage(icon.getImage());
    }




    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
