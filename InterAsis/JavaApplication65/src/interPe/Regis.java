/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package interPe;

import javax.swing.JOptionPane;

/**
 *
 * @author miran
 */
public class Regis extends javax.swing.JFrame {

    /**
     * Creates new form Regis
     */
    public Regis() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cantiPerro = new javax.swing.JLabel();
        cantiPerro1 = new javax.swing.JLabel();
        Consultar = new javax.swing.JButton();
        Consultar1 = new javax.swing.JButton();
        numHr = new javax.swing.JTextField();
        numPer = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        cantiPerro.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        cantiPerro.setText("Digite la cantidad de perros:");

        cantiPerro1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        cantiPerro1.setText("Digite el numero de horas:");

        Consultar.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        Consultar.setText("Consultar");
        Consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConsultarActionPerformed(evt);
            }
        });

        Consultar1.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        Consultar1.setText("Atras");
        Consultar1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Consultar1ActionPerformed(evt);
            }
        });

        numHr.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numHrActionPerformed(evt);
            }
        });

        numPer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                numPerActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(cantiPerro1)
                    .addComponent(cantiPerro))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(numPer, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numHr, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(267, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addComponent(Consultar1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Consultar, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(34, 34, 34))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantiPerro)
                    .addComponent(numPer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(48, 48, 48)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cantiPerro1)
                    .addComponent(numHr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 90, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Consultar1)
                    .addComponent(Consultar))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConsultarActionPerformed
         int numAni = Integer.parseInt(numPer.getText());
        int numHr = Integer.parseInt(this.numHr.getText());
         int[] tamAni = new int[numAni];
        for (int i = 0; i < numAni; i++) {
            String sizeInput = JOptionPane.showInputDialog(this, "De que tamaño es el perro número " + (i + 1) + "?\n1) Grande\n2) Mediano\n3) Pequeño");
            tamAni[i] = Integer.parseInt(sizeInput);
        }
        int costoFi = precio(tamAni, numHr);
        JOptionPane.showMessageDialog(null,"El precio total por el paseo es="+costoFi);
      
        this.dispose();
    }//GEN-LAST:event_ConsultarActionPerformed
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
    private void Consultar1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Consultar1ActionPerformed
         Princip newframe=new Princip();
        newframe.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_Consultar1ActionPerformed

    private void numHrActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numHrActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_numHrActionPerformed

    private void numPerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_numPerActionPerformed
        
        
        
    }//GEN-LAST:event_numPerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Regis.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Regis().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Consultar;
    private javax.swing.JButton Consultar1;
    private javax.swing.JLabel cantiPerro;
    private javax.swing.JLabel cantiPerro1;
    private javax.swing.JTextField numHr;
    private javax.swing.JTextField numPer;
    // End of variables declaration//GEN-END:variables
}
