package ru.croc.task17;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.sql.*;

public class Task17 {
    static final String DATABASE_URL = "jdbc:h2:C:/Users/dazhu/IdeaProjects/java-school-2022-DazhukNew/meow";
    static final String JDBC_DRIVER = "org.h2.Driver";

    public static void createTables(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()){
            String SQL = """
                    CREATE TABLE "USER"(ID INT PRIMARY KEY, NAME VARCHAR(255));
                    CREATE TABLE "PRODUCTS"(ARTICLE VARCHAR(255) PRIMARY KEY,"OBJECT" VARCHAR(255), PRICE INTEGER);
                    CREATE TABLE "ORDER"(ID INT/*, FOREIGN KEY(ID) REFERENCES "USER"(ID) ON DELETE CASCADE*/, ARTICLE VARCHAR(255)/*, FOREIGN KEY(ARTICLE) REFERENCES PRODUCTS(ARTICLE)*/);""";

                    statement.execute(SQL);
        }
    }

    public static void updateOne(Connection connection, String tableName, String atributes, String first, String second) throws SQLException {
        try (Statement statement = connection.createStatement()){
            String SQL = "INSERT INTO " + tableName + " VALUES" +
                    "(" + first + ", " + second + ");";
            statement.execute(SQL);
        }
    }

    public static void updateTwo(Connection connection, String tableName, String atributes, String first, String second, String third) throws SQLException {
        try (Statement statement = connection.createStatement()){
            String SQL = "INSERT INTO " + tableName + " VALUES" +
                    "(" + first + ", " + second + ", " + third + ");";
            statement.execute(SQL);
        }
    }

    public static void updateThree(Connection connection) throws SQLException {
        try (Statement statement = connection.createStatement()) {
            String SQL = "SELECT \"USER\".ID, PRODUCTS.ARTICLE " +
                    "FROM \"ORDER\" JOIN PRODUCTS ON \"ORDER\".ARTICLE = PRODUCTS.ARTICLE" +
                    " JOIN \"USER\" ON \"ORDER\".ID = \"USER\".ID;";
            statement.execute(SQL);
        }
    }

    public static boolean hasArticle(Connection connection, String article) throws SQLException {
        String SQL = "SELECT * FROM PRODUCTS " +
                "WHERE ARTICLE = " + article + ";";
        try (Statement statement = connection.createStatement()){
            try (ResultSet result = statement.executeQuery(SQL)) {
                return result.next();
            }
        }
    }

    public static boolean hasID(Connection connection, String ID) throws SQLException {
        String SQL = "SELECT * FROM \"USER\" " +
                "WHERE ID = " + ID + ";";
        try (Statement statement = connection.createStatement()){
            try (ResultSet result = statement.executeQuery(SQL)) {
                return result.next();
            }
        }
    }

    public static void initializationTable(String pathCSV, Connection connection) throws IOException, SQLException {
        BufferedReader reader = new BufferedReader(new FileReader(pathCSV));
        String line = reader.readLine();
        while (line != null) {
            String[] fields = line.split(",");
            //updateThree(connection);
            updateOne(connection, "\"ORDER\"", " (ID, ARTICLE)", fields[0], "'" + fields[2] + "'");
            if(!hasID(connection, "'" + fields[0] + "'"))
                updateOne(connection, "\"USER\"", " (ID, NAME)", fields[0], "'" + fields[1] + "'");
            if(!hasArticle(connection, "'" + fields[2] + "'"))
                updateTwo(connection, "PRODUCTS",  " (ARTICLE, OBJECT, PRICE)", "'" + fields[2] + "'","'" +  fields[3] + "'", fields[4]);
            line = reader.readLine();
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        Class.forName(JDBC_DRIVER);
        try (Connection connection = DriverManager.getConnection(DATABASE_URL)){
            createTables(connection);
            initializationTable(args[0], connection);
        } catch (IOException | SQLException e) {
            e.printStackTrace();
        }
    }
}