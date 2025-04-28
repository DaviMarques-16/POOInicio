public class Instancias {
    public static void main(String[] args) {
       /* Visitante v1 = new Visitante();
        v1.setNome("Davi");
        v1.setIdade(16);
        v1.setSexo("M");
        
        System.out.println(v1.toString()); */

        Aluno a1 = new Aluno();
        a1.setNome("Cleitu");
        a1.setMatricula(12786);
        a1.setCurso("Infor");
        a1.setIdade(16);
        a1.setSexo("M");

        a1.pagarMensalidade();

        Bolsista b1 = new Bolsista();
        b1.setMatricula(1223);
        b1.setNome("Julio");
        b1.setBolsa(12.5f);
        b1.setSexo("M");
        b1.pagarMensalidade();
    }
}
