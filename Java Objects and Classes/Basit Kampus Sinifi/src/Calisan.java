public class Calisan extends Insan {

    private String calismaPozisyonu;
    private String mesaiSaatleri;

    protected Calisan(String cinsiyet, String isim, String soyad, int yas, int dogumYili, boolean hayatta, String calismaPozisyonu, String mesaiSaatleri) {
        super(cinsiyet, isim, soyad, yas, dogumYili, hayatta);
        setCalismaPozisyonu(calismaPozisyonu);
        this.mesaiSaatleri = mesaiSaatleri;
    }

    public String getCalismaPozisyonu(){
        return calismaPozisyonu;
    }

    public void setCalismaPozisyonu(String calismaPozisyonu) throws IllegalArgumentException{
        if (calismaPozisyonu.matches("[a-zA-Z,ç,Ç,ğ,Ğ,ı,İ,ö,Ö,ş,Ş,ü,Ü,\\s]+$")) {
            this.calismaPozisyonu = calismaPozisyonu;
        } else {
            throw new IllegalArgumentException("Bilinmeyen pozisyon: Lutfen sadece  harf kullanin.");
        }
    }

    public String getMesaiSaatleri(){
        return mesaiSaatleri;
    }

    public void setMesaiSaatleri(String mesaiSaatleri){
        this.mesaiSaatleri = mesaiSaatleri;
    }

    @Override
    public String toString(){
        return super.toString() + "\nPozisyon: " + calismaPozisyonu + "\nMesai Saatleri: " + mesaiSaatleri;
    }
}
