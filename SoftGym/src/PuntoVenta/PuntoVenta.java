/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PuntoVenta;

import Utilidades.usapv;
import java.awt.event.KeyEvent;
import java.util.Date;
import javax.swing.table.DefaultTableModel;
import softgym.Principal;
import Utilidades.SoftGym;

/**
 *
 * @author ErickFrancisco
 */
public class PuntoVenta extends javax.swing.JInternalFrame {

    /**
     * Creates new form PuntoVenta1
     */
    usapv pv = new usapv();
    public double total=0;
    public double cantprod=0;
    SoftGym prop=new SoftGym();
    public PuntoVenta() {
        initComponents();
        //SoftGym prop=new SoftGym();
        prop.leer();
        if(SoftGym.usuario.equals("normal")&&prop.ajustes.equals("false")){
            jButton4.setEnabled(false);
        }
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
        jTextField1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Punto de venta SOFTGYM");

        jPanel1.setBackground(new java.awt.Color(153, 255, 204));

        jTextField1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jTextField1KeyReleased(evt);
            }
        });

        jLabel1.setText("Codigo Barras:");

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código Barras", "Descripción Prod", "Cantidad", "Precio", "Total"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(jTable1);

        jButton1.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton1.setText("--Cobrar--");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        jButton1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jButton1KeyReleased(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel3.setText("TOTAL: $");

        jLabel4.setText("# Productos");

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel5.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jButton2.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jButton2.setText("Limpiar Venta");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton3.setText("Buscar Producto");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton4.setText("Inventario");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
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
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jButton4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 213, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3)
                        .addComponent(jButton3)
                        .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 241, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

   public void agregarcarrito(String id, double cantidad){
        DefaultTableModel dtm=(DefaultTableModel) jTable1.getModel();
        
        int aux=0;
        Object[][] producto=pv.get_inventario(id, "codigobarra");
        
        if(producto[aux][3]!=null&&Double.parseDouble(producto[aux][3].toString())>0){
         double prectot=(cantidad*Double.parseDouble(producto[aux][5].toString()));
         
          dtm.addRow(new Object[]{producto[aux][1],producto[aux][2],cantidad,producto[aux][5]
              ,prectot});
              total=total+prectot;
              cantprod=cantprod+cantidad;
              jLabel2.setText("$"+total);
              jLabel5.setText(""+cantprod);
              aux=aux+1;
        }
        
    }
    
   public void cobrar(){
       DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
       
       for(int i=0;i<dtm.getRowCount();i++){
           pv.in_movimiento(dtm.getValueAt(i, 0).toString(), "Salida", 
                   Double.parseDouble(dtm.getValueAt(i, 2).toString()), 
                   Double.parseDouble(dtm.getValueAt(i, 4).toString()), SoftGym.nombre, 
                   new Date());
           
           Object[][] inventario = pv.get_inventario(dtm.getValueAt(i, 0).toString(), "codigobarra");
           double cantidad= ((double)inventario[0][3])-1;
          // System.out.println(""+cantidad);
           pv.actualizar("Inventario", new Object[]{inventario[0][0],inventario[0][1],inventario[0][2],cantidad,inventario[0][4],inventario[0][5]});
           //System.out.println("Fecha: "+new Date());
       }
   }
   
    
    
    private void jTextField1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jTextField1KeyReleased
        // TODO add your handling code here:
        usapv db=new usapv();
        if(evt.getKeyCode()==KeyEvent.VK_ENTER){

            if(jTextField1.getText().equals("")){
                evt.consume();
            }
            String asd;
            asd=jTextField1.getText();
            if(db.get_inventario(asd, "codigobarra")!=null){
                agregarcarrito(asd,1);
                jTextField1.setText("");
            }

        }
    }//GEN-LAST:event_jTextField1KeyReleased
    
    private VentanaPago vi=null;
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        String aux = ""+total;
        
        DefaultTableModel dtm = (DefaultTableModel) jTable1.getModel();
       Object[][] productos=new Object[dtm.getRowCount()][5];
       for(int i=0;i<dtm.getRowCount();i++){
           productos[i][0]=dtm.getValueAt(i, 0);
           productos[i][1]=dtm.getValueAt(i, 1);
           productos[i][2]=dtm.getValueAt(i, 2);
           productos[i][3]=dtm.getValueAt(i, 3);
           productos[i][4]=dtm.getValueAt(i, 4);
       }
        
       if(vi==null||vi.isClosed()){
           vi = new VentanaPago();
            vi.Ventana(jLabel5.getText(), aux);
            vi.cobrar(productos);
            vi.setVisible(true);
            Principal.jDesktopPane1.add(vi);
            vi.moveToFront();
       }
       else{
           vi.moveToFront();
       }
       
        /*cobrar();
        jLabel5.setText("");
        jLabel2.setText("");
        DefaultTableModel dtm= (DefaultTableModel) jTable1.getModel();
        while(jTable1.getRowCount()!=0){
            dtm.removeRow(0);
        }*/
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        BuscarProducto bp = new BuscarProducto();
        //bp.setLocationRelativeTo(null);
        bp.setVisible(true);
        
        Principal.jDesktopPane1.add(bp);
        bp.toFront();
        bp.moveToFront();
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jButton1KeyReleased
        // TODO add your handling code here:
        if(evt.getKeyCode()==KeyEvent.VK_F2){
            jButton1ActionPerformed(null);
        }
    }//GEN-LAST:event_jButton1KeyReleased

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        while(jTable1.getRowCount()>0){
            ((DefaultTableModel)jTable1.getModel()).removeRow(0);
        }
        total=0;
        cantprod=0;
        jLabel5.setText("");
        jLabel2.setText("");
    }//GEN-LAST:event_jButton2ActionPerformed

    private Inventario in;
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        // TODO add your handling code here:
        if(in==null||in.isClosed()){
           in= new Inventario();
            //in.setLocationRelativeTo(null);
            in.setVisible(true);
            Principal.jDesktopPane1.add(in);
            in.toFront();
            in.moveToFront(); 
        }
        else{
            in.moveToFront(); 
        }
        
                  
    }//GEN-LAST:event_jButton4ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    private javax.swing.JTextField jTextField1;
    // End of variables declaration//GEN-END:variables
}