/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo.AccesoDatos;

import java.sql.Connection;
import java.util.List;
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
        
    }
    
    //Lista todos los inscriptos
    public List<Inscripcion> obtenerInscripciones(){
        
    }
    
    //Inscripciones x alumno
    public List<Inscripcion> obtenerInscripcionesPorAlumno(int id){
        
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
        
    }
}
