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
        /*//Connection con= Conexion.getConexion();
        //Alumno alumno = new Alumno(123456, "Perez", "Juan", LocalDate.of(1996, 6, 10), true);
        AlumnoData alu = new AlumnoData();
        //alu.guardarAlumno(alumno);
        //alu.modificarAlumno(alumno);
<<<<<<< HEAD
        alu.eliminarAlumno(14);*/
        
        /*
        Materia materia= new Materia("Geografia", 3, true);
        MateriaData mat= new MateriaData();
        mat.guardarMateria(materia);
*/
=======
        //alu.eliminarAlumno(14);
        
        
        //PRUEBA BUSCAR ALUMNO POR ID
       Alumno alumnoEncontrado=alu.buscarAlumno(15);
       if (alumnoEncontrado!=null){
        System.out.println("dni: "+alumnoEncontrado.getDni());
        System.out.println("apellido: "+alumnoEncontrado.getApellido());
       }*/
        
>>>>>>> 436cb6bace8cb7978a93dbe717c968a435530df4
    }
    
}
