/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ordenacao;

/**
 *
 * @author iagom
 */
import java.util.Arrays;
public class Classe {
    public int[] lista = new int[1000];
    public int aux;
    public int[] bubbleSort(int lista[], int k){
        for(int j = 0; j < k; j++){
            for(int i = 0; i < k; i++){
                if(lista[i] > lista[i + 1]){
                    this.aux = lista[i + 1];
                    lista[i + 1] = lista[i];
                    lista[i] = aux;
            }
        }
        
        }
        return lista;
    }
    public int[] mergesort(int lista[], int k){
        int tamanhoListaEsquerda;
        int tamanhoListaDireita;
        if(k % 2 == 0){
            tamanhoListaEsquerda = k / 2;
            tamanhoListaDireita = k / 2;
        }
        else{
            tamanhoListaEsquerda = k / 2;
            tamanhoListaDireita = (k / 2) + 1;
        }
        int[] listaEsquerda = Arrays.copyOfRange(lista, 0, tamanhoListaEsquerda);
        int[] listaDireita = Arrays.copyOfRange(lista, tamanhoListaEsquerda, k);
        
        listaEsquerda = mergesort(listaEsquerda, listaEsquerda.length);
        listaDireita = mergesort(listaDireita, listaDireita.length);
        
        return merge(listaEsquerda, listaDireita);
    }
    private int[] merge(int[] esquerda, int[] direita){
        int[] resultado = new int[esquerda.length + direita.length];
        int i = 0, k = 0, j = 0;
        
        
    }
   }

