
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;


public class Conexion {
    
    private static String url= "jdbc:mysql://localhost/bd_ventas";
    private static String user ="root";
    private static String pass ="12345678";

    /**
     *
     * @return
     */
    public static Connection Conectar(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection(url, user, pass);
            System.out.println("coneccion establecida");
        }catch (Exception e){
            System.out.println(e);
        }
        return con;
    }
}
