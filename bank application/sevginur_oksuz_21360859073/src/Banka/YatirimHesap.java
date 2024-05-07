package Banka;

class YatirimHesap extends BankaHesap {

    String hesapTuru;
    double yatirimBakiye;
    String yatirimTuru;
    float kur;

    public YatirimHesap() {
    }

    public YatirimHesap(String hesapTuru, double yatirimBakiye, String yatirimTuru, float kur) {
        this.hesapTuru = hesapTuru;
        this.yatirimBakiye=yatirimBakiye;
        this.yatirimTuru=yatirimTuru;
        this.kur=kur;
    }

    @Override
    public String getHesapTuru() {
        return hesapTuru;
    }

    @Override
    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }

    public double getYatirimBakiye() {
        return yatirimBakiye;
    }

    public void setYatirimBakiye(double yatirimBakiye) {
        this.yatirimBakiye = yatirimBakiye;
    }

    public String getYatirimTuru() {
        return yatirimTuru;
    }

    public void setYatirimTuru(String yatirimTuru) {
        this.yatirimTuru = yatirimTuru;
    }

    public float getKur() {
        return kur;
    }

    public void setKur(float kur) {
        this.kur = kur;
    }

    double paraEkle(double yatirimBakiye, String yatirimTuru, float kur) {
        YatirimHesap yatirimHesap = null;
        yatirimHesap.yatirimTuru=yatirimTuru;
        yatirimHesap.kur=kur;
        yatirimHesap.yatirimBakiye += kur*yatirimBakiye;
        return yatirimHesap.yatirimBakiye;
    }

    double paraBoz(double yatirimBakiye, String yatirimTuru, float kur){
        YatirimHesap yatirimHesap = null;
        yatirimHesap.hesapTuru=yatirimTuru;
        yatirimHesap.yatirimBakiye=kur*yatirimBakiye;
        return yatirimHesap.yatirimBakiye;
    }

    public String toString() {
        String output = "Yatirim Hesap: | ";

        output +=
                ""
                        + "yatirim turu: "
                        + getYatirimTuru()
                        + "\t | "
                        + "yatirim bakiye: "
                        + getYatirimBakiye()
                        + "\t | "
                        + "kur: "
                        + getKur()
                        + "\t |\n";

        //output += accountStatement.toString();

        return output;
    }
}
