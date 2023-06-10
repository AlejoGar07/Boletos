package Conexiones;

import java.sql.Connection;
import java.sql.DriverManager;


public class Azure {
 
private static final String Database= "boletos";
private static final String Server="boletos-le.postgres.database.azure.com";
private static final String Port="5432";

private static final String Url="jdbc:postgresql://" + Server + ":" + Port + "/" + Database;

private static final String Admin_Name="postgres";

private static final String Admin_Password="Ale0107@";

public static Connection getConnection(){
    Connection connection=null;
    try{
    Class.forName("org.postgresql.Driver");
    connection= DriverManager.getConnection(Url, Admin_Name, Admin_Password);
    System.out.println("Connection to Database " + Database + " Successful");
    }catch(Exception e){
        System.out.println("Connection to Database " + Database + " Failed");
        e.printStackTrace();
    }
    return connection;
}
}
