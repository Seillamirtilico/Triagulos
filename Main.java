import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvedio a tu programa para determinar que tipo de triagulo tienes");
        System.out.println("A continuacion ingresa el lado A de tu triagulo");
        double ladoa = sc.nextDouble();
        System.out.println("A continuacion ingresa el lado B de tu triagulo");
        double ladob = sc.nextDouble();
        System.out.println("A continuacion ingresa el lado C de tu triagulo");
        double ladoc = sc.nextDouble();
        if ((ladoa+ladob>ladob)&&(ladoa+ladoc>ladob)&&(ladob+ladoc>ladoa)) {
            if ((ladoa == ladob) && (ladob == ladoc)) {
                System.out.println("tu triagulo es valido y es un triagulo equilatero osea tiene 3 lados iguales");
            } else if (((ladoa == ladob) || (ladob == ladoc) || (ladoa == ladoc))) {
                System.out.println("tu triangulo es valido y es un triangulo isoceles osea tiene 2 lados iguales");
            } else if (((ladoa != ladob) && (ladob != ladoc) && (ladoc != ladoa))) {
                System.out.println("tu triangulo es valido y es un triangulo escaleno osea tiene 3 lados diferentes");
            }
        }else{
            System.out.println("Tu triangulo es Invalido ya que no cumple con la desigualdad triangular");
        }
    }

}