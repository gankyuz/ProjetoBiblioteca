package SistemaBiblioteca.gabriela.Controller;

import SistemaBiblioteca.gabriela.Sistema.Livro;
import SistemaBiblioteca.gabriela.Sistema.SistemaBiblioteca;
import SistemaBiblioteca.gabriela.Sistema.Usuario;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

public class BibliotecaEmprestimoController implements ActionListener {
    private SistemaBiblioteca sistema;
    private JFrame janelaPrincipal;
    public BibliotecaEmprestimoController(SistemaBiblioteca sistema, JFrame janelaPrincipal){
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String cpf = JOptionPane.showInputDialog(janelaPrincipal, "CPF:");
        String codigoLivro = JOptionPane.showInputDialog(janelaPrincipal, "CÓDIGO DO LIVRO:");
        Usuario usuario =new Usuario ("",cpf,"",null );
        Livro livro = new Livro("","",0, codigoLivro);
        try{
            sistema.emprestimo(usuario,livro);
            JOptionPane.showMessageDialog(janelaPrincipal, "EMPRÉSTIMO FEITO COM SUCESSO");
        }catch (Exception u){
            JOptionPane.showMessageDialog(janelaPrincipal, u.getMessage());
        }
    }
}
