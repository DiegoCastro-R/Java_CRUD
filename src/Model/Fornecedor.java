package Model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Fornecedor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String codigo_fornecedor;
    private String nomefantasia;
    private String endereco;
    private String numerocontato;
    private String email;
    private String cnpj;

    public String getCodigo_fornecedor() {
        return codigo_fornecedor;
    }

    public void setCodigo_fornecedor(String codigo_fornecedor) {
        this.codigo_fornecedor = codigo_fornecedor;
    }

    public String getNomefantasia() {
        return nomefantasia;
    }

    public void setNomefantasia(String nomefantasia) {
        this.nomefantasia = nomefantasia;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public String getNumerocontato(String numerocontato) {
        return numerocontato;
    }

    public void setNumerocontato(String numerocontato) {
        this.numerocontato = numerocontato;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
}
