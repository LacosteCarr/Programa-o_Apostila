import java.util.Scanner;
public class pag33_3 {
    
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    int aaa = 1;
    aaa = input.nextInt();
    if (aaa % 2 == 0){
        System.out.println("O número é par");
    }else{
        System.out.println("O número é inpar");
    }
    for (int j = 2; j < aaa; j++) {
        if (aaa % j == 0){
            System.out.println("O número é primo");
        }}
    input.close();
    }
}
