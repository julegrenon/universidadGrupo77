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
import universidadgrupo.AccesoDatos.MateriaData;
import universidadgrupo.entidades.Alumno;
import universidadgrupo.entidades.Materia;


public class UniversidadGrupo {

   
    public static void main(String[] args) {
        // PRUEBA DE METODOS ALUMNODATA PARTE 1
        //Connection con= Conexion.getConexion();
        //Alumno alumno = new Alumno(123456, "Perez", "Juan", LocalDate.of(1996, 6, 10), true);
        AlumnoData alu = new AlumnoData();
        //alu.guardarAlumno(alumno);
        //alu.modificarAlumno(alumno);

        //alu.eliminarAlumno(14);
        
        /*
        Materia materia= new Materia("Geografia", 3, true);
        MateriaData mat= new MateriaData();
        mat.guardarMateria(materia);
*/

        //alu.eliminarAlumno(14);
        
        
<<<<<<< HEAD
        //PRUEBA BUSCAR ALUMNO POR ID
     /*   AlumnoData alu = new AlumnoData();
       Alumno alumnoEncontrado=alu.buscarAlumno(1);
=======
     /*   //PRUEBA BUSCAR ALUMNO POR ID
       Alumno alumnoEncontrado=alu.buscarAlumno(15);
>>>>>>> e384fae5e55ae8c911f654a10d5a94b685944334
       if (alumnoEncontrado!=null){
        System.out.println("dni: "+alumnoEncontrado.getDni());
        System.out.println("apellido: "+alumnoEncontrado.getApellido());
       }
<<<<<<< HEAD
        */

     
=======
       
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
        }*/
            
        }
>>>>>>> e384fae5e55ae8c911f654a10d5a94b685944334
    }
    

