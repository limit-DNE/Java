public interface OkulKimligiYarat {
    int HARF_BASLANGIC = 97;
    int HARF_BITIS = 122;
    int ADRES_HARF_LIMITI = 16;
    long OKUL_NO_ALT_LIMIT = 1_000_000_000L;
    long OKUL_NO_UST_LIMIT = 10_000_000_000L;
    long okulNumarasiOlustur();
    String adresOlustur();
    String okuldakiGoreviniBelirt();
    String okulKimliginiGor();
}
