package SistemaBiblioteca.gabriela.GUI;

import SistemaBiblioteca.gabriela.Controller.*;
import SistemaBiblioteca.gabriela.Sistema.SistemaBiblioteca;



import javax.swing.*;
import java.awt.*;
import java.io.File;

public class BibliotecaGUID2 extends JFrame {
    JLabel linha1, linha2;
    ImageIcon bibliotecaPrincipal = new ImageIcon(new ImageIcon("./imgs/lula-lendo.jpg").getImage().getScaledInstance(190,200, Image.SCALE_SMOOTH));
    ImageIcon usuario = new ImageIcon(new ImageIcon("./imgs/do-utilizador.png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH));
    ImageIcon livroempres = new ImageIcon(new ImageIcon("./imgs/livroempres.png").getImage().getScaledInstance(10,10,Image.SCALE_SMOOTH));
    ImageIcon livro = new ImageIcon(new ImageIcon("./imgs/book.png").getImage().getScaledInstance(10,10,Image.SCALE_SMOOTH));
    ImageIcon remove = new ImageIcon(new ImageIcon("./imgs/lixo.png").getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));
    ImageIcon pesqImg = new ImageIcon(new ImageIcon("./imgs/pesquisar-alt.png").getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));
    JButton botaoCadastrarUsu, botaoCadastrarLi, botaoEmprestimo, botaoPesquisar, botaoRemover;
    SistemaBiblioteca sistema = new SistemaBiblioteca();
    public BibliotecaGUID2(){
        setTitle("MyLibrary");
        System.out.println("++++>"+new File("./imgs/cadastroUsup.png").getAbsolutePath());
        setSize(800,600); //tamanho da janela
        setLocationRelativeTo(null);
        setResizable(true);
        getContentPane().setBackground(Color.black);
        linha1 = new JLabel("Biblioteca LULALENO", JLabel.CENTER);
        linha1.setForeground(Color.white);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(bibliotecaPrincipal, JLabel.CENTER);

        botaoCadastrarUsu = new JButton("<html><font color='white'>Cadastrar Usuário</font></html>");
        botaoCadastrarUsu.setBackground(Color.black);
        botaoCadastrarUsu.addActionListener(new BibliotecaAddUsuarioController(sistema, this));

        botaoCadastrarLi = new JButton("<html><font color='white'>Cadastrar Livro</font></html>");
        botaoCadastrarLi.setBackground(Color.black);
        botaoCadastrarLi.addActionListener(new BibliotecaAddLivroController(sistema,this));

        botaoEmprestimo = new JButton("<html><font color='white'>Empréstimo</font></html>");
        botaoEmprestimo.setBackground(Color.black);
        botaoEmprestimo.addActionListener(new BibliotecaEmprestimoController(sistema, this));


        botaoPesquisar = new JButton("<html><font color='white'>Pesquisar</font></html>");
        botaoPesquisar.setBackground(Color.black);
        botaoPesquisar.addActionListener(new BibliotecaPesquisarController(sistema, this));


        botaoRemover = new JButton("<html><font color='white'>Remover</font></html>");
        botaoRemover.setBackground(Color.black);
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
        JFrame janela = new BibliotecaGUID2();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}

