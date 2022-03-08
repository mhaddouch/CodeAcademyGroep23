package Repository;

import java.sql.ResultSet;
import java.sql.*;
import Domain.*;

public class CertificateRepository {
    String SQL = "SELECT * FROM Certificate ";stmt=con.createStatement();
    // Voer de query uit op de database.
    rs=stmt.executeQuery(SQL);
}
