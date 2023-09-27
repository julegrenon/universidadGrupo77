
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

        jLCodigo = new javax.swing.JLabel();
        jLNombre = new javax.swing.JLabel();
        jLAño = new javax.swing.JLabel();
        jLEstado = new javax.swing.JLabel();
        jLMateria = new javax.swing.JLabel();
        jTCodigo = new javax.swing.JTextField();
        jTNombre = new javax.swing.JTextField();
        jTAño = new javax.swing.JTextField();
        jBBuscar = new javax.swing.JButton();
        jBAgregar = new javax.swing.JButton();
        jBEliminar = new javax.swing.JButton();
        jBModificar = new javax.swing.JButton();
        jBSalir = new javax.swing.JButton();
        jREstado = new javax.swing.JRadioButton();
        jBLimpiar = new javax.swing.JButton();

        setPreferredSize(new java.awt.Dimension(400, 280));

        jLCodigo.setText("Código");

        jLNombre.setText("Nombre");

        jLAño.setText("Año");

        jLEstado.setText("Estado");

        jLMateria.setFont(new java.awt.Font("Dialog", 1, 14)); // NOI18N
        jLMateria.setText("Materia");

        jBBuscar.setText("Buscar");
        jBBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBBuscarActionPerformed(evt);
            }
        });

        jBAgregar.setText("Agregar");
        jBAgregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAgregarActionPerformed(evt);
            }
        });

        jBEliminar.setText("Eliminar");
        jBEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEliminarActionPerformed(evt);
            }
        });

        jBModificar.setText("Modificar");
        jBModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBModificarActionPerformed(evt);
            }
        });

        jBSalir.setText("Salir");
        jBSalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBSalirActionPerformed(evt);
            }
        });

        jBLimpiar.setText("Limpiar");
        jBLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimpiarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jBAgregar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBEliminar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBModificar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jBSalir, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLCodigo)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLNombre)
                                    .addComponent(jLAño)
                                    .addComponent(jLEstado))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jREstado)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(29, 29, 29)
                                        .addComponent(jBBuscar)
                                        .addGap(18, 18, 18)
                                        .addComponent(jBLimpiar, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(164, 164, 164)
                        .addComponent(jLMateria)))
                .addContainerGap(32, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLMateria)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 16, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLEstado)
                        .addGap(24, 24, 24))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLCodigo)
                            .addComponent(jTCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jBBuscar)
                            .addComponent(jBLimpiar))
                        .addGap(15, 15, 15)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLNombre)
                            .addComponent(jTNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLAño)
                            .addComponent(jTAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(24, 24, 24)
                        .addComponent(jREstado)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jBAgregar)
                    .addComponent(jBEliminar)
                    .addComponent(jBModificar)
                    .addComponent(jBSalir))
                .addGap(18, 18, 18))
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
       

try{         
         jTNombre.setText(mate.getNombre());
         jTAño.setText(mate.getAnio()+"");
         jREstado.setSelected(mate.isEstado());
         if(jTCodigo!=null){
             System.out.println( "Materia encontrada");
             JOptionPane.showMessageDialog(this,"Puede modificar los datos de la Materia");
             
        String nombreNuevo=jTNombre.getText();
         if(nombreNuevo.isEmpty()){
         JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
        }
            String anioNuevo= jTAño.getText();
            Integer.parseInt(anioNuevo);
         if( jTAño.getText()==null){
        JOptionPane.showMessageDialog(this, "No puede haber campos vacios");
        }
         boolean estado;
         if(jREstado.isSelected()){
             estado=true;         
    } else {
           
             materiaActual=new Materia(nombreNuevo, 0, true);
             matData.guardarMateria(materiaActual);
         } 
         } catch(NullPointerException ex){
            JOptionPane.showMessageDialog(null, "Debe completar todos los campos");
        }

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
                   
      
    }//GEN-LAST:event_jBLimpiarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAgregar;
    private javax.swing.JButton jBBuscar;
    private javax.swing.JButton jBEliminar;
    private javax.swing.JButton jBLimpiar;
    private javax.swing.JButton jBModificar;
    private javax.swing.JButton jBSalir;
    private javax.swing.JLabel jLAño;
    private javax.swing.JLabel jLCodigo;
    private javax.swing.JLabel jLEstado;
    private javax.swing.JLabel jLMateria;
    private javax.swing.JLabel jLNombre;
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
    
    
  private void estadoTrue(){
        boolean estado;              
          if(jREstado.isSelected()){
              estado=true;
      }else{          
          }
       
      
  
  }

}
