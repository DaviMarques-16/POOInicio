package exconta;

public class Transacoes {
    public static void main(String[] args){
        Conta c1 = new Conta();

        c1.setdono("Davi"); // Dono

        c1.setNumconta(2345); //Nova conta e número
        
        c1.settipo("CC"); //Tipo

        c1.abrir();
        System.out.println("Seu saldo é R$" + c1.getsaldo());

        c1.depositar(300); //Depositar

        System.out.println(c1.getsaldo());


        c1.sacar(120); //Sacar

        c1.mensal(); //Taxa mensal

        c1.depositar(100.25f);

        System.out.println(c1.getsaldo());

        c1.fechar(); //Fechar conta

        Conta c2 = new Conta();

        System.out.println("Conta 2: ");
        c2.depositar(50);
    }
}
