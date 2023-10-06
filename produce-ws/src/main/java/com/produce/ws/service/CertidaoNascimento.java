package com.produce.ws.service;

import jakarta.jws.WebMethod;
import jakarta.jws.WebService;
import jakarta.jws.soap.SOAPBinding;

import static jakarta.jws.soap.SOAPBinding.Style.RPC;

@WebService
@SOAPBinding(style = RPC)
public interface CertidaoNascimento {

    @WebMethod
    int calcularIdade(String idade);

    @WebMethod
    String diaSemanaNascimento(String idade);
}
