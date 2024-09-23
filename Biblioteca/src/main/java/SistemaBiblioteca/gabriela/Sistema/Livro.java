package SistemaBiblioteca.gabriela.Sistema;

import java.io.Serializable;
import java.util.Objects;

public class Livro implements Serializable {
    private String nomeLivro;
    private String nomeAutor;
    private int edicao;
    private String codigo;
    public Livro(String nomeLivro, String nomeAutor, int edicao, String codigo){
        this.nomeLivro = nomeLivro;
        this.nomeAutor = nomeAutor;
        this.edicao = edicao;
        this.codigo = codigo;
    }
    public Livro(){
        this("","",0,"-");
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNomeLivro() {
        return nomeLivro;
    }

    public void setNomeLivro(String nomeLivro) {
        this.nomeLivro = nomeLivro;
    }

    public String getNomeAutor() {
        return nomeAutor;
    }

    public void setNomeAutor(String nomeAutor) {
        this.nomeAutor = nomeAutor;
    }

    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Livro livro = (Livro) o;

        if (edicao != livro.edicao) return false;
        if (!Objects.equals(nomeLivro, livro.nomeLivro)) return false;
        return Objects.equals(nomeAutor, livro.nomeAutor);
    }

    @Override
    public int hashCode() {
        int result = nomeLivro != null ? nomeLivro.hashCode() : 0;
        result = 31 * result + (nomeAutor != null ? nomeAutor.hashCode() : 0);
        result = 31 * result + edicao;
        return result;
    }
    public String toString(){
        return "Livro: "+this.nomeLivro+
                "\nAutor: "+this.nomeAutor+
                "\nEdição: "+this.edicao+"º"+
                "\nCódigo: "+this.codigo;
    }
}
