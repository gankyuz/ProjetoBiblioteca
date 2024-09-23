package SistemaBiblioteca.gabriela.GUI;

import SistemaBiblioteca.gabriela.Controller.*;
import SistemaBiblioteca.gabriela.Sistema.SistemaBiblioteca;



import javax.swing.*;
import java.awt.*;

public class BibliotecaGUID extends JFrame {
    JLabel linha1, linha2;
    ImageIcon bibliotecaPrincipal = new ImageIcon("./imgs/bibvirtual.jpg");
    ImageIcon usuario = new ImageIcon("./imgs/cadastroUsup.png");
    ImageIcon livro = new ImageIcon("./imgs/cadastroLivro.png");
    ImageIcon remove = new ImageIcon("./imgs/removeLivro.png");
    ImageIcon pesqImg = new ImageIcon("./imgs/lupa.png");
    JButton botaoCadastrarUsu, botaoCadastrarLi, botaoEmprestimo, botaoPesquisar, botaoRemover;
    SistemaBiblioteca sistema = new SistemaBiblioteca();
    public BibliotecaGUID(){
        setTitle("Minha Biblioteca");
        setSize(800,600); //tamanho da janela
        setLocation(150, 150);
        setResizable(false);
        getContentPane().setBackground(Color.black);
        linha1 = new JLabel("Biblioteca Elevando a Leitura", JLabel.CENTER);
        linha1.setForeground(Color.white);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(bibliotecaPrincipal, JLabel.CENTER);

        botaoCadastrarUsu = new JButton("Cadastrar Usuário", usuario);
        botaoCadastrarUsu.addActionListener(new BibliotecaAddUsuarioController(sistema, this));

        botaoCadastrarLi = new JButton("Cadastrar Livro",livro);
        botaoCadastrarLi.addActionListener(new BibliotecaAddLivroController(sistema,this));

        botaoEmprestimo = new JButton("Empréstimo", null);
        botaoEmprestimo.addActionListener(new BibliotecaEmprestimoController(sistema, this));


        botaoPesquisar = new JButton("Pesquisar",pesqImg);
        botaoPesquisar.addActionListener(new BibliotecaPesquisarController(sistema, this));


        botaoRemover = new JButton("Remover",remove);
        botaoRemover.addActionListener(new BibliotecaRemoveController(sistema, this));


        getContentPane().setLayout(new GridLayout(5,2));
        getContentPane().add(linha1);
        getContentPane().add(botaoCadastrarUsu);

        getContentPane().add(linha2);
        getContentPane().add(botaoCadastrarLi);

        getContentPane().add(new JLabel());
        getContentPane().add(botaoEmprestimo);

        getContentPane().add(new JLabel());
        getContentPane().add(botaoPesquisar);

        getContentPane().add(new JLabel());
        getContentPane().add(botaoRemover);
    }
    public static void main(String [] args){
        JFrame janela = new BibliotecaGUID();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
