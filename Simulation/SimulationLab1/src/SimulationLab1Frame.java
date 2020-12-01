
import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ashu
 */
public class SimulationLab1Frame extends javax.swing.JFrame {
  

    /**
     * Creates new form SimulationLab1Frame
     */
    public SimulationLab1Frame() {
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

        jButton1 = new javax.swing.JButton();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("SimulationLab1 Random Number Application");

        jButton1.setText("Generate");
        jButton1.setToolTipText("");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jTextField2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(133, 133, 133)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(146, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 195, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(14, 14, 14))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Random rand = new Random(); //to generate random no
        int r = rand.nextInt(6)+1;       
        String str = Integer.toString(r);  
        jTextField2.setText(str);   //to display in textfield
        Graphics g = this.getGraphics();
        g.setColor(Color.red);
        g.fillRect(180, 180, 50, 50);
        g.drawRect(180, 180, 50, 50);
        switch(r)
        {
            case 1:
                g.setColor(Color.BLACK);
                g.fillOval(200, 200, 10, 10);
                g.drawOval(200, 200, 10, 10);
                break;
            case 2:
                g.setColor(Color.BLACK);
                g.fillOval(195, 195, 10, 10);
                g.drawOval(195, 195, 10, 10);
                g.fillOval(205, 205, 10, 10);
                g.drawOval(205, 205, 10, 10);                
                break;
            case 3:
                g.setColor(Color.BLACK);
                g.fillOval(188, 188, 10, 10);
                g.drawOval(188, 188, 10, 10);
                g.fillOval(201, 201, 10, 10);
                g.drawOval(201, 201, 10, 10);
                g.fillOval(215, 215, 10, 10);
                g.drawOval(215, 215, 10, 10);
                break;
            case 4:
                g.setColor(Color.BLACK);
                g.fillOval(190, 190, 10, 10);
                g.drawOval(190, 190, 10, 10);//1
                g.fillOval(208, 190, 10, 10);
                g.drawOval(208, 190, 10, 10);//2
                g.fillOval(190, 210, 10, 10);
                g.drawOval(190, 210, 10, 10);//3
                g.fillOval(208, 210, 10, 10);
                g.drawOval(208, 210, 10, 10);//4
                break;
            case 5:
                g.setColor(Color.BLACK);
                g.fillOval(190, 190, 10, 10);
                g.drawOval(190, 190, 10, 10);
                g.fillOval(208, 190, 10, 10);
                g.drawOval(208, 190, 10, 10);
                g.fillOval(190, 210, 10, 10);
                g.drawOval(190, 210, 10, 10);
                g.fillOval(208, 210, 10, 10);
                g.drawOval(208, 210, 10, 10);
                g.fillOval(199, 200, 10, 10);
                g.drawOval(199, 200, 10, 10);
                break;
            case 6: 
              g.setColor(Color.BLACK);
                g.fillOval(190, 186, 10, 10);
                g.drawOval(190, 186, 10, 10);//1
                g.fillOval(208, 186, 10, 10);
                g.drawOval(208, 186, 10, 10);//2
                g.fillOval(190, 200, 10, 10);
                g.drawOval(190, 200, 10, 10);//3
                g.fillOval(208, 200, 10, 10);
                g.drawOval(208, 200, 10, 10);//4
                g.fillOval(190, 215, 10, 10);
                g.drawOval(190, 215, 10, 10);//5
                g.fillOval(208, 215, 10, 10);
                g.drawOval(208, 215, 10, 10);//6
                break;
                
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jTextField2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField2ActionPerformed

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
            java.util.logging.Logger.getLogger(SimulationLab1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SimulationLab1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SimulationLab1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SimulationLab1Frame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SimulationLab1Frame().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
