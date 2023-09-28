/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo.Vistas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.JDesktopPane;
import javax.swing.JPanel;

/**
 *
 * @author sonia
 */
public class Menu extends javax.swing.JFrame {

    //FondoPanel fondo= new FondoPanel();
   
    public Menu() {
        
      //  this.setContentPane(fondo);
        
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

        Escritorio = new javax.swing.JDesktopPane();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenuAlumnos = new javax.swing.JMenu();
        jMenuItemFormAlum = new javax.swing.JMenuItem();
        jMenuMateria = new javax.swing.JMenu();
        jMenuItemFormMat = new javax.swing.JMenuItem();
        jMenuAdmin = new javax.swing.JMenu();
        jMenuItemManejoInsc = new javax.swing.JMenuItem();
        jMenuItemManipNotas = new javax.swing.JMenuItem();
        jMenu1 = new javax.swing.JMenu();
        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuSalir = new javax.swing.JMenu();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Escritorio.setPreferredSize(new java.awt.Dimension(380, 290));

        javax.swing.GroupLayout EscritorioLayout = new javax.swing.GroupLayout(Escritorio);
        Escritorio.setLayout(EscritorioLayout);
        EscritorioLayout.setHorizontalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        EscritorioLayout.setVerticalGroup(
            EscritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        jMenuAlumnos.setText("Alumnos");
        jMenuAlumnos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuAlumnosActionPerformed(evt);
            }
        });

        jMenuItemFormAlum.setText("Formulario de alumno");
        jMenuItemFormAlum.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFormAlumActionPerformed(evt);
            }
        });
        jMenuAlumnos.add(jMenuItemFormAlum);

        jMenuBar1.add(jMenuAlumnos);

        jMenuMateria.setText("Materia");

        jMenuItemFormMat.setText("Formulario de materia");
        jMenuItemFormMat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemFormMatActionPerformed(evt);
            }
        });
        jMenuMateria.add(jMenuItemFormMat);

        jMenuBar1.add(jMenuMateria);

        jMenuAdmin.setText("Administración");

        jMenuItemManejoInsc.setText("Manejo de inscripciones");
        jMenuItemManejoInsc.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManejoInscActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemManejoInsc);

        jMenuItemManipNotas.setText("Manipulación de notas");
        jMenuItemManipNotas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItemManipNotasActionPerformed(evt);
            }
        });
        jMenuAdmin.add(jMenuItemManipNotas);

        jMenuBar1.add(jMenuAdmin);

        jMenu1.setText("Consultas");

        jMenuItem1.setText("Alumnos por materia");
        jMenuItem1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jMenuItem1ActionPerformed(evt);
            }
        });
        jMenu1.add(jMenuItem1);

        jMenuBar1.add(jMenu1);

        jMenuSalir.setText("Salir");
        jMenuBar1.add(jMenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Escritorio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 279, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jMenuItemFormMatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFormMatActionPerformed
       Escritorio.removeAll();
       Escritorio.repaint();
       FormularioMateria fm= new FormularioMateria();
       fm.setVisible(true);
       Escritorio. add(fm);
       Escritorio.moveToFront(fm);
       
    }//GEN-LAST:event_jMenuItemFormMatActionPerformed

    private void jMenuAlumnosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuAlumnosActionPerformed
       
    }//GEN-LAST:event_jMenuAlumnosActionPerformed

    private void jMenuItemFormAlumActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemFormAlumActionPerformed
        Escritorio.removeAll();
       Escritorio.repaint();
       FormularioAlumnos fa= new FormularioAlumnos();
       fa.setVisible(true);
       Escritorio. add(fa);
       Escritorio.moveToFront(fa);
    }//GEN-LAST:event_jMenuItemFormAlumActionPerformed

    private void jMenuItemManejoInscActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManejoInscActionPerformed
        Escritorio.removeAll();
        Escritorio.repaint();
        FormularioInscripciones fi = new FormularioInscripciones();
        fi.setVisible(true);
        Escritorio.add(fi);
        Escritorio.moveToFront(fi);
    }//GEN-LAST:event_jMenuItemManejoInscActionPerformed

    private void jMenuItemManipNotasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItemManipNotasActionPerformed
        Escritorio.removeAll();
       Escritorio.repaint();
       FormCargaDeNotas fc= new FormCargaDeNotas();
       fc.setVisible(true);
       Escritorio. add(fc);
       Escritorio.moveToFront(fc);
    }//GEN-LAST:event_jMenuItemManipNotasActionPerformed

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
         Escritorio.removeAll();
       Escritorio.repaint();
       FormListadoAlumXMat faxm= new FormListadoAlumXMat();
       faxm.setVisible(true);
       Escritorio. add(faxm);
       Escritorio.moveToFront(faxm);
    }//GEN-LAST:event_jMenuItem1ActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Menu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane Escritorio;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenuAdmin;
    private javax.swing.JMenu jMenuAlumnos;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItemFormAlum;
    private javax.swing.JMenuItem jMenuItemFormMat;
    private javax.swing.JMenuItem jMenuItemManejoInsc;
    private javax.swing.JMenuItem jMenuItemManipNotas;
    private javax.swing.JMenu jMenuMateria;
    private javax.swing.JMenu jMenuSalir;
    // End of variables declaration//GEN-END:variables
/*
class FondoPanel extends JPanel{

    private Image imagen;
    
    public void paint(Graphics g){
    
        imagen= new ImageIcon(getClass().getResource("/Imagenes/Univ Grupo 77")).getImage();
  
         g.drawImage(imagen,0, 0, imagen.getWidth(this),imagen.getHeight(this), this);
      
        setOpaque(false);
        
        super.paint(g);
      }

  }*/
}
