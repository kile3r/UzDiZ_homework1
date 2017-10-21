/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package default_package;

import builder.Mjesto;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author kile
 */
public class Parser {

    String line = "";
    String splitBy = ";";

    private Postavke postavke;

    public Parser(Postavke postavke) {
        this.postavke = postavke;
    }

    public List<Mjesto> parsirajMjesto() {

        List<Mjesto> listaMjesta = new ArrayList<>();

        line = "";
        if (postavke != null && postavke.getNazivDatotekeMjesta() != null && !postavke.getNazivDatotekeMjesta().equals("")) {
            String filePath = "";
            File file = new File(postavke.getNazivDatotekeMjesta());
            if (file.isAbsolute()) {
                filePath = postavke.getNazivDatotekeMjesta();
            } else {
                filePath = new File("").getAbsolutePath()+ "/";
                filePath += postavke.getNazivDatotekeMjesta();
            }

            //System.out.println(filePath);

            if (filePath != null && !filePath.equals("")) {
                boolean skipFirstLine = true;
                try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

                    Mjesto mjesto;
                    while ((line = br.readLine()) != null) {
                        if (skipFirstLine == true) {
                            skipFirstLine = false;
                            continue;
                        } else {
                            String[] m = line.split(splitBy);
                            System.out.println("\n" + m[0]);
                            
                            //TODO - validacija podataka
                            
                            mjesto = new Mjesto.MjestoBuilder(m[0],
                                    Integer.valueOf(m[1]), 
                                    Integer.valueOf(m[2]), 
                                    Integer.valueOf(m[3]))
                            .build();
                            
                            listaMjesta.add(mjesto);

                        }

                    }

                } catch (IOException e) {

                    e.printStackTrace();

                }

            }

        }

        return listaMjesta;

    }

    public List<Senzor> parsirajSenzor() {

        List<Senzor> listaSenzora = new ArrayList<>();
        line = "";
        if (postavke != null && postavke.getNazivDatotekeSenzora() != null && !postavke.getNazivDatotekeSenzora().equals("")) {

            String filePath = "";

            File file = new File(postavke.getNazivDatotekeSenzora());
            if (file.isAbsolute()) {
                filePath = postavke.getNazivDatotekeSenzora();
            } else {
                filePath = new File("").getAbsolutePath() + "/";
                filePath += postavke.getNazivDatotekeSenzora();
            }

            if (file != null && !filePath.equals("")) {
                boolean skipFirstLine = true;

                try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

                    Senzor senzor;

                    while ((line = br.readLine()) != null) {
                        if (skipFirstLine == true) {
                            skipFirstLine = false;
                            continue;
                        } else {
                            String[] s = line.split(splitBy);
                            System.out.println("\n" + s[0]);
                            
                            //dim baca exception jer nema komentara

                            senzor = new Senzor();
                           
                            senzor.setNaziv(s[0]);
                            senzor.setTip(Integer.valueOf(s[1]));
                            senzor.setVrsta(Integer.valueOf(s[2]));
                            senzor.setMinVrijednost(Float.valueOf(s[3]));
                            senzor.setMaxVrijednost(Float.valueOf(s[4]));
                            
                            if(s.length!=6){
                                
                                senzor.setKomentar("");
                            }else{
                                senzor.setKomentar(s[5]);
                                
                            }
                            

                            listaSenzora.add(senzor);

                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            }

        }

        return listaSenzora;

    }
    
    
    List<Aktuator> parsirajAktuatore(){
        List<Aktuator> listaAktuatora = new ArrayList<>();
        line = "";
        if (postavke != null && postavke.getNazivDatotekeAktuatora() != null && !postavke.getNazivDatotekeAktuatora().equals("")) {

            String filePath = "";

            File file = new File(postavke.getNazivDatotekeAktuatora());
            if (file.isAbsolute()) {
                filePath = postavke.getNazivDatotekeAktuatora();
            } else {
                filePath = new File("").getAbsolutePath() + "/";
                filePath += postavke.getNazivDatotekeAktuatora();
            }

            if (file != null && !filePath.equals("")) {
                boolean skipFirstLine = true;

                try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {

                    Aktuator aktuator;

                    while ((line = br.readLine()) != null) {
                        if (skipFirstLine == true) {
                            skipFirstLine = false;
                            continue;
                        } else {
                            String[] a = line.split(splitBy);
                            System.out.println("\n" + a[0]);

                            aktuator = new Aktuator();
                            
                            //naziv;tip: 0 - vanjski, 1 - unutarnji, 2 - vanjski i unutarnji;vrsta: 0=od-do cjelobrojno, 
                            //1=od-do razlomljeno 1 decimala, 2=od-do razlomljeno 5 decimala, 3=0(ne) ili 1(da); min vrijednost;
                            //max vrijednost;komentar
                            
                            aktuator.setNaziv(a[0]);
                            aktuator.setTip(Integer.valueOf(a[1]));
                            aktuator.setVrsta(Integer.valueOf(a[2]));
                           
                            
                            aktuator.setMinVrijednost(Float.valueOf(a[3]));
                            aktuator.setMaxVrijednost(Float.valueOf(a[4]));
                            
                            if(a.length!=6){
                                
                                aktuator.setKomentar("");
                            }else{
                                aktuator.setKomentar(a[5]);
                                
                            }
                            

                            listaAktuatora.add(aktuator);

                        }

                    }

                } catch (IOException e) {
                    e.printStackTrace();
                }

            } else {

            }

        }

        return listaAktuatora;

    }

    public Postavke getPostavke() {
        return postavke;
    }

    public void setPostavke(Postavke postavke) {
        this.postavke = postavke;
    }

}
