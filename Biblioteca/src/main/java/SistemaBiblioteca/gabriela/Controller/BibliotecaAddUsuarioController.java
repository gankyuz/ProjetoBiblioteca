package SistemaBiblioteca.gabriela.Controller;

import SistemaBiblioteca.gabriela.Sistema.Endereco;
import SistemaBiblioteca.gabriela.Sistema.SistemaBiblioteca;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class BibliotecaAddUsuarioController implements ActionListener {
    private SistemaBiblioteca sistema;
    private JFrame janelaPrincipal;

    public BibliotecaAddUsuarioController(SistemaBiblioteca sistema, JFrame janelaPrincipal){
        this.sistema = sistema;
        this.janelaPrincipal = janelaPrincipal;
    }
    @Override
    public void actionPerformed(ActionEvent e){
        String nome = JOptionPane.showInputDialog(janelaPrincipal, "NOME:");
        String cpf = JOptionPane.showInputDialog(janelaPrincipal, "CPF:");
        String numero = JOptionPane.showInputDialog(janelaPrincipal, "NÚMERO TELEFÔNICO:");
        String rua = JOptionPane.showInputDialog(janelaPrincipal, "AV/RUA:");
        int numeroCasa = Integer.parseInt(JOptionPane.showInputDialog(janelaPrincipal, "NÚMERO DO ENDEREÇO:"));
        String bairro = JOptionPane.showInputDialog(janelaPrincipal, "BAIRRO:");
        String cidade = JOptionPane.showInputDialog(janelaPrincipal, "CIDADE:");
        String estado = JOptionPane.showInputDialog(janelaPrincipal, "ESTADO");
        Endereco endereco = new Endereco(rua, numeroCasa,bairro, cidade, estado);
        try{
            sistema.cadastraUsuario(nome, cpf, numero, endereco);

            JOptionPane.showMessageDialog(janelaPrincipal,"USUÁRIO CADASTRADO");
        }catch (Exception a){
            JOptionPane.showMessageDialog(janelaPrincipal, a.getMessage());
            a.printStackTrace();
        }
    }
}

