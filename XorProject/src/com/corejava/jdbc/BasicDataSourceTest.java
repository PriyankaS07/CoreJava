package com.corejava.jdbc;

import java.io.*;
import java.io.FileInputStream;
import java.sql.*;
import org.apache.commons.*;
import org.apache.commons.dbcp2.BasicDataSource;

public class BasicDataSourceTest {
	 
	public static void main(String[] args) throws Exception{

			BasicDataSource basicDataSource = new BasicDataSource();
			
			basicDataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
	 
			
			basicDataSource.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
	 
			
			basicDataSource.setUsername("system");
	 
			
			basicDataSource.setPassword("1234");
			basicDataSource.setMaxIdle(10);
			basicDataSource.setMinIdle(5);
			basicDataSource.setMaxTotal(10);
			Connection conn = null;
	 
			
			PreparedStatement stmt = null;
			try {
				conn = basicDataSource.getConnection();
				
			/*	File file = new File("D:/CoreJava/Workspace/XorProject/download.jfif");
				FileInputStream fis = new FileInputStream(file);*/
				conn.setAutoCommit(false);
				PreparedStatement pstmt= conn.prepareStatement("INSERT INTO employe VALUES (?,?)");
				pstmt.setInt(1, 1); 
				pstmt.setString(2, "ABC");
				pstmt.addBatch();
				pstmt.setInt(1, 2); 
				pstmt.setString(2, "PQR");
				pstmt.addBatch();
				pstmt.setInt(1, 3); 
				pstmt.setString(2, "XYZ");
				pstmt.addBatch();
				pstmt.executeBatch();
				conn.commit();
				conn.setAutoCommit(true);
			/*	stmt = conn.prepareStatement("select * from person");
				ResultSet rs = stmt.executeQuery();
				while (rs.next()) {
					InputStream is=rs.getBinaryStream("PHOTO");
					File f=new File("D:/car.jfif");
					FileOutputStream fos=new FileOutputStream(f);
					int i=0;
					do {
						i=is.read();
						if(i!=-1)
							fos.write(i);
					} while (i!=-1);
					is.close();
					fos.flush();
					fos.close();
					System.out.println("DOne");
				}*/	
			} catch (SQLException e) {
				e.printStackTrace();
			} finally {
				
				if (stmt != null) {
					stmt.close();
				}
				if (conn != null) {
					conn.close();
				}
				if(basicDataSource !=null){
					basicDataSource.close();
				}
			}	
	}

}
	

