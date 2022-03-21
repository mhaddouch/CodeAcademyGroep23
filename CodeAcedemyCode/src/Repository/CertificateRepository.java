package Repository;

import java.sql.ResultSet;
import java.sql.*;
import Domain.*;

public class CertificateRepository {
    DatabaseConnection connection = new DatabaseConnection();

    public void selectCertificate() {

    }

    public void addCertificate() {

    }

    public boolean deleteCertificate(String certificateID) {
        if (!connection.connectionIsOpen())
            connection.openConnection();

        boolean result = connection
                .executeSQLDeleteStatement(
                        "DELETE FROM Certificate WHERE nameEmployer =  '" + certificateID + "'");

        connection.closeConnection();

        return result;

    }

    public void updateCertificate() {

    }
}
