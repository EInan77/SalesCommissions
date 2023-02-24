/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package eren.sales;

/**
 *
 * @author ereni
 */
public class Sales {

 public static void main(String[] args)
    {
        int[] array = {0, 0,  1, 3, 2, 3, 5, 1, 6, 4, 1};
        System.out.println("Salary distribution:");
        for ( int counter = 2; counter < array.length; counter ++){
            if(counter == 10){
                System.out.print(1000 + " and over: ");
            }
            else{
                System.out.printf("%02d-%02d: ", counter * 100, counter *100 + 99);
               
            }
            for (int stars =0; stars < array[counter]; stars++){
                System.out.print("*");
            }
            System.out.println();

        }
        }
}
