/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearthtraining;

import java.util.Arrays;

/**
 *
 * @author enovate
 */
public class CloseToZeroOption {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //this code 
        //looks to be collect
        //compared to others
        int[] data = {-1, -2, -8, 0, 2, 3, 4, 5};
//        int[] data = {2,3,-2};
        int curr = 0;
        int near = data[0];
        Arrays.sort(data);      //  add this
        System.out.println(Arrays.toString(data));
        // find the element nearest to zero
        for (int i = 0; i < data.length; i++) {
            System.out.println("dist from " + data[i] + " = " + Math.abs(0 - data[i]));
            curr = data[i] * data[i];
            if (curr <= (near * near)) {
                near = data[i];
            }
        }
        System.out.println(near);
    }

}
