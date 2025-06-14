import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
class JDBC_DEMO{
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        String url = "jdbc:mysql://localhost:3306/mayuri";
        String uname = "root";
        String password = "password";
        Connection con = DriverManager.getConnection(url, uname, password);
        Statement st = con.createStatement();
        ResultSet  resultSet = st.executeQuery("Select * from Employee_Address");
        while (resultSet.next()){
            System.out.println("EmployeeID : " + resultSet.getInt(1));
            System.out.println("Employee Name: " + resultSet.getString(2));
            System.out.println("Employee Address: " + resultSet.getString(3));
        }
    }
}