package SistemaBiblioteca.gabriela.Sistema;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable {
    private String nomeUsuario;
    private String cpf;
    private String numeroTelefone;
    private Endereco enderecoUsuario;

    public Usuario(String nomeUsuario, String cpf, String numeroTelefone, Endereco enderecoUsuario){
        this.nomeUsuario = nomeUsuario;
        this.cpf = cpf;
        this.numeroTelefone = numeroTelefone;
        this.enderecoUsuario = enderecoUsuario;
    }
    public Usuario(){
        this("-","-","-", null);
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getNumeroTelefone() {
        return numeroTelefone;
    }

    public void setNumeroTelefone(String numeroTelefone) {
        this.numeroTelefone = numeroTelefone;
    }

    public Endereco getEnderecoUsuario() {
        return enderecoUsuario;
    }

    public void setEnderecoUsuario(Endereco enderecoUsuario) {
        this.enderecoUsuario = enderecoUsuario;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Usuario usuario = (Usuario) o;

        if (!Objects.equals(nomeUsuario, usuario.nomeUsuario)) return false;
        if (!Objects.equals(numeroTelefone, usuario.numeroTelefone))
            return false;
        return Objects.equals(enderecoUsuario, usuario.enderecoUsuario);
    }

    @Override
    public int hashCode() {
        int result = nomeUsuario != null ? nomeUsuario.hashCode() : 0;
        result = 31 * result + (numeroTelefone != null ? numeroTelefone.hashCode() : 0);
        result = 31 * result + (enderecoUsuario != null ? enderecoUsuario.hashCode() : 0);
        return result;
    }

    public String toString(){
        return "Nome Usuário: "+this.nomeUsuario+
                "\nCPF: "+this.cpf+
                "\nTelefône: "+this.numeroTelefone+
                "\nEndereço: "+this.enderecoUsuario;
    }
}
