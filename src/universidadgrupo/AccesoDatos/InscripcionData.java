/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
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
    private MateriaData matData;
    private AlumnoData aluData;

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
    public List<Inscripcion> obtenerInscripciones(){
        
        ArrayList<Inscripcion> inscripcionLista=new ArrayList();
        
         String sql="SELECT idInscripto, nota, inscripcion.idAlumno, inscripcion.idMateria FROM inscripcion, alumno, materia";
         
        
        try {
            PreparedStatement ps=con.prepareStatement(sql);
            
            
            ResultSet rs=ps.executeQuery();
            
            while (rs.next()){
                Inscripcion inscripcion=new Inscripcion();
                
                
                inscripcion.setIdInscripto(rs.getInt("idinscripto"));
                inscripcion.getAlumno().setIdAlumno(rs.getInt("idAlumno"));
                inscripcion.getMateria().setIdMateria(rs.getInt("idMateria"));
                inscripcion.setNota(rs.getDouble("nota"));
                
                inscripcionLista.add(inscripcion);
            } 
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla alumnos");
        }
        return inscripcionLista;
    }
    
    //Inscripciones x alumno
   /* public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        
    }
    
    //Listar materias cursadas
    public List<Materia> obtenerMateriasCursadas(int id){
        
    }
    
    //Listar materias no cursadas
    public List<Materia> obtenerMateriasNOCursadas(int id){
        
    }
    
    //Borra inscripción a materia
    public void borrarInscripcionMateriaAlumno(int idAlumno, int idMateria){
        
    }
    
    //Actualiza nota final en materia
    public void actualizarNota (int idAlumno, int idMateria, double nota){
        
    }
    
    //Lista alumnos x materia
    public List<Alumno> obtenerAlumnosPorMateria (int idMateria){
        
    }*/
}
