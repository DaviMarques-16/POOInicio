package Pessoa;

import java.util.Calendar;

public class Pessoa {
    private String nome;
    private int nascimento;
    private int idade;
    public String apelido;


    Calendar c = Calendar.getInstance();
    int anoatual = c.get(Calendar.YEAR);
    int hora = c.get(Calendar.HOUR_OF_DAY);

    public Pessoa(String n, int nasc){
        this.nome = n;
        this.nascimento = nasc;
    }

    //GETTERS
    public String getnome(){
        return this.nome;
    }

    public int getnascmento(){
        return this.nascimento;
    }

    public int getidade(){
        return this.idade;
    }

    //SETTERS
    public void setapelido(String apel){
        this.apelido = apel;
    }

    //MÉTODOS
    public void calcIdade(){
        this.idade = anoatual - this.nascimento;
        System.out.printf("A idade do(a) %s é %d anos." , this.nome, this.idade);
    }

    public String saudação(){
        String msg;
        if(hora >= 6 && hora <= 12){
            msg = "Bom Dia!";
        }
        else if(hora > 12 && hora <= 18){
            msg = "Boa Tarde!";
        }
        else if(hora > 18 && hora <= 23){
            msg = "Boa Noite!";
        }
        else{ msg = "Tá madrugando?";
    }
        return "\n" + msg + " Nome: " + this.nome + ", Apelido: " + this.apelido + "\n";
    }

}