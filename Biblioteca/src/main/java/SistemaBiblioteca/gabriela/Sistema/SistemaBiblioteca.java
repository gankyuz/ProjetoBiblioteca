package SistemaBiblioteca.gabriela.Sistema;

import SistemaBiblioteca.gabriela.Exceptions.*;
import SistemaBiblioteca.gabriela.Sistema.*;

import java.util.*;

public class SistemaBiblioteca implements InterfaceBiblioteca {

    private Map<String, Livro> livros;
    private Map<String, Usuario> usuarios;
    private List<Emprestimo> emprestimos;

    public SistemaBiblioteca(){
        this.livros = new HashMap<>();
        this.usuarios = new HashMap<>();
        this.emprestimos = new ArrayList<>();
    }

    @Override
    public void cadastraUsuario(String nomeUsuario, String cpf, String numeroTelefone, Endereco enderecoUsuario) throws UsuarioJaCadastrado {
        if(this.usuarios.containsKey(cpf)) throw new UsuarioJaCadastrado("USUÁRIO JÁ EXISTENTE");
        Usuario cadastro = new Usuario(nomeUsuario, cpf, numeroTelefone, enderecoUsuario);
        this.usuarios.put(cpf, cadastro);
    }

    @Override
    public void cadastrarLivro(String nomeLivro, String nomeAutor, int edicao, String codigo) throws LivroJaCadastrado {
        if (this.usuarios.containsKey(codigo))throw new LivroJaCadastrado("LIVRO JÁ CADASTRADO");
        Livro cadastro = new Livro(nomeLivro, nomeAutor, edicao, codigo);
        this.livros.put(codigo, cadastro);


    }

    @Override
    public void emprestimo(Usuario usuario, Livro livro) throws LivroNaoEncontrado,EmprestimoJaFeito {
        if (this.emprestimos.equals(usuario.getCpf())) throw new EmprestimoJaFeito("EMPRÉSTIMO JÁ FEITO NO CPF: "+usuario.getCpf());
        else if (this.livros.containsKey(livro.getCodigo())){
            Emprestimo emprestimo = new Emprestimo(usuario, livro);
            this.emprestimos.add(emprestimo);
        }else {
            throw new LivroNaoEncontrado("LIVRO NÃO ENCONTRADO");
        }
    }

    @Override
    public Livro pesquisarLivro(Livro livro) throws LivroNaoEncontrado {
       if (this.livros.containsKey(livro.getCodigo())){
           return livro;
       }
       throw new LivroNaoEncontrado("LIVRO NÃO ENCONTRADO");
    }

    @Override
    public void excluirLivro(Livro livro) throws LivroNaoEncontrado {
        if (this.livros.containsKey(livro.getCodigo())){
            livros.remove(livro.getCodigo());
        }
        throw new LivroNaoEncontrado("LIVRO NÃO ENCONTRADO");
    }
}
