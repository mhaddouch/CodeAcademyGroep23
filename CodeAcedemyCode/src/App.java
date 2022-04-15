import Domain.Certificate;
import Repository.CertificateRepository;
import Repository.StudentRepository;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        CertificateRepository certificate = new CertificateRepository();

       // certificate.deleteCertificate("mike");
        StudentRepository student = new StudentRepository();
     //  student.addStudent("email3@hotmail.com", "berd", "boob", "M", "3aaaaaa1-bbbb-cccc-dddd-2eeeeeeeeeee"); 

     
    }
}
