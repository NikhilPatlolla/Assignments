package com.nikhil.main;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class RealOperations {
	public static void main(String[] args) {
		System.out.println("Please select the kind of operation you want to make to the table");
		System.out.println("Create : c");
		System.out.println("Read: r");
		System.out.println("Update: u");
		System.out.println("Delete: d");

		Set<String> operations = new HashSet<>();
		operations.add("c");
		operations.add("r");
		operations.add("u");
		operations.add("d");

		try (Scanner scan = new Scanner(System.in)) {
			String operation = scan.nextLine();
			operation = operation.toLowerCase();
			if (isValidOperation(operation, operations)) {
				try {
					realOperation(operation);
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

	private static void realOperation(String s) throws SQLException {

		Connection connection = null;
		Statement statement = null;
		if (s.equals("c")) {
			createARecord(connection, statement);
		}
		if (s.equals("r")) {
			readARecord(connection, statement);
		}
		if (s.equals("u")) {
			updateARecord(connection, statement);
		}
		if (s.equals("d")) {
			deleteARecord(connection, statement);
		}
	}

	private static void createARecord(Connection connection, Statement statement) throws SQLException {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the firstName");
		String fName = scan.nextLine();

		System.out.println("Enter the LastName");
		String lName = scan.nextLine();

		System.out.println("Enter the Address");
		String address = scan.nextLine();
		System.out.println("Enter the City");
		String city = scan.nextLine();

		String sqlInsertQuery = String.format(
				"insert into students(`FirstName`, `LastName`, `Address`, `City`) values('%s', '%s', '%s', '%s')",
				fName, lName, address, city);

		try {
			connection = JavaUtilJdbc.getJdbcConnection();
			if (connection != null) {
				statement = connection.createStatement();
			}

			if (statement != null) {
				int noOFRows = statement.executeUpdate(sqlInsertQuery);
				System.out.println("the no. of rows affected are" + noOFRows);
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JavaUtilJdbc.closeConnection(null, statement, connection);

			if (scan != null) {
				scan.close();
			}
		}

	}

	private static void updateARecord(Connection connection, Statement statement) throws SQLException {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the StudentID");
		int sId = scan.nextInt();

		System.out.println("Enter the City");
		String city = scan.nextLine();

		String sqlInsertQuery = String.format("update students set City = '%s' where StudentID = '%d'", city, sId);

		try {
			connection = JavaUtilJdbc.getJdbcConnection();
			if (connection != null) {
				statement = connection.createStatement();
			}

			if (statement != null) {
				int noOFRows = statement.executeUpdate(sqlInsertQuery);
				System.out.println("the no. of rows affected are" + noOFRows);
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JavaUtilJdbc.closeConnection(null, statement, connection);

			if (scan != null) {
				scan.close();
			}
		}
	}

	private static void deleteARecord(Connection connection, Statement statement) throws SQLException {
		Scanner scan = new Scanner(System.in);

		System.out.println("Enter the StudentID to Delete");
		Integer sID = scan.nextInt();

		String sqlInsertQuery = String.format("delete from Students where StudentID = '%d'", sID);

		try {
			connection = JavaUtilJdbc.getJdbcConnection();
			if (connection != null) {
				statement = connection.createStatement();
			}

			if (statement != null) {
				int noOFRows = statement.executeUpdate(sqlInsertQuery);
				System.out.println("the no. of rows affected are" + noOFRows);
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JavaUtilJdbc.closeConnection(null, statement, connection);

			if (scan != null) {
				scan.close();
			}
		}
	}

	private static void readARecord(Connection connection, Statement statement) throws SQLException {
		String sqlQuery = "select FirstName, LastName, Address, City from Students";
		ResultSet resultSet = null;
		try {
			connection = JavaUtilJdbc.getJdbcConnection();
			if (connection != null) {
				statement = connection.createStatement();
			}

			if (statement != null) {

				resultSet = statement.executeQuery(sqlQuery);

				if (resultSet != null) {
					System.out.println("FirstName\tLastName\tAddress\tCity");
					while (resultSet.next()) {
//                        Integer StudentID = resultSet.getInt(1);
//                        System.out.println(StudentID);
						String firstName = resultSet.getString(1);
						String LastName = resultSet.getString(2);
						String Address = resultSet.getString(3);
						String City = resultSet.getString(4);
						System.out.println(firstName + "\t" + LastName + "\t" + Address + "\t" + City);
					}
				}
			}

		} catch (SQLException se) {
			se.printStackTrace();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			JavaUtilJdbc.closeConnection(resultSet, statement, connection);
		}
	}

	private static boolean isValidOperation(String operation, Set<String> operations) {

		if (operations.contains(operation)) {
			return true;
		}
		return false;

	}
}
