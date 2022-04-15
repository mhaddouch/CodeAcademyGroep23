package Repository;
import java.sql.ResultSet;
import java.sql.*;
import Domain.Student;

public class StudentRepository {

    DatabaseConnection connection = new DatabaseConnection();
    public void selectStudent() {

    }
    public Student findStudent(String emailAddress) {
        //haal member op uit de mySQL server
        if(!connection.connectionIsOpen())
            connection.openConnection();
        ResultSet result = connection.executeSQLSelectStatement("SELECT * FROM Student WHERE emailAddress = " + emailAddress);
        Student student = new Student(null,null,null,null,null);
        try {
            while (result.next()) {

                student.setEmailAddress(result.getString("emailAddress"));
                student.setName(result.getString("CursistEmail"));
                student.setBirthDay(result.getString("Adres"));
                student.setNaam(result.getString("Naam"));
                student.setGeboorteDatum(result.getDate("Geboortedatum"));
                
            }

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
        return cursist;
        
        
    }


    public boolean addStudent(String email,String name,String birthplace,String gender,String addressID) {
        if (!connection.connectionIsOpen())
        connection.openConnection();

    boolean result = connection
            .executeSQLInsertStatement(
                "INSERT INTO Student (emailAddress, name, birthplace, gender, addressID) VALUES('" + email + "','" + name + "','" + birthplace + "','" + gender + "','" + addressID + "')");

                connection.closeConnection();

                return result;
    }

    public boolean deleteStudent(String studentId){
        return false;
    }

}
