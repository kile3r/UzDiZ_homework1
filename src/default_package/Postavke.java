/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package default_package;

/**
 *
 * first param - random generator seed
 * second param - place file name 
 * third param - sensor file name 
 * fourth param - actuator file name 
 * fifth param - algorithm class name 
 * sixth param - thread cycle in sec 
 * seventh param - number of thread cycles 
 * eighth param - output file name
 *
 * @author kile
 */
public class Postavke {

    private String nazivPrograma;
    private int sjeme;
    private String nazivDatotekeMjesta;
    private String nazivDatotekeSenzora;
    private String nazivDatotekeAktuatora;
    private String nazivKlaseAlgoritmaProvjere;
    private int trajanjeCiklusaDretve;
    private int brojCiklusaDretve;
    private String nazivDatotekeIzlaza;

    public Postavke(String nazivPrograma, int sjeme, String nazivDatotekeMjesta, String nazivDatotekeSenzora, String nazivDatotekeAktuatora, String nazivKlaseAlgoritmaProvjere, int trajanjeCiklusaDretve, int brojCiklusaDretve, String nazivDatotekeIzlaza) {
        this.nazivPrograma = nazivPrograma;
        this.sjeme = sjeme;
        this.nazivDatotekeMjesta = nazivDatotekeMjesta;
        this.nazivDatotekeSenzora = nazivDatotekeSenzora;
        this.nazivDatotekeAktuatora = nazivDatotekeAktuatora;
        this.nazivKlaseAlgoritmaProvjere = nazivKlaseAlgoritmaProvjere;
        this.trajanjeCiklusaDretve = trajanjeCiklusaDretve;
        this.brojCiklusaDretve = brojCiklusaDretve;
        this.nazivDatotekeIzlaza = nazivDatotekeIzlaza;
    }

    public String getNazivPrograma() {
        return nazivPrograma;
    }

    public void setNazivPrograma(String nazivPrograma) {
        this.nazivPrograma = nazivPrograma;
    }

    public int getSjeme() {
        return sjeme;
    }

    public void setSjeme(int sjeme) {
        this.sjeme = sjeme;
    }

    public String getNazivDatotekeMjesta() {
        return nazivDatotekeMjesta;
    }

    public void setNazivDatotekeMjesta(String nazivDatotekeMjesta) {
        this.nazivDatotekeMjesta = nazivDatotekeMjesta;
    }

    public String getNazivDatotekeSenzora() {
        return nazivDatotekeSenzora;
    }

    public void setNazivDatotekeSenzora(String nazivDatotekeSenzora) {
        this.nazivDatotekeSenzora = nazivDatotekeSenzora;
    }

    public String getNazivDatotekeAktuatora() {
        return nazivDatotekeAktuatora;
    }

    public void setNazivDatotekeAktuatora(String nazivDatotekeAktuatora) {
        this.nazivDatotekeAktuatora = nazivDatotekeAktuatora;
    }

    public String getNazivKlaseAlgoritmaProvjere() {
        return nazivKlaseAlgoritmaProvjere;
    }

    public void setNazivKlaseAlgoritmaProvjere(String nazivKlaseAlgoritmaProvjere) {
        this.nazivKlaseAlgoritmaProvjere = nazivKlaseAlgoritmaProvjere;
    }

    public int getTrajanjeCiklusaDretve() {
        return trajanjeCiklusaDretve;
    }

    public void setTrajanjeCiklusaDretve(int trajanjeCiklusaDretve) {
        this.trajanjeCiklusaDretve = trajanjeCiklusaDretve;
    }

    public int getBrojCiklusaDretve() {
        return brojCiklusaDretve;
    }

    public void setBrojCiklusaDretve(int brojCiklusaDretve) {
        this.brojCiklusaDretve = brojCiklusaDretve;
    }

    public String getNazivDatotekeIzlaza() {
        return nazivDatotekeIzlaza;
    }

    public void setNazivDatotekeIzlaza(String nazivDatotekeIzlaza) {
        this.nazivDatotekeIzlaza = nazivDatotekeIzlaza;
    }

}
