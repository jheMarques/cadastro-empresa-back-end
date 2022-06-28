package br.com.smartVendas.cadastro.cadEmpresa.models;


import javax.persistence.*;


@Entity
@Table(name = "empresas")
public class Empresa {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "cnpj", unique = true, nullable = false)
    private String cnpj;
    @Column(name = "nome" ,nullable = false)
    private String nome;
    @Column(name = "endereço", nullable = false)
    private String endereço;
    @Column(name = "telefone", nullable = false)
    private String telefone;
    @Column(name = "cidade", nullable = false)
    private String cidade;
    @Column(name = "estado", nullable = false)
    private String estado;

    public Empresa() {
    }

    public Empresa(String cnpj, String nome, String endereço, String telefone, String cidade, String estado) {
        super();
        this.cnpj = cnpj;
        this.nome = nome;
        this.endereço = endereço;
        this.telefone = telefone;
        this.cidade = cidade;
        this.estado = estado;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEndereço() {
        return endereço;
    }

    public void setEndereço(String endereço) {
        this.endereço = endereço;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getCidade() {
        return cidade;
    }

    public void setCidade(String cidade) {
        this.cidade = cidade;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }
}
