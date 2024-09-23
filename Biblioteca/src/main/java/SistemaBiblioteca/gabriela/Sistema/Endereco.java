package SistemaBiblioteca.gabriela.Sistema;

import java.util.Objects;

public class Endereco {
    private String enderecoRua;
    private int numeroCasa;
    private String enderecoBairro;
    private String enderecoCidade;
    private String enderecoEstado;
    public Endereco(String enderecoRua, int numeroCasa, String enderecoBairro, String enderecoCidade, String enderecoEstado){
        this.enderecoRua = enderecoRua;
        this.numeroCasa = numeroCasa;
        this.enderecoCidade = enderecoCidade;
        this.enderecoEstado = enderecoEstado;
    }
    public Endereco(){
        this("NONE",0,"NONE","NONE","NONE");
    }

    public String getEnderecoRua() {
        return enderecoRua;
    }

    public void setEnderecoRua(String enderecoRua) {
        this.enderecoRua = enderecoRua;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getEnderecoBairro() {
        return enderecoBairro;
    }

    public void setEnderecoBairro(String enderecoBairro) {
        this.enderecoBairro = enderecoBairro;
    }

    public String getEnderecoCidade() {
        return enderecoCidade;
    }

    public void setEnderecoCidade(String enderecoCidade) {
        this.enderecoCidade = enderecoCidade;
    }

    public String getEnderecoEstado() {
        return enderecoEstado;
    }

    public void setEnderecoEstado(String enderecoEstado) {
        this.enderecoEstado = enderecoEstado;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Endereco endereco = (Endereco) o;

        if (numeroCasa != endereco.numeroCasa) return false;
        if (!Objects.equals(enderecoRua, endereco.enderecoRua))
            return false;
        if (!Objects.equals(enderecoBairro, endereco.enderecoBairro))
            return false;
        if (!Objects.equals(enderecoCidade, endereco.enderecoCidade))
            return false;
        return Objects.equals(enderecoEstado, endereco.enderecoEstado);
    }

    @Override
    public int hashCode() {
        int result = enderecoRua != null ? enderecoRua.hashCode() : 0;
        result = 31 * result + numeroCasa;
        result = 31 * result + (enderecoBairro != null ? enderecoBairro.hashCode() : 0);
        result = 31 * result + (enderecoCidade != null ? enderecoCidade.hashCode() : 0);
        result = 31 * result + (enderecoEstado != null ? enderecoEstado.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "Rua: " + enderecoRua+
                "\nNúmero: " + numeroCasa +"º"+
                "\nBairro: " + enderecoBairro+
                "\nCidade: " + enderecoCidade  +
                "\nEstado: " + enderecoEstado;
    }
}
