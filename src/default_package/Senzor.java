/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package default_package;

/**
 *
 * @author kile
 */
public class Senzor {
    
    private String naziv;
    private int tip; //0 - vanjski, 1 - unutarnji, 2 - vanjski i unutarnji
    private int vrsta; //0=od-do cjelobrojno, 1=od-do razlomljeno 1 decimala, 2=od-do razlomljeno 5 decimala, 3=0(ne) ili 1(da)
    private float minVrijednost;
    private float maxVrijednost;
    private String komentar;

    public Senzor() {
    }

    public Senzor(String naziv, int tip, int vrsta, float minVrijednost, float maxVrijednost, String komentar) {
        this.naziv = naziv;
        this.tip = tip;
        this.vrsta = vrsta;
        this.minVrijednost = minVrijednost;
        this.maxVrijednost = maxVrijednost;
        this.komentar = komentar;
    }

    public String getNaziv() {
        return naziv;
    }

    public void setNaziv(String naziv) {
        this.naziv = naziv;
    }

    public int getTip() {
        return tip;
    }

    public void setTip(int tip) {
        this.tip = tip;
    }

    public int getVrsta() {
        return vrsta;
    }

    public void setVrsta(int vrsta) {
        this.vrsta = vrsta;
    }

    public float getMinVrijednost() {
        return minVrijednost;
    }

    public void setMinVrijednost(float minVrijednost) {
        this.minVrijednost = minVrijednost;
    }

    public float getMaxVrijednost() {
        return maxVrijednost;
    }

    public void setMaxVrijednost(float maxVrijednost) {
        this.maxVrijednost = maxVrijednost;
    }

    public String getKomentar() {
        return komentar;
    }

    public void setKomentar(String komentar) {
        this.komentar = komentar;
    }
    
}
