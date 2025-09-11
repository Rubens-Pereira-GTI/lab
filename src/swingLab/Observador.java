package swingLab;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Observador {
    
    public static void main(String[] args) {      
        Observador obs = new Observador();    
        JFrame frame = new JFrame("Observador");        
        JButton button = new JButton("Botão");

        //button.addActionListener(obs.new ButtonObserver());
        button.addActionListener(e -> System.out.println("fui clicaldo"));

        frame.setLocationRelativeTo(null);
        frame.add(button, BorderLayout.SOUTH);
        frame.setSize(600, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
        static class ButtonObserver implements ActionListener{        
            public void actionPerformed(ActionEvent e) {           
            }        
        }



   
}
