/*
METODOS OBTENER INSCRIPCIONES AUN NO FUNCIONAN.
ARROJAN NULL POINTER EXCEPTION
 */
package universidadgrupo.AccesoDatos;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import universidadgrupo.entidades.Alumno;
import universidadgrupo.entidades.Inscripcion;
import universidadgrupo.entidades.Materia;

/**
 *
 * @author sonia
 */
public class InscripcionData {
    private Connection con=null;
    public MateriaData matData;
    public AlumnoData aluData;

    public InscripcionData() {
        con=Conexion.getConexion();
        
    }
    
    //Inscribe a materia
    public void guardarInscripcion(Inscripcion insc){
            // ?=variable comodin
        String sql="INSERT INTO inscripcion (idAlumno, idMateria, nota)"
                + "VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps=con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            // Setea los comodines
            ps.setInt(1, insc.getAlumno().getIdAlumno());
            ps.setInt(2, insc.getMateria().getIdMateria());
            ps.setDouble(3, insc.getNota());
            
            
            ps.executeUpdate();
            
            //Setea id
            ResultSet rs=ps.getGeneratedKeys();
            if (rs.next()){
                
                insc.setIdInscripto(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Alumno inscripto");
            }
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos");
        }
    }
    
    //Lista todos los inscriptos
    public List<Inscripcion> obtenerInscripciones() {
        
        ArrayList<Inscripcion> inscripcionLista = new ArrayList<>();
        
        String sql = "SELECT * FROM inscripcion";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                
                inscripcion.setIdInscripto(rs.getInt("idInscripto"));
                inscripcion.setNota(rs.getDouble("nota"));
                Alumno alum=aluData.buscarAlumno(rs.getInt("idAlumno"));
                //System.out.println(alum);
               // System.out.println("id alumno: "+rs.getInt("idAlumno"));
                Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
                inscripcion.setAlumno(alum);
                inscripcion.setMateria(mat);
                
                
                inscripcionLista.add(inscripcion);
            }            
            ps.close();
        } catch (SQLException ex ) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripciones");
        } catch (NullPointerException ex2){
            JOptionPane.showMessageDialog(null,ex2);
        }
        return inscripcionLista;
    }
    
    //Inscripciones x alumno
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int idAlumno){
        ArrayList<Inscripcion> inscripcionLista = new ArrayList<>();
        
        String sql = "SELECT * FROM inscripcion WHERE idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Inscripcion inscripcion = new Inscripcion();
                
                inscripcion.setIdInscripto(rs.getInt("idInscripto"));
                Alumno alum=aluData.buscarAlumno(rs.getInt("idAlumno"));
                Materia mat = matData.buscarMateria(rs.getInt("idMateria"));
                inscripcion.setAlumno(alum);
                inscripcion.setMateria(mat);
                inscripcion.setNota(rs.getDouble("nota"));
                
                inscripcionLista.add(inscripcion);
            }            
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripciones");
        }
        return inscripcionLista;
    }
    
  //Listar materias cursadas
    public List<Materia> obtenerMateriasCursadas(int idAlumno){
        ArrayList<Materia> materiasCursadas=new ArrayList();
        
        String sql="SELECT inscripcion.idMateria, nombre, anio FROM inscripcion,"
                + " materia WHERE inscripcion.idMateria=materia.idMateria "
                + "AND inscripcion.idAlumno = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                Materia materia = new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                
                
                
                materiasCursadas.add(materia);
            }            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripciones");
        }
        
        return materiasCursadas;
    }
    
      //Actualiza nota final en materia
    public void actualizarNota (int idAlumno, int idMateria, double nota){
        
    String sql="UPDATE `inscripcion` "
            + "SET `nota`=? "
            + "WHERE idAlumno=? AND idMateria=?";
        try {
            PreparedStatement ps= con.prepareStatement(sql);
            
            ps.setDouble(1, nota);
            ps.setInt(2, idAlumno);
            ps.setInt(3, idMateria);
            int filas =ps.executeUpdate();
            
            if(filas>0){
             
                JOptionPane.showMessageDialog(null,"Nota actualizada");
            }
             ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error alacceder a la tabla inscripcion");
        }
   
    }
    
    //Listar materias no cursadas
    public List<Materia> obtenerMateriasNOCursadas(int idAlumno){
         ArrayList<Materia> materiasNOCursadas=new ArrayList();
        
        String sql="SELECT * FROM materia WHERE estado = 1 AND idMateria not in "
                + "(SELECT idMateria FROM inscripcion WHERE idAlumno = ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idAlumno);
            
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                Materia materia = new Materia();
                
                materia.setIdMateria(rs.getInt("idMateria"));
                materia.setNombre(rs.getString("nombre"));
                materia.setAnio(rs.getInt("anio"));
                
                
                
                materiasNOCursadas.add(materia);
            }            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripciones");
        }
        
        return materiasNOCursadas;
    }
    
    /*//Borra inscripción a materia
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        
    }*/
    
    //Lista alumnos x materia
    public List<Alumno> obtenerAlumnosPorMateria (int idMateria){
         ArrayList<Alumno> alumnosMateria=new ArrayList();
        
        String sql="SELECT a.idAlumno, dni, nombre, apellido, fechaNacimiento, estado "
                + "FROM inscripcion i, alumno a WHERE i.idAlumno = a.idAlumno AND idMateria = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, idMateria);
            
            ResultSet rs = ps.executeQuery();
             while (rs.next()) {
                Alumno alumno = new Alumno();
                
                alumno.setIdAlumno(rs.getInt("idAlumno"));
                alumno.setDni(rs.getInt("dni"));
                alumno.setApellido(rs.getString("apellido"));
                alumno.setNombre(rs.getString("nombre"));
                alumno.setFechaNacimiento(rs.getDate("fechaNacimiento").toLocalDate());
                alumno.setEstado(rs.getBoolean("estado"));
                
                
                alumnosMateria.add(alumno);
            }            
            ps.close();
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripciones");
        }
        
        return alumnosMateria;
    }
}
