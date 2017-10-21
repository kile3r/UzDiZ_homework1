/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builder;

import default_package.Aktuator;
import default_package.Senzor;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author kile
 */
public class Mjesto {
    
    //obavezni podaci
    private String naziv;
    private int tip; //0 - vanjski, 1 - unutarnji
    private int brojSenzora;
    private int brojAktuatora;
    //opcionalni podaci
    private List<Senzor> senzorList;
    private List<Aktuator> aktuatorList;


    public String getNaziv() {
        return naziv;
    }

    public int getTip() {
        return tip;
    }

    public int getBrojSenzora() {
        return brojSenzora;
    }

    public int getBrojAktuatora() {
        return brojAktuatora;
    }

    public List<Senzor> getSenzorList() {
        return senzorList;
    }

    public List<Aktuator> getAktuatorList() {
        return aktuatorList;
    }
    
    public Mjesto(MjestoBuilder builder) {
        this.naziv  = builder.naziv;
        this.tip = builder.tip;
        this.brojSenzora = builder.brojSenzora;
        this.brojAktuatora = builder.brojAktuatora;
        
        this.senzorList = builder.senzorList;
        this.aktuatorList = builder.aktuatorList;
        
    }

    //Builder Class – interna klasa (klasa u klasi)!
    public static class MjestoBuilder {

        //obavezni podaci
        private String naziv;
        private int tip; //0 - vanjski, 1 - unutarnji
        private int brojSenzora;
        private int brojAktuatora;      
        //opcionalni podaci
        private List<Senzor> senzorList;
        private List<Aktuator> aktuatorList;

        public MjestoBuilder(String naziv, int tip, int brojSenzora, int brojAktuatora) {
            this.naziv = naziv;
            this.tip = tip;
            this.brojSenzora = brojSenzora;
            this.brojAktuatora = brojAktuatora;
        }

        public MjestoBuilder setSenzorList(List<Senzor> senzorList) {
            this.senzorList = senzorList;
            return this;
        }

        public MjestoBuilder setAktuatorList(List<Aktuator> aktuatorList) {
            this.aktuatorList = aktuatorList;
            return this;
        }
        
        public Mjesto build() {
            return new Mjesto(this);
        }

    }
    
    public static Comparator<Mjesto> COMPARE_BY_NAME = new Comparator<Mjesto>() {
        public int compare(Mjesto one, Mjesto other) {
            return one.getNaziv().compareTo(other.getNaziv());
        }
    };
    
    public static Comparator<Mjesto> COMPARE_BY_TIP = new Comparator<Mjesto>() {
        public int compare(Mjesto one, Mjesto other) {
            return Integer.toString(one.getTip()).compareTo(Integer.toString(other.getTip()));
        }
    };
    
    public static Comparator<Mjesto> COMPARE_BY_BROJAKTUATORA = new Comparator<Mjesto>() {
        public int compare(Mjesto one, Mjesto other) {
            return Integer.toString(one.getBrojAktuatora()).compareTo(Integer.toString(other.getBrojAktuatora()));
        }
    };
    
}
