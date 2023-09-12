
package universidadgrupo.AccesoDatos;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo.entidades.Materia;


public class MateriaData {
    
    private Connection con=null;
    
    public MateriaData(){
    
        con=Conexion.getConexion();
    }
    
    public void guardarMateria (Materia materia){
    
        String sql= "INSERT INTO materia(`nombre`, `anio`, `estado`) "
                + "VALUES (?,?,?)";
        try {
            PreparedStatement ps=con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setBoolean(3, materia.isEstado());
            ps.executeUpdate();
            
            ResultSet rs=ps.getGeneratedKeys();
            if(rs.next()){
            
                materia.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Materia guardada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia");
        }
    }
    
    public Materia buscarMateria(int id){
    String sql="SELECT nombre, anio, estado FROM `materia` WHERE idMateria=? AND estado=1";
    Materia materia=null;
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs=ps.executeQuery();
            if(rs.next()){
            
                materia= new Materia();
                materia.setIdMateria(id);
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                materia.setEstado(true);
                
            }else {
            JOptionPane.showMessageDialog(null, "No existe esa materia con ese ID");
            }
            ps.close();
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al acceder a la tabla Materia");
        }
   return materia;
    }
    
    public void modificarMateria(Materia materia){
    String sql="UPDATE `materia` SET `nombre`=?,`anio`=? WHERE idMateria=?";
    
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            ps.setString(1, materia.getNombre());
            ps.setInt(2, materia.getAnio());
            ps.setInt(3,materia.getIdMateria());
            int exito=ps.executeUpdate();
            if(exito==1){
            JOptionPane.showMessageDialog(null,"Materia modificada exitosamente");
            }
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error al acceder a la tabla materia");
        }
    }
       
    public void eliminarMateria(int id){
        
             String sql="UPDATE `materia` SET  estado=0 WHERE idMateria=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int exito=ps.executeUpdate();
            if(exito==1){
            JOptionPane.showMessageDialog(null,"Materia eliminada");
            }
        } catch (SQLException ex) {
           JOptionPane.showMessageDialog(null, "Error al eliminar la materia");
        }
        
    }
}
