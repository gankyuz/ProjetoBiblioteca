package SistemaBiblioteca.gabriela.GUI;

import SistemaBiblioteca.gabriela.Controller.*;
import SistemaBiblioteca.gabriela.Sistema.SistemaBiblioteca;



import javax.swing.*;
import java.awt.*;
import java.io.File;

public class BibliotecaGUID extends JFrame {
    JLabel linha1, linha2;
    ImageIcon bibliotecaPrincipal = new ImageIcon(new ImageIcon("./imgs/livroprincipal.png").getImage().getScaledInstance(150,110, Image.SCALE_SMOOTH));
    ImageIcon usuario = new ImageIcon(new ImageIcon("./imgs/do-utilizador.png").getImage().getScaledInstance(50,50, Image.SCALE_SMOOTH));
    ImageIcon livroempres = new ImageIcon(new ImageIcon("./imgs/livroempres.png").getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH));
    ImageIcon livro = new ImageIcon(new ImageIcon("./imgs/book.png").getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH));
    ImageIcon remove = new ImageIcon(new ImageIcon("./imgs/lixo.png").getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH));
    ImageIcon pesqImg = new ImageIcon(new ImageIcon("./imgs/pesquisar-alt.png").getImage().getScaledInstance(50,50,Image.SCALE_SMOOTH));
    JButton botaoCadastrarUsu, botaoCadastrarLi, botaoEmprestimo, botaoPesquisar, botaoRemover;
    SistemaBiblioteca sistema = new SistemaBiblioteca();
    public BibliotecaGUID(){
        setTitle("Minha Biblioteca");
        //System.out.println("++++>"+new File("./imgs/cadastroUsup.png").getAbsolutePath());
        setSize(800,600); //tamanho da janela
        setLocationRelativeTo(null);
        setResizable(true);
        getContentPane().setBackground(Color.white);
        linha1 = new JLabel("Biblioteca Elevando a Leitura", JLabel.CENTER);
        linha1.setForeground(Color.black);
        linha1.setFont(new Font("Serif", Font.BOLD, 24));
        linha2 = new JLabel(bibliotecaPrincipal, JLabel.CENTER);

        botaoCadastrarUsu = new JButton("Cadastrar Usuário", usuario);
        botaoCadastrarUsu.addActionListener(new BibliotecaAddUsuarioController(sistema, this));

        botaoCadastrarLi = new JButton("Cadastrar Livro",livro);
        botaoCadastrarLi.addActionListener(new BibliotecaAddLivroController(sistema,this));

        botaoEmprestimo = new JButton("Empréstimo", livroempres);
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
