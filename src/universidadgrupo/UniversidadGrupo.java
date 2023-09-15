/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo;

import java.sql.Connection;
import java.time.LocalDate;
import universidadgrupo.AccesoDatos.AlumnoData;
import universidadgrupo.AccesoDatos.Conexion;
import universidadgrupo.AccesoDatos.InscripcionData;
import universidadgrupo.AccesoDatos.MateriaData;
import universidadgrupo.entidades.Alumno;
import universidadgrupo.entidades.Inscripcion;
import universidadgrupo.entidades.Materia;


public class UniversidadGrupo {

   
    public static void main(String[] args) {
        
       /*r (Inscripcion inscripcion : insc.obtenerInscripciones()) {
         
            System.out.println("id Inscripto: "+inscripcion.getIdInscripto()); 
            System.out.println("nota: "+inscripcion.getNota());
           // System.out.println("materia: "+inscripcion.getMateria().getNombre());
            System.out.println("id: "+inscripcion.getAlumno().getIdAlumno());
            System.out.println("id materia: "+inscripcion.getMateria().getIdMateria());
           /* System.out.println("dni: "+inscripcion.getAlumno().getDni());
            System.out.println("nombre: "+inscripcion.getAlumno().getNombre());
            System.out.println("apellido: "+inscripcion.getAlumno().getApellido());
            System.out.println("fecha nacimiento: "+inscripcion.getAlumno().getFechaNacimiento());
            System.out.println("==============================");*/
    
       AlumnoData alu = new AlumnoData();
      // Alumno alumnoEncontrado=alu.buscarAlumno(1);

      //PRUEBA BUSCAR ALUMNO POR ID
       Alumno alumnoEncontrado=alu.buscarAlumno(15);
       if (alumnoEncontrado!=null){
        System.out.println("dni: "+alumnoEncontrado.getDni());
        System.out.println("apellido: "+alumnoEncontrado.getApellido());
       }
       
       InscripcionData insc=new InscripcionData();
       
        for (Inscripcion inscripcion : insc.obtenerInscripciones()) {
            System.out.println(inscripcion);
        }
    
    }
        }

    




