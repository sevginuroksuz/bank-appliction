package Banka;

class Vadelihesap extends BankaHesap{
    String hesapTuru;
    double vadeliBakiye;
    float faizOrani;

    public Vadelihesap(){}             // bos constructor

    public Vadelihesap(double vadeliBakiye, String hesapTuru, float faizOrani) {
        this.vadeliBakiye = vadeliBakiye;
        this.hesapTuru= hesapTuru;
        this.faizOrani=  faizOrani;
    }

    @Override
    public String getHesapTuru() {
        return hesapTuru;
    }

    @Override
    public void setHesapTuru(String hesapTuru) {
        this.hesapTuru = hesapTuru;
    }

    public double getVadeliBakiye() {
        return vadeliBakiye;
    }

    public void setVadeliBakiye(double vadeliBakiye) {
        this.vadeliBakiye = vadeliBakiye;
    }

    public float getFaizOrani() {
        return faizOrani;
    }

    public void setFaizOrani(float faizOrani) {
        switch (hesapBilgisi){
            case "maas":
                this.faizOrani=0.20f;
                break;
            case "normal":
                this.faizOrani=0.10f;
                break;
        }
    }

    public String toString() {
        String output = "Vadeli Hesap: | ";

        output +=
                ""
                        + "hesap turu: "
                        + getHesapTuru()
                        + "\t | "
                        + "faiz orani: "
                        + getFaizOrani()
                        + "\t | "
                        + "vadeli bakiye: "
                        + getVadeliBakiye()
                        + "\t |\n";

        //output += accountStatement.toString();

        return output;
    }
}

