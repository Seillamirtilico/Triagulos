import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido a tu programa para saber que tipo de triagulo es");
        System.out.println("Ingresa El lado A de tu triangulo");
        double ladoa = sc.nextDouble();
        System.out.println("Ingresa El lado B de tu triangulo");
        double ladob = sc.nextDouble();
        System.out.println("Ingresa El lado C de tu triangulo");
        double ladoC = sc.nextDouble();
        if ((ladoa==ladob)&& (ladob==ladoC)){
            System.out.println("Tu triangulo es equilatero");
        }
        else if ((ladoa=ladob) || (ladoC == ladoa)){
            System.out.println("el año "+anno+ " es bisciesto");
        }else{
            System.out.println("el año "+anno+ " NO es bisciesto");
        }

    }
}