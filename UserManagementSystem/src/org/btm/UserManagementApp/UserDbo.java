package org.btm.UserManagementApp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class UserDbo 
{
	//----------------------------TO INSERT USER INFORMATION--------------------------------------------------------------//
	
	void insert(int id,String name,String email,String place,String phn)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		String Qry="insert into user.usr values(?,?,?,?,?)";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(Qry);
			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setString(3, email);
			pstmt.setString(4, place);
			pstmt.setString(5, phn);
			pstmt.executeUpdate();

		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}
	}
	//-------------------------------------END--------------------------------------------------------//
	
	//------------------------- TO SHOW THE INFORMATION OF PARTICULAR USER----------------------------//
	void show(int id)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select * from user.usr where id=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(qry);
			pstmt.setInt(1, id);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				int uid=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String place=rs.getString(4);
				String phn=rs.getString(5);
				System.out.println("id :"+id+"\n"+"name :"+name+"\n"+"email :"+email+"\n"+"place :"+place+"\n"+"phone_number :"+phn);
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}	

	}
	//---------------------------------END-----------------------------------------------------------------------------------//
	
	//----------------------TO SHOW ALL USER INFORMATION---------------------------------------------------------------------//
	
	void showAll()
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		ResultSet rs=null;
		String qry="select * from user.usr";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(qry);
			rs=pstmt.executeQuery();
			while(rs.next())
			{
				int uid=rs.getInt(1);
				String name=rs.getString(2);
				String email=rs.getString(3);
				String place=rs.getString(4);
				String phn=rs.getString(5);
				System.out.println("id :"+uid+"\n"+"name :"+name+"\n"+"email :"+email+"\n"+"place :"+place+"\n"+"phone_number :"+phn);
			}
		} 
		catch (ClassNotFoundException | SQLException e) 
		{
			e.printStackTrace();
		}	

	}
	//-------------------------------------------END---------------------------------------------------------------------//
	
	//--------------------------------------TO UPDATE USER DETAILS-------------------------------------------------------//
	
	//-------------------TO UPDATE USER NAME------------------------------------------------------//
	
	void update_name(int id,String name)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		String qry="update user.usr set name=? where id=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(qry);
			pstmt.setString(1, name);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}	
	}
	//-----------------------------END-----------------------------------------------------------------------------------------------//
	//---------------------TO UPDATE USER EMAIL--------------------------------------------------------------------------------------//
	
	void update_email(int id,String email)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		String qry="update user.usr set email=? where id=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(qry);
			pstmt.setString(1, email);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}	
	}
	//------------------------------------END-------------------------------------------------------------------------------
	//--------------------------------TO UPDATE USER PLACE------------------------------------------------------------------
	
	void update_place(int id,String place)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		String qry="update user.usr set place=? where id=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(qry);
			pstmt.setString(1, place);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}	
	}
	//-------------------------------END-------------------------------------------------------------------------------------
	//-----------------------------TO UPDATE USER PHONE----------------------------------------------------------------------
	
	void update_phone(int id,String phn)
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		String qry="update user.usr set phn=? where id=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(qry);
			pstmt.setString(1, phn);
			pstmt.setInt(2, id);
			pstmt.executeUpdate();
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}	
	}
	//------------------------------------END-------------------------------------------------------------------------------//
	//--------------------------TO DELETE USER INFORMATION------------------------------------------------------------------//
	
	void delete(int id) 
	{
		Connection con=null;
		PreparedStatement pstmt=null;
		String qry="delete from user.usr where id=?";
		try 
		{
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=root");
			pstmt=con.prepareStatement(qry);
			pstmt.setInt(1, id);
			pstmt.executeUpdate();
		} 
		catch (ClassNotFoundException | SQLException e)
		{
			e.printStackTrace();
		}
	}
	//-------------------------------END------------------------------------------------------------------------------//
	
	//---------------------Exit Method-----------------------------------//
	  
	void exit()
	{
		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println("Thank You");
		System.out.println("................................................");
	}
	
	
   //-------------------------End---------------------------------------//

}
