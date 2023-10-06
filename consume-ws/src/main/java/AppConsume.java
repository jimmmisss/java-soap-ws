import com.consume.ws.service.CertidaoNascimento;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.URL;

public class AppConsume {

    public static void main(String[] args) throws Exception {

        URL urlCorreio = new URL("http://localhost:8085/servico/certidao?wsdl");
        QName qnameCorreio = new QName("http://service.ws.produce.com/", "CertidaoNascimentoImplService");

        Service serviceCorreio = Service.create(urlCorreio, qnameCorreio);
        CertidaoNascimento certidaoNascimento = serviceCorreio.getPort(CertidaoNascimento.class);

        int idade = certidaoNascimento.calcularIdade("13/09/1982");
        String dia = certidaoNascimento.diaSemanaNascimento("13/09/1982");

        System.out.println("Idade: " + idade);
        System.out.println("Dia: " + dia);
    }
}
