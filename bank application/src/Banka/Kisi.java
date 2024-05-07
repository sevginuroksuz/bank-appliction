package Banka;

import static java.lang.Math.pow;
import static java.lang.Math.random;

class Kisi {
    private int tcKimlikNo;
    private String ad;
    private String soyad;
    private String email;
    private int telefonNumarasi;

    public Kisi(){}

    public Kisi(String ad, String soyad, String email, int telefonNumarasi) {
        this.ad=ad;
        this.soyad=soyad;
        this.email= email;
        this.telefonNumarasi=telefonNumarasi;
    }

    public String getAd() {
        return ad;
    }

    public void setAd(String ad) {
        this.ad = ad;
    }

    public String getSoyad() {
        return soyad;
    }

    public void setSoyad(String soyad) {
        this.soyad = soyad;
    }

    public int getTcKimlikNo() {
        return tcKimlikNo;
    }
    public void setTcKimlikNo(int tcKimlikNo) {

        tcKimlikNo = (int) (tcKimlikNo * ((random()%1000)+1));

        this.tcKimlikNo = tcKimlikNo;
    }

    public void setTelefonNumarasi(int telefonNumarasi) {
        this.telefonNumarasi = telefonNumarasi;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTelefonNumarasi() {
        return telefonNumarasi;
    }



    @Override
    public String toString() {
        return "Kisi bilgileri" +
                "tcKimlikNo " + tcKimlikNo +"\t" +
                "| ad " + ad + "\t" +
                "| soyad " + soyad + '\t' +
                "| email='" + email + '\t' +
                "| telefonNumarasi=" + telefonNumarasi +
                "\n";
    }
}
