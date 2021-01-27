/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vistas;


//import Modelo.Vendedor;
import Modelo.Entidadvendedor;
import Modelo.VendedorDAO;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public final class VendedorForm extends javax.swing.JInternalFrame {

    VendedorDAO dao = new VendedorDAO();
    Entidadvendedor ven = new Entidadvendedor();
    
    DefaultTableModel modelo = new DefaultTableModel();
    
    int idven;
    
    public VendedorForm() {
        initComponents();
        listar();
    }
   
    void listar(){
       List<Entidadvendedor> lista = dao.listar();
       modelo = (DefaultTableModel)tablaven.getModel();
       Object[]ob = new Object[6];
       for (int i = 0; i < lista.size(); i++){
           ob[0] = lista.get(i).getId();
           ob[1] = lista.get(i).getDni();
           ob[2] = lista.get(i).getNombre();
           ob[3] = lista.get(i).getTelefono();
           ob[4] = lista.get(i).getEstado();
           ob[5] = lista.get(i).getUser();
           modelo.addRow(ob);
           
       }
       tablaven.setModel(modelo);
   }
    

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        txtDniVen = new javax.swing.JTextField();
        txtNomVen = new javax.swing.JTextField();
        txtTelVen = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        btnagregar = new javax.swing.JButton();
        agregar = new javax.swing.JButton();
        btactualizar = new javax.swing.JButton();
        bteliminar = new javax.swing.JButton();
        btnuevo = new javax.swing.JButton();
        cboEstven = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tablaven = new javax.swing.JTable();

        jButton2.setText("jButton2");

        jButton3.setText("jButton3");

        setClosable(true);
        setTitle("Vendedor");

        jLabel1.setText("DNI:");

        jLabel2.setText("NOMBRES:");

        jLabel3.setText("TELEFONO:");

        jLabel4.setText("ESTADO:");

        jLabel5.setText("USUARIO:");

        btnagregar.setText("AGREGAR");
        btnagregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnagregarActionPerformed(evt);
            }
        });

        agregar.setText("AGREGAR");
        agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                agregarActionPerformed(evt);
            }
        });

        btactualizar.setText("ACTUALIZAR");
        btactualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btactualizarActionPerformed(evt);
            }
        });

        bteliminar.setText("ELIMINAR");
        bteliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bteliminarActionPerformed(evt);
            }
        });

        btnuevo.setText("NUEVO");
        btnuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnuevoActionPerformed(evt);
            }
        });

        cboEstven.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "SELECCIONAR", "1", "0" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtDniVen)
                    .addComponent(txtNomVen)
                    .addComponent(txtTelVen)
                    .addComponent(txtUser, javax.swing.GroupLayout.DEFAULT_SIZE, 159, Short.MAX_VALUE)
                    .addComponent(cboEstven, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(74, 74, 74)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(btnagregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btactualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(bteliminar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(btnuevo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(agregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(99, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(txtDniVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnagregar)))
                        .addGap(7, 7, 7)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNomVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtTelVen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(cboEstven, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(agregar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btactualizar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bteliminar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnuevo)))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        tablaven.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "DNI", "NOMBRES", "TELEFONO", "ESTADO", "USUARIO"
            }
        ));
        tablaven.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tablavenMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tablaven);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 520, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnagregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnagregarActionPerformed
        agregar();
        limpiartabla();
        listar ();
        nuevo();
    }//GEN-LAST:event_btnagregarActionPerformed

    private void btactualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btactualizarActionPerformed
        actualizar();
        limpiartabla();
        listar();
        nuevo();
    }//GEN-LAST:event_btactualizarActionPerformed

    private void bteliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bteliminarActionPerformed
        eliminar();
        limpiartabla();
        listar();
        nuevo();
    }//GEN-LAST:event_bteliminarActionPerformed

    private void btnuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnuevoActionPerformed
        nuevo();
    }//GEN-LAST:event_btnuevoActionPerformed

    private void tablavenMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tablavenMouseClicked
        int fila = tablaven.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(this,"Debe seleccionar una fila");
        }else{
            idven = Integer.parseInt(tablaven.getValueAt(fila, 0).toString());
            String dni = tablaven.getValueAt(fila, 1).toString();
            String nombres = tablaven.getValueAt(fila, 2).toString();
            String telefono = tablaven.getValueAt(fila, 3).toString();
            String estado = tablaven.getValueAt(fila, 4).toString();
            String user = tablaven.getValueAt(fila, 5).toString();
            txtDniVen.setText(dni);
            txtNomVen.setText(nombres);
            txtTelVen.setText(telefono);
            cboEstven.setSelectedItem(estado); 
            txtUser.setText(user);
        }
    }//GEN-LAST:event_tablavenMouseClicked

    private void agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_agregarActionPerformed
        agregar();
        limpiartabla();
        listar ();
        nuevo();
    }//GEN-LAST:event_agregarActionPerformed

    void agregar(){
        String dni = txtDniVen.getText();
        String nombres = txtNomVen.getText();
        String telefono = txtTelVen.getText();
        String estado = cboEstven.getSelectedItem().toString();
        String user = txtUser.getText();
        Object[] ob = new Object[5];
        ob[0] = dni;
        ob[1] = nombres;
        ob[2] = telefono;
        ob[3] = estado;
        ob[4] = user;
        dao.add(ob);
    }
    
    void actualizar(){
        int fila = tablaven.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }else{
            String dni = txtDniVen.getText();
            String nombres = txtNomVen.getText();
            String telefono = txtTelVen.getText();
            String estado = cboEstven.getSelectedItem().toString();
            String user = txtUser.getText();
            Object[]ob = new Object[6];        
            ob[0] = dni;
            ob[1] = nombres;
            ob[2] = telefono;
            ob[3] = estado;
            ob[4] = user;
            ob[5] = idven;
            dao.actualizar(ob);
        }
    }
    
    void eliminar(){
        int fila = tablaven.getSelectedRow();
        if (fila == -1){
            JOptionPane.showMessageDialog(this, "Debe seleccionar una fila");
        }else{
            dao.eliminar(idven);
        }
    }
    
    void nuevo(){
        txtNomVen.setText("");
        txtTelVen.setText("");
        txtDniVen.setText("");
        cboEstven.setSelectedItem(0);
        txtUser.setText("");
        txtDniVen.requestFocus();
    }
    
    void limpiartabla(){
        for(int i = 0; i < modelo.getRowCount(); i++){
            modelo.removeRow(i);
            i = i-1;
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton agregar;
    private javax.swing.JButton btactualizar;
    private javax.swing.JButton bteliminar;
    private javax.swing.JButton btnagregar;
    private javax.swing.JButton btnuevo;
    private javax.swing.JComboBox<String> cboEstven;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tablaven;
    private javax.swing.JTextField txtDniVen;
    private javax.swing.JTextField txtNomVen;
    private javax.swing.JTextField txtTelVen;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
