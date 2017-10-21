/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package default_package;

import builder.Mjesto;
import factoryMethod.Algoritam;
import factoryMethod.ConcreeteAlgoritamFactory;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kile
 */
public class ToF {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        if (args.length == 9) {

            if (Integer.valueOf(args[1]) > 99) {

                Postavke postavke = new Postavke(args[0],
                        Integer.valueOf(args[1]),
                        args[2],
                        args[3],
                        args[4],
                        args[5],
                        Integer.valueOf(args[6]),
                        Integer.valueOf(args[7]),
                        args[8]);
                
                

                System.out.println(postavke.getNazivDatotekeMjesta());
                System.out.println("\n");
                
                

                //OK argumente čita i sprema u objekt Postavke
                //parsiranje
                Parser parser = new Parser(postavke);
                

                List<Mjesto> listaMjesta = new ArrayList<>();
                listaMjesta = parser.parsirajMjesto();
                
                ConcreeteAlgoritamFactory concreateAlgoritamFactory = new ConcreeteAlgoritamFactory();
                Algoritam algoritam = concreateAlgoritamFactory.kreirajAlgoritam(postavke.getNazivKlaseAlgoritmaProvjere());
                
                List<Mjesto> listaMjestaSortirano = new ArrayList<>();
                listaMjestaSortirano = algoritam.sortirajListuMjesta(listaMjesta);
                
                String pero = "pero";
                
                
                
                

            } else {
                System.out.println("Sjeme generatora nije dobro unešeno");
            }

        } else {
            System.out.println("Argumenti nisu dobro uneseni");
        }

    }

}
