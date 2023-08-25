
package br.com.projeto.jdbc;


import java.sql.Connection; 
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane; // esse é o único que não faz parte do problema

public class SingleConnection {

    private static String url = "jdbc:mysql://localhost:3306/bdvendas";
   private static String password = "123";
   private static String user = "usuariocurso";
    private static Connection connection = null;
    
    public SingleConnection(){
        conectar();
    }
    
 
    private static void conectar(){
        try {
            if(connection == null){
                Class.forName("com.mysql.jdbc.Driver");
                //connection = DriverManager.getConnection(url, user, password);
                Connection connection = DriverManager.getConnection(url, user, password);
                connection.setAutoCommit(false);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    } 
    public static Connection getConnection(){
        return connection;
    }
    
   
}

    

