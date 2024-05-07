package Banka;

import java.time.LocalDateTime;
import java.util.Date;

import static java.lang.Math.pow;

class BankaHesap {
    long iban;
    Date hesapAcilisTarihi;
    double toplamBakiye;
    String hesapBilgisi;
    double islemMiktari;
    String hesapTuru;

    public BankaHesap(){}

    public BankaHesap(long iban, double toplamBakiye, String hesapBilgisi) {
        this.iban=iban;
        this.toplamBakiye=toplamBakiye;
        this.hesapBilgisi = hesapBilgisi;
    }

    public long getIban() {
        return iban;
    }

    public void setIban(long iban) {

        this.iban = (int)(Math.random()*pow(10,25)+1);
    }

    public LocalDateTime getHesapAcilisTarihi() {
        return getHesapAcilisTarihi();
    }

    public void setHesapAcilisTarihi(LocalDateTime hesapAcilisTraihi) {

        this.hesapAcilisTarihi = hesapAcilisTarihi;
    }

    public double getToplamBakiye() {
        return toplamBakiye;
    }

    public void setToplamBakiye(double toplamBakiye) {
        this.toplamBakiye = toplamBakiye;
    }

    public String getHesapBilgisi() {
        return hesapBilgisi;
    }

    public void setHesapBilgisi(String hesapBilgisi) {
        hesapBilgisi=hesapTuru;
        switch (hesapBilgisi) {
            case "1":
                this.hesapBilgisi = "maas";
                break;
            case "2":
                this.hesapBilgisi = "normal";
                break;
            default:
                System.out.println("tanimlanmayan hesap turu girdiniz. (1: maas, 2. normal)\n");
                break;
        }
    }

    public double getIslemMiktari() {
        return islemMiktari;
    }

    public void setIslemMiktari(double islemMiktari) {
        this.islemMiktari = islemMiktari;
    }

    public String getHesapTuru() {
        return hesapTuru;
    }

    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }

    public void hesapGoruntuleme(int musteriNumarasi, String ad, String soyad, long iban, double toplamBakiye, String hesapBilgisi){
        System.out.println("Musteri: #"+ musteriNumarasi+ " | ad "+ ad+ " | soyad " + soyad+" | iban "+ iban+" | toplam bakiye " + toplamBakiye+ " | hesapBilgisi " +hesapBilgisi+"\n");

    }

    public String toString() {
        String output = "Hesap: | ";

        output +=
                " #: "
                        + getIban()
                        + "\t | "
                        + "hesap turu: "
                        + getHesapTuru()
                        + "\t | "
                        + "acilis tarihi: "
                        + getHesapAcilisTarihi()
                        + "\t | "
                        + "toplam bakiye: "
                        + getToplamBakiye()
                        + "\t |\n";


        return output;
    }
}
