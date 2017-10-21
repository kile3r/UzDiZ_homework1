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
public abstract class AlgoritamFactory {
    
    public AlgoritamFactory() {
    }
    
    protected abstract Algoritam kreirajAlgoritam(String tipAlgoritma);
    
}
