package banco;

public class Main {
    public static void main(String[] args) {
        ContaCorrente contaCorrente;
        contaCorrente = new ContaCorrente();
        contaCorrente.iniciarContaCorrente(1, 1);
        contaCorrente.depositar(500);
        System.out.println("Saldo: " + contaCorrente.consultarSaldo());
        contaCorrente.sacar(300);
        System.out.println("Saldo: " + contaCorrente.consultarSaldo());
    }
}
