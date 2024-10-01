package SistemaBiblioteca.gabriela.GUI;

import SistemaBiblioteca.gabriela.Controller.*;
import SistemaBiblioteca.gabriela.Sistema.Endereco;
import SistemaBiblioteca.gabriela.Sistema.SistemaBiblioteca;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.EnumSet;

public class BibliotecaGUI extends JFrame {
    JLabel linha1, linha2;
    ImageIcon bibliotecaPrincipal = new ImageIcon(new ImageIcon("./imgs/livroprincipal.png").getImage().getScaledInstance(190,200, Image.SCALE_SMOOTH));
  /*  ImageIcon usuario = new ImageIcon(new ImageIcon("./imgs/do-utilizador.png").getImage().getScaledInstance(30,30, Image.SCALE_SMOOTH));
    ImageIcon livroempres = new ImageIcon(new ImageIcon("./imgs/livroempres.png").getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));
    ImageIcon livro = new ImageIcon(new ImageIcon("./imgs/book.png").getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));
    ImageIcon remove = new ImageIcon(new ImageIcon("./imgs/lixo.png").getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));
    ImageIcon pesqImg = new ImageIcon(new ImageIcon("./imgs/pesquisar-alt.png").getImage().getScaledInstance(30,30,Image.SCALE_SMOOTH));*/
    SistemaBiblioteca sistema = new SistemaBiblioteca();
    JMenuBar barraDeMenu = new JMenuBar();
    public BibliotecaGUI(){
        setTitle("library");

        setSize(800,600);
        setLocationRelativeTo(null);
        setResizable(false);
        getContentPane().setBackground(Color.black);

        linha1 = new JLabel("Biblioteca Juventude", JLabel.CENTER);
        linha1.setForeground(Color.WHITE);
        linha1.setFont(new Font("Serif", Font.BOLD, 40));

        linha2 = new JLabel(bibliotecaPrincipal, JLabel.CENTER);

        setLayout(new GridLayout(3,1));
        add(linha1);
        add(linha2);
        add(new JLabel());

        /*Cadastrar Usuário*/
        JMenu menuCadastrarUsu = new JMenu("Cadastrar");
        JMenuItem menuCadastrarUsuario = new JMenuItem("Cadastrar Usuário");
        menuCadastrarUsu.add(menuCadastrarUsuario);

        /*Cadastrar Livro*/
        JMenu menuCadastrarLiv = new JMenu("Cadastrar Livro");
        JMenuItem menuCadastrarLivro = new JMenuItem("Cadastrar Livro");
        menuCadastrarLiv.add(menuCadastrarUsuario);

        /*Empréstimo de livro*/
        JMenu menuEmpres = new JMenu("Empréstimo");
        JMenuItem menuEmprestimoLivro = new JMenuItem("Emprestar Livro");
        menuEmpres.add(menuEmprestimoLivro);

        /*Pesquisa de livro*/
        JMenu menuPesquisar = new JMenu("Pesquisar");
        JMenuItem menuPesquisarLivro = new JMenuItem("Pesquisar Livro");
        menuPesquisar.add(menuPesquisarLivro);

        /*Remover Livro*/
        JMenu menuRemover = new JMenu("Remover");
        JMenuItem menuRemoverLivro = new JMenuItem("Remover Livro");
        menuRemover.add(menuRemoverLivro);

        /*Sair*/
        JMenu sair = new JMenu("Sair");
        JMenuItem menuSair = new JMenuItem("Sair");
        sair.add(menuSair);

        menuPesquisarLivro.addActionListener(new BibliotecaPesquisarController(sistema,this));
        menuEmprestimoLivro.addActionListener(new BibliotecaEmprestimoController(sistema,this));
        //menuCadastrarUsuario.addActionListener(new BibliotecaAddUsuarioController(sistema, this));
        menuCadastrarLivro.addActionListener(new BibliotecaAddLivroController(sistema,this));
        menuRemoverLivro.addActionListener(new BibliotecaRemoveController(sistema, this));


        menuCadastrarUsuario.addActionListener(
                (ae) ->{
                    String nome = JOptionPane.showInputDialog(this, "NOME:");
                    String cpf = JOptionPane.showInputDialog(this, "CPF:");
                    String numero = JOptionPane.showInputDialog(this, "NÚMERO TELEFÔNICO:");
                    String rua = JOptionPane.showInputDialog(this, "AV/RUA:");
                    int numeroCasa = Integer.parseInt(JOptionPane.showInputDialog(this, "NÚMERO DO ENDEREÇO:"));
                    String bairro = JOptionPane.showInputDialog(this, "BAIRRO:");
                    String cidade = JOptionPane.showInputDialog(this, "CIDADE:");
                    String estado = JOptionPane.showInputDialog(this, "ESTADO");
                    Endereco endereco = new Endereco(rua, numeroCasa,bairro, cidade, estado);
                    try{
                        sistema.cadastraUsuario(nome, cpf, numero, endereco);
                        JOptionPane.showMessageDialog(this,"USUÁRIO CADASTRADO");
                    }catch (Exception e){
                        JOptionPane.showMessageDialog(this, e.getMessage());
                        e.printStackTrace();
                    }
                });

        menuSair.addActionListener(
                (bye) ->{

                    Object[] options = {"SIM", "NÃO"};
                    JOptionPane.showOptionDialog(this, "Deseja Sair?", "SIM/NAO", JOptionPane.DEFAULT_OPTION,JOptionPane.WARNING_MESSAGE,null, options, options[0]);
                    //String sairJanela = JOptionPane.showConfirmDialog(this, "Deseja Sair?","SIM", JOptionPane.YES_NO_OPTION);

                }
        );
        barraDeMenu.add(menuCadastrarUsuario);
        barraDeMenu.add(menuCadastrarLivro);
        barraDeMenu.add(menuEmprestimoLivro);
        barraDeMenu.add(menuPesquisarLivro);
        barraDeMenu.add(menuRemoverLivro);
        barraDeMenu.add(menuSair);
        setJMenuBar(barraDeMenu);

    }
    public static void main(String[]args){
        JFrame janela = new BibliotecaGUI();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
