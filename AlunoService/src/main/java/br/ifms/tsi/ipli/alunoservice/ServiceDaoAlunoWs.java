/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ifms.tsi.ipli.alunoservice;


import java.util.List;
import java.util.logging.Logger;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;
import javax.persistence.PersistenceException;

/**
 *
 * @author Rodrigo
 */


@WebService(targetNamespace = "http://localhost:8000/aluns")
public class ServiceDaoAlunoWs {
    private AlunoDao dao;
    
    public ServiceDaoAlunoWs() {
        
            dao = new AlunoDao();
       
    }
    
    
    @WebMethod
    public void inserir(@WebParam(name = "aluno") Aluno aluno) {
        dao.persistir(aluno);
    }
    
    @WebMethod
    public void alterar(@WebParam(name = "aluno") Aluno aluno) {
        dao.alterar(aluno);
    }
    
    @WebMethod
    public void remover(@WebParam(name = "id") int id) {
        dao.remover(id);
    }
    
    @WebMethod
    public List<Aluno> listar() {
        return dao.listarTodos();
    }
}