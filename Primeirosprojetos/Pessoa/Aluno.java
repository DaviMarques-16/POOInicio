package Pessoa;
public class Aluno extends Pessoa {

    private int matricula;
    private String curso; 

    public Aluno(String n, int nasc, int mtr, String curso) {
        super(n, nasc);
        this.matricula = mtr;
        this.curso = curso;
    }

    //Getters
    public int getMtr() {
        return this.matricula;
    }

    public String getCurso() {
        return this.curso;
    }


    //Método sobrescrito
    @Override
    public String saudação(){
        String pai = super.saudação();
        return pai + "Aluno mtr: " + this.matricula + " | Curso: " + this.curso;
    }  
}