import java.util.concurrent.ThreadLocalRandom;

public class Ogrenci extends Insan implements OkulKimligiYarat{

    private int ogrencilikYili;
    private String okuduguBolum;
    private long okulNO;
    private String adres;

    protected Ogrenci(String cinsiyet, String isim, String soyad, int yas, int dogumYili, boolean hayatta, int ogrencilikYili, String okuduguBolum) {
        super(cinsiyet, isim, soyad, yas, dogumYili, hayatta);
        setOgrencilikYili(ogrencilikYili);
        setOkuduguBolum(okuduguBolum);
    }

    public int getOgrencilikYili(){
        return ogrencilikYili;
    }

    public void setOgrencilikYili(int ogrencilikYili) throws IllegalArgumentException{
       if (ogrencilikYili < 1 || ogrencilikYili > 5){
           throw new IllegalArgumentException("Bilinmeyen Ogrencilik Yili: Ogrencilik yili 1den kucuk 5ten buyuk olamaz.");
       } else {
           this.ogrencilikYili = ogrencilikYili;
       }
    }

    public String getOkuduguBolum(){
        return okuduguBolum;
    }

    public void setOkuduguBolum(String okuduguBolum) throws IllegalArgumentException{
        if (okuduguBolum.matches("[a-zA-Z,ç,Ç,ğ,Ğ,ı,İ,ö,Ö,ş,Ş,ü,Ü,\\s]+$")) {
            this.okuduguBolum = okuduguBolum;
        } else {
            throw new IllegalArgumentException("Bilinmeyen bolum: Lutfen sadece turkce harf kullanin.");
        }
    }

    @Override
    public long okulNumarasiOlustur() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return random.nextLong(OkulKimligiYarat.OKUL_NO_ALT_LIMIT, OkulKimligiYarat.OKUL_NO_UST_LIMIT);
    }

    public long getOkulNO(){
        this.okulNO = okulNumarasiOlustur();
        return okulNO;
    }

    @Override
    public String adresOlustur() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        StringBuilder adresBuffer = new StringBuilder(OkulKimligiYarat.ADRES_HARF_LIMITI);
        for (int i = 0; i < OkulKimligiYarat.ADRES_HARF_LIMITI; i++){
            int randomNum = random.nextInt(OkulKimligiYarat.HARF_BASLANGIC, OkulKimligiYarat.HARF_BITIS + 1);
            adresBuffer.append((char)randomNum);
        }
        String kimlikAdresi = adresBuffer.toString();
        return kimlikAdresi;
    }

    public String getAdres(){
        this.adres = adresOlustur();
        return adres;
    }

    @Override
    public String okuldakiGoreviniBelirt() {
        return "Öğrenci";
    }

    @Override
    public String okulKimliginiGor(){
        return "Isim: " + getIsim() + "\nSoyad: " + getSoyad() + "\nOkul Numarasi: " + getOkulNO() + "\nOkuldaki Durumu: " + okuldakiGoreviniBelirt() + "\nOgrencilik Yili: " + ogrencilikYili
                + "\nOkudugu Bolum: " + okuduguBolum + "\nAdres: " + getAdres() + " Istanbul/Turkiye";
    }

    @Override
    public String toString(){
        return super.toString() + "\nOgrencilik Yili: " + ogrencilikYili + "\nOkudugu Bolum: " + okuduguBolum;
    }
}
