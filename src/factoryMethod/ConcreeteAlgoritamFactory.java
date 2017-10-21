/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

/**
 *
 * @author kile
 */
public class ConcreeteAlgoritamFactory extends AlgoritamFactory{
       
    public Algoritam kreirajAlgoritam(String tipAlgoritma) {
        if (tipAlgoritma.equals("AbecedniAlgoritam")) {
            return new AbecedniAlgoritam();
        } else if (tipAlgoritma.equals("TipMjestaAlgoritam")) {
            return new TipMjestaAlgoritam();
        } else if (tipAlgoritma.equals("BrojAkuatoraAlgoritam")) {
            return new BrojAkuatoraAlgoritam();
        } else {
            System.out.println("\nNepoznati algoritam.");
            return null;
        }
    }
}
