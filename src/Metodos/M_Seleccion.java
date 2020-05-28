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
public class M_Seleccion {
    private int N;
    private int a[];
    private int conta;
    private int FormulaMC;
    private double FormulaCM;
    private int FormulaPC;
   
   
    
    public int ContaSel(int N){
        int i,j,x,t;
        a = new int [N]; 
 
        //metodo seleccion
        for(j=0; j<N; j++){
            a[j]=N-j;
        }
        int conta=1; //
        for(i=0;i<N/2.0;i++) { // 15(N/2)
            conta=conta+6;
            x=i;
            for(j=i+1;j<N-i;j++) { // 6(N*N/4)
                conta=conta+5;
                if(a[x]>a[j]) {
                    x=j;
                    conta=conta+1;
                }
            }
            conta=conta+1;
            conta=conta+1;
            if(i!=x) {
                    conta=conta+7;
                    t=a[i];
                    a[i]=a[x];
                    a[x]=t;
            }
        }
        conta=conta+2;
        return conta;
    }
    public int MCSeleccion(int N){
        FormulaMC=5*(N*N/4)+8*(N/2)+3;
        return FormulaMC;
    }
    public double CMeSeleccion(int N){
        FormulaCM = 5.5*(N*N/4)+11.5*(N/2)+3;
        return FormulaCM;
    }
    public int PCSeleccion(int N){
        FormulaPC=6*(N*N/4)+15*(N/2)+3;
        return FormulaPC;
    }
    
    public int contador(){
        return conta;
    }
    
}
