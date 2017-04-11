/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import Entidades.Entrenadores;
import Entidades.Equipos;
import Entidades.Torneos;
import Metodos.*;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Admi
 */
public class Interfaz_Login extends javax.swing.JFrame {
  
    
  
     
     
    //interfaces
    public static Interfaz_Info_para_admi                  info  = new Interfaz_Info_para_admi();
    public static Interfaz_MenuPrincipal         principal  = new Interfaz_MenuPrincipal();
    public static Interfaz_Entrenador            entrenador = new Interfaz_Entrenador();
    public static Interfaz_Jugadores             jugadores  = new Interfaz_Jugadores();
    public static Interfaz_Torneo                torneo     = new Interfaz_Torneo();
    public static Interfaz_Equipos               equipos    = new Interfaz_Equipos();
    public static Interfaz_Enlaces               enlaces   =  new Interfaz_Enlaces();
    public static Interfaz_Estadio               estadio   =  new Interfaz_Estadio();
    public static Interfaz_Usuario_Entrenador      userEntrenador  =  new Interfaz_Usuario_Entrenador();
    public static Interfaz_Usuario_Entrenador_Comprar_Enlazar      enlaceJE  =  new Interfaz_Usuario_Entrenador_Comprar_Enlazar();
    public static Interfaz_Info_para_entrenador     info2  =  new Interfaz_Info_para_entrenador();
    
    
    
    //metodos
    public static Metodos_Enlace_Torneo_Equipo     metET =  new Metodos_Enlace_Torneo_Equipo();
    public static MetodosEquipos                   metE  =  new MetodosEquipos();
    public static MetodosEntrenador                metEn =  new MetodosEntrenador(); 
    public static MetodosJugadores                 metJ  =  new MetodosJugadores();
    public static MetodosTorneo                    metT  =  new MetodosTorneo();
    public static Metodos_Enlace_Entrenador_Equipo metEnE  =  new Metodos_Enlace_Entrenador_Equipo();
    public static MetodosLogin                     metL  =  new MetodosLogin();
    public static Metodos_Enlace_Jugador_Equipo                 metJE  = new Metodos_Enlace_Jugador_Equipo();
    
    
    
    
    
    
    /**
     * Creates new form Login
     */
    public Interfaz_Login(MetodosLogin metodos) {  
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
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
        nombreUsuarioTxt = new javax.swing.JTextField();
        contraseñaTxt = new javax.swing.JTextField();
        IngresarBtn = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Log In");
        setPreferredSize(new java.awt.Dimension(583, 360));

        jLabel1.setText("Nombre de usuario:");

        jLabel2.setText("Contraseña:");

        IngresarBtn.setText("Ingresar");
        IngresarBtn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                IngresarBtnMouseClicked(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 18)); // NOI18N
        jLabel3.setText("Log In");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(nombreUsuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(contraseñaTxt, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(IngresarBtn))))
                .addContainerGap(195, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(nombreUsuarioTxt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(contraseñaTxt, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(IngresarBtn)
                .addContainerGap(167, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    public Equipos verificaEntrenador_en_Equipo(String nombreEntrenador)
    {
        if (Interfaz_Login.metE.inicio==Interfaz_Login.metE.inicio.sig)
        {
            if(Interfaz_Login.metE.inicio.nombreEntrenador.equals(nombreEntrenador))
            {
                return Interfaz_Login.metE.inicio;
            }
          
        }
        else
        {
            Equipos temp = Interfaz_Login.metE.inicio;
            Equipos aux = Interfaz_Login.metE.inicio;
            while(aux.sig != temp)
            {
                if(aux.nombreEntrenador != null  && aux.nombreEntrenador.equals(nombreEntrenador))
                {
                    return aux;
                }
                aux=aux.sig;
            }
            if(aux.nombreEntrenador != null  && aux.nombreEntrenador.equals(nombreEntrenador))
            {
                    return aux;
            }
        }
        
        return null;
    }
    
    
 
    
    
    
    
    private void IngresarBtnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_IngresarBtnMouseClicked
        
        
        
        // TODO add your handling code here:
        String nombreUsuario = nombreUsuarioTxt.getText();
        String contraseña = contraseñaTxt.getText();
        int contraEntrenadores=Integer.parseInt(contraseñaTxt.getText());
               
        if (nombreUsuario.equals("Fifa") && contraseña.equals("123"))
        {
            Interfaz_Login.principal.setVisible(true);
            this.dispose();
            
        }
        else
        {
            Equipos verifica=verificaEntrenador_en_Equipo(nombreUsuario);
            
            if(verifica != null)
            {
                int bandera=0;
                for(Entrenadores i:Interfaz_Login.metL.entrenadores){
                    if(i.getNombre().equals(nombreUsuario) && i.getId()==contraEntrenadores)
                    {
                        bandera=1;

                        //
                        Interfaz_Login.userEntrenador.jLabel2.setText(nombreUsuario );
                        Interfaz_Login.userEntrenador.jLabel4.setText(verifica.nombre );
                        Interfaz_Login.enlaceJE.jLabel6.setText(Integer.toString(verifica.dinero));
                        //
                        Interfaz_Login.userEntrenador.setVisible(true);
                        this.dispose();
                    }
                }
                if(bandera==0)
                {
                JOptionPane.showMessageDialog(null,"Incorrecto");
                }
            }
            else
            {
                JOptionPane.showMessageDialog(null,"El usuario ingresado no se encontro vinculado a un equipo");
            }
            
  
        }
        
        
    }//GEN-LAST:event_IngresarBtnMouseClicked

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
            java.util.logging.Logger.getLogger(Interfaz_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Login(new MetodosLogin()).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton IngresarBtn;
    private javax.swing.JTextField contraseñaTxt;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField nombreUsuarioTxt;
    // End of variables declaration//GEN-END:variables
}
