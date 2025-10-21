import java.util.Scanner;

public class Imc {
    public static void main (String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Entre com o peso ");
        double peso = sc.nextDouble();

        System.out.println("Entre com a altura ");
        double altura = sc.nextDouble();
        double imc = peso/(altura*altura);

        if (peso<=0||altura<=0) {
            sc.close();

            return;
        }

        System.out.println(imc);
        
        if (imc<18.5) {
            System.out.println("Abaixo do peso");          
        }
        else if (imc<=24.9) {
            System.out.println("Peso normal");
        } else if (imc<=29.9) {
            System.out.println("Sobrepeso");
        } else {
            System.out.println("Obesidade");
        }    
        sc.close();
    }
}
