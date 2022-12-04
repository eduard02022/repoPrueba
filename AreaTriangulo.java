import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner valor=new Scanner(System.in);
        int b = 0,a = 0;
        float area=b*a/2;
        System.out.println("Digite la base triangulo");
        b=valor.nextInt();
        System.out.println("Digite la altura triangulo");
        a=valor.nextInt();
        System.out.println("El area del triangulo es "+area);
    }
}
