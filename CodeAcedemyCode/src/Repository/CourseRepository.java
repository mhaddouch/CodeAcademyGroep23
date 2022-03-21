package Repository;

import java.sql.ResultSet;
import java.sql.*;
import Domain.*;

public class CourseRepository {
    DatabaseConnection connection = new DatabaseConnection();

    // public boolean DeleteCertificate(int bookNr) {
    // // verwijder reservation uit de mySQL server
    // if (!connection.connectionIsOpen())
    // connection.openConnection();

    // boolean result = connection.executeQuery("DELETE FROM Course = " + bookNr);

    // connection.closeConnection();

    // return result;
    // }

}
