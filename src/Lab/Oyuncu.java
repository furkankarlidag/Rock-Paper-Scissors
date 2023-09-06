/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lab;

/**
 *
 * @author Victus
 */
abstract public class Oyuncu {
    private String OyuncuID;
    private String OyuncuAdi;
    private double skor;

    private Nesne[] nesneler=new Nesne[14];


    public Oyuncu() {
    }

    public Oyuncu(String oyuncuID, String oyuncuAdi, double skor, Nesne[] nesneler) {
        OyuncuID = oyuncuID;
        OyuncuAdi = oyuncuAdi;
        this.skor = skor;
        this.nesneler = nesneler;
    }

    abstract public double SkorGoster(double dayiniklilik);

    abstract public String[] NesneSec(int[] dizi);


    public String getOyuncuID() {
        return OyuncuID;
    }

    public void setOyuncuID(String oyuncuID) {
        OyuncuID = oyuncuID;
    }

    public String getOyuncuAdi() {
        return OyuncuAdi;
    }

    public void setOyuncuAdi(String oyuncuAdi) {
        OyuncuAdi = oyuncuAdi;
    }

    public double getSkor() {
        return skor;
    }

    public void setSkor(double skor) {
        this.skor = skor;
    }

    public Nesne[] getNesneler() {
        return nesneler;
    }

    public void setNesneler(Nesne[] nesneler) {
        this.nesneler = nesneler;
    }
}
