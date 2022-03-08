package Repository;

import java.sql.ResultSet;
import java.sql.*;
import Domain.Course;

public class CourseRepository {
    DatabaseConnection connection = new DatabaseConnection();

    public boolean DeleteCertificate(int bookNr) {
        // verwijder reservation uit de mySQL server
        if (!connection.connectionIsOpen())
            connection.openConnection();

        boolean result = connection.executeSQLDeleteStatement("DELETE FROM Course = " + bookNr);

        connection.closeConnection();

        return result;
    }

}
