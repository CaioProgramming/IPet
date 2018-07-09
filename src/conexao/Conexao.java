
package conexao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexao {

    public static Connection abrirConexao() {
        Connection con = null;       
        try{         
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            String url = "";
            url += "jdbc:mysql://127.0.0.1/ipet?user=root&password=";
            con = (Connection) DriverManager.getConnection(url);
            System.out.println("Conexão aberta.");
            
        }catch (SQLException e) {  
            
            System.out.println("ERRO AO CONECTAR COM O BANCO DE DADOS. ERRO: " + e.getMessage());
            
        }catch (Exception e) {           
            
            System.out.println("ERRO: " + e.getMessage());
               
        }
        
        return con;
 
    }
    
}
