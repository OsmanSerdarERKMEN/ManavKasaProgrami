import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        final double armut = 2.14;
        final double elma = 3.67;
        final double domates = 1.11;
        final double muz = 0.95;
        final double patlican = 5.0;
        double müsteriArmut, müsteriElma, müsteriDomates, müsteriMuz, müsteriPatlican;
        System.out.println("Kaç kg armut istersiniz ? :");
        müsteriArmut = input.nextDouble();
        System.out.println("Kaç kg elma istersiniz ? :");
        müsteriElma = input.nextDouble();
        System.out.println("Kaç kg domates istersiniz ? :");
        müsteriDomates = input.nextDouble();
        System.out.println("Kaç kg muz istersiniz ? :");
        müsteriMuz = input.nextDouble();
        System.out.println("Kaç kg patlican istersiniz ? :");
        müsteriPatlican = input.nextDouble();
        double toplamTutar = müsteriArmut + müsteriElma + müsteriDomates + müsteriMuz + müsteriPatlican;
        System.out.println("Toplam Borcunuz: " + toplamTutar + " TL");


    }
}