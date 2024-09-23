package SistemaBiblioteca.gabriela.Sistema;

import java.io.Serializable;

public class Emprestimo implements Serializable {
    private Usuario usuario;
    private Livro livro;

    public Emprestimo(Usuario usuario, Livro livro){
        this.usuario = usuario;
        this.livro = livro;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Livro getLivro() {
        return livro;
    }

    public void setLivro(Livro livro) {
        this.livro = livro;
    }

    @Override
    public String toString() {
        return "Emprestimo" +
                "\nUsuario: "+this.usuario+
                "\nLivro: " + this.livro;
    }
}
