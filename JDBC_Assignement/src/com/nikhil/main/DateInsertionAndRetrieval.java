package com.nikhil.main;

import java.sql.Statement;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class DateInsertionAndRetrieval {
	public static void main(String[] args) throws SQLException {
		boolean play = true;
		while (play) {
			System.out.println(
					"What is the operation you want to make to the table? \n Adding a record - 'c' \n Retrieve a record - 'r' ");
			try (Scanner scan = new Scanner(System.in)) {
				String operation = scan.nextLine();
				operation = operation.toLowerCase();
				if (operation.equals("c")) {
					createARecord(null, null);
					play = false;
				} else if (operation.equals("r")) {
					readARecord(null, null);
					play = false;
				} else {
					System.out.println("You have not selected 'c' or 'r', Please try again");
				}
			}
		}

	}

	private static void readARecord(Connection connection, Statement statement) throws SQLException {
		String sQlStatement = "select * from studentdob";
		ResultSet resultSet = null;
		try {
			connection = JavaUtilJdbc.getJdbcConnection();
			if (connection != null) {
				statement = connection.createStatement();
			}

			if (statement != null) {
				resultSet = statement.executeQuery(sQlStatement);
				if (resultSet != null) {
					System.out.println("Name\tAddress\tGender\tDOB\tDOJ\tDOM");
					while (resultSet.next()) {
						String name = resultSet.getString(1);
						String address = resultSet.getString(2);
						String gender = resultSet.getString(3);
						java.sql.Date dob = resultSet.getDate(4);
						String sDob = toNormalDate(dob, "dd-MM-yyyy");
						java.sql.Date doj = resultSet.getDate(5);
						String sDoj = toNormalDate(doj, "MM-dd-yyyy");
						java.sql.Date dom = resultSet.getDate(6);
						String sDom = toNormalDate(dom, "yyyy-MM-dd");
						System.out.println(
								name + "\t" + address + "\t" + gender + "\t" + sDob + "\t" + sDoj + "\t" + sDom);
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

	private static void createARecord(Connection connection, Statement statement) throws SQLException {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the Name");
		String name = scan.nextLine();

		System.out.println("Enter the Address");
		String addr = scan.nextLine();

		System.out.println("Enter the Gender (Male, Female, Other)");
		String gender = scan.nextLine();

		System.out.println("Enter the DOB in (dd-MM-yyyy) format");
		String dob = scan.nextLine();
		java.sql.Date sqlDob = toSqlDate(dob, "dd-MM-yyyy");

		System.out.println("Enter the DOJ in (MM-dd-yyyy) format");
		String doj = scan.nextLine();
		java.sql.Date sqlDoj = toSqlDate(doj, "MM-dd-yyyy");

		System.out.println("Enter the DOM in (yyyy-MM-dd) format");
		String dom = scan.nextLine();
		java.sql.Date sqlDom = toSqlDate(dom, "yyyy-MM-dd");

		String sqlInsertQuery = String.format(
				"insert into studentdob(`name`, `address`, `gender`, `DOB`, `DOJ`, `DOM` ) values('%s', '%s', '%s', '%s', '%s', '%s')",
				name, addr, gender, sqlDob, sqlDoj, sqlDom);

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

	private static java.sql.Date toSqlDate(String date, String format) {
		SimpleDateFormat sdt = new SimpleDateFormat(format);
		try {
			java.util.Date uDate = sdt.parse(date);
			long l = uDate.getTime();
			return new java.sql.Date(l);
		} catch (ParseException e) {
			e.printStackTrace();
		}
		return null;

	}

	private static String toNormalDate(java.sql.Date sDate, String format) {
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String date = sdf.format(sDate);
		return date;
	}
}
