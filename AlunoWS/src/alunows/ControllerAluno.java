/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunows;

import java.awt.event.ActionEvent;
import java.util.List;
import javax.swing.table.DefaultTableModel;


import localhost._8000.aluns.Aluno;



/**
 *
 * @author Rodrigo
 */
public class ControllerAluno {

    
       
    private final AlunoView view;
    
    private Aluno alunoAtual;


    

    public ControllerAluno(AlunoView view) {
        this.view = view;
        
        alunoAtual = null;
         
        
        InicializacaoBotoes();
      
      
    }
    
    private void inicializarTabela() {
        String[] colunas = {"ID", "Nome", "Telefone"};
        List<Aluno> lista = ControllerAluno.listar();
        Object[][] data = {};
        DefaultTableModel tb = new DefaultTableModel(data, colunas);
        for (Aluno aluno : lista) {
            Object[] ob = {aluno.getId(),aluno.getNome(),aluno.getTelefone()};
            tb.addRow(ob);
        }
        
        view.getTabela().setModel(tb);
                  
    }
     
     private void InicializacaoBotoes() {
               
       
    view.getBotaoNovo().addActionListener((ActionEvent e) -> {
    
        alunoAtual=null;
        
    });
    
    view.getBotaoSalvar().addActionListener((ActionEvent e) -> {
    
        if(alunoAtual==null){
           
           Aluno aluno =  new Aluno();
           
           
           aluno.setNome(view.getCampoNome().getText());
           
           aluno.setTelefone(view.getCampoTelefone().getText());    
            
            ControllerAluno.inserir(aluno);
            
            inicializarTabela();
        }
        
    });
                 
        }

    private static void inserir(localhost._8000.aluns.Aluno aluno) {
        localhost._8000.aluns.ServiceDaoAlunoWsService service = new localhost._8000.aluns.ServiceDaoAlunoWsService();
        localhost._8000.aluns.ServiceDaoAlunoWs port = service.getServiceDaoAlunoWsPort();
        port.inserir(aluno);
    }

    private static java.util.List<localhost._8000.aluns.Aluno> listar() {
        localhost._8000.aluns.ServiceDaoAlunoWsService service = new localhost._8000.aluns.ServiceDaoAlunoWsService();
        localhost._8000.aluns.ServiceDaoAlunoWs port = service.getServiceDaoAlunoWsPort();
        return port.listar();
    } 
     } 