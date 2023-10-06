package com.consume.correio.ws;

import com.consume.correio.ws.service.AtendeCliente;
import com.consume.correio.ws.service.EnderecoERP;
import jakarta.xml.ws.Service;

import javax.xml.namespace.QName;
import java.net.URL;

public class AppCorreioWs {

    public static void main(String[] args) throws Exception {
        URL urlCorreio = new URL("https://apps.correios.com.br/SigepMasterJPA/AtendeClienteService/AtendeCliente?wsdl");
        QName qnameCorreio = new QName("http://cliente.bean.master.sigep.bsb.correios.com.br/", "AtendeClienteService");

        Service serviceCorreio = Service.create(urlCorreio, qnameCorreio);

        AtendeCliente atendeCliente = serviceCorreio.getPort(AtendeCliente.class);
        EnderecoERP enderecoERP = atendeCliente.consultaCEP("88131626");
        System.out.printf("Cidade: %s/%s \n", enderecoERP.getCidade(), enderecoERP.getUf());
        System.out.println("Bairro: " + enderecoERP.getBairro());
        System.out.println("Endereço: " + enderecoERP.getEnd());
        System.out.println("Cep: " + enderecoERP.getCep());
    }

}
