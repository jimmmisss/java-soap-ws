package com.produce.ws;

import com.produce.ws.service.CertidaoNascimentoImpl;
import jakarta.xml.ws.Endpoint;

public class App {

    public static void main(String[] args) {
        CertidaoNascimentoImpl certidaoNascimento = new CertidaoNascimentoImpl();
        Endpoint.publish("http://localhost:8085/servico/certidao", certidaoNascimento);
        System.out.println("Serviço publicado com sucesso.");
    }
}
