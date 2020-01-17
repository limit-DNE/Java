import java.util.InputMismatchException;
import java.util.Scanner;

/* Program basit bir kampus alanindan esinlenmistir.
 * Kampuste Calisan, Ogrenci ve Ogretmen siniflari bulunur.
 * Butun calisanlar, ogrenciler ve ogretmenler insan sinifindan turer.
 * Insan sinifi soyutlandirilmistir.
 * Sadece ogrenci ve ogretmenlere okul kimlik karti yaratilmistir. Bunun icin
 * OkulKimligiYarat arayuzu kullanilir.
 */

/* YENI BIR KISI EKLEMEK ICIN:
 * Verilerin yanlis girilmesi durumunda, kod yeniKisiEkleye geldiginde hata verecektir.
 * Yanlis deger girildiginde direkt uyari vermez. En sonda sadece ekleme yapmaz, ve hata turunu belirtir.
 * Isim, soyad, fakulte, calistigi pozisyon gibi degerler sadece harf kabul eder. Rakamsal degerler hata kabul edilir.
 * Cinsiyet sadece kadin/erkek kabul eder.
 * Yas tam sayi deger alir, 0-99 arasinda sinirlidir. Dogum yili 1921-2020 olarak sinirlidir.
 * Adres ve okul kimlik numarasi rastgele atanir.
 * Turkce harf kullanilabilir.
 */

public class Main {

    private static YeniKisiEkle yeniKisiEkle;
    static Scanner in = new Scanner(System.in);
    private static String kampusUyeTipiCevap;

    public static void main(String[] args) {

        try{
            yeniKisiEkle = new YeniKisiEkle();

            yeniKisiEkle.ogrenciEkle("Erkek", "Hasan", "Bozok", 22, 1997, true, 2, "Mühendislik Fakültesi");
            yeniKisiEkle.ogrenciEkle("Kadin", "Eda Melek", "Akdogan", 19, 1999, true, 1, "Edebiyat Fakültesi");
            yeniKisiEkle.ogrenciEkle("Erkek", "Mert", "Tokat", 23, 1996, true, 3, "Tip Fakültesi");

            yeniKisiEkle.calisanEkle("Kadın", "Hatice", "Durmaz", 37, 1983, true, "Kütüphane Görevlisi", "09:00 - 17:30");
            yeniKisiEkle.calisanEkle("Erkek", "Mustafa", "Bolkan", 48, 1972, true, "Güvenlik Görevlisi", "14:00 - 01:00");

            yeniKisiEkle.ogretmenEkle("Kadın", "Leyla", "Kocaeli", 42, 1978, true, "Edebiyat Fakultesi", "Turk Dili ve Tarihi, Yaratici Yazma, Akademik Turkce, Hukukcular icin Turk Dili ve Edebiyati");
            yeniKisiEkle.ogretmenEkle("Erkek", "Yilmaz", "Demirer", 48, 1972, true, "Hukuk Fakultesi", "Medeni Hukuk, Ceza Hukuku, Miras Hukuku");
            yeniKisiEkle.ogretmenEkle("Erkek", "Ibrahim", "Torun", 54, 1966, true, "Muhendislik Fakultesi", "Bilgisayar Bilimine Giris, Yazilima Giris, Veritabanlari, Algoritmalar");

            System.out.println("\nÇALIŞANLAR");
            for (int i = 0; i < yeniKisiEkle.getCalisanListSize(); i++){
                System.out.println(yeniKisiEkle.getCalisan(i).toString() + "\n");
            }

            System.out.println("ÖĞRENCILER");
            for (int i = 0; i < yeniKisiEkle.getOgrenciListSize(); i++){
                System.out.println(yeniKisiEkle.getOgrenci(i).okulKimliginiGor() + "\n");
            }

            System.out.println("ÖĞRETMENLER");
            for (int i = 0; i < yeniKisiEkle.getOgretmentListSize(); i++){
                System.out.println(yeniKisiEkle.getOgretmen(i).okulKimliginiGor() + "\n");
            }
        } catch (IndexOutOfBoundsException exception){
            System.out.println("Belirtilen lokasyonda tanimli bir veri bulunamadi.");
        } catch (NullPointerException exception){
            System.out.println("Belirtilen nesneye ulasilamadi.");
        } catch (IllegalArgumentException exception){
            System.out.println("Beklenilenden farkli bir deger girildigi icin ekleme yapilamadi.");
        } catch (Exception exception) {
            System.out.println("Beklenmedik Hata: Lutfen verileri kontrol ediniz.");
        }

        while (true){
            System.out.println("Yeni bir kisi eklemek ister misiniz? (Evet) (Hayir): ");
            String yeniBirKisiCevap = in.nextLine().toLowerCase();
            if (yeniBirKisiCevap.equals("hayır") || yeniBirKisiCevap.equals("hayir")){
                break;
            } else if (yeniBirKisiCevap.equals("evet")){
                System.out.println("Eklemek istediğiniz kampüs üyesini belirtiniz (Öğrenci) (Öğretmen) (Çalışan): ");
                kampusUyeTipiCevap = in.nextLine().toLowerCase();

                if (kampusUyeTipiCevap.equals("ogrenci") || kampusUyeTipiCevap.equals("öğrenci")){
                    ogrenciEkle();
                    System.out.println("\nSON EKLENEN OGRENCI");
                    System.out.println(yeniKisiEkle.getOgrenci(yeniKisiEkle.getOgrenciListSize() - 1).okulKimliginiGor() + "\n");
                } else if (kampusUyeTipiCevap.equals("calisan") || kampusUyeTipiCevap.equals("çalışan")){
                    calisanEkle();
                    System.out.println("\nSON EKLENEN CALISAN");
                    System.out.println(yeniKisiEkle.getCalisan(yeniKisiEkle.getCalisanListSize() - 1).toString() + "\n");
                } else if (kampusUyeTipiCevap.equals("ogretmen") || kampusUyeTipiCevap.equals("öğretmen")){
                    ogretmenEkle();
                    System.out.println("\nSON EKLENEN OGRETMEN");
                    System.out.println(yeniKisiEkle.getOgretmen(yeniKisiEkle.getOgretmentListSize() - 1).okulKimliginiGor() + "\n");
                } else {
                    System.out.println("Lutfen Öğrenci, Öğretmen ya da Çalışan tercihlerinden birini seciniz: ");
                    kampusUyeTipiCevap = in.nextLine();
                }
            } else {
                System.out.println("Lutfen sadece evet ya da hayir olarak cevap veriniz");
            }
        }
        in.close();
    }

