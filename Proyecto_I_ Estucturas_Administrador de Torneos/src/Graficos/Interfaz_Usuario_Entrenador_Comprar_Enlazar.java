/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import Entidades.Enlace_Jugador_Equipo;
import Entidades.Equipos;
import Entidades.Jugadores;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Interfaz_Usuario_Entrenador_Comprar_Enlazar extends javax.swing.JFrame {

    DefaultTableModel equipos;
    /**
     * Creates new form Interfaz_Usuario_Entrenador_Enlazar_JE
     */
    public Interfaz_Usuario_Entrenador_Comprar_Enlazar() {
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
        jLabel3 = new javax.swing.JLabel();
        jTextField2 = new javax.swing.JTextField();
        _enlazar_Jugador_Entrenador_ = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Usuario Entrenador Enlazar Jugador con Equipo");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 153, 153));
        jLabel1.setText("Enlazar Jugadores a Equipo");

        jLabel2.setText("Nombre de mi  Equipo");

        jLabel3.setText("Nombre del Jugador");

        _enlazar_Jugador_Entrenador_.setText("Comprar");
        _enlazar_Jugador_Entrenador_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _enlazar_Jugador_Entrenador_ActionPerformed(evt);
            }
        });

        jButton2.setText("Atras");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane2.setViewportView(jTable1);

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 0));
        jLabel4.setText("jLabel4");

        jLabel5.setText("Dinero de mi Equipo");

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 0));
        jLabel6.setText("jLabel6");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel6)
                                .addComponent(jLabel4))
                            .addComponent(_enlazar_Jugador_Entrenador_)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 452, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jButton2))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(9, 9, 9)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(_enlazar_Jugador_Entrenador_))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        
        Interfaz_Login.userEntrenador.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void _enlazar_Jugador_Entrenador_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__enlazar_Jugador_Entrenador_ActionPerformed
        try
        {
            String nombreEquipo=Interfaz_Login.userEntrenador.jLabel4.getText();
            String nombreJugador=jTextField2.getText();
     
            //String insertado=Interfaz_Login.metJE.enlazarEquipoJugador(nombreEquipo, nombreJugador);
            String insertado=Interfaz_Login.metJE.enlazarEquipoJugadorLibre(nombreEquipo, nombreJugador);
            JOptionPane.showMessageDialog(null,insertado);
            Imprimir(nombreEquipo);
            
            
        }
        catch(Exception e)
        {
            JOptionPane.showMessageDialog(null,"Error al ingresar los datos");
        }
    }//GEN-LAST:event__enlazar_Jugador_Entrenador_ActionPerformed

    public void Imprimir(String nombreEquipo)
    {
        //Tabla para Equipos
        String titulo3[]={"Nombre","Jugador","Posicion"};
        String datos3[][]={};
        equipos=new DefaultTableModel(datos3,titulo3);
        jTable1.setModel(equipos);
        
        if (Interfaz_Login.metE.inicio==Interfaz_Login.metE.inicio.sig && Interfaz_Login.metE.inicio.nombre.equals(nombreEquipo) )
        {
          //Tabla para Equipos
          if(Interfaz_Login.metE.inicio.sigSub1 != null)
          {
              
            Enlace_Jugador_Equipo  sub=Interfaz_Login.metE.inicio.sigSub1;
            while(sub != null) 
            { 
            Object datos[]={Interfaz_Login.metE.inicio.nombre,Interfaz_Login.metE.inicio.sigSub1.sigJugador.getNombre(),Interfaz_Login.metE.inicio.sigSub1.sigJugador.getPosicion()};
            equipos.addRow(datos);
            sub=sub.sig;
            
            }
          }
        }
        else
        {
            Equipos temp = Interfaz_Login.metE.inicio;
            Equipos aux = Interfaz_Login.metE.inicio;
            
            while(aux.sig != temp)
            {
               //Tabla para Equipos
                if(aux.sigSub1 != null && aux.nombre.equals(nombreEquipo))
                {
                    Enlace_Jugador_Equipo  sub=aux.sigSub1;
                    while(sub != null) 
                    { 
                    Object datos[]={aux.nombre,sub.sigJugador.getNombre(),sub.sigJugador.getPosicion()};
                    equipos.addRow(datos);
                    sub=sub.sig;
                    }
                }
                aux=aux.sig;
            }
            if(aux.sigSub1 != null && aux.nombre.equals(nombreEquipo))
            {
                Enlace_Jugador_Equipo  sub=aux.sigSub1;
                    while(sub != null) 
                    { 
                    Object datos[]={aux.nombre,sub.sigJugador.getNombre(),sub.sigJugador.getPosicion()};
                    equipos.addRow(datos);
                    sub=sub.sig;
                    }
            }
        }   
    }
    
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
            java.util.logging.Logger.getLogger(Interfaz_Usuario_Entrenador_Comprar_Enlazar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Usuario_Entrenador_Comprar_Enlazar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Usuario_Entrenador_Comprar_Enlazar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Usuario_Entrenador_Comprar_Enlazar.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Usuario_Entrenador_Comprar_Enlazar().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _enlazar_Jugador_Entrenador_;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    public javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField2;
    // End of variables declaration//GEN-END:variables
}
