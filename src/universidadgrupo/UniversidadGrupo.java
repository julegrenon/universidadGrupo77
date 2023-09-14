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
        
        AlumnoData ad=new AlumnoData();
        MateriaData md=new MateriaData();
        InscripcionData insc = new InscripcionData();

        Alumno alu=ad.buscarAlumno(21);
       // System.out.println(alu);
        Materia mate=md.buscarMateria(9);
        Inscripcion inscrip=new Inscripcion(alu, mate, 0.0);
        
       /* for (Inscripcion inscripcion : insc.obtenerInscripcionesPorAlumno(21)) {
            System.out.println("id inscripto: "+inscripcion.getIdInscripto());
            System.out.println("nombre: "+inscripcion.getAlumno().getNombre());
            System.out.println("apellido: "+inscripcion.getAlumno().getApellido());
            System.out.println("dni: "+inscripcion.getAlumno().getDni());
            System.out.println("materia: "+inscripcion.getMateria().getNombre());
        }*/
       
        for (String arg : args) {
            
        }

    }
}



