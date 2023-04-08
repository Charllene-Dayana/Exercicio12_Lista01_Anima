import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        double altura;
        double imc;
        Scanner teclado = new Scanner(System.in);
        System.out.println(" a altura é ");
        altura = teclado.nextDouble();
        imc = (72.7 * altura) - 58;
        teclado.close();
        System.out.println("meu peso ideal é " + imc);

    }
}
