package com.mycompany.bancojdk11;



public class ContaBanco extends Pessoa{
    private int numConta;
    private String tipo;
    private double saldo;
    private String status;

    public void abrirConta(){
        System.out.println("Abrindo uma conta...");
        
        if(this.getSaldo() > 50 && "CC".equals(this.getTipo())){
            System.out.println("Criando a conta....");
            this.setSaldo(this.saldo+=50);
            System.out.println("Conta criada ;)");
            
        }else if(this.getSaldo() > 150 && "CP".equals(this.getTipo())){
            System.out.println("Criando a conta....");
            this.setSaldo(this.saldo+=150);
            System.out.println("Conta criada ;)");
        }
    }
    
    public void fecharConta(){}
    public void depositarP(){}
    public void depositarC(){}
    public void sacar(){}
    public void pagarMensal(){}
    
    
    public ContaBanco(int numConta, String tipo, double saldo, String status, 
            String nome, String cpf, int idade) {
        super(nome, cpf, idade);
        this.numConta = numConta;
        this.tipo = tipo;
        this.saldo = saldo;
        this.status = status;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getNumConta() {
        return numConta;
    }

    public void setNumConta(int numConta) {
        this.numConta = numConta;
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ContaBanco{");
        sb.append("numConta=").append(numConta);
        sb.append(", tipo=").append(tipo);
        sb.append(", saldo=").append(saldo);
        sb.append(", status=").append(status);
        sb.append('}');
        return sb.toString();
    }
    
    
}
