package SistemaBiblioteca.gabriela.Sistema;

import SistemaBiblioteca.gabriela.Exceptions.*;

public interface InterfaceBiblioteca {
    public void cadastraUsuario(String nomeUsuario, String cpf, String numeroTelefone, Endereco enderecoUsuario) throws UsuarioJaCadastrado;
    public void cadastrarLivro(String nomeLivro, String nomeAutor, int edicao, String codigo) throws LivroJaCadastrado;
    public void emprestimo(Usuario usuario, Livro livro) throws LivroNaoEncontrado, EmprestimoJaFeito;
    public Livro pesquisarLivro(Livro livro) throws LivroNaoEncontrado;
    public void excluirLivro(Livro livro) throws LivroNaoEncontrado;
}
