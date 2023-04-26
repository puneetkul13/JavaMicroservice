package com.webage.domain;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
public class Crud {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		Connection connection;
		connection = (Connection)DriverManager.getConnection("jdbc:postgressql://34.30.79.157:niveustraining:us-central1:my-database", "punit.agarwal@niveussolution.com", "9453121824");
		PostObject(connection);
		PutObject(connection);
		GetObject(connection);
		DeleteObject(connection);
	
	}
	public void PostObject(Connection connection) throws SQLException{
		String sql = "INSERT INTO guestbook (guestName, content) VALUES (?, ?)";
		PreparedStatement preparedStatement = connection.prepareStatement(sql);
		preparedStatement.setString(1, "John Doe");
		preparedStatement.setString(2,  "I got here");
		preparedStatement.executeUpdate();
		
	}
	public void PutObject(Connection connection) throws SQLException {
		String sql = "UPDATE guestbook SET guestName=?, content=? WHERE guestName = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, "Harry Doe");
		statement.setString(2, "I am in the room");
		statement.setString(3, "John Doe");
		statement.executeUpdate();
	}
	public void GetObject(Connection connection) throws SQLException {
		String sql = "SELECT * FROM guestbook";
		Statement statement = connection.createStatement();
		ResultSet result = statement.executeQuery(sql);
		while (result.next()){
		    String guestName = result.getString("guestName");
		    String content = result.getString("content");
		    String output = guestName + " "+content;
		    System.out.println(output);}
	}
	public void DeleteObject(Connection connection) throws SQLException {
		String sql = "DELETE FROM guestbook WHERE guestName = ?";
		PreparedStatement statement = connection.prepareStatement(sql);
		statement.setString(1, "Harry Doe");
		statement.executeUpdate();
		
	}}

