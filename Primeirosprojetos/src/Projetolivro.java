package src;

public class Projetolivro {
    public static void main(String[] args) {
        Pessoa[] p = new Pessoa[2];
        Livro[] l = new Livro[3];

        p[0] = new Pessoa("Pedro",16, "M");
        p[1] = new Pessoa("Maria", 22, "F");

        l[0] = new Livro("Farfar","Alexandre",303,p[0]);
        l[1] = new Livro("Julin do peao","pedro paulo",654,p[1]);
        l[2] = new Livro("Carlos","Carlos julhos",332, p[0]);

        l[0].abrir();
        l[0].folhear(100);
        l[0].avançarPag();
        System.out.println(l[0].detalhes());
    }
}
