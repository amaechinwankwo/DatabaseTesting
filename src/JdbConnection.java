import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbConnection {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		String host="localhost";

		String port= "3306";

		Connection con=DriverManager.getConnection("jdbc:mysql://" + host + ":" + port + "/QATestdb", "root", "Dandytech@2023");

		Statement s=con.createStatement();

		ResultSet rs=s.executeQuery("select * from EmployeeInfo where name ='Daniel'");

		while(rs.next())

		{
		System.out.println(rs.getString("name"));
		System.out.println(rs.getString("id"));
		System.out.println(rs.getString("location"));
		System.out.println(rs.getString("age"));
		
		
//		WebDriver driver= new FirefoxDriver();
//
//		driver.get("https://login.salesforce.com");
//
//		driver.findElement(By.xpath(".//*[@id='username']")).sendKeys(rs.getString("username"));
//
//		driver.findElement(By.xpath(".//*[@id='password']")).sendKeys(rs.getString("password"));
//
//		

		}


	}

}
