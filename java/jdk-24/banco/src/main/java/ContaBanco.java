import java.util.Scanner;
        
public class ContaBanco {
    private int numConta;
    protected String tipo;
    private String dono;
    private double saldo;
    private String status;

    public ContaBanco(int numConta, String tipo, String dono, double saldo, String status) {
        this.numConta = numConta;
        this.tipo = tipo;
        this.dono = dono;
        this.saldo = saldo;
        this.status = status;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getDono() {
        return dono;
    }

    public void setDono(String dono) {
        this.dono = dono;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    
    // abrir conta
    public void abrirConta(){
        System.out.println("Abrindo uma conta....");
        
        if(this.getSaldo() > 50 && "CC".equals(this.getTipo())){
            this.setSaldo(this.saldo +=50);
        }else if(this.getSaldo() > 150 && "CP".equals(this.getTipo())){
            this.setSaldo(saldo += 150);
        }
    }
    
    //fecha conta
    public void fecharContaS(){
    }
   
    //deposiar
    public void depositar(){
        System.out.println("Aréa de depositar");
        
        Scanner input = new Scanner(System.in);
        
        int esc = input.nextInt();
        
        switch(esc) {
            case 1:
                System.out.println("");
                break;
            default:
                throw new AssertionError();
        }
        
        
        
        
    }
    
    // sacar
    public void sacar(){
    }
    
    // pegar mensalidade
    public void pegarMensal(){
    
    }
}
