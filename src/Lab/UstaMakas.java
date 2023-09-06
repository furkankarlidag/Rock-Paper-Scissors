
package Lab;


public class UstaMakas extends Makas {
    
    private double direnc=2;

    public UstaMakas() {
    }

    public UstaMakas(double direnc, double keskinlik, double dayaniklilik, int seviyepuani) {
        super(keskinlik, dayaniklilik, seviyepuani);
        this.direnc = direnc;
    }
    int nesnePuaniGoster() {
        return getSeviyepuani();
    }
    @Override
    double Etk(UstaMakas mks){
        return 0.0;
    }

    @Override
    double Etk(Makas mks) {
        double etki,pay,payda;
        pay=getKeskinlik()*this.direnc;
        payda=getKeskinlik();
        etki=pay/payda;
        return etki;
    }

    @Override
    double Etk(Tas tas) {
        double etki,pay,payda;
        final double a=0.2;
        pay=getKeskinlik()*this.direnc;
        payda=(1-a)*tas.getKatilik();
        etki=pay/payda;
        return etki;
    }
    double Etk(AgirTas tas) {
        double etki,pay,payda;
        final double a=0.2;
        pay=getKeskinlik()*this.direnc;
        payda=(1-a)*tas.getKatilik()*tas.getSicaklik();
        etki=pay/payda;
        return etki;
    }

    @Override
    double Etk(Kagit kgt) {
        double etki,pay,payda;
        final double a=0.2;
        pay=getKeskinlik()*this.direnc;
        payda=a*kgt.getNufuz();
        etki=pay/payda;
        return etki;
    }
    double Etk(OzelKagit kgt) {
        double etki,pay,payda;
        final double a=0.2;
        pay=getKeskinlik()*this.direnc;
        payda=a*kgt.getNufuz()*kgt.getKalinlik();
        etki=pay/payda;
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

    public double getDirenc() {
        return direnc;
    }

    public void setDirenc(double direnc) {
        this.direnc = direnc;
    }
    
    
}
