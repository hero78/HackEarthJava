/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearthtraining.closeToZero;

import java.util.Arrays;   
import static java.lang.Math.abs;
import static java.lang.Math.max;

/**
 *
 * @author enovate
 */
public class ClosetToZero {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     int[] str = {0,8,3,4,5};
//     int[] str = {0,2,3,-2};
        Arrays.stream(str).filter(i -> i != 0)
                .reduce((a, b) -> abs(a) < abs(b) ? a : (abs(a) == abs(b) ? max(a, b) : b))
                .ifPresent(System.out::println);
    
    }
    
}
