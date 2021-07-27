/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staircaseapp;

import java.util.Scanner;

/**
 *
 * @author Joy Salomo S
 */
public class StaircaseApp {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("How Many Size of Starcase : ");
        int n = scanner.nextInt();
        
        if(n>0 && n<=100){
            
            for(int i = 1; i <= n; i++) {
                for(int j = 1; j <= n; j++) {
                    if ((i + j) > n) {
                        System.out.print("#");
                    } else {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }
        else{
            System.out.println("Size must be Positive Integer 1-100.");
        }
    }
}
