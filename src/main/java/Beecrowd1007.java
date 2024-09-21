import java.util.Scanner;
public class Beecrowd1007 {
    public static void main(String[] args)throws java.lang.Exception {
        Scanner leitor = new Scanner(System.in);
        //declarar variáveis
        int A,B,C,D,DIFERENCA;
        //ler variáveis
        A = leitor.nextInt();
        B = leitor.nextInt();
        C = leitor.nextInt();
        D = leitor.nextInt();
        DIFERENCA = A * B - C * D;
        
        
        //mostrar resultado no console
        System.out.printf("DIFERENCA = %d%n" , DIFERENCA);
    }
}
