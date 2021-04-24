
package provaestrutura;


public class BubbleSort {
     public static void main(String[] args) {
      //dado os seguintes valores do vetor
       int vetor[] = {5,9,3,7,2};
       int aux;
       boolean controle;
       
       for(int i = 0;i<vetor.length;++i){
           controle = true;
       for(int c = 0;c < (vetor.length - 1);++ c){
           
          //caso queira que o vetor faça ordem descrecente inverter posição do ">"menor para "<" maior
       if(vetor[c] > vetor [c + 1]){ //esse membro controla se vetor e maior que o outro
           aux = vetor[c];
           vetor[c] = vetor[c + 1];
           vetor[c + 1]= aux;
           controle = false;    
       }
       }
       if(controle){
           break;
       }
       }//esperado do vetor é organiza-lo (2,3,5,7,9)
       for(int i = 0;i< vetor.length; ++i){
           System.out.println(vetor[i]+"");
       
       
       }
    }
}