    /* Degerlerin yanlis girilmesi durumunda direkt uyari olmayacaktir.
     * Kod yeniKisiEkleye geldiginde siniflardan veri tipiyle ilgili hata bilgisi varsa alir.
     * Eger hatali giris varsa ekleme olmaz, ve hata tipi belirtilir. Bu islem en sonda gerceklesir.
     * Hatali giris yoksa, son eklenen kisi belirttiginiz kisidir. Varsa son eklenen kisi degismeyecektir.
     */
    public static void ogrenciEkle(){
        try{
            System.out.println("Ogrencinin Ismini belirtiniz: ");
            String isim = in.nextLine();
            System.out.println("Ogrencinin Soyadini belirtiniz: ");
            String soyad = in.nextLine();
            System.out.println("Ogrencinin Cinsiyetini belirtiniz: ");
            String cinsiyet = in.nextLine();
            System.out.println("Ogrencinin Yasini belirtiniz: ");
            int yas = in.nextInt();
            in.nextLine();
            System.out.println("Ogrencinin Dogum Yilini belirtiniz: ");
            int dogumYili = in.nextInt();
            in.nextLine();
            System.out.println("Ogrencinin Bulundugu Yili belirtiniz: ");
            int ogrencilikYili = in.nextInt();
            in.nextLine();
            System.out.println("Ogrencinin Okudugu Bolumu belirtiniz: ");
            String okuduguBolum = in.nextLine();
            yeniKisiEkle.ogrenciEkle(cinsiyet, isim, soyad, yas, dogumYili, true, ogrencilikYili, okuduguBolum);
        } catch (IllegalArgumentException exception){
            System.out.println("Hatali giris yaptiniz. Lutfen girdiginiz verileri kontrol ederek tekrar deneyiniz.");
        } catch (InputMismatchException exception){
            System.out.println("Beklenenden farkli bir veri tipi algilandi. Lutfen veri tipini kontrol edip tekrar deneyin.");
        } catch (NullPointerException exception){
            System.out.println("Zorunlu alanlardan biri bulunamadigi icin ekleme yapilamadi. Lutfen tekrar deneyiniz.");
        } catch (Exception exception){
            System.out.println("Beklenmeyen bir hatadan oturu eklemeniz gerceklestirilemedi. Lutfen tekrar deneyin.");
        }
    }

