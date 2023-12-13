/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.view;

import com.model.ClientDTO;
import com.model.DBContext;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class IndexClients extends javax.swing.JFrame {

    DBContext db = new DBContext();
    
    public IndexClients() {
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

        jPanel1 = new javax.swing.JPanel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jLabel1 = new javax.swing.JLabel();
        roleFilter = new javax.swing.JComboBox<>();
        jLabel2 = new javax.swing.JLabel();
        documentFilter = new javax.swing.JTextField();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jButton1.setText("Buscar Clientes");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonSearchClient(evt);
            }
        });

        jButton2.setText("Crear Cliente");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateClient(evt);
            }
        });

        jButton3.setText("Modificar Cliente Seleccionado");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUpdateClient(evt);
            }
        });

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Documento", "Nombre", "Apellido", "Valor total de las Compras", "Cargo"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        jLabel1.setText("Buscar por cargo:");

        roleFilter.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "--Todos los cargos--", "Cajero", "Supervisor", "Proveedor" }));
        roleFilter.setName(""); // NOI18N

        jLabel2.setText("Buscar por documento:");

        documentFilter.setToolTipText("");

        jButton4.setText("Eliminar Cliente seleccionado");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonDeleteClient(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 564, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(roleFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jButton1)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(18, 18, 18)
                                .addComponent(documentFilter, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 106, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(127, 127, 127))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(roleFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(documentFilter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton3))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addGap(59, 59, 59)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(59, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonSearchClient(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonSearchClient
        GetClients();
    }//GEN-LAST:event_ButtonSearchClient

    private void ButtonCreateClient(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateClient
        CreateClient createClient = new CreateClient(this, true);
        createClient.setVisible(true);
        GetClients();
    }//GEN-LAST:event_ButtonCreateClient

    private void ButtonUpdateClient(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUpdateClient
        if(jTable1.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente para poderlo editar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            UpdateClient updateClient = new UpdateClient(this, rootPaneCheckingEnabled, db.ParseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
            updateClient.setVisible(true);
            GetClients();
        }
    }//GEN-LAST:event_ButtonUpdateClient

    private void ButtonDeleteClient(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonDeleteClient
        if(jTable1.getSelectedRow() == -1){
            JOptionPane.showMessageDialog(null, "Debe seleccionar un cliente para poderlo eliminar", "Error", JOptionPane.ERROR_MESSAGE);
        }
        else{
            int respuesta = JOptionPane.showConfirmDialog(
                null,
                "¿Estás seguro de querer eliminar el cliente "+jTable1.getValueAt(jTable1.getSelectedRow(), 2)+" "+jTable1.getValueAt(jTable1.getSelectedRow(), 3)+"?",
                "Eliminar Cliente",
                JOptionPane.YES_NO_OPTION);
            if (respuesta == JOptionPane.YES_OPTION) {
                try {
                    String mess = db.deleteClient(db.ParseInt(jTable1.getValueAt(jTable1.getSelectedRow(), 0).toString()));
                    JOptionPane.showMessageDialog(null, mess, "Éxito", JOptionPane.INFORMATION_MESSAGE);
                    GetClients();
                } catch (SQLException | ClassNotFoundException ex) {
                    Logger.getLogger(IndexClients.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }//GEN-LAST:event_ButtonDeleteClient

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
            java.util.logging.Logger.getLogger(IndexClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(IndexClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(IndexClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(IndexClients.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new IndexClients().setVisible(true);
            }
        });
    }
    
    public void GetClients(){
        int document = db.ParseInt(documentFilter.getText());
        String role = "";
        if(!documentFilter.getText().equals("") && document == 0){
            JOptionPane.showMessageDialog(null, "El documento solo admite valores numéricos", "Error", JOptionPane.ERROR_MESSAGE);
            return;
        }
        if(!roleFilter.getSelectedItem().toString().equals("") && !roleFilter.getSelectedItem().toString().equals("--Todos los cargos--")){
            role = roleFilter.getSelectedItem().toString();
        }
        DefaultTableModel model = new DefaultTableModel(); //Logger.getLogger(ListClient.class.getName()).log(Level.SEVERE, null, ex);
        
        model.addColumn("Id");
        model.addColumn("Documento");
        model.addColumn("Nombre");
        model.addColumn("Apellido");
        model.addColumn("Valor total de Compras");
        model.addColumn("Cargo");
        
        try {
            ArrayList<ClientDTO> clients;
            clients = db.getClients(document,role);
            for (ClientDTO client : clients) {
                Object[] row = {client.getId(),client.getDocument(), client.getName(),client.getLastname(),client.getPurchasevalue(),client.getRole()};
                model.addRow(row);
            }
            jTable1.setModel(model);
        } catch (SQLException | ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(null, ex.toString(), "Ocurrió un error con la base de datos", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField documentFilter;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> roleFilter;
    // End of variables declaration//GEN-END:variables
}
