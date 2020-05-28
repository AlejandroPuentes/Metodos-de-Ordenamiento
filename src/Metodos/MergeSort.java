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
public class MergeSort {
  	int conta=0;
    public void sort(int array[], int izq, int der) {
           if(izq < der){
         //Encuentra el punto medio del vector.
         int med = (izq + der) / 2;
         //Divide la primera y segunda mitad (llamada recursiva).
         sort(array, izq, med);
         sort(array, med+1, der);

         //Une las mitades.
         merge(array, izq, med, der);
       }
    }

public void merge(int array[], int izq, int med, int der) {
    //Encuentra el tamaño de los sub-vectores para unirlos.
    int n1 = med - izq + 1;
    int n2 = der - med;
        conta=conta+5;
    //Vectores temporales.
    int izqArray[] = new int [n1];
    int derArray[] = new int [n2];
        conta=conta+4;
    //Copia los datos a los arrays temporales.
    for (int i=0; i < n1; i++) {
      izqArray[i] = array[izq+i];
      conta=conta+5;
    }
    conta=conta+2;
    for (int j=0; j<n2; j++) {
      derArray[j] = array[med + j + 1];
      conta=conta+7;
    }
    /* Une los vectorestemporales. */

    //Índices inicial del primer y segundo sub-vector.
    int i = 0, j = 0;
    conta=conta+2;
    //Índice inicial del sub-vector arr[].
    int k = izq;
    conta=conta+2;
    //Ordenamiento.
    while (i < n1 && j < n2) {
        conta=conta+5;
      if (izqArray[i] <= derArray[j]) {
        array[k] = izqArray[i];
        i++;
        conta=conta+4;
      } else {
          array[k] = derArray[j];
          j++;
          conta=conta+4;
      }
      k++;
     conta=conta+1;
    }//Fin del while.

    /* Si quedan elementos por ordenar */
    //Copiar los elementos restantes de leftArray[].
    conta=conta+1;
    while (i < n1) {
      array[k] = izqArray[i];
      i++;
      k++;
      conta=conta+6;
    }
    //Copiar los elementos restantes de rightArray[].
    conta=conta+1;
    while (j < n2) {
      array[k] = derArray[j];
      j++;
      k++;
      conta=conta+6;
    }
    }
   
    
}
