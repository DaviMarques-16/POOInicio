package Pessoa;

public class Funcionario extends Pessoa {

    private String cargo;
    private float salario;

    //Método Construtor com Super (Pessoa)
    public Funcionario(String n, int nasc, String função, float salario) {
        super(n, nasc);
        this.cargo = função;
        this.salario = salario;
    }

    //Método sobrescrito
    @Override
    public String saudação(){
        String pai = super.saudação();
        return "\n" + pai + "\nCargo: " + this.cargo + "\nSalário: " + this.salario;
    }
}
