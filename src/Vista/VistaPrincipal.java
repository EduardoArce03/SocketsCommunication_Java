/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;


import distribuidos_sockets_arce_bravo.Servidor;
import javax.swing.JTextArea;

/**
 *
 * @author ESTUDIANTE
 */
public class VistaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form VistaPrincipal
     */
    public VistaPrincipal() {
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

        btnIniciarServidor = new javax.swing.JButton();
        btnIniciarCliente = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        dkpPrincipal = new javax.swing.JDesktopPane();
        jLabel2 = new javax.swing.JLabel();
        btnServidor = new javax.swing.JButton();
        btnCliente = new javax.swing.JButton();

        btnIniciarServidor.setText("Iniciar Servidor");
        btnIniciarServidor.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIniciarServidorMouseClicked(evt);
            }
        });
        btnIniciarServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarServidorActionPerformed(evt);
            }
        });

        btnIniciarCliente.setText("Iniciar Cliente");
        btnIniciarCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIniciarClienteActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Swis721 BT", 0, 36)); // NOI18N
        jLabel1.setText("Sistema De Mensajeria");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel2.setFont(new java.awt.Font("Swis721 Blk BT", 0, 36)); // NOI18N
        jLabel2.setText("Sistema de Mensajeria");

        btnServidor.setText("Iniciar Servidor");
        btnServidor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnServidorActionPerformed(evt);
            }
        });

        btnCliente.setText("Iniciar Cliente");
        btnCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClienteActionPerformed(evt);
            }
        });

        dkpPrincipal.setLayer(jLabel2, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpPrincipal.setLayer(btnServidor, javax.swing.JLayeredPane.DEFAULT_LAYER);
        dkpPrincipal.setLayer(btnCliente, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout dkpPrincipalLayout = new javax.swing.GroupLayout(dkpPrincipal);
        dkpPrincipal.setLayout(dkpPrincipalLayout);
        dkpPrincipalLayout.setHorizontalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpPrincipalLayout.createSequentialGroup()
                .addGroup(dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(dkpPrincipalLayout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jLabel2))
                    .addGroup(dkpPrincipalLayout.createSequentialGroup()
                        .addGap(193, 193, 193)
                        .addGroup(dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(btnServidor)
                            .addComponent(btnCliente))))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        dkpPrincipalLayout.setVerticalGroup(
            dkpPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(dkpPrincipalLayout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnServidor)
                .addGap(55, 55, 55)
                .addComponent(btnCliente)
                .addContainerGap(259, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpPrincipal)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(dkpPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnIniciarServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarServidorActionPerformed
        // TODO add your handling code here:
        //ServidorVista servidorVista = new ServidorVista();
        //servidorVista.iniciarServidor();
        
        
    }//GEN-LAST:event_btnIniciarServidorActionPerformed

    private void btnIniciarClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIniciarClienteActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_btnIniciarClienteActionPerformed

    private void btnIniciarServidorMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIniciarServidorMouseClicked
        // TODO add your handling code here:
        
    }//GEN-LAST:event_btnIniciarServidorMouseClicked

    private void btnServidorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnServidorActionPerformed
        // TODO add your handling code here:
        ServidorVista servidorVista = new ServidorVista();
        dkpPrincipal.add(servidorVista);
        servidorVista.setVisible(true);
        servidorVista.iniciarServidor();
        
    }//GEN-LAST:event_btnServidorActionPerformed

    private void btnClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClienteActionPerformed
        // TODO add your handling code here:
        //ClienteVista clienteVista = new ClienteVista();
        //dkpPrincipal.add(clienteVista);
        //clienteVista.setVisible(true);
        
    }//GEN-LAST:event_btnClienteActionPerformed

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
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(VistaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new VistaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCliente;
    private javax.swing.JButton btnIniciarCliente;
    private javax.swing.JButton btnIniciarServidor;
    private javax.swing.JButton btnServidor;
    private javax.swing.JDesktopPane dkpPrincipal;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
