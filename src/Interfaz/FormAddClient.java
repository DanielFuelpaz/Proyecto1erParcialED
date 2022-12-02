package Interfaz;

import Gestion.GestorClientes;
import Clases.Cliente;
import Utiles.Validacion;
import java.awt.Color;
import java.time.LocalDate;
import java.util.LinkedList;
import javax.swing.JComboBox;

/**
 *
 * @author Daniel
 */
public class FormAddClient extends javax.swing.JDialog {

    public GestorClientes GC = new GestorClientes();
    /**
     * Creates new form FormAddClient
     */
    public FormAddClient(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        CedulaTF = new javax.swing.JTextField();
        NombreTF = new javax.swing.JTextField();
        ApellidoTF = new javax.swing.JTextField();
        TelefonoTF = new javax.swing.JTextField();
        DireccionTF = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        CrearCliente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Cédula");

        jLabel2.setText("Nombre");

        jLabel3.setText("Apellido");

        jLabel4.setText("Teléfono");

        jLabel5.setText("Dirección");

        CedulaTF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                CedulaTFCaretUpdate(evt);
            }
        });

        TelefonoTF.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                TelefonoTFCaretUpdate(evt);
            }
        });

        DireccionTF.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DireccionTFActionPerformed(evt);
            }
        });

        jLabel6.setText("Nuevo Cliente");

        CrearCliente.setText("Guardar");
        CrearCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CrearClienteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(16, 16, 16)
                        .addComponent(CedulaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(NombreTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(14, 14, 14)
                        .addComponent(ApellidoTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(10, 10, 10)
                        .addComponent(TelefonoTF))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(6, 6, 6)
                        .addComponent(DireccionTF)))
                .addGap(95, 95, 95))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(171, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(152, 152, 152))
            .addGroup(layout.createSequentialGroup()
                .addGap(167, 167, 167)
                .addComponent(CrearCliente)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(CedulaTF, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(NombreTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ApellidoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TelefonoTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DireccionTF, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(CrearCliente)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void DireccionTFActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DireccionTFActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DireccionTFActionPerformed

    private void CedulaTFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_CedulaTFCaretUpdate

        Validacion v = new Validacion();
        if (v.validarCedula(CedulaTF.getText())) {
            CedulaTF.setBackground(Color.green);
        } else {
            CedulaTF.setBackground(new Color(234, 111, 111));
        }
    }//GEN-LAST:event_CedulaTFCaretUpdate

    private void TelefonoTFCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_TelefonoTFCaretUpdate

        Validacion v = new Validacion();
        if (v.validarTelefono(TelefonoTF.getText())) {
            TelefonoTF.setBackground(Color.green);
        } else {

            TelefonoTF.setBackground(new Color(234, 111, 111));
        }
    }//GEN-LAST:event_TelefonoTFCaretUpdate

    private void CrearClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CrearClienteActionPerformed

        Cliente cliente = new Cliente(CedulaTF.getText(), NombreTF.getText(), ApellidoTF.getText(), TelefonoTF.getText(), DireccionTF.getText(), false, LocalDate.now());
        /*Map<String, Cliente> ListadoC = new HashMap<>();
        ListadoC.put(c + i, new Cliente(CedulaTF.getText(), NombreTF.getText(), ApellidoTF.getText(), TelefonoTF.getText(), DireccionTF.getText(), false, LocalDate.now()));
        Cliente v = ListadoC.get(c + i);*/
        GC.add(cliente);
        System.out.println("-----------------------------------");
        GC.Listar();
        CedulaTF.setText("");
        NombreTF.setText("");
        ApellidoTF.setText("");
        TelefonoTF.setText("");
        DireccionTF.setText("");
    }//GEN-LAST:event_CrearClienteActionPerformed

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
            java.util.logging.Logger.getLogger(FormAddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormAddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormAddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormAddClient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                FormAddClient dialog = new FormAddClient(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }
    
    public void CargarClientes(JComboBox<Cliente> ClientesCB){
        ClientesCB.removeAllItems();
        for (int i = 0; i < GC.Listar().size(); i++) {
        ClientesCB.addItem(GC.Listar().get(i));            
        }

    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField ApellidoTF;
    private javax.swing.JTextField CedulaTF;
    private javax.swing.JButton CrearCliente;
    private javax.swing.JTextField DireccionTF;
    private javax.swing.JTextField NombreTF;
    private javax.swing.JTextField TelefonoTF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables
}
