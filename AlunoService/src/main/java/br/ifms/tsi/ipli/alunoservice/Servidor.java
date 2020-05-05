/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.tsi.ipli.alunoservice;

import javax.xml.ws.Endpoint;

/**
 *
 * @author Rodrigo
 */
public class Servidor {
    public static void main(String[] args) {
        ServiceDaoAlunoWs aluno = new ServiceDaoAlunoWs();
        String url = "http://localhost:8000/aluns";
        System.out.println("CalculadoraWS rodando:" + url); 
        Endpoint.publish(url, aluno);
    }
}
