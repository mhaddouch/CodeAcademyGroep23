import Domain.Certificate;
import Repository.CertificateRepository;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        CertificateRepository certificate = new CertificateRepository();

        certificate.deleteCertificate("mike");

    }
}
