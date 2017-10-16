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
public class ToF {

    /**
     * first param - random generator seed
     * second param - place file name
     * third param - sensor file name
     * fourth param - actuator file name
     * fifth param - algorithm class name
     * sixth param - thread cycle in sec
     * seventh param - number of thread cycles
     * eighth param - output file name
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        if(args.length==8){
            
            int seed = Integer.parseInt(args[0]);
            
            if(seed > 99){
                
                System.out.println("Ok je seed");
                String mjesto = args[1];
                String senzor = args[2];
                String aktuatori = args[3];
                String klasaAlgoritma = args[4];
                int trajanjeDretve = Integer.parseInt(args[5]);
                int ciklusDretve = Integer.parseInt(args[6]);
                String izlazDat = args[7];
                
                
            }else{
                
                System.out.println("Sjeme generatora random brojeva mora imati barem 3 znamenke");
                
            }
               
        }else{
            
            System.out.println("Unesen krivi broj argumenata. (Treba biti 8)");       
            
        }
        
    }
    
}
