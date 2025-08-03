import java.sql.*;

public class Jdbc{
    public static void main(String[] args){
        System.out.println("Learning JDBC hehe");
        String url = "jdbc:mysql://localhost:3306/java_db";
        String user = "Mio";
        String password = "";

        Connection con = null;
        try{
            //Establishing connection
            con = DriverManager.getConnection(url, user, password);
            System.out.println("connection sucessfull");
        }
        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                if (con != null) con.close();

            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}