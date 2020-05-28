/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author User
 */
public class QuickSort {

    
    int conta;
    int t;
    int tempj;
    int tempi;
    
    public void cambio(int a[],int i,int j) {
        t=a[i];
        conta=conta+7;
        a[i]=a[j];
        a[j]=t;
    }
    
    
    public void quickSort(int i,int j,int a[]) {
        conta=conta+6;
        tempi = i;
        tempj = j;
        int x = a[ (i+j) / 2 ];
        do {
            while (a[i] < x) {
                    conta=conta+3;
                    i++;
            }while (x < a[j]) {
                conta=conta+3;
                j--;
            }
            if (i < j) {
                conta=conta+5;
                cambio (a,i,j);
                i = i + 1;
                j = j - 1;
            }
            conta=conta+6;
        }while ( i < j);
        conta=conta+2;
        if (i == j) {
            conta=conta+2;
            if (x < a[i]){
                conta=conta+2;
                j = j - 1;
            }else{
                conta=conta+2;
                    i = i + 1;
                }
        }
        conta=conta+3;
        if (j-1 == tempi) {
            conta=conta+3;
            if (a [tempi] > a[j]) {
                cambio (a, tempi,j);
                conta=conta+1;
            }
        }
        else {
            conta=conta+2;
            if (j > tempi) {
                conta=conta+1;
                quickSort (tempi,j,a);
            }
        }
        conta=conta+3;
        if (i+1 == tempj) {
            conta=conta+3;
            if (a[i] > a[tempj]) {
                conta=conta+1;
                cambio (a,i,tempj);
            }
        }
        else {
            conta=conta+1;
            if (i < tempj) {
                conta=conta+1;
                quickSort (i,tempj,a);
            }
        }
        
}
    public int contador(){
        return conta;
    }
    public int getConta() {
        return conta;
    }

    //atributos
    public void setConta(int conta) {
        this.conta = conta;
    }
}
