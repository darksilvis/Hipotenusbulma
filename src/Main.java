import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int kenar1, kenar2;
        double hipotenus;

        Scanner input = new Scanner(System.in);

        System.out.print("kenar1'i giriniz: ");
        kenar1 = input.nextInt();

        System.out.print("kenar2'yi giriniz: ");
        kenar2 = input.nextInt();

        hipotenus = Math.sqrt(Math.pow(kenar1, 2) + Math.pow(kenar2, 2));
        System.out.println("hipotenus: " + hipotenus);

        input.close();
    }
}
