public abstract class Insan {

    private String cinsiyet;
    private String isim;
    private String soyad;
    private int yas;
    private int dogumYili;
    private boolean hayatta;

    protected Insan (String cinsiyet, String isim, String soyad, int yas, int dogumYili, boolean hayatta){
        setCinsiyet(cinsiyet);
        setIsim(isim);
        setSoyad(soyad);
        setYas(yas);
        setDogumYili(dogumYili);
        this.hayatta = hayatta;
    }

    public String getCinsiyet(){
        return cinsiyet;
    }

    public void setCinsiyet(String cinsiyet) throws IllegalArgumentException{
        if (cinsiyet.toLowerCase().equals("kadin") || cinsiyet.toLowerCase().equals("erkek") || cinsiyet.toLowerCase().equals("kadın")){
            this.cinsiyet = cinsiyet;
        } else {
            throw new IllegalArgumentException("Bilinmeyen Cinsiyet: Lutfen cinsiyeti Kadin ya da Erkek olarak belirtiniz.");
        }
    }

    public String getIsim(){
        return isim;
    }

    public void setIsim(String isim) throws IllegalArgumentException{
        if (isim.matches("[a-zA-Z,ç,Ç,ğ,Ğ,ı,İ,ö,Ö,ş,Ş,ü,Ü,\\s]+$")) {
            this.isim = isim;
        } else {
            throw new IllegalArgumentException("Bilinmeyen isim: Lutfen sadece turkce harf kullanin.");
        }
    }

    public String getSoyad(){
        return soyad;
    }

    public void setSoyad(String soyad) throws IllegalArgumentException{
        if (soyad.matches("[a-zA-Z,ç,Ç,ğ,Ğ,ı,İ,ö,Ö,ş,Ş,ü,Ü,\\s]+$")) {
            this.soyad = soyad;
        } else {
            throw new IllegalArgumentException("Bilinmeyen soyad: Lutfen sadece turkce harf kullanin.");
        }
    }

    public int getYas(){
        return yas;
    }

    public void setYas(int yas) throws IllegalArgumentException{
        if (yas < 0 || yas > 99){
            throw  new IllegalArgumentException("Bilinmeyen Yas: Yas negatif ya da 99dan buyuk olamaz.");
        } else {
            this.yas = yas;
        }
    }

    public int getDogumYili(){
        return dogumYili;
    }

    public void setDogumYili(int dogumYili) throws IllegalArgumentException{
        if (dogumYili > 2020 || dogumYili < 1921){
            throw new IllegalArgumentException("Bilinmeyen Dogum Yili: Dogum yili 2020den buyuk, 1921den kucuk olamaz.");
        } else {
            this.dogumYili = dogumYili;
        }
    }

    public boolean getHayatta(){
        return hayatta;
    }

    public void setHayatta(boolean hayatta){
        this.hayatta = hayatta;
    }

    @Override
    public String toString(){
        return "Isim: " + isim + "\nSoyad: " + soyad + "\nCinsiyet: " + cinsiyet + "\nYas: " + yas
                + "\nDogum Yili: " + dogumYili + "\nHayatta: " + hayatta;
    }
}
