
package Ventanas;

import Matrices3x3.Matrices3x3;

public class Ejercicios extends javax.swing.JFrame {

    public Ejercicios() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ejercicioMenu = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        ejercicioMenu.setBackground(new java.awt.Color(255, 255, 255));
        ejercicioMenu.setForeground(new java.awt.Color(255, 255, 255));
        ejercicioMenu.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/2.png"))); // NOI18N
        jLabel4.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabel4.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel4MouseClicked(evt);
            }
        });
        ejercicioMenu.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 100, 90));

        jLabel3.setBackground(new java.awt.Color(0, 0, 0));
        jLabel3.setFont(new java.awt.Font("DialogInput", 1, 24)); // NOI18N
        jLabel3.setText("MATRIZ");
        ejercicioMenu.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 210, 90, 40));

        getContentPane().add(ejercicioMenu, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 570, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel4MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabel4MouseClicked
        Matrices3x3 formulario=new Matrices3x3();
        formulario.setBounds(0,0,720,600);
        formulario.setVisible(true);
    }//GEN-LAST:event_jLabel4MouseClicked

    
    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ejercicios.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ejercicios().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel ejercicioMenu;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    // End of variables declaration//GEN-END:variables
}
