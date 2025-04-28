package ueccev;

public class Lutador{
    private String nome;
    private String nacionalidade;
    private int idade;
    private float altura;
    private float peso;
    private String categoria;
    private int vitorias;
    private int derrotas;
    private int empates;

    //MÉTODO CONSTRUTOR

    public Lutador(String no, String na, int id, float al, float pe, int vi, int de, int em){
        this.setNome(no);
        this.setNacionalidade(na);
        this.setIdade(id);
        this.setAltura(al);
        this.setPeso(pe);
        this.setVitorias(vi);
        this.setDerrotas(de);
        this.setEmpates(em);
    }

    //GETTERS

    public String getNome(){
        return this.nome;
    }

    private String getNacionalidade(){
        return this.nacionalidade;
    }

    private int getIdade(){
        return this.idade;
    }

    private float getAltura(){
        return this.altura;
    }

    private float getPeso(){
        return this.peso;
    }

    public String getCategoria(){
        return this.categoria;
    }

    private int getVitorias(){
        return this.vitorias;
    }

    private int getDerrotas(){
        return this.derrotas;
    }

    private int getEmpates(){
        return this.empates;
    }

    //SETTERS

    private void setNome(String nome){
        this.nome = nome;
    }

    private void setNacionalidade(String nacionalidade){
        this.nacionalidade = nacionalidade;
    }

    private void setIdade(int idade){
        this.idade = idade;
    }

    private void setAltura(float altura){
        this.altura = altura;
    }

    private void setPeso(float peso){
        this.peso = peso;
        this.setCategoria();
    }

    private void setCategoria(){
        if(this.peso < 52.2){
            this.categoria = "Inválido";
        }
        else if (peso <= 70.3){
            this.categoria = "Leve";
        }
        else if(peso <= 83.9){
            this.categoria = "Médio";
        }
        else if(peso <= 120.2){
            this.categoria = "Pesado";
        } else {
            this.categoria = "Inválido";
        }

    }

    private void setVitorias(int vitorias){
        this.vitorias = vitorias;
    }

    private void setDerrotas(int derrotas){
        this.derrotas = derrotas;
    }

    private void setEmpates(int empates){
        this.empates = empates;
    }

    //MÉTODOS

    public void Apresentar(){
        System.out.println("Chegou a HORA!!!!!!");
        System.out.println("Lutador: " + getNome());
        System.out.println("Origem: " + getNacionalidade());
        System.out.println(getIdade() + " Anos.");
        System.out.println(getAltura() + "m de altura");
        System.out.println("Pesando" + getPeso() + " kg");
        System.out.println("Ganhou: " + getVitorias() );
        System.out.println("Perdeu: " + getDerrotas());
        System.out.println("Empatou: " + getEmpates());
    }

    public void Status(){
        System.out.println(getNome());
        System.out.println("É um peso: " + getCategoria());
        System.out.println(getVitorias() + " vitórias.");
        System.out.println(getDerrotas() + " derrotas.");
        System.out.println(getEmpates() + " empates.");
    }

    public void ganharLuta(){
        this.setVitorias(getVitorias() + 1);
    }

    public void perderLuta(){
        this.setDerrotas(getDerrotas() + 1);
    }

    public void empatarLuta(){
        this.setEmpates(getEmpates() + 1);
    }
    
}