package Banka;


import java.util.List;



class BankaPersonel extends Kisi{
    private int personelID;
    List<Musteri> musteriler;

    public BankaPersonel(){}

    public BankaPersonel(String ad, String soyad, String email, int telefonNumarasi) {
        super(ad, soyad, email, telefonNumarasi);
    }

    public int getPersonelID() {
        return personelID;
    }

    public void setPersonelID(int personelID) {

        personelID= (int) (personelID * Math.random()*1000+1);
        this.personelID = personelID;
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

    public List<Musteri> getMusteriler() {
        return musteriler;
    }

    public void setMusteriler(List<Musteri> musteriler) {
        this.musteriler = musteriler;
    }

    public String toString() {
        String output = "Banka personel: | ";

        output +=
                "personel #: "
                        + getPersonelID()
                        + "\t | "
                        + "ad: "
                        + getAd()
                        + "\t | "
                        + "soyad: "
                        + getSoyad()
                        + "\t | "
                        + "tc kimlik: "
                        + getTcKimlikNo()
                        + "\t | "
                        + "email: "
                        + getEmail()
                        + "\t | "
                        + "telefon: "
                        + getTelefonNumarasi()
                        + "\t |\n";

        return output;
    }
}
