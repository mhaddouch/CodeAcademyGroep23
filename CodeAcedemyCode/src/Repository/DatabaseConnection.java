package Repository;

import java.sql.*;

/**
 * Dit is een voorbeeld Java toepassing waarin je verbinding maakt met een
 * SQLServer database.
 */
public class DatabaseConnection {

    private Connection connection;

    // The Statement object has been defined as a field because some methods
    // may return a ResultSet object. If so, the statement object may not
    // be closed as you would do when it was a local variable in the query
    // execution method.
    private Statement statement;

    public DatabaseConnection() {
        connection = null;
        statement = null;
    }

    public boolean openConnection() {
        boolean result = false;

        if (connection == null) {
            try {

                // Try to create a connection with the library database

                connection = DriverManager.getConnection(
                        "jdbc:sqlserver://aei-sql2.avans.nl:1443;databaseName=CodeCademy23;user=JohnDoe;password=DoeJohn23!;");

                if (connection != null) {
                    statement = connection.createStatement();
                }

                result = true;
            } catch (SQLException e) {
                System.out.println(e);
                result = false;
            }
        } else {
            // A connection was already initalized.
            result = true;
        }

        return result;
    }

    public boolean connectionIsOpen() {
        boolean open = false;

        if (connection != null && statement != null) {
            try {
                open = !connection.isClosed() && !statement.isClosed();
            } catch (SQLException e) {
                System.out.println(e);
                open = false;
            }
        }
        // Else, at least one the connection or statement fields is null, so
        // no valid connection.

        return open;
    }

    public void closeConnection() {
        try {
            statement.close();

            // Close the connection
            connection.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }

    public ResultSet executeSQLSelectStatement(String query) {
        ResultSet resultset = null;

        // First, check whether a some query was passed and the connection with
        // the database.
        if (query != null && connectionIsOpen()) {
            // Then, if succeeded, execute the query.
            try {
                resultset = statement.executeQuery(query);
            } catch (SQLException e) {
                System.out.println(e);
                resultset = null;
            }
        }

        return resultset;
    }

    public boolean executeSQLDeleteStatement(String query) {
        boolean result = false;

        // First, check whether a some query was passed and the connection with
        // the database.
        if (query != null && connectionIsOpen()) {
            // Then, if succeeded, execute the query.
            try {
                statement.executeUpdate(query);
                result = true;
            } catch (SQLException e) {
                System.out.println(e);
                result = false;
            }
        }

        return result;
    }
    public boolean executeSQLInsertStatement(String query) {
        boolean result = false;

        // First, check whether a some query was passed and the connection with
        // the database.
        if (query != null && connectionIsOpen()) {
            // Then, if succeeded, execute the query.
            try {
                statement.executeUpdate(query);
                result = true;
            } catch (SQLException e) {
                System.out.println(e);
                result = false;
            }
        }

        return result;
    }

}
