import java.util.ArrayList;

public class YeniKisiEkle {

    private ArrayList<Ogrenci> ogrenciler;
    private ArrayList<Calisan> calisanlar;
    private ArrayList<Ogretmen> ogretmenler;

    public YeniKisiEkle(){
        ogrenciler = new ArrayList<Ogrenci>();
        calisanlar = new ArrayList<Calisan>();
        ogretmenler = new ArrayList<Ogretmen>();
    }

    public void ogrenciEkle(String cinsiyet, String isim, String soyad, int yas, int dogumYili, boolean hayatta, int ogrencilikYili, String okuduguBolum){
        this.ogrenciler.add(new Ogrenci(cinsiyet, isim, soyad, yas, dogumYili, hayatta, ogrencilikYili, okuduguBolum));
    }

    public void ogretmenEkle(String cinsiyet, String isim, String soyad, int yas, int dogumYili, boolean hayatta, String calistigiFakulte, String ogrettigiDersler){
        this.ogretmenler.add(new Ogretmen(cinsiyet, isim, soyad, yas, dogumYili, hayatta, calistigiFakulte, ogrettigiDersler));
    }

    public void calisanEkle(String cinsiyet, String isim, String soyad, int yas, int dogumYili, boolean hayatta, String calismaPozisyonu, String mesaiSaatleri){
        this.calisanlar.add(new Calisan(cinsiyet, isim, soyad, yas, dogumYili, hayatta, calismaPozisyonu, mesaiSaatleri));
    }

    public Ogrenci getOgrenci(int index){
        return ogrenciler.get(index);
    }

    public Ogretmen getOgretmen(int index){
        return ogretmenler.get(index);
    }

    public Calisan getCalisan(int index){
        return calisanlar.get(index);
    }

    public int getOgrenciListSize(){
        return ogrenciler.size();
    }

    public int getOgretmentListSize(){
        return ogretmenler.size();
    }

    public int getCalisanListSize(){
        return calisanlar.size();
    }
}
