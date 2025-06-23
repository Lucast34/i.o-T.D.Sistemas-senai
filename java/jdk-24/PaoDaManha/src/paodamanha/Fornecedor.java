package paodamanha;

public class Fornecedor {
    private int id;
    private String nome;
    private String cnpj;
    private String produto;

    public Fornecedor(int id, String nome, String cnpj, String produto) {
        this.id = id;
        this.nome = nome;
        this.cnpj = cnpj;
        this.produto = produto;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    
}
