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
public class Insercion {
    private  int a[];
    private int N;
    private int i,j,temp;
    private int conta;
    private int FormulaMC;
    private double FormulaCM;
    private int FormulaPC;
    
    
    
    public int M_Insercion(int N){
       int temp; 
       conta=2;
       a= new  int [N];
        for(int j=1; j<N; j++){
            temp = a[j];
            i = j-1;
            conta=conta+6;
            while (i>-1 && a[i]>temp){
                a[i+1] = a[i];
                i = i-1;
                conta=conta+9;
            }
            a[i+1] = temp;
            conta=conta+3;
        }
        return conta;
    }
    /*
    
    */
    public int MCInsercion(int N){
        FormulaMC=9*(N-1)+2;
        return FormulaMC;
    }
    public double CMeInsercion(){
        FormulaCM = (4.5*((N/2)*(N + 1) - N) + 9*(N - 1) + 2);
        return FormulaCM;
    }
    public int PCInsercion(int N){
        FormulaPC=9*((N/2)*(N + 1) - N) + 9*(N - 1) + 2;
        return FormulaPC;
    }
    
    public int contador(){
        return conta;
    }
}
