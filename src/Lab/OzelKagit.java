
package Lab;

public class OzelKagit extends Kagit{
    
    private double kalinlik=2;

    public OzelKagit() {
    }
    public OzelKagit(double kalinlik, double nufuz, double dayaniklilik, int seviyepuani) {
        super(nufuz, dayaniklilik, seviyepuani);
        this.kalinlik = kalinlik;
    }
    
    
    
    int nesnePuaniGoster() {
        return getSeviyepuani();
    }
    
    @Override
    double Etk(OzelKagit kgt) {
        return 0.0;
    }

    @Override
    double Etk(Kagit kgt) {
        double etki,pay,payda;
        pay=getNufuz()*this.kalinlik;
        payda=getNufuz();
        etki=pay/payda;
        return etki;
    }

    @Override
    double Etk(Makas mks) {
        double etki,pay,payda;
        final double a=0.2;
        pay=getNufuz()*this.kalinlik;
        payda=(1-a)*mks.getKeskinlik();
        etki=pay/payda;
        return etki;
    }
    double Etk(UstaMakas mks) {
        double etki, pay, payda;
        final double a = 0.2;
        pay = getNufuz() * this.kalinlik;
        payda = (1 - a) * mks.getKeskinlik()*mks.getDirenc();
        etki = pay / payda;
        return etki;
    }

    @Override
    double Etk(Tas tas) {
        double etki,pay,payda;
        final double a=0.2;
        pay=getNufuz()*this.kalinlik;
        payda=a*tas.getKatilik();
        etki=pay/payda;
        return etki;
    }
    double Etk(AgirTas tas) {
        double etki, pay, payda;
        final double a = 0.2;
        pay = getNufuz() * this.kalinlik;
        payda = a * tas.getKatilik()*tas.getSicaklik();
        etki = pay / payda;
        return etki;
    }
    
    @Override
    double etkiHesapla(OzelKagit obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    @Override
    double etkiHesapla(UstaMakas obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    @Override
    double etkiHesapla(AgirTas obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    @Override
    double etkiHesapla(Kagit obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    @Override
    double etkiHesapla(Makas obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    @Override
    double etkiHesapla(Tas obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    void durumGuncelle(double etk) {
        double yenday;
        yenday=getDayaniklilik();
        yenday=yenday-etk;
        setDayaniklilik(yenday);
    }

    public double getKalinlik() {
        return kalinlik;
    }

    public void setKalinlik(double kalinlik) {
        this.kalinlik = kalinlik;
    }
    
    
    
}
