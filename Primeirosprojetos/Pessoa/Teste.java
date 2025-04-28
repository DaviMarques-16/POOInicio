package Pessoa;

public class Teste {
    public static void main(String[] args) {
        //Pessoa

        Pessoa p1 = new Pessoa("Davi", 2008);
        p1.setapelido("Dazuzin");
        System.out.println(p1.saudação());

        System.out.println("-#-#-#-#-#-#-#-#-#-#-#-#-#-#");

        //Aluno

        Aluno al1 = new Aluno("Leandro", 2008, 298534, "Informática");
        al1.setapelido("Leo");
        System.out.println(al1.saudação());

        //Professor

        System.out.println("-#-#-#-#-#-#-#-#-#-#-#-#-#-#");

        Professor prof1 = new Professor("Alcides", 1974, 5678953, "Biologia", 1996);
        prof1.setapelido("Alcides");
        System.out.println(prof1.saudação());

        //Funcionário

        System.out.println("-#-#-#-#-#-#-#-#-#-#-#-#-#-#");

        Funcionario func1 = new Funcionario("Alexandre", 2002, "Programador", 4250.50f);
        func1.setapelido("Alex");
        System.out.println(func1.saudação());


    }
}
