package provaestrutura;

import java.util.Arrays;


public class InsertionSort {
  public static void main(String[] args) {
    int[]vetor = {5,9,3,7,2};
   int x,j;
     
   
   for (int i = 1; i < vetor.length; i++){
      x = vetor[i];
      j = i - 1;
   //momento que utilizo elemento na posicao j se for maior do que o x sendo comparado   
      while ((j >= 0) && vetor[j] > x){
      vetor[j+1] = vetor[j]; //empurrando os numeros maiores a direita
      j = j - 1;
      
    }
       vetor[j + 1] = x;
       System.out.println(Arrays.toString(vetor));//esperado (2,3,5,7,9)
   }
}
}