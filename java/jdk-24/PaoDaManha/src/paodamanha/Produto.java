package paodamanha;

public class Produto {
    private int id;
    private String nome;
    private int estoque;
    private float precoQt;

    public Produto(int id, String nome, int estoque, float precoQt) {
        this.id = id;
        this.nome = nome;
        this.estoque = estoque;
        this.precoQt = precoQt;
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

    public int getEstoque() {
        return estoque;
    }

    public void setEstoque(int estoque) {
        this.estoque = estoque;
    }

    public float getPrecoQt() {
        return precoQt;
    }

    public void setPrecoQt(float precoQt) {
        this.precoQt = precoQt;
    }
    
    
}
