package Banka;

import java.util.ArrayList;

import static java.lang.Math.random;

class Musteri extends Kisi{

    // Musteri sinifinda bulunan degiskenler
    private int musteriNumarasi;
    ArrayList<BankaHesap> hesaplar;
    ArrayList <KrediKarti> krediKartlari;

    // bos constructor
    public Musteri(){}

    // parametreli constructor
    public Musteri(String ad, String soyad, String email, int telefonNumarasi, int musteriNumarasi) {
        super(ad, soyad, email, telefonNumarasi);
        this.musteriNumarasi = musteriNumarasi;
    }


    // kullanicidan alinan hesapTuru ve BankaHesap nesnesi kullanilarak hesaplar dizisine olusturulan hesabi ekler.
    public void hesapEkle(String hesapTuru, BankaHesap hesap){
        switch (hesapTuru){
            case "vadeli":
                Vadelihesap vadelihesap= new Vadelihesap(hesap.toplamBakiye,"vadeli",0.0f);
                hesaplar.add(vadelihesap);
                break;

            case "vadesiz":
                VadesizHesap vadesizHesap = new VadesizHesap("vadesiz",hesap.toplamBakiye);
                hesaplar.add(vadesizHesap);
                break;
            case "yatirim":
                YatirimHesap yatirimHesap = new YatirimHesap("yatirim",hesap.toplamBakiye,null,0.0f);
                hesaplar.add(yatirimHesap);
                break;
            default:
                System.out.println("Girilen hesap turu gecersiz. Lutfen gecerli hesap turu giriniz: vadeli, vadesiz, yatirim. \n");
        }
    }


    // Kullanicidan alinan
    public void hesapSil(long iban, double toplamBakiye, String hesapBilgisi){

        BankaHesap hesap = new BankaHesap(iban, toplamBakiye, hesapBilgisi);
        if(hesap.toplamBakiye==0){
            hesaplar.remove(hesaplar.indexOf(hesap));
        }
        else if(hesap.toplamBakiye > 0) {
            System.out.println("Lütfen oncelikle bakiyenizi baska hesaba aktariniz. \n");
        }

    }

    @Override
    public String getAd() {
        return super.getAd();
    }

    @Override
    public void setAd(String ad) {
        super.setAd(ad);
    }

    @Override
    public String getSoyad() {
        return super.getSoyad();
    }

    @Override
    public void setSoyad(String soyad) {
        super.setSoyad(soyad);
    }

    @Override
    public int getTcKimlikNo() {
        return super.getTcKimlikNo();
    }

    @Override
    public void setTcKimlikNo(int tcKimlikNo) {
        tcKimlikNo = (int) ((tcKimlikNo * ((random()%1000)+1)));
        super.setTcKimlikNo(tcKimlikNo);
    }

    @Override
    public String getEmail() {
        return super.getEmail();
    }

    @Override
    public void setEmail(String email) {
        super.setEmail(email);
    }

    @Override
    public int getTelefonNumarasi() {
        return super.getTelefonNumarasi();
    }

    @Override
    public void setTelefonNumarasi(int telefonNumarasi) {
        super.setTelefonNumarasi(telefonNumarasi);
    }

    public int getMusteriNumarasi() {
        return musteriNumarasi;
    }

    public void setMusteriNumarasi(int musteriNumarasi) {
        this.musteriNumarasi = musteriNumarasi;
    }

    public ArrayList<BankaHesap> getHesaplar() {
        return hesaplar;
    }

    public void setHesaplar(ArrayList<BankaHesap> hesaplar) {
        this.hesaplar = hesaplar;
    }

    public ArrayList<KrediKarti> getKrediKartlari() {
        return krediKartlari;
    }

    public void setKrediKartlari(ArrayList<KrediKarti> krediKartlari) {
        this.krediKartlari = krediKartlari;
    }


    public String toString() {
        String output = "Musteri:";

        output += " #"
                + this.getMusteriNumarasi()
                +" |\t"
                + "ad: "
                + this.getAd()
                + " "
                + this.getSoyad()
                +  "|\t"
                + "tcno: "
                + this.getTcKimlikNo()
                +  "|\t"
                + " email: "
                + this.getEmail()
                + "|\t"
                + "| telefon: "
                + this.getTelefonNumarasi()
                + "\t|\n";


        return output;
    }


}
