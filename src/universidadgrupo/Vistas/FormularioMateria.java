/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo.Vistas;

import javax.swing.JOptionPane;
import universidadgrupo.AccesoDatos.MateriaData;
import universidadgrupo.entidades.Materia;


public class FormularioMateria extends javax.swing.JInternalFrame {

  private MateriaData matData= new MateriaData();
  private Materia materiaActual= null;
  
  
    public FormularioMateria() {
        initComponents();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTAño = new javax.swing.JTextField();
        jREstado = new javax.swing.JRadioButton();
        jBuscar = new javax.swing.JButton();
        jBLimpiar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBsalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Engravers MT", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MATERIA");

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel2.setText("CODIGO");

        jLabel3.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel3.setText("ESTADO");

        jLabel4.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel4.setText("NOMBRE");

        jLabel5.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLabel5.setText("AÑO");

        jBuscar.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jBuscar.setText("BUSCAR");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jBLimpiar.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jBLimpiar.setText("LIMPIAR");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        jBAgregar.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jBAgregar.setText("AGREGAR");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBEliminar.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jBEliminar.setText("ELIMINAR");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBModificar.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jBModificar.setText("MODIFICAR");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBsalir.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jBsalir.setText("SALIR");
        jBsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBsalirActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addComponent(jBAgregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBEliminar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBModificar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                .addComponent(jBsalir)
                .addGap(33, 33, 33))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jREstado))
                            .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(49, 49, 49)
                                .addComponent(jBuscar)
                                .addGap(18, 18, 18)
                                .addComponent(jBLimpiar))
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBuscar)
                    .addComponent(jBLimpiar))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3)
                    .addComponent(jREstado, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar)
                    .addComponent(jBEliminar)
                    .addComponent(jBModificar)
                    .addComponent(jBsalir))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//=======================================================================
    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
      
        try{
       Integer codigo= Integer.parseInt(jTCodigo.getText());
      materiaActual=matData.buscarMateria(codigo);
      
      if(materiaActual !=null){
      
          jTNombre.setText(materiaActual.getNombre());
          jTAño.setText(materiaActual.getAnio()+"");
          jREstado.setSelected(materiaActual.isEstado());
      }
       
        }catch(NumberFormatException ex){
        
            JOptionPane.showMessageDialog(this, " Debe ingresar un codigo ID válido");
        }
    }//GEN-LAST:event_jBuscarActionPerformed
//======================================================================
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
   
        limpiarCampos();
        materiaActual=null;
    }//GEN-LAST:event_jBLimpiarActionPerformed
//=======================================================================
    
    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jBModificarActionPerformed
//========================================================================
    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
     
       try{
       // Integer idMat= Integer.parseInt(jTCodigo.getSelectedText());
        String nombre= jTNombre.getText();
        Integer anio= Integer.parseInt(jTAño.getText());
        
        if(nombre.isEmpty()){
         JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
         return;
        }
        Boolean estado= jREstado.isSelected();
           
        if(materiaActual==null){          
            materiaActual=new Materia(nombre, 0, true);
       matData.guardarMateria(materiaActual);
        
        }else{
        
            materiaActual.getNombre();
            materiaActual.getAnio();
           matData.modificarMateria(materiaActual);
        }
        
       }catch(NumberFormatException nfe){
        
            JOptionPane.showMessageDialog(this, " Debe ingresar un codigo ID válido");
        }      
    }//GEN-LAST:event_jBAgregarActionPerformed
//=====================================================================
    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
        // TODO add your handling code here:
        if(materiaActual!=null){
           
            matData.eliminarMateria(materiaActual.getIdMateria());
            materiaActual=null;
            limpiarCampos();
            
        }else{
             JOptionPane.showMessageDialog(this, "No hay materia seleccionada");
        }        
    }//GEN-LAST:event_jBEliminarActionPerformed
//=======================================================================
    private void jBsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBsalirActionPerformed
         dispose();
         
    }//GEN-LAST:event_jBsalirActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBsalir;
    private javax.swing.JButton jBuscar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JRadioButton jREstado;
    private javax.swing.JTextField jTAño;
    private javax.swing.JTextField jTCodigo;
    private javax.swing.JTextField jTNombre;
    // End of variables declaration//GEN-END:variables

private void limpiarCampos(){

      jTCodigo.setText(" ");
      jTNombre.setText(" ");
      jTAño.setText(" ");
      jREstado.setSelected(true);
}

}
