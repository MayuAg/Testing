import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mayuri";
        String username = "root";
        String password = "password";
        ResultSet resultSet = null;
        Connection con = null;
        String query = "Select * from Employee_Address";
        String insertQuery = "insert into Employee_Address values('9', 'Heena', 'Nishta Ahsish');";
        try {
            con = DriverManager.getConnection(url, username, password);
            Statement st = con.createStatement();
//        int count = st.executeUpdate("insert into Employee_Address values('7', 'Sarveshji', 'Chandni Chowk')");
            int count = st.executeUpdate(insertQuery);
            System.out.println("Number of rows affected " + count);
        }
        finally {
            if (resultSet != null)
                resultSet.close();
            if (con != null)
                con.close();
        }
    }
}


