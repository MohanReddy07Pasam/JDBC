import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Prepare {
	public static Connection con=null;
	public static String url="jdbc:oracle:thin:@localhost:1522:xe";
	public static String un="system";
	public static String pwd="system";
	public static PreparedStatement pstmt=null;
	public static ResultSet rs=null;

	public static void main(String[] args) throws SQLException
	{
		try 
		{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			con=DriverManager.getConnection(url,un,pwd);
			System.out.println("connection established");
			String s1="insert into VTU values(?,?,?,?,?)";
			pstmt=con.prepareStatement(s1);
			System.out.println(s1);
			Scanner scan=new Scanner(System.in);
			System.out.println("enter the usn:");
			String temp1=scan.next();
			pstmt.setString(1,temp1);
			
			System.out.println("enter the name:");
			String temp2=scan.next();
			pstmt.setString(2,temp2);
			
			System.out.println("enter the m1:");
			int temp3=scan.nextInt();
			pstmt.setInt(3,temp3);
			
			System.out.println("enter the m2:");
			int temp4=scan.nextInt();
			pstmt.setInt(4,temp4);
			
			System.out.println("enter the m2:");
			int temp5=scan.nextInt();
			pstmt.setInt(5,temp5);
			
			
			pstmt.executeUpdate();
			
			
			
			
			
			
					
			
			
		}
		catch (ClassNotFoundException e) 
		{
			
			e.printStackTrace();
		}

	}

}
