package SistemaBiblioteca.gabriela.Controller;

import SistemaBiblioteca.gabriela.Sistema.Livro;
import SistemaBiblioteca.gabriela.Sistema.SistemaBiblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliotecaPesquisarController implements ActionListener {
    private SistemaBiblioteca sistema;
    private JFrame janelaPrincipal;

    public BibliotecaPesquisarController(SistemaBiblioteca sistema, JFrame janelaPrincipal){
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        //String nomeLivro = JOptionPane.showInputDialog(janelaPrincipal,"NOME:");
        //String nomeAutor = JOptionPane.showInputDialog(janelaPrincipal,"AUTOR");
        //int edicao = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal,"EDIÇÃO"));
        String codigo = JOptionPane.showInputDialog(janelaPrincipal,"CÓDIGO:");
        Livro livro = new Livro("", "", 0, codigo);
        try{
            JOptionPane.showMessageDialog(janelaPrincipal, sistema.pesquisarLivro(livro));
        }catch (Exception a){
            JOptionPane.showMessageDialog(janelaPrincipal, a.getMessage());
        }
    }
}
