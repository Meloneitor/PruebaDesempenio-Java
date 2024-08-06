package persistence.configDB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MysqlConfig {

    private static Connection connection = null;

    public static Connection openConnection(){

        String URL = "mysql://avnadmin:@mysql-666-project-21.f.aivencloud.com:13946/defaultdb?ssl-mode=REQUIRED";
        String user = "avnadmin";
        String password = "AVNS_ovRDke1LQrQeBw87GXh";

        try {
            connection = DriverManager.getConnection(URL,user,password);
            System.out.println("Connection successful");
        } catch (SQLException error){
            throw new RuntimeException(error.getMessage());
        }
        return  connection;
    }
    public static void closeConnection(){
        if (connection != null){
            try {
                connection.close();
                System.out.println("Connection closed");
            } catch (SQLException error){
                throw new RuntimeException(error.getMessage());
            }
        }
    }
}