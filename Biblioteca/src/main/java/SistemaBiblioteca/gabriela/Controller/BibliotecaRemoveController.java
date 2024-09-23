package SistemaBiblioteca.gabriela.Controller;

import SistemaBiblioteca.gabriela.Sistema.Livro;
import SistemaBiblioteca.gabriela.Sistema.SistemaBiblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliotecaRemoveController implements ActionListener {
    private SistemaBiblioteca sistema;
    private JFrame janelaPrincipal;

    public BibliotecaRemoveController(SistemaBiblioteca sistema, JFrame janelaPrincipal){
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String codigo = JOptionPane.showInputDialog(janelaPrincipal,"CÓDIGO DO LIVRO:");
        Livro livro = new Livro("","",0,codigo);
        try {
            sistema.excluirLivro(livro);
            JOptionPane.showMessageDialog(janelaPrincipal,"LIVRO REMOVIDO COM SUCESSO");
        }catch (Exception r){
            JOptionPane.showMessageDialog(janelaPrincipal, r.getMessage());
        }
    }
}
