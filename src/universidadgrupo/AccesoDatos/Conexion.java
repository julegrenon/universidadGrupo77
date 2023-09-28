/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package universidadgrupo.AccesoDatos;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;


public class Conexion {
    
    private static final String URL="jdbc:mariadb://localhost/";
    private static final String DB="universidadejemplo";
    private static final String USUARIO="root";
    private static final String PASSWORD="";
    private static Connection conex;
    
    private Conexion(){   
    }
    public static Connection getConexion(){
    
      if(conex==null){
          try {
              Class.forName("org.mariadb.jdbc.Driver");
              conex=DriverManager.getConnection(URL+DB,USUARIO,PASSWORD);
          //   JOptionPane.showMessageDialog(null, "Conectado");
              System.out.println("Se ha conectado con exito a la base de datos");
          } catch (ClassNotFoundException ex) {
             JOptionPane.showMessageDialog(null, "Error al cargar driver");
          } catch (SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error al conectarse");
          }
      }
        return conex;
    }
}






