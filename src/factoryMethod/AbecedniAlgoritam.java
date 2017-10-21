/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factoryMethod;

import builder.Mjesto;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/**
 *
 * @author kile
 */
public class AbecedniAlgoritam extends Algoritam{
    
    public AbecedniAlgoritam() {
    }
    
    public String opis() { //TODO obrisati
        return "AbecedniAlgoritam";
    }
    
    public List<Mjesto> sortirajListuMjesta(List<Mjesto> listaMjesta){
        
        Collections.sort(listaMjesta, Mjesto.COMPARE_BY_NAME);
        
        return listaMjesta;
        
    }
    
    
    
}