    public static void ogretmenEkle(){
        try{
            System.out.println("Ogretmenin Ismini belirtiniz: ");
            String isim = in.nextLine();
            System.out.println("Ogretmenin Soyadini belirtiniz: ");
            String soyad = in.nextLine();
            System.out.println("Ogretmenin Cinsiyetini belirtiniz: ");
            String cinsiyet = in.nextLine();
            System.out.println("Ogretmenin Yasini belirtiniz: ");
            int yas = in.nextInt();
            in.nextLine();
            System.out.println("Ogretmenin Dogum Yilini belirtiniz: ");
            int dogumYili = in.nextInt();
            in.nextLine();
            System.out.println("Ogretmenin Fakultesini belirtiniz: ");
            String fakulte = in.nextLine();
            System.out.println("Ogretmin Ogrettigi Dersleri belirtiniz (Birden Fazla Ders Girebilirsiniz): ");
            String dersler = in.nextLine();
            yeniKisiEkle.ogretmenEkle(cinsiyet, isim, soyad, yas, dogumYili, true, fakulte, dersler);
        } catch (IllegalArgumentException exception){
            System.out.println("Hatali giris yaptiniz. Lutfen girdiginiz verileri kontrol ederek tekrar deneyiniz.");
        } catch (InputMismatchException exception){
            System.out.println("Beklenenden farkli bir veri tipi algilandi. Lutfen veri tipini kontrol edip tekrar deneyin.");
        } catch (NullPointerException exception){
            System.out.println("Zorunlu alanlardan biri bulunamadigi icin ekleme yapilamadi. Lutfen tekrar deneyiniz.");
        } catch (Exception exception){
            System.out.println("Beklenmeyen bir hatadan oturu eklemeniz gerceklestirilemedi. Lutfen tekrar deneyin.");
        }
    }

    public static void calisanEkle(){
        try{
            System.out.println("Calisanin Ismini belirtiniz: ");
            String isim = in.nextLine();
            System.out.println("Calisanin Soyadini belirtiniz: ");
            String soyad = in.nextLine();
            System.out.println("Calisanin Cinsiyetini belirtiniz: ");
            String cinsiyet = in.nextLine();
            System.out.println("Calisanin Yasini belirtiniz: ");
            int yas = in.nextInt();
            in.nextLine();
            System.out.println("Calisanin Dogum Yilini belirtiniz: ");
            int dogumYili = in.nextInt();
            in.nextLine();
            System.out.println("Calisanin Pozisyonunu belirtiniz: ");
            String pozisyon = in.nextLine();
            System.out.println("Calisanin Mesai Saatlerini belirtiniz: ");
            String mesaiSaatleri = in.nextLine();
            yeniKisiEkle.calisanEkle(cinsiyet, isim, soyad, yas, dogumYili, true, pozisyon, mesaiSaatleri);
        } catch (IllegalArgumentException exception){
            System.out.println("Hatali giris yaptiniz. Lutfen girdiginiz verileri kontrol ederek tekrar deneyiniz.");
        } catch (NullPointerException exception){
            System.out.println("Zorunlu alanlardan biri bulunamadigi icin ekleme yapilamadi. Lutfen tekrar deneyiniz.");
        } catch (InputMismatchException exception){
            System.out.println("Beklenenden farkli bir veri tipi algilandi. Lutfen veri tipini kontrol edip tekrar deneyin.");
        } catch (Exception exception){
            System.out.println("Beklenmeyen bir hatadan oturu eklemeniz gerceklestirilemedi. Lutfen tekrar deneyin.");
        }
    }
}

