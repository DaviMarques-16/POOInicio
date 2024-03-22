import java.time.LocalDateTime;
public class Saudacao{
    public static void mensagem() {
        LocalDateTime now = LocalDateTime.now();
        int hora = now.getHour();
        mensagem(hora);

    }
    public static void mensagem(int hora) {
        if (hora >= 5 && hora <= 11) {
            System.out.println("Bom dia");
        }
        else if(hora >= 12 && hora <= 18) {
            System.out.println("Boa tarde");
        }
        else if(hora >= 19 && hora <= 23) {
            System.out.println("Boa noite");
        }
        else if(hora >= 0 && hora <= 4) {
            System.out.println("Vai dormir rapaz!");
        }
    }
}