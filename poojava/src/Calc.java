public class Calc {
    public static void calculadora(double n1, double n2, String sinal){
        double res = 0;
        String msg = "";
        if(sinal == "+"){
            res = n1 + n2;
            msg = "A soma é : ";
        }
        else if(sinal == "-"){
            res = n1 - n2;
            msg = "A Subtração é : ";
        }
        else if(sinal == "/"){
            res = n1 / n2;
            msg = "A Divisão é : ";
        }
        else if(sinal == "*"){
            res = n1 * n2;
            msg = "A multiplicação é : ";
        }

        System.out.println(msg+res);
    }
    
public static void main(String[] args) {
        calculadora(100, 60, "*");
    
    }
}
