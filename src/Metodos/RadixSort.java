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
public class RadixSort {
    int conta = 0;// Op.Elementales.
	
	void escribir(int []a, int N,int c){
		int i;
	    for(i = 0; i < N; i++){
	    	if(i%80 == 0){
	    		System.out.println();
	    	}
	    	System.out.print(" "+a[i]);
	    }
	    System.out.println();
	    System.out.println("OE = "+c);
	} // escribir()
	
	void insertar (int numero, int lista, int []info, int []sig, int []r, int []rp){
		int nuevo,p;
	    nuevo = sig[0];
	    sig[0] = sig[nuevo];
	    info[nuevo] = numero;
	    sig[nuevo] = 0;
	    p = r[lista];
	    conta = conta+12;
	    if(p == 0){
	    	conta = conta+5;
		    r[lista] = nuevo;
		    rp[lista] = nuevo;
		    return;
	    }
	    conta = conta+6;
	    p = rp[lista];
	    sig[p] = nuevo;
	    rp[lista] = nuevo;
	} // insertar()

	void recuperar(int []a,int []info, int []sig, int[]r, int []rp){
		int i,j = 0,p;
		conta = conta + 2;
		for(i = 0; i < 10; i++){
			conta = conta + 4;
			p = r[i];
			while(p != 0){
				conta = conta + 7;
				a[j] = info[p];
				j++;
				p = sig[p];
			}
			r[i] = 0;
			rp[i] = 0;
			conta = conta + 5;
		}	
	} // recuperar()

	void clasificar(int N){
		int conta = 0,i;
		int []r = new int [10];
		int []rp = new int [10];
		int []a = new int [N];
		int pot = 1,aux;
		conta = conta + 1;
		for(i = 0;i < 10; i++){
		conta = conta + 6;	
		r[i] = 0;
		rp[i] = 0;
		}
		conta = conta + 1;
		for(i = 0; i < N; i++){
			a[i] = (int)(Math.random()*1000);  
		}
		escribir(a,N,conta);
		conta = conta + 1;
		for(i = 0; i < 3; i++){
			conta = conta + 5;
			int []info = new int[N+1];
			int []sig = new int[N+1];
			int xi, j, d, t;
			for(xi = 0; xi < N+1; xi++){
				conta = conta + 7;
				info[xi] = -1;
				sig[xi] = xi+1;
			}
		sig[N] = 0;
		conta = conta + 3;
		for(j = 0; j < N ; j++){
			conta = conta + 11;
			aux = a[j] / pot;
			d = aux % 10;
			insertar(a[j], d,info,sig,r,rp);
		}
			conta = conta + 1;
			recuperar(a,info,sig, r,rp);
			pot = pot*10;
		}
		System.out.println("Numeros clasificados");
		escribir(a,N,conta);
	} // clasificar()
    
}
