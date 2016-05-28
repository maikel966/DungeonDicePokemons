
package Vistas;

import java.awt.event.ActionListener;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Michael
 */
public class VistaLogin extends javax.swing.JFrame {

    /**
     * Creates new form VistaLogin
     */
    public VistaLogin() {
        initComponents();
    }
    //SETTER
    public void setListener(ActionListener e){
        btnCancelar.addActionListener(e);
        btnIngresar.addActionListener(e);
        
    }
    /*********CAMBIAR BOTON DE LOGIN***************/
    public  void setActionCommandBoton(String opcion){
        this.btnIngresar.setActionCommand(opcion);
    }

    /********MOSTRAR MENSAJE ERROR POR VISTA**********/
    public  void setMensajeUsuario(String mensaje){
        lblMensajeUsuario.setText(mensaje);
    }
    public void setMensajeContrasena(String mensaje){
        lblMensajeContrasena.setText(mensaje);
    }/******************************************/
    
    public String getUsuario(){
        
        return txtUsuario.getText();
    }
    public String getContrasena(){
        return txtContrasena.getText();
    }
    
    
    

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtUsuario = new javax.swing.JTextField();
        btnIngresar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        lblMensajeUsuario = new javax.swing.JLabel();
        lblMensajeContrasena = new javax.swing.JLabel();
        txtContrasena = new javax.swing.JPasswordField();
        logoLogin = new javax.swing.JLabel();
        fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(600, 340));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(txtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(208, 101, 177, -1));

        btnIngresar.setText("Ingresar");
        btnIngresar.setActionCommand("ingresar");
        getContentPane().add(btnIngresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 125, 38));

        btnCancelar.setText("Cancelar");
        btnCancelar.setActionCommand("cancelar");
        getContentPane().add(btnCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 100, -1));
        getContentPane().add(lblMensajeUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 101, 127, 19));
        getContentPane().add(lblMensajeContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(389, 179, 158, -1));

        txtContrasena.setText("jPasswordField1");
        getContentPane().add(txtContrasena, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 150, 177, -1));

        logoLogin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/logoLogin.png"))); // NOI18N
        getContentPane().add(logoLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 240, 120));

        fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/Fondos/login.png"))); // NOI18N
        getContentPane().add(fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnIngresar;
    private javax.swing.JLabel fondo;
    private javax.swing.JLabel lblMensajeContrasena;
    private javax.swing.JLabel lblMensajeUsuario;
    private javax.swing.JLabel logoLogin;
    private javax.swing.JPasswordField txtContrasena;
    private javax.swing.JTextField txtUsuario;
    // End of variables declaration//GEN-END:variables
}
