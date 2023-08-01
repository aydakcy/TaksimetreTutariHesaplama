/* Java ile gidilen mesafeye (KM) göre taksimetre tutarını ekrana yazdıran programı yazın.

Taksimetre KM başına 2.20 TL tutmaktadır.
Minimum ödenecek tutar 20 TL'dir. 20 TL altında ki ücretlerde yine 20 TL alınacaktır.
Taksimetre açılış ücreti 10 TL'dir.*/

import java.util.Scanner;

public class PatikaProje3 {
    public static void main(String[] args) {

        //Değişkenleri tanımlıyoruz.
        double KM = 2.20, x, TaksimetreTutari;
        int MinOdenecekTutar = 20, AcilisUcreti = 10;

        //Scanner sınıfını tanımlıyoruz
        Scanner mesafe = new Scanner(System.in);

        //Kullanıcıdan değer alıyoruz
        System.out.print("Gidilen Mesafeyi Giriniz : ");
        x = mesafe.nextDouble();

        //Taksimetre tutarını hesaplayalım
        TaksimetreTutari = AcilisUcreti + (KM * x);
        if(TaksimetreTutari <= 20){
            TaksimetreTutari = MinOdenecekTutar;

        }
        else {
            TaksimetreTutari = AcilisUcreti + (KM * x);
        }
        System.out.print("Taksimetre Tutarı : " + TaksimetreTutari);
    }
}
