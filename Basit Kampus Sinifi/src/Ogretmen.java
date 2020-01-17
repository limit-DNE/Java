import java.util.concurrent.ThreadLocalRandom;

public class Ogretmen extends Insan implements OkulKimligiYarat {

    private String calistigiFakulte;
    private long ogretmenNo;
    private String adres;
    private String ogrettigiDersler;

    protected Ogretmen(String cinsiyet, String isim, String soyad, int yas, int dogumYili, boolean hayatta, String calistigiFakulte, String ogrettigiDersler) {
        super(cinsiyet, isim, soyad, yas, dogumYili, hayatta);
        setCalistigiFakulte(calistigiFakulte);
        this.ogrettigiDersler = ogrettigiDersler;
    }

    public void setCalistigiFakulte(String calistigiFakulte){
        if (calistigiFakulte.matches("[a-zA-Z,ç,Ç,ğ,Ğ,ı,İ,ö,Ö,ş,Ş,ü,Ü,\\s]+$")) {
            this.calistigiFakulte = calistigiFakulte;
        } else {
            throw new IllegalArgumentException("Bilinmeyen fakulte: Lutfen sadece turkce harf kullanin.");
        }
    }

    public String getCalistigiFakulte(){
        return calistigiFakulte;
    }

    public void setOgrettigiDersler(String ogrettigiDersler){
        this.ogrettigiDersler = ogrettigiDersler;
    }

    public String getOgrettigiDersler(){
        return ogrettigiDersler;
    }

    @Override
    public long okulNumarasiOlustur() {
        ThreadLocalRandom random = ThreadLocalRandom.current();
        return random.nextLong(OkulKimligiYarat.OKUL_NO_ALT_LIMIT, OkulKimligiYarat.OKUL_NO_UST_LIMIT);
    }

    public long getOgretmenNo(){
        this.ogretmenNo = okulNumarasiOlustur();
        return ogretmenNo;
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
        return "Profesör";
    }

    @Override
    public String okulKimliginiGor() {
        return "Isim: " + getIsim() + "\nSoyad: " + getSoyad() + "\nOgretmen Numarasi: " + getOgretmenNo() + "\nOkuldaki Durumu: " + okuldakiGoreviniBelirt() + "\nCalistigi Fakulte: " + calistigiFakulte
                + "\nOgrettigi Dersler: " + getOgrettigiDersler() + "\nAdres: " + getAdres() + " Istanbul/Turkiye";
    }

    @Override
    public String toString(){
        return super.toString() + "\nCalistigi Fakulte: " + calistigiFakulte + "\nOgrettigi Dersler: " + getOgrettigiDersler();
    }
}
