package hackerearthtraining;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author enovate
 */
public class HackerEarthTraining {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
            List<String> intial_input = new ArrayList<>();   
            
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            String input = br.readLine();
//            String input = null;

//            while ((input = br.readLine()) != null) {
                System.err.println("Name:>>" + input);
                //add data to list 
                intial_input.add(input);
//            }     
            
        } catch (IOException ex) {
            Logger.getLogger(HackerEarthTraining.class.getName()).log(Level.SEVERE, null, ex);
        }    
        //display list of data 
        intial_input.stream().forEach(row ->{
            System.err.println("Name:---"+row);
        
        });  
        
//        intial_input.get
    }

}
