package Pessoa;

public class Professor extends Aluno {

    private int anoFormacao;

    //Método Construtor com Super (Aluno)
    public Professor(String n, int nasc, int mtr, String curso, int anoForm) {
        super(n, nasc, mtr, curso);
        this.anoFormacao = anoForm;
    } 

    //Método sobrescrito
    @Override
    public String saudação(){
        String avô = super.saudação();
        return "\n"+ avô + "\nProfessor formado em: " + this.anoFormacao + "\n";
    }
}