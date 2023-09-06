/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author Victus
 */
public class AgirTas extends Tas {
    private double sicaklik=2;

    public AgirTas(){
        
    }
    
    public AgirTas(double dayaniklilik, int seviyepuani,double katilik,double sicaklik) {
        super(dayaniklilik, seviyepuani,katilik);
        this.sicaklik=sicaklik;
    }
    
    @Override
    int nesnePuaniGoster() {
        return getSeviyepuani();
    }
    
    double Etk(Makas mks){
        double etki,pay,payda;
        final double a=0.2;
        pay=getKatilik()*this.sicaklik;
        payda=a*mks.getKeskinlik();
        etki=pay/payda;
        return etki;
    }
    double Etk(UstaMakas mks){
        double etki, pay, payda;
        final double a = 0.2;
        pay = getKatilik() * this.sicaklik;
        payda = a * mks.getKeskinlik()*mks.getDirenc();
        etki = pay / payda;
        return etki;
    }
    double Etk(Kagit kgt){
        double etki,pay,payda;
        final double a=0.2;
        pay=getKatilik()*this.sicaklik;
        payda=(1-a)*kgt.getNufuz();
        etki=pay/payda;
        return etki;
    }
    double Etk(OzelKagit kgt){
        double etki, pay, payda;
        final double a = 0.2;
        pay = getKatilik() * this.sicaklik;
        payda = (1 - a) * kgt.getNufuz()*kgt.getKalinlik();
        etki = pay / payda;
        return etki;
    }
    double Etk(Tas tas){
        double etki,pay,payda;
        pay=getKatilik()*this.sicaklik;
        payda=getKatilik();
        etki=pay/payda;
        return etki;
    }
    double Etk(AgirTas tas){
        return 0.0;
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
    
    

    public double getSicaklik() {
        return sicaklik;
    }

    public void setSicaklik(double sicaklik) {
        this.sicaklik = sicaklik;
    }

    
 
    
    
}
