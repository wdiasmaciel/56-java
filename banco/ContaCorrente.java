package banco;

public class ContaCorrente {
	private int numero, agencia;
	private double saldo;
	
   public void iniciarContaCorrente(int n, int ag) {
    	 numero = n;
    	 agencia = ag;
    	 saldo = 0;
   }

    public void sacar(double valor) {
    	saldo = saldo - valor;
    }
    
    public void depositar(double valor) {
    	saldo = saldo + valor;
    }
    
    public double consultarSaldo() {
    	return (saldo);
    }
}
