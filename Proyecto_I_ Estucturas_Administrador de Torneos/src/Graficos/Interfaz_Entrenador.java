/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Graficos;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import Entidades.Entrenadores;
import Metodos.MetodosEntrenador;
/**
 *
 * @author Usuario
 */
public class Interfaz_Entrenador extends javax.swing.JFrame {

    
     MetodosEntrenador met =new MetodosEntrenador(); 
     
     DefaultListModel <String> ListModel = new DefaultListModel <>();// esto es para poder usar la jlist1
     
    public Interfaz_Entrenador() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setResizable(false);
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuBar3 = new javax.swing.JMenuBar();
        jMenu6 = new javax.swing.JMenu();
        jMenu7 = new javax.swing.JMenu();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jTextField4 = new javax.swing.JTextField();
        jSeparator3 = new javax.swing.JSeparator();
        jButton1_Insertar_Inicio_Un_Entrenador = new javax.swing.JButton();
        jButton2_busca_Entrenador_ = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jButton5_Agrgar_Al_Final_Entrenador_ = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        jMenuItem1.setText("jMenuItem1");

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenu6.setText("File");
        jMenuBar3.add(jMenu6);

        jMenu7.setText("Edit");
        jMenuBar3.add(jMenu7);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Administrador crear Entrenador");
        setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 102, 102));
        jLabel1.setText("Agregar Entrenador");

        jLabel2.setText("Nombre");

        jLabel3.setText("Identificacion");

        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(0, 102, 102));
        jLabel4.setText("Buscar Entrenador");

        jLabel5.setText("Nombre ");

        jLabel6.setText("Identificacion");

        jButton1_Insertar_Inicio_Un_Entrenador.setText("Agregar Inicio");
        jButton1_Insertar_Inicio_Un_Entrenador.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1_Insertar_Inicio_Un_EntrenadorActionPerformed(evt);
            }
        });

        jButton2_busca_Entrenador_.setText("Buscar");
        jButton2_busca_Entrenador_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2_busca_Entrenador_ActionPerformed(evt);
            }
        });

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jLabel10.setForeground(new java.awt.Color(0, 102, 102));
        jLabel10.setText("Mostrar");

        jScrollPane1.setViewportView(jList1);

        jButton5_Agrgar_Al_Final_Entrenador_.setText("Agregar Final");
        jButton5_Agrgar_Al_Final_Entrenador_.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5_Agrgar_Al_Final_Entrenador_ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel2))
                                .addGap(28, 28, 28)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(37, 37, 37)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jButton1_Insertar_Inicio_Un_Entrenador, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jButton5_Agrgar_Al_Final_Entrenador_, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel5))
                                .addGap(26, 26, 26)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(39, 39, 39)
                                        .addComponent(jButton2_busca_Entrenador_, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel4))
                        .addGap(259, 259, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel10)
                        .addGap(0, 537, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1)
                        .addContainerGap())
                    .addComponent(jSeparator1)
                    .addComponent(jSeparator3)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel1)
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton1_Insertar_Inicio_Un_Entrenador)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton5_Agrgar_Al_Final_Entrenador_))
                .addGap(18, 18, 18)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 11, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel6)
                        .addComponent(jButton2_busca_Entrenador_)))
                .addGap(28, 28, 28)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel10)
                .addGap(27, 27, 27)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 248, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45))
        );

        getAccessibleContext().setAccessibleName(" Entrenador");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    
    private void jButton1_Insertar_Inicio_Un_EntrenadorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1_Insertar_Inicio_Un_EntrenadorActionPerformed
        
        try
        {
        String nombre= jTextField1.getText();
        int    identificacion  = Integer.parseInt( jTextField2.getText());

        boolean verifica=met.verificaID(identificacion);
        if (verifica == false)
        {
            String insertado= met.InsertarInicio(nombre, identificacion);
            JOptionPane.showMessageDialog(null, insertado); 
            imprimir();
        }
        else
        {
            JOptionPane.showMessageDialog(null, "La ID no se encuentra disponible"); 
        }
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al Ingresar los Datos");
        }
    }//GEN-LAST:event_jButton1_Insertar_Inicio_Un_EntrenadorActionPerformed

    public void imprimir()
    {
        ListModel.clear();
        if (met.inicio==met.inicio.sig)
        {
          ListModel.addElement(met.inicio.getNombre() +"  "+ met.inicio.getId());// muestra en ListModel el nombre y la edad del Cliente
        }
        else
        {
            Entrenadores temp = met.inicio;
            Entrenadores  aux = met.inicio;
            while(aux.sig != temp)
            {
                ListModel.addElement(aux.getNombre() +"  "+ aux.getId());// muestra en ListModel el nombre y la edad del Cliente
                aux=aux.sig;
            }
            ListModel.addElement(aux.getNombre()+"  "+ aux.getId());
        }
        jList1.setModel(ListModel);
        
    }
    
    
    private void jButton5_Agrgar_Al_Final_Entrenador_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5_Agrgar_Al_Final_Entrenador_ActionPerformed
       
        try
        {
            
            String nombre= jTextField1.getText();
            int    identificacion  = Integer.parseInt( jTextField2.getText());
            
            boolean verifica=met.verificaID(identificacion);
            if (verifica==false)
            {
                String insertado= met.InsertarFinal(nombre,identificacion);
                JOptionPane.showMessageDialog(null, insertado);
                imprimir();
            }
            else
            {
                JOptionPane.showMessageDialog(null, "La ID no se encuentra disponible");
            }
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al Ingresar los Datos");
        }
    }//GEN-LAST:event_jButton5_Agrgar_Al_Final_Entrenador_ActionPerformed

    private void jButton2_busca_Entrenador_ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2_busca_Entrenador_ActionPerformed
       try
        {
            String nombre= jTextField3.getText();
            int    id  = Integer.parseInt( jTextField4.getText());

            boolean insertado= met.buscarEntrenador(nombre, id);
            if (insertado==true)
            {
                JOptionPane.showMessageDialog(null, "Fue encontrado");
            }
            else
            {
            JOptionPane.showMessageDialog(null, "No fue encontrado");
            }
        }
        catch (Exception e) 
        {
            JOptionPane.showMessageDialog(null, "Error al Ingresar los Datos");
        }
    }//GEN-LAST:event_jButton2_busca_Entrenador_ActionPerformed
    
    
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
            java.util.logging.Logger.getLogger(Interfaz_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz_Entrenador.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz_Entrenador().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1_Insertar_Inicio_Un_Entrenador;
    private javax.swing.JButton jButton2_busca_Entrenador_;
    private javax.swing.JButton jButton5_Agrgar_Al_Final_Entrenador_;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuBar jMenuBar3;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables
}
