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
public class M_Burbuja {
    //atributos
   private  int N;
    private int conta;
    private int a[];
    private int temp;
    private int FormulaMC;
    private double FormulaCM;
    private int FormulaPC;
    
   
    
    
    public int ContaBur(int N){
        conta=0;
        int i,j;
        a=new int [N];
        //metodo de ordenamiendo burbuja
        conta=conta+4;
        for(i=0;i<N-1 ; i++) {
            conta=conta+6;
            for(j=i+1; j < N; j++) {
                conta=conta+5;
                if(a[i] > a[j]) {
                    conta=conta+7;
                    temp=a[i];
                    a[i]=a[j];
                    a[j]=temp;
                }
            }
        }         
        return conta;
    }
    public int MCBurbuja(int N){
        FormulaMC=5*(N*(N-1)/2)+6*(N-1)+4;
        return FormulaMC;
    }
    public double CMeBurbuja(int N){
        FormulaCM = 8.5*(N*(N-1)/2)+6*(N-1)+4;
        return FormulaCM;
    }
    public int PCBurbuja(int N){
        FormulaPC=6*N*N-4;
        return FormulaPC;
    }
    public int contador(){
        return conta;
    }

}
