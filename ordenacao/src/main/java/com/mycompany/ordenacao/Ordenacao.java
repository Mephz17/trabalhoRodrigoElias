/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ordenacao;

/**
 *
 * @author iagom
 */
import java.util.Scanner;
public class Ordenacao {
    public static void main(String[] args) {
        int valor, i;
        i = 0;
        String operacao;
        Scanner input = new Scanner(System.in);
        int[] lista = new int[1000];
        while(true){
            valor = input.nextInt();
            if(valor == 0){
                break;
            }
            lista[i] = valor;
            i++;
        }
        input.nextLine();
        operacao = input.nextLine();
        Classe objetoArray = new Classe();
        int[] newArray;
        if("crescente".equals(operacao)){
            newArray = objetoArray.crescente(lista, i);
        }
        else{
            newArray = objetoArray.decrescente(lista, i);
        }
        // Printando
        
        for(int j = 0; j <= i; j++){
            if(j == i){
                System.out.print(newArray[j]);
                break;
            }
            System.out.print(newArray[j] + " ");
        }
        input.close();
    }
}
