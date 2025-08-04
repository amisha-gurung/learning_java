import java.sql.*;

public class Morejdbc{
    public static void main(String[] args){
        System.out.println("More of JDBC: Actually using the connection");
        String url = "jdbc:mysql://localhost:3306/java_db";
        String user = "Mio";
        String password = "";

        Connection con = null;
        try{
            //establishing connection
            con = DriverManager.getConnection(url, user, password);
            System.out.println("connection sucessfull");

            //using the connection
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM students");

            System.out.println("\n Students in database:");
            while(rs.next()){
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                System.out.println("ID: " + id + "Name: " + name + "Age: " + age);
            }
        }

        catch(SQLException e){
            e.printStackTrace();
        }
        finally{
            try{
                if(con != null) con.close();
            }catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }
}