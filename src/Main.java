import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Uchburchtuk uchBurchtuk = new Uchburchtuk();
        System.out.println("Uch burchtukta A kanch bolsun?");
        uchBurchtuk.a = sc.nextInt();
        System.out.println("Uch burchtukta B kanch bolsun?");
        uchBurchtuk.b = sc.nextInt();
        System.out.println("Uch burchtukta C kanch bolsun?");
        uchBurchtuk.c = sc.nextInt();
        uchBurchtuk.area();
    }
}