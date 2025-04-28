package Controlador;

public class ControleRemoto implements Controlador {
    private int volume;
    private boolean ligado;
    private boolean tocando;
    
    public ControleRemoto(){
        this.volume = 50;
        this.ligado = true;
        this.tocando = false;
    }

    //GETTERS 
    private int getvolume(){
        return this.volume;
    }
    
    private boolean getligado(){
        return this.ligado;
    }

    private boolean gettocando(){
        return this.tocando;
    }

    //SETTERS
    private void setvolume(int v){
        this.volume = v;
    }

    private void setligado(boolean l){
        this.ligado = l;
    }

    private void settocando(boolean t){
        this.tocando = t;
    }

    //MÉTODOS ABSTRATOS SOBRESCRITOS
    @Override
    public void ligar() {
       this.setligado(true);
    }

    @Override
    public void desligar() {
        this.setligado(false);
    }

    @Override
    public void abrirMenu() {
       System.out.println("Está ligado? : " + this.getligado());
       System.out.println("Está tocando? : " + this.gettocando());
       System.out.print("Volume: " + this.getvolume());

       for(int i = 10; i <= this.getvolume(); i+=10 ){
            System.out.print("|");
       }
    }

    @Override
    public void FecharMenu() {
        System.out.println();
        System.out.println("Fechando Menu....");
    }

    @Override
    public void maisVolume() {
       if (this.getligado()){
            this.setvolume(this.getvolume() + 5);
       } else {
            System.out.println("Impossível aumentar volume.");
       }
    }

    @Override
    public void menosVolume() {
        if (this.getligado()){
            this.setvolume(this.getvolume() - 5);
        } else{
            System.out.println("Impossível diminuir volume");
        }
    }

    @Override
    public void ligarMudo() {
       if(this.getligado() && this.getvolume() > 0) {
            this.setvolume(0);
       }
    }

    @Override
    public void desligarMudo() {
      if(this.getligado() && this.getvolume() == 0){
        this.setvolume(50);
      }
    }

    @Override
    public void play() {
        if(this.getligado() && !(this.gettocando())) {
            this.settocando(true);
        }
    }

    @Override
    public void pause() {
        if (this.getligado() && this.gettocando()) {
            this.settocando(false);
        }
    }
    
}
