import java.util.Scanner;

public class pag26_1e2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        Float B, b, h, A;
        System.out.println("Bem-vindo ao calculador de área!");
        System.out.println("Informe o valor de B = base maior: ");
        B = input.nextFloat();
        System.out.println("Informe o valor de b = base menor: ");
        b = input.nextFloat();
        System.out.println("Informe o valor de h = altura");
        h = input.nextFloat();
        A = ((B + b) / 2) * h;
        System.out.println("A área do trapézio é: " + A);
        // numero 2
        System.out.println("A área do trapézio aredondada é: " + Math.round(A));
        input.close();
    }
}
