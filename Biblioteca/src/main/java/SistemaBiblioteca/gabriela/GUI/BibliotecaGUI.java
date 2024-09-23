/*
package SistemaBiblioteca.gabriela.GUI;

import SistemaBiblioteca.gabriela.Sistema.Endereco;
import SistemaBiblioteca.gabriela.Sistema.SistemaBiblioteca;

import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.util.EnumSet;

public class BibliotecaGUI extends JFrame {
    JLabel linha1, linha2;
    ImageIcon bibliotecaPrincipal = new ImageIcon("./iconBiblioteca/principal.png");
    ImageIcon usuario = new ImageIcon("./iconBiblioteca/cadastroUsup.png");
    ImageIcon livro = new ImageIcon("./iconBiblioteca/cadastroLivro.png");
    ImageIcon remove = new ImageIcon("./iconBiblioteca/removeLivro.png");
    SistemaBiblioteca sistema = new SistemaBiblioteca();
    JMenuBar barraDeMenu = new JMenuBar();
    public BibliotecaGUI(){
        setTitle("Biblioteca Eleve à Leitura");
        setSize(800,900);
        setLocationRelativeTo(null);
        setBackground(Color.white);

        linha1 = new JLabel("Biblioteca Eleve à Leitura", JLabel.CENTER);
        linha1.setForeground(Color.red);
        linha1.setFont(new Font("Serif", Font.BOLD, 40));

        linha2 = new JLabel(bibliotecaPrincipal, JLabel.CENTER);

        setLayout(new GridLayout(3,1));
        add(linha1);
        add(linha2);
        add(new JLabel());

        JMenu menuCadastrarUsu = new JMenu("Cadastrar Usuário");
        JMenuItem menuCadastrarUsuario = new JMenuItem("Cadastrar Usuário");
        menuCadastrarUsu.add(menuCadastrarUsuario);

        JMenu menuCadastrarLiv = new JMenu("Cadastrar Livro");
        JMenuItem menuCadastrarLivro = new JMenuItem("Cadastrar Livro");
        menuCadastrarLiv.add(menuCadastrarUsuario);

        JMenu menuEmpres = new JMenu("Empréstimo");
        JMenuItem menuEmprestimoLivro = new JMenuItem("Emprestar Livro");
        menuEmpres.add(menuEmprestimoLivro);

        JMenu menuPesquisar = new JMenu("Pesquisar");
        JMenuItem menuPesquisarLivro = new JMenuItem("Pesquisar Livro");
        menuPesquisar.add(menuPesquisarLivro);

        JMenu menuRemover = new JMenu("Remover");
        JMenuItem menuRemoverLivro = new JMenuItem("Remover Livro");
        menuRemover.add(menuRemoverLivro);

        */
/*menuPesquisarLivro.addActionListener();
        menuEmprestimoLivro.addActionListener();
        menuCadastrarUsuario.addActionListener();
        menuCadastrarLivro.addActionListener();
        menuRemoverLivro.addActionListener();*//*


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
        barraDeMenu.add(menuCadastrarUsuario);
        setJMenuBar(barraDeMenu);

    }
    public static void main(String[]args){
        JFrame janela = new BibliotecaGUI();
        janela.setVisible(true);
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
*/
