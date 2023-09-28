
package universidadgrupo.Vistas;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo.AccesoDatos.MateriaData;
import universidadgrupo.entidades.Materia;

public class FormularioMateria extends javax.swing.JInternalFrame {
  
    private MateriaData matData= new MateriaData();
    private Materia materiaActual= null;
  
    
    
    
    public FormularioMateria() {
        initComponents();
        this.matData = new MateriaData();
    
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
        jBLimpiar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBuscar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("MATERIA");

        jLabel2.setText("Codigo");

        jLabel3.setText("Estado");

        jLabel4.setText("Nombre");

        jLabel5.setText("Año");

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

        jBuscar.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jBuscar.setText("BUSCAR");
        jBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBuscarActionPerformed(evt);
            }
        });

        jBSalir.setFont(new java.awt.Font("Dialog", 3, 12)); // NOI18N
        jBSalir.setText("SALIR");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 57, Short.MAX_VALUE)
                .addComponent(jBSalir)
                .addGap(39, 39, 39))
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
                                .addGap(36, 36, 36)
                                .addComponent(jBuscar)
                                .addGap(36, 36, 36)
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
                    .addComponent(jBLimpiar)
                    .addComponent(jBuscar))
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
                    .addComponent(jBSalir))
                .addGap(37, 37, 37))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
//====================================================================
//BUSCAR
    private void jBBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBBuscarActionPerformed
  
try{
        int idMat = Integer.parseInt(jTCodigo.getText());
         Materia mate = matData.buscarMateria(idMat);
        
         jTNombre.setText(mate.getNombre());
         jTAño.setText(mate.getAnio()+"");
         jREstado.setSelected(mate.isEstado());
         if(jTCodigo!=null){
             System.out.println( "Materia encontrada");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Usted debe ingresar un codigo ID para buscar");
        }
    }//GEN-LAST:event_jBBuscarActionPerformed

  //=====================================================================   
  //AGREGAR
    private void jBAgregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAgregarActionPerformed
     
     /*   String nombreMate=jTNombre.getText();
        int anio=Integer.parseInt(jTAño.getText());
        Boolean estado=jREstado.isSelected();
        MateriaData nuevaMate=new MateriaData();
        Materia materia= new Materia(nombreMate, anio, estado);
        nuevaMate.guardarMateria(materia);
        */
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
  //  ELIMINAR
    private void jBEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEliminarActionPerformed
  
         if(materiaActual!=null){
           
            matData.eliminarMateria(materiaActual.getIdMateria());
            materiaActual=null;
            limpiarCampos();
            
        }else{
             JOptionPane.showMessageDialog(this, "No hay materia seleccionada");
        }       
        
    }//GEN-LAST:event_jBEliminarActionPerformed
//=======================================================================
    private void jBModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBModificarActionPerformed
         materiaActual=null;

        int idMat = Integer.parseInt(jTCodigo.getText());
         Materia mate = matData.buscarMateria(idMat);
       

        try {
            jTNombre.setText(mate.getNombre());
            jTAño.setText(mate.getAnio() + "");
            jREstado.setSelected(mate.isEstado());
            if (jTCodigo != null) {
                System.out.println("Materia encontrada");
                JOptionPane.showMessageDialog(this, "Puede modificar los datos de la Materia");

                String nombreNuevo = jTNombre.getText();
                if (nombreNuevo.isEmpty()) {
                    JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                }
                String anioNuevo = jTAño.getText();
                Integer.parseInt(anioNuevo);
                if (jTAño.getText() == null) {
                    JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
                }
                boolean estado;
                if (jREstado.isSelected()) {
                    estado = true;
                } else {

                    materiaActual = new Materia(nombreNuevo, 0, true);
                    matData.guardarMateria(materiaActual);
                }
            }
        } catch (NullPointerException ex) {
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }


    }//GEN-LAST:event_jBModificarActionPerformed
//=======================================================================
    private void jBSalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBSalirActionPerformed
      dispose();  
       
    }//GEN-LAST:event_jBSalirActionPerformed
//=======================================================================
    private void jBLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimpiarActionPerformed
      limpiarCampos();
      materiaActual=null;
      jREstado.setSelected(false);
                   
      
    }//GEN-LAST:event_jBLimpiarActionPerformed

    private void jBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBuscarActionPerformed
                                      
  
try{
        int idMat = Integer.parseInt(jTCodigo.getText());
         Materia mate = matData.buscarMateria(idMat);
        
         jTNombre.setText(mate.getNombre());
         jTAño.setText(mate.getAnio()+"");
         jREstado.setSelected(mate.isEstado());
         if(jTCodigo!=null){
             System.out.println( "Materia encontrada");
            }
        } catch (NumberFormatException ex) {
            JOptionPane.showMessageDialog(null,"Usted debe ingresar un codigo ID para buscar");
        }
                                        

    }//GEN-LAST:event_jBuscarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
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
    
    
    private void estadoTrue() {
        boolean estado;
        if (jREstado.isSelected()) {
            estado = true;
        } else {
        }
    }

}
