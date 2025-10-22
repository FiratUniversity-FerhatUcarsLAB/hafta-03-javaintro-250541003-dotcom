package odev;

public class VucutKitleIndeksi {

	public static void main(String[] args) {
		
		double kilo = 60;        
        double boy = 1.65;       

        double bmi = kilo / (boy * boy);

        System.out.printf("Vücut Kitle İndeksiniz: %.2f\n", bmi);
    }
}
