import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int r, base;
        double pi = 3.14, areaSegment;

        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yari capini giriniz : ");
        r = inp.nextInt();

        double area = pi * r * r;
        double circumference = 2 * pi * r;

        System.out.println("Dairenin alani : " + area);
        System.out.println("Dairenin cevresi : " + circumference);

        System.out.print("Merkez olcusunu giriniz : ");
        base = inp.nextInt();

        areaSegment = (pi * (r*r)*base)/360;

        System.out.println("Daire diliminin alani : " + areaSegment);

    }
}