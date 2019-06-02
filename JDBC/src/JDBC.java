import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;



public class JDBC {
	public static Connection con=null;
	public static String url="jdbc:oracle:thin:@localhost:1522:xe";
	public static String un="system";
	public static String pwd="system";
	public static Statement stmt=null;
	public static ResultSet rs=null;
	
	public static void main(String[] args) throws SQLException 
	{
		
		
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println(Class.forName("oracle.jdbc.driver.OracleDriver"));
			System.out.println("driver is connected");
			con=DriverManager.getConnection(url,un,pwd);
			System.out.println(con);
			System.out.println("connection established");
			String  s1="select * from VTU";
			System.out.println(s1);
			 stmt=con.createStatement();
			 System.out.println(stmt);
			 rs=stmt.executeQuery(s1);
			 System.out.println(rs);
			while(rs.next()==true)
			{
				try {
					String a=rs.getString(1);
					System.out.println(a);
					
					String b=rs.getString(2);
					System.out.println(b);
					
					int c=rs.getInt(3);
					System.out.println(c);
					
					int d=rs.getInt(4);
					System.out.println(d);
					
					int e=rs.getInt(5);
					System.out.println(e);
					
				} catch (Exception e) {
					
					e.printStackTrace();
				}
			
			}
			
			
		} 
		
		
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}



	}

}
