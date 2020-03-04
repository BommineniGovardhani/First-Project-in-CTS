import java.sql.*;
public class Javaprogram {

	public static void main(String[] args) throws Exception{
		String url="jdbc:mysql://localhost:3306/jdbc";
		String username="root";
		String password="Hanuman@456";
/*String sql1="create table emplo(id smallint not null primary key,emp_name varchar(30));";
String sql2="insert into emplo values(1,'Ram');";
String sql3="insert into emplo values(2,'Sam');";
String sql4="select * from emplo";*/
		String sql5="insert into emplo(id,name) values(?,?)";

		
// TODO Auto-generated method stub
//step-2
		Class.forName("com.mysql.jdbc.Driver");
		//step-3
		Connection con=DriverManager.getConnection(url,username,password);
		//step-4
		//Statement st=con.createStatement();
		//st.executeUpdate(sql1);
		//System.out.println("table created");
		//st.executeUpdate(sql2);
		//st.executeUpdate(sql3);
		//System.out.println("Inserted");
		//st.executeUpdate(sql);
		//ResultSet rs=st.executeQuery(sql4);
		//while(rs.next())
		/*{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
		}*/
		PreparedStatement pstmt=con.prepareStatement(sql5);
		pstmt.setInt(1,05);
		pstmt.setString(2, "Ram");
		pstmt.executeUpdate(sql5);
		
		
		
		pstmt.close();
		con.close();
		//PreparedStatement pstmt=con.prepareStatement(sql6);
	}

}
