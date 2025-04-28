package src;

public class Livro implements Publicacao{
    private String título;
    private String autor;
    private int totpag;
    private int pagAtual;
    private boolean aberto;
    private Pessoa leitor;

    
//GETTERS E SETTERS E CONSTRUTOR

    public Livro(String título, String autor, int totpag, Pessoa leitor) {
        this.título = título;
        this.autor = autor;
        this.totpag = totpag;
        this.leitor = leitor;
    }

    public String getTítulo() {
        return título;
    }
    public void setTítulo(String título) {
        this.título = título;
    }
    public String getAutor() {
        return autor;
    }
    public void setAutor(String autor) {
        this.autor = autor;
    }
    public int getTotpag() {
        return totpag;
    }
    public void setTotpag(int totpag) {
        this.totpag = totpag;
    }
    public Pessoa getLeitor() {
        return leitor;
    }
    public void setLeitor(Pessoa leitor) {
        this.leitor = leitor;
    }

//MÉTODOS
    
    public String detalhes() {
        return "Livro [título=" + título + ", autor=" + autor + ", totpag=" + totpag + ", pagAtual=" + pagAtual
            + ", aberto=" + aberto + ", leitor=" + leitor.getNome() + "]";
    }

    @Override
    public void abrir() {
        this.aberto = true;
    }

    @Override
    public void fechar() {
       this.aberto = false;
    }
    @Override
    public void folhear(int p) {
        if (p > this.totpag) {
            this.pagAtual = 0;
        } else {
            this.pagAtual = p;
        }
    }
    @Override
    public void avançarPag() {
        this.pagAtual++;
    }
    @Override
    public void voltarPag() {
        this.pagAtual--;
    }
}

