public class Conta{
    String banco;
    String agencia;
    String titular;
    double saldo;
    
    public String getBanco() {
        return this.banco;
    }

    public void setBanco (String banco) {
        this.banco = banco;
    }

    public String getAgencia() {
        return this.agencia;
    }

    public void setAgencia (String agencia) {
        this.agencia = agencia;
    }

    public String getTitular() {
        return this.titular;
    }

    public void setTitular (String titular) {
        this.titular = titular;
    }

    public double getSaldo() {
        return this.saldo;
    }

    public void setSaldo (double saldo){
        this.saldo = saldo;
    }
  
    void transfere(double valor, Conta destinatario){
        if(valor > saldo){
            System.out.println("Saldo insuficiente.");
        }else{
            this.saldo = this.saldo - valor;
            destinatario.saldo = destinatario.saldo + valor;
            System.out.println("Transferência efetuada para " + destinatario.titular + ".");
        }
    }
    
    void deposita(double valor){
            this.saldo = this.saldo + valor;
            System.out.println("Depósito efetuado.");
    }

    void saca(double valor){
        if(valor > saldo){
            System.out.println("Saldo insuficiente.");
        }else{
            System.out.println("Saque efetuado.");
            this.saldo = this.saldo - valor;
        }
    }
    
}

