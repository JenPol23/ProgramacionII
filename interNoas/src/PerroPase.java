/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.FlowLayout;
import java.awt.HeadlessException;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class PerroPase extends JFrame implements ActionListener{
     private JTextField numAniTextField;
    private JTextField numHrTextField;
    private JTextArea resultTextArea;
    private JButton calculateButton;

    public PerroPase() {
        initComponents();
    }

    private void initComponents() {
        numAniTextField = new JTextField();
        JLabel numAniLabel = new JLabel();
        numHrTextField = new JTextField();
        JLabel numHrLabel = new JLabel();
        calculateButton = new JButton();
        JScrollPane jScrollPane1 = new JScrollPane();
        resultTextArea = new JTextArea();

        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setTitle("PASEADOR DE PERROS");

        numAniLabel.setText("Cuantos perros va a pasear:");

        numHrLabel.setText("Cuantas horas los va a pasear:");

        calculateButton.setText("Calcular Costo");

        calculateButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent evt) {
                calculateButtonActionPerformed(evt);
            }
        });

        resultTextArea.setEditable(false);
        jScrollPane1.setViewportView(resultTextArea);

        GroupLayout layout = new GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(numAniLabel)
                            .addComponent(numHrLabel))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(GroupLayout.Alignment.LEADING)
                            .addComponent(numAniTextField, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE)
                            .addComponent(numHrTextField, GroupLayout.PREFERRED_SIZE, 50, GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(calculateButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(numAniLabel)
                    .addComponent(numAniTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                    .addComponent(numHrLabel)
                    .addComponent(numHrTextField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addComponent(calculateButton))
                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane1, GroupLayout.DEFAULT_SIZE, 177, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }

    private void calculateButtonActionPerformed(ActionEvent evt) {
        int numAni = Integer.parseInt(numAniTextField.getText());
        int numHr = Integer.parseInt(numHrTextField.getText());

        int[] tamAni = new int[numAni];
        for (int i = 0; i < numAni; i++) {
            String sizeInput = JOptionPane.showInputDialog(this, "De que tamaño es el perro número " + (i + 1) + "?\n1) Grande\n2) Mediano\n3) Pequeño");
            tamAni[i] = Integer.parseInt(sizeInput);
        }

        int costoFi = precio(tamAni, numHr);
        resultTextArea.setText("El costo total es: $" + costoFi);
    }

    public static int precio(int[] tama, int numHr) {
        int costo = 0;
        for (int i = 0; i < tama.length; i++) {
            if (tama[i] == 1) {
                costo += (10000 * numHr);
            } else if (tama[i] == 2) {
                costo += (5000 * numHr);
            } else if (tama[i] == 3) {
                costo += (3000 * numHr);
            }
        }
        if (tama.length > 1) {
            double descu = costo * 0.10;
            costo -= descu;
        }

        return costo;
    }

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PerroPase().setVisible(true);
            }
        });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}

  
