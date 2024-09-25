public class TransacoesBancarias {

    private String nome;
    private int numConta;
    private double saldo;
    
    
    
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
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
    public TransacoesBancarias(String nome, int numConta, double saldo) {
        this.nome = nome;
        this.numConta = numConta;
        this.saldo = saldo;
    }

    public void deposito(double valor){

       double taxa = valor *0.01;
       this.setSaldo(valor - taxa);
       System.out.println("Depósito de R$" +valor + " realizado. Taxa de R$" +taxa + " aplicada.");

    }

    public void saque(double valor){

        double taxa = valor *0.005;

        if (this.getSaldo() >=(valor +taxa)) {

            this.setSaldo(valor +taxa);
            System.out.println("Saque de R$" + valor + " realizado. Taxa de R$" +taxa + " aplicada.");
            
        } else {

            System.out.println("Saldo insuficiente para realizar o saque.");
            
        }
    }


    public void consultarSaldo(){

        this.setSaldo(saldo-= 0.02);
        System.out.println("Consulta de saldo realizado com sucesso!!");
        System.out.println("Taxa de R$0,02 aplicada");
        System.out.println("Saldo:R$" +this.getSaldo());

    }


}
