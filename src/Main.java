import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       double kilo,boy, vucutKitle;
        Scanner input = new Scanner(System.in);
        System.out.println("Kilonuzu giriniz: ");
        kilo = input.nextDouble();
        System.out.println("Boyunuzu giriniz: ");
        boy = input.nextDouble();

        vucutKitle=  kilo /(boy * boy);
        System.out.println("Vücut kitle endeksiniz: " + vucutKitle);

    }
}