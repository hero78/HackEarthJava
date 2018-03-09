/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hackerearthtraining.subArray;

/**
 *
 * @author enovate
 */
// Java program to print largest contiguous
// array sum
 
class GFG {
 
    static int maxSubArraySum(int a[], int size)
    {
    int max_so_far = a[0];
    int curr_max = a[0];
 
    for (int i = 1; i < size; i++)
    {
           curr_max = Math.max(a[i], curr_max+a[i]);
        max_so_far = Math.max(max_so_far, curr_max);
    }
    return max_so_far;
    }
 
    /* Driver program to test maxSubArraySum */
    public static void main(String[] args)
    {
    int a[] = {4,8,5,2,4};
    int n = a.length;   
    int max_sum = maxSubArraySum(a, n);
    System.out.println("Maximum contiguous sum is "
                       + max_sum);
    }
}
 
// This code is contributd by Prerna Saini