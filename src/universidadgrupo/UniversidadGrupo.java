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
      /*  // PRUEBA DE METODOS ALUMNODATA PARTE 1
        //Connection con= Conexion.getConexion();
        Alumno alumno = new Alumno(8976433, "Ruiz", "Ana", LocalDate.of(1996, 6, 10), true);
        AlumnoData alu = new AlumnoData();
        alu.guardarAlumno(alumno);
        //alu.modificarAlumno(alumno);

        //alu.eliminarAlumno(14);
        
        
        Materia materia= new Materia("Civica II", 3, true);
        MateriaData mat= new MateriaData();
        mat.guardarMateria(materia);


        //alu.eliminarAlumno(14);
        
        
     /*   //PRUEBA BUSCAR ALUMNO POR ID
       Alumno alumnoEncontrado=alu.buscarAlumno(15);
       if (alumnoEncontrado!=null){
        System.out.println("dni: "+alumnoEncontrado.getDni());
        System.out.println("apellido: "+alumnoEncontrado.getApellido());
       }
       
       //PRUEBA BUSCAR ALUMNO POR DNI
       Alumno alumnoEncontrado=alu.buscarAlumnoPorDni(123456);
       if (alumnoEncontrado!=null){
        System.out.println("id: "+alumnoEncontrado.getIdAlumno());
        System.out.println("dni: "+alumnoEncontrado.getDni());
        System.out.println("apellido: "+alumnoEncontrado.getApellido());
       }*/
        
     //PRUEBA LISTAR TODOS LOS ALUMNOS
        /*for (Alumno alumno : alu.listarAlumnos()) {
            System.out.println("id: "+alumno.getIdAlumno());
            System.out.println("dni: "+alumno.getDni());
            System.out.println("nombre: "+alumno.getNombre());
            System.out.println("apellido: "+alumno.getApellido());
            System.out.println("fecha nacimiento: "+alumno.getFechaNacimiento());
            System.out.println("==============================");

=======
        }*/
            
        //PRUEBA BUSCAR MATERIA
        /*
        MateriaData mat= new MateriaData();
        Materia materiaEncontrada=mat.buscarMateria(3);
        if(materiaEncontrada!=null){
        System.out.println("Nombre: "+materiaEncontrada.getNombre());
        System.out.println("Año: "+materiaEncontrada.getAnio());
        
          }
*/
        
            
            //PRUEBA INSCRIPCION
           // Inscripcion incs=new Inscripcion(alumno,materia, 0.0);
            //InscripcionData inscData=new InscripcionData();
            //inscData.guardarInscripcion(incs);*/
        }
    
}

