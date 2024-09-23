package SistemaBiblioteca.gabriela.Controller;

import SistemaBiblioteca.gabriela.Sistema.Endereco;
import SistemaBiblioteca.gabriela.Sistema.SistemaBiblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliotecaAddLivroController implements ActionListener {
    private SistemaBiblioteca sistema;
    private JFrame janelaPrincipal;

    public BibliotecaAddLivroController(SistemaBiblioteca sistema, JFrame janelaPrincipal){
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String nomeLivro = JOptionPane.showInputDialog(janelaPrincipal,"NOME:");
        String nomeAutor = JOptionPane.showInputDialog(janelaPrincipal,"AUTOR");
        int edicao = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"EDIÇÃO"));
        String codigo = JOptionPane.showInputDialog(janelaPrincipal,"CÓDIGO:");
        try{
            sistema.cadastrarLivro(nomeLivro,nomeAutor,edicao,codigo);
            JOptionPane.showMessageDialog(janelaPrincipal, "Cadastro Realizado com Sucesso");
        }catch (Exception i){
            JOptionPane.showMessageDialog(janelaPrincipal,i.getMessage());
        }
    }
}
