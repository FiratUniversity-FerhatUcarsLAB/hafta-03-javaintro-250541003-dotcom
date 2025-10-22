package odev;

public class ParaBozma {

	public static void main(String[] args) {
		int toplam = 278;

        int yuzluk = toplam / 100;
        toplam %= 100;

        int ellilik = toplam / 50;
        toplam %= 50;

        int yirmilik = toplam / 20;
        toplam %= 20;

        int beslik = toplam / 5;
        toplam %= 5;

        int ikilik = toplam / 2;
        toplam %= 2;

        int birlik = toplam;

        System.out.println("278 TL =");
        System.out.println(yuzluk + " x 100 TL");
        System.out.println(ellilik + " x 50 TL");
        System.out.println(yirmilik + " x 20 TL");
        System.out.println(beslik + " x 5 TL");
        System.out.println(ikilik + " x 2 TL");
        System.out.println(birlik + " x 1 TL");
    }
}
