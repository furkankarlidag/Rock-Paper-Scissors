/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author Victus
 */
public class Kagit extends Nesne {
    
    private double nufuz=2;

    public Kagit() {
    }
    public Kagit(double nufuz, double dayaniklilik, int seviyepuani) {
        super(dayaniklilik, seviyepuani);
        this.nufuz = nufuz;
    }
    
    double Etk(Tas tas){
        double etki,pay,payda;
        final double a=0.2;
        pay=this.nufuz;
        payda=a*tas.getKatilik();
        etki=pay/payda;
        return etki;
    }
    double Etk(AgirTas tas){
        double etki,pay,payda;
        final double a=0.2;
        pay=this.nufuz;
        payda=a*tas.getKatilik()* tas.getSicaklik();
        etki=pay/payda;
        return etki;
    }
    double Etk(Makas mks){
        double etki,pay,payda;
        final double a=0.2;
        pay=this.nufuz;
        payda=(1-a)*mks.getKeskinlik();
        etki=pay/payda;
        return etki;
    }
    double Etk(UstaMakas mks){
        double etki,pay,payda;
        final double a=0.2;
        pay=this.nufuz;
        payda=(1-a)*mks.getKeskinlik()*mks.getDirenc();
        etki=pay/payda;
        return etki;
    }
    double Etk(Kagit kgt){
        return 0.0;
    }
    double Etk(OzelKagit kgt){
        double etki,pay,payda;
        pay=this.nufuz;
        payda=this.nufuz*kgt.getKalinlik();
        etki=pay/payda;
        return etki;
    }

    @Override
    int nesnePuaniGoster() {
        return getSeviyepuani();
    }

    @Override
    double etkiHesapla(Tas obj) {
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
    double etkiHesapla(Kagit obj) {
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
    double etkiHesapla(UstaMakas obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    @Override
    double etkiHesapla(OzelKagit obj) {
        double etki;
        etki=Etk(obj);
        return etki;
    }

    @Override
    void durumGuncelle(double etk) {
        double yenday;
        yenday=getDayaniklilik();
        yenday=yenday-etk;
        setDayaniklilik(yenday);
    }
    
    

    public double getNufuz() {
        return nufuz;
    }

    public void setNufuz(double nufuz) {
        this.nufuz = nufuz;
    }
    
    
    
}
