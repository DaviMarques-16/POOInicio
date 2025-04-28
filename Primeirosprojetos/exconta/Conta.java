package exconta;

public class Conta {
    public int numConta;
    protected String tipo;
    private String dono;
    private float saldo;
    private boolean status;

    //MÉTODO CONSTRUTOR
    public Conta(){
        this.status = false;
        this.setsaldo(0);
    }

    // GETTERS E SETTERS
    public int getNumconta(){
        return this.numConta;
    }
    
    public void setNumconta(int n){
        this.numConta = n;
    }

    public String gettipo(){
        return this.tipo;
    }

    public void settipo(String type){
        if(type == "CC"){
        this.tipo = "CC";
        }
        else if(type == "CP"){
        this.tipo = "CP";
        }
    }

    public String getdono(){
        return this.dono;
    }

    public void setdono(String nome){
        this.dono = nome;
    }

    public float getsaldo(){
        return this.saldo;
    }
    public void setsaldo(float valor){
        this.saldo += valor;
    }

    public boolean getstatus(){
        return this.status;
    }


    // MÉTODOS
    public void abrir(){
        this.status = true;
        if(this.tipo == "CC"){
            this.setsaldo(50);
            System.out.println("Sua conta é " + this.tipo);
        }
        else if(this.tipo == "CP"){
            this.setsaldo(150);
            System.out.println("Sua conta é " + this.tipo);
        }
    }

    public void depositar(float quantia){
        if(this.status == true){
            this.setsaldo(quantia);
            System.out.println("Quantia de " + quantia + " adicionada com sucesso.");
        } else { 
            System.out.println("Erro, verifique ativação!");
        }
    }

    public void sacar(float saque){
        if(this.status == true && this.saldo >= saque){
            this.saldo -= saque;
            System.out.println("Saque realizado com sucesso! Saldo: " + this.saldo);
        } else {
            System.out.println("Erro, verifique ativação ou saldo.");
        }
    }

    public void mensal(){
        if(this.tipo == "CC"){
            this.saldo -= 12;
            System.out.println("Pagamento de R$12 REALIZADO.");
        }
        else if(this.tipo == "CP"){
            this.saldo -= 20;
            System.out.println("Pagamento de R$20 REALIZADO.");
        }
    }

    public void fechar(){
        if(this.saldo == 0){
            this.status = false;
            System.out.println("Conta fechada com sucesso.");
        }
        else{
            System.out.println("Há valor na sua conta! Saque-o antes de fechar");
        }
    }
}
