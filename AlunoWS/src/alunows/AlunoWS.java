/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alunows;

import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

/**
 *
 * @author Rodrigo
 */
public class AlunoWS {

    /**
     * @param args the command line arguments
     */
    
        JFrame janela;
    
    public static void main(String[] args) {
     
        AlunoView view = new AlunoView();
      
        JFrame janela = new JFrame();

        janela.setTitle("Lista Alunos");
        janela.setSize(430, 500);

        janela.setDefaultCloseOperation(EXIT_ON_CLOSE);
        janela.add(view);
        janela.setVisible(true);

        ControllerAluno ctl = new ControllerAluno(view);

    }
} // TODO code application logic here
  
    

