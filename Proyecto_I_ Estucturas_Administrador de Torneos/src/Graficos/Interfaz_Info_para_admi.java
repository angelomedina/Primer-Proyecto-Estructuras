/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;

import Entidades.Enlace_Jugador_Equipo;
import Entidades.Enlace_Torneo_Equipos;
import Entidades.Entrenadores;
import Entidades.Equipos;
import Entidades.Jugadores;
import Entidades.Torneos;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Usuario
 */
public class Interfaz_Info_para_admi extends javax.swing.JFrame {
      
    DefaultTableModel entrenadores; 
    DefaultTableModel jugadores; 
    DefaultTableModel equipos; 
    DefaultTableModel torneo; 
    DefaultTableModel enlace1; 
    
    //info para limpiar tabla
    static ResultSet rs;
    static Statement st;
    static Connection conn;
    DefaultTableModel temp;
    

    /**
     * Creates new form Interfaz_Info
     */
    public Interfaz_Info_para_admi() {
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

        _Atras_ = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        _Mostrar_Entrenadores_ = new javax.swing.JButton();
        _Mostrar_Equipos_ = new javax.swing.JButton();
        _Mostrar_Jugadores_ = new javax.swing.JButton();
        _Mostrar_Torneo_ = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        _Mostrar_Enlace1_ = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        _imprime_entrendor_de_equipo_ = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        _imprime_jugador_por_equipo_ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        _Atras_.setText("Atras");
        _Atras_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _Atras_ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setText("Ver Entrenadores");

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel2.setText("Ver Equipos");

        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel3.setText("Ver Jugadores");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setText("Ver Torneo");

        _Mostrar_Entrenadores_.setText("Mostrar");
        _Mostrar_Entrenadores_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _Mostrar_Entrenadores_ActionPerformed(evt);
            }
        });

        _Mostrar_Equipos_.setText("Mostrar");
        _Mostrar_Equipos_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _Mostrar_Equipos_ActionPerformed(evt);
            }
        });

        _Mostrar_Jugadores_.setText("Mostrar");
        _Mostrar_Jugadores_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _Mostrar_Jugadores_ActionPerformed(evt);
            }
        });

        _Mostrar_Torneo_.setText("Mostrar");
        _Mostrar_Torneo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _Mostrar_Torneo_ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel5.setText("Ver Enlaces Equipo a Torneo");

        _Mostrar_Enlace1_.setText("Mostrar");
        _Mostrar_Enlace1_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _Mostrar_Enlace1_ActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(0, 102, 102));
        jLabel6.setText("Ver la Informacion que puede crear el Administrador");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel8.setText("Ver Enlaces Entrenador a Equipo ");

        _imprime_entrendor_de_equipo_.setText("Mostrar");
        _imprime_entrendor_de_equipo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _imprime_entrendor_de_equipo_ActionPerformed(evt);
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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel7.setText("Ver Enlaces Jugador a Equipo");

        _imprime_jugador_por_equipo_.setText("Mostrar");
        _imprime_jugador_por_equipo_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                _imprime_jugador_por_equipo_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(_Atras_))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(68, 68, 68)
                                .addComponent(_imprime_jugador_por_equipo_, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(_Mostrar_Enlace1_)
                                    .addComponent(_Mostrar_Torneo_)
                                    .addComponent(_Mostrar_Jugadores_)
                                    .addComponent(_Mostrar_Equipos_)
                                    .addComponent(_Mostrar_Entrenadores_)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(45, 45, 45)
                                .addComponent(_imprime_entrendor_de_equipo_)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(26, 26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(_Atras_))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(_Mostrar_Entrenadores_))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(_Mostrar_Equipos_))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel3)
                            .addComponent(_Mostrar_Jugadores_))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(_Mostrar_Torneo_))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(_Mostrar_Enlace1_))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(_imprime_entrendor_de_equipo_))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(_imprime_jugador_por_equipo_)
                            .addComponent(jLabel7))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 302, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 29, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void _Mostrar_Entrenadores_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__Mostrar_Entrenadores_ActionPerformed
    
        imprimirEntrenadores();
    }//GEN-LAST:event__Mostrar_Entrenadores_ActionPerformed

    private void _Mostrar_Equipos_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__Mostrar_Equipos_ActionPerformed
    
       imprimirEquipos();
    }//GEN-LAST:event__Mostrar_Equipos_ActionPerformed

    private void _Mostrar_Jugadores_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__Mostrar_Jugadores_ActionPerformed
    
        imprimirJugadores();
    }//GEN-LAST:event__Mostrar_Jugadores_ActionPerformed

    private void _Mostrar_Torneo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__Mostrar_Torneo_ActionPerformed

      imprimirTorneo();                         
    }//GEN-LAST:event__Mostrar_Torneo_ActionPerformed

    private void _Mostrar_Enlace1_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__Mostrar_Enlace1_ActionPerformed
       
        imprimir_equios_por_torneo();  
        
    }//GEN-LAST:event__Mostrar_Enlace1_ActionPerformed

    private void _Atras_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__Atras_ActionPerformed
        Interfaz_Login.principal.setVisible(true);
        this.dispose();
    }//GEN-LAST:event__Atras_ActionPerformed

    private void _imprime_entrendor_de_equipo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__imprime_entrendor_de_equipo_ActionPerformed
       
        imprimirEquiposEntrenador();
       
    }//GEN-LAST:event__imprime_entrendor_de_equipo_ActionPerformed

    private void _imprime_jugador_por_equipo_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event__imprime_jugador_por_equipo_ActionPerformed
  
        
        
        ImprimirJugadorXEquipo();
        

        //Interfaz_Login.info2.ImprimirJugadorXEquipo();
    }//GEN-LAST:event__imprime_jugador_por_equipo_ActionPerformed

  
     void limpiaTabla(){
        try{
            temp = (DefaultTableModel) jTable1.getModel();
            int a =temp.getRowCount()-1;
            for(int i=0; i<a; i++)
                temp.removeRow(i);
        }catch(Exception e){
            System.out.println(e);
        }
    }
    
     
     public void refrescar()
     {
           equipos.setColumnCount(0);
           equipos.setRowCount(0);
     }
    
     public void ImprimirJugadorXEquipo()
    {
        
      
        
        
        //Tabla para Equipos
        String titulo3[]={"Equipo","Jugador"};
        String datos3[][]={};
        equipos=new DefaultTableModel(datos3,titulo3);
        jTable1.setModel(equipos);
        
        
        if (Interfaz_Login.metE.inicio==Interfaz_Login.metE.inicio.sig)
        {
          //Tabla para Equipos
          if(Interfaz_Login.metE.inicio.sigSub1 != null)
          {
              
            Enlace_Jugador_Equipo  sub=Interfaz_Login.metE.inicio.sigSub1;
            while(sub != null) 
            { 
            Object datos[]={Interfaz_Login.metE.inicio.nombre,Interfaz_Login.metE.inicio.sigSub1.sigJugador.getNombre()};
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
                if(aux.sigSub1 != null)
                {
                    Enlace_Jugador_Equipo  sub=aux.sigSub1;
                    while(sub != null) 
                    { 
                    Object datos[]={aux.nombre,sub.sigJugador.getNombre()};
                    equipos.addRow(datos);
                    sub=sub.sig;
                    }
                }
                aux=aux.sig;
            }
            if(aux.sigSub1 != null)
            {
                Enlace_Jugador_Equipo  sub=aux.sigSub1;
                    while(sub != null) 
                    { 
                    Object datos[]={aux.nombre,sub.sigJugador.getNombre()};
                    equipos.addRow(datos);
                    sub=sub.sig;
                    }
            }
        }   
    }
    
     
     //fecha 04/04/17
    // por este metodo va a imprimir por cada torneo sus integrantes
    public void imprimir_equios_por_torneo()  
    {
   
        //Tabla para Torneo
        String titulo1[]={"Torneo","Equipo"};
        String datos1[][]={};
        enlace1=new DefaultTableModel(datos1,titulo1);
        jTable1.setModel(enlace1);
        
        
        if (Interfaz_Login.metE.inicio==null)
        {
            JOptionPane.showMessageDialog(null, "Lista Vacia");
        }
        
        else
        {          
            Torneos torneo = Interfaz_Login.metT.inicio;    // entro a los Torneo
            while(  torneo != null)
            { 
              Equipos equipo = Interfaz_Login.metE.inicio;
              if(equipo==null)
              {
                JOptionPane.showMessageDialog(null,"Lista de equipos esta vacia");
                break;
              }
              else
              {
 
                while(equipo != Interfaz_Login.metE.fin)
                {
                    Enlace_Torneo_Equipos  enlace =equipo.sigSub;
                    while(enlace != null)
                    {
                        if(enlace.sigTorneo==torneo)
                        {
                            //Tabal Enlace1
                            Object datos[]={torneo.nombre ,equipo.nombre};
                            enlace1.addRow(datos);
                            break;
                        }
                        enlace=enlace.sig; // avanzo con los enlces

                    }
                    equipo=equipo.sig;
                }
                if(Interfaz_Login.metE.fin.sigSub.sigTorneo==torneo)
                {
                    //Tabal Enlace1
                    Object datos[]={torneo.nombre ,equipo.nombre};
                    enlace1.addRow(datos);
                    break;
                }
                
              }
              torneo=torneo.sig;
            }
            
        }
    }  
      
     

    
    public void imprimirTorneo(){
        //Tabla para Torneo
        String titulo1[]={"Nombre"};
        String datos1[][]={};
        torneo=new DefaultTableModel(datos1,titulo1);
        jTable1.setModel(torneo);
 
        Torneos temp =Interfaz_Login.metT.inicio;
        while(temp != null)
        {
        //Tabal Entrenadores
        Object datos[]={temp.nombre};
        torneo.addRow(datos);
          
        temp=temp.sig;
        } 
    }
    
    public void imprimirEntrenadores()
    {
        //Tabla para Entrenadores
        String titulo1[]={"Nombre","Identificacion"};
        String datos1[][]={};
        entrenadores=new DefaultTableModel(datos1,titulo1);
        jTable1.setModel(entrenadores);
        
        if (Interfaz_Login.metEn.inicio==Interfaz_Login.metEn.inicio.sig)
        {
          //Tabal Entrenadores
          Object datos[]={Interfaz_Login.metEn.inicio.getNombre(),Interfaz_Login.metEn.inicio.getId()};
          entrenadores.addRow(datos);
        }
        else
        {
            Entrenadores temp = Interfaz_Login.metEn.inicio;
            Entrenadores  aux = Interfaz_Login.metEn.inicio;
            while(aux.sig != temp)
            {
                //Tabal Entrenadores
                Object datos[]={aux.getNombre(),aux.getId()};
                entrenadores.addRow(datos);
                
                aux=aux.sig;
            }
            //Tabal Entrenadores
            Object datos[]={aux.getNombre(),aux.getId()};
            entrenadores.addRow(datos);
        }
        
    }
    
     public void imprimirEquipos()
    {
               
        //Tabla para Equipos
        String titulo3[]={"Nombre","Codigo"};
        String datos3[][]={};
        equipos=new DefaultTableModel(datos3,titulo3);
        jTable1.setModel(equipos);
        
        if (Interfaz_Login.metE.inicio==Interfaz_Login.metE.inicio.sig)
        {
          //Tabla para Equipos
          Object datos[]={Interfaz_Login.metE.inicio.nombre,Interfaz_Login.metE.inicio.codigo};
          equipos.addRow(datos);
        }
        else
        {
            Equipos temp = Interfaz_Login.metE.inicio;
            Equipos aux = Interfaz_Login.metE.inicio;
            while(aux.sig != temp)
            {
                //Tabla para Equipos
                Object datos[]={aux.nombre,aux.codigo};
                equipos.addRow(datos);
                
                aux=aux.sig;
            }
            //Tabla para Equipos
            Object datos[]={aux.nombre,aux.codigo};
            equipos.addRow(datos);
        }
    }
     
    public void imprimirJugadores(){
        
         
        //Tabla para Jugadores
        String titulo2[]={"Nombre","Cedula","Posicion","Valor"};
        String datos2[][]={};
        jugadores=new DefaultTableModel(datos2,titulo2);
        jTable1.setModel(jugadores);
        
        Jugadores temp = Interfaz_Login.metJ.inicio;
        while(temp != null)
        {
        //Tabla de Jugadores
        Object datos[]={temp.getNombre(),temp.getCedula(),temp.getPosicion(),temp.getValor()+" $"};
        jugadores.addRow(datos);
        
        temp=temp.sig;
        }  
    }
    
    
    public void imprimirEquiposEntrenador()
    {
               
        //Tabla para Equipos
        String titulo3[]={"Equipo","Entrenador"};
        String datos3[][]={};
        equipos=new DefaultTableModel(datos3,titulo3);
        jTable1.setModel(equipos);
        
        if (Interfaz_Login.metE.inicio==Interfaz_Login.metE.inicio.sig)
        {
          //Tabla para Equipos
          Object datos[]={Interfaz_Login.metE.inicio.nombre,Interfaz_Login.metE.inicio.nombreEntrenador};
          equipos.addRow(datos);
        }
        else
        {
            Equipos temp = Interfaz_Login.metE.inicio;
            Equipos aux = Interfaz_Login.metE.inicio;
            while(aux.sig != temp)
            {
                //Tabla para Equipos
                Object datos[]={aux.nombre,aux.nombreEntrenador};
                equipos.addRow(datos);
                
                aux=aux.sig;
            }
            //Tabla para Equipos
            Object datos[]={aux.nombre,aux.nombreEntrenador};
            equipos.addRow(datos);
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
            java.util.logging.Logger.getLogger(Interfaz_Info_para_admi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Info_para_admi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Info_para_admi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Info_para_admi.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Info_para_admi().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton _Atras_;
    private javax.swing.JButton _Mostrar_Enlace1_;
    private javax.swing.JButton _Mostrar_Entrenadores_;
    private javax.swing.JButton _Mostrar_Equipos_;
    private javax.swing.JButton _Mostrar_Jugadores_;
    private javax.swing.JButton _Mostrar_Torneo_;
    private javax.swing.JButton _imprime_entrendor_de_equipo_;
    private javax.swing.JButton _imprime_jugador_por_equipo_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane2;
    javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
