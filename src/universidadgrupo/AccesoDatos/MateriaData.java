
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
}
