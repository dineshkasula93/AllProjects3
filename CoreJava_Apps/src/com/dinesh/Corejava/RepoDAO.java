package com.dinesh.Corejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


public class RepoDAO {

	Connection con;
	private static final String SEQUENCE = "CREATE SEQUENCE id_seq";
	private static final String CREATE_TABLE = "create table registration (ID integer nextval('id_seq') primary key unique not null,Firstname text not null, Lastname text not null, Email text not null, Username text UNIQUE not null, Password text not null, Maidenname text not null);";
	private static final String INSERT_REGISTER = "insert into registration (Firstname,Lastname,Email,Username,Password,PhoneNumber,MaidenName) values(?,?,?,?,?,?,?);";
	private static final String GET_DETAILS = "select exists(select Username,Password from registration where Username = ? and Password = ?);";
	private static final String VIEW_DETAILS = "select * from registration where username=?;";
	private static final String PASS_CHECk_CONFIRM = "select exists(select Username,Email,MaidenName from registration where Username =? and Email=? and Maidenname=?);";

	public void getConnection() {
		try {
			Class.forName("org.postgresql.Driver");
			con = DriverManager.getConnection("jdbc:postgresql://127.0.0.1:5432/BellinfoBatch4", "postgres", "dinesh");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException s) {
			s.printStackTrace();
		}
	}

	public void createTable() {
		boolean isSequenceExists = false;
		boolean isTableExists = false;
		Statement stmt = null;
		try {
			getConnection();
			stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery(
					"select exists (select 1 from pg_tables where schemaname = 'public' and tablename = 'registration')");
			ResultSet rs1 = stmt.executeQuery("select * from id_seq");
			while (rs1.next()) {
				isSequenceExists = rs1.getBoolean(1);
			}
			if (!isSequenceExists) {
				stmt.execute(SEQUENCE);
			}
			while (rs.next()) {
				isTableExists = rs.getBoolean(1);
			}
			if (!isTableExists) {
				stmt.execute(CREATE_TABLE);
				System.out.println("****************Database Created Successfully***************");
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				stmt.close();
			} catch (SQLException sq) {
				sq.printStackTrace();
			}
		}

	}

	public boolean insertUserInfo() {
		PreparedStatement ps = null;
		boolean result = false;
		try {
			getConnection();
			
//				getConnection();
//				ps = con.prepareStatement(INSERT_REGISTER);
//				ps.setString(1, info.get(i).getFirstname());
//				ps.setString(2, info.get(i).getLastname());
//				ps.setString(3, info.get(i).getEmail());
//				ps.setString(4, info.get(i).getUsername());
//				ps.setString(5, info.get(i).getPassword());
//				ps.setString(6, info.get(i).getMaidenname());
//				result = ps.execute();
//				ps.close();
		
			if (result == false) {
				System.out.println("****************Values Inserted Successfully***************");
			} else {
				System.out.println("Something Went Wrong Please Try Again!!!");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}

	public boolean getDetails() {
		PreparedStatement ps = null;
		ResultSet rs = null;
		boolean userExists = false;
		try {
			getConnection();
			ps = con.prepareStatement(GET_DETAILS);
			ps.setString(1,"testid1");
			ps.setString(2, "test");
			rs = ps.executeQuery();
			while (rs.next()) {
				userExists = rs.getBoolean(1);
				System.out.println("from the repo dao class:  "+userExists);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException s) {
				s.printStackTrace();
			}
		}
		return userExists;
	}
	
	public String forgetPasswordMtd() {
		String email = null;
		String mname = null;
		String confirmMail = null;
		String confirmMName = null;
		boolean confirmDetails = false;
		PreparedStatement ps = null;
		ResultSet rs = null;
		try {
			getConnection();
			ps = con.prepareStatement(PASS_CHECk_CONFIRM);
//			ps.setString(1, usf.getUsername());
//			ps.setString(1, usf.getEmail());
//			ps.setString(3, usf.getMaidenname());
//			System.out.println("From RepoDAO class viewDetials Methd Uname value:\t" + usf.getUname());
			rs = ps.executeQuery();
			while (rs.next()) {
				email = rs.getString("Email");
				mname = rs.getString("MaidenName");
//				confirmMail = usf.getEmail();
//				confirmMName = usf.getMaidenname();
}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		return email + mname;
	}
public static void main(String[] args){
	
	RepoDAO rp = new RepoDAO();
	boolean val=rp.getDetails();
	System.out.println("Value of RepoDAO"+val);
}


}
