/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearthtraining;

/**
 *
 * @author enovate
 */
//imports for BufferedReader 
import java.io.BufferedReader;
import java.io.InputStreamReader;

//import for Scanner and other utility classes
import java.util.*;

// Warning: Printing unwanted or ill-formatted data to output will cause the test cases to fail
class ReadFromConsole {

    public static void main(String args[]) throws Exception {

        List<String> inputList = new ArrayList<>();
        String firstname = null;
        List<String> address = new ArrayList<>();
        List<String> children = new ArrayList<>();
        StringTokenizer tk = null;

        //BufferedReader
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = null;          // Reading input from STDIN 
        while ((input = br.readLine()) != null) {
            inputList.add(input);//add input line by line into a list 

        }
        System.out.println("*************** Printing List Items Starts ********************");
        inputList.stream().forEach(row -> {
            System.out.println("Name:>>" + row);

        });
        System.out.println("***************List Item Ends **********************************");
        //print entire list 
        System.out.println("Entire List Object:>" + inputList);
        System.out.println("********************Data Extraction Begins *********************************************");
        try {
            //get first Name here
            if (inputList.get(0) != null) {
                firstname = inputList.get(0);
                System.out.println("FNAme:*:*:" + firstname);
            }
            //get Second Address List 
            if (inputList.get(1) != null) {
                //String Tokenizer and save the results in the List    
                tk = new StringTokenizer(inputList.get(1), "");
                //check is token exists
                while (tk.hasMoreTokens()) {
                    address.add(tk.nextToken());
                }

                System.out.println("Address List:" + address);
            }
            //children List
            if (inputList.get(2) != null) {
                tk = new StringTokenizer(inputList.get(2), "");
                //get list of children fro string 
                while (tk.hasMoreTokens()) {
                    children.add(tk.nextToken());
                }

                System.out.println("Children List::>>" + children);
            }
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
