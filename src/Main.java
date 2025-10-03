import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // Değişkenleri oluştur
        int matematik,fizik,kimya,turkce,tarih,muzik;

        // Scanner sınıflarını tanımla
        Scanner inp = new Scanner(System.in);

        //Kullanıcıdan değerler alınacak
        System.out.print("Matematik notunuz: ");
        matematik = inp.nextInt();

        System.out.print("Fizik notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Kimya notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Türkçe notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Tarih notunuz: ");
        tarih = inp.nextInt();

        System.out.print("Müzik notunuzu: ");
        muzik = inp.nextInt();


        int toplam = (matematik + fizik + kimya + turkce + tarih + muzik);
        double sonuc = toplam / 6.0;
        System.out.println("sonucunuz = " + sonuc);
    }


}
