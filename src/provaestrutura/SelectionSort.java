package provaestrutura;

public class SelectionSort {

    int i, z, c;
    int auxiliar;
    int cont = 1;

    public void algoritmoSelectionSort(int vetor[]) {

        for (i = 0; i < vetor.length - 1; i++) {
            //Antes de comparar, considera-se como o valor no indice atual do loop,o valor inserido no indice que o loop esta
            
            auxiliar = i;
            //O laço for utilizado para comparação ele pega o elemento seguinte ao atual
            for (z = auxiliar + 1; z < vetor.length; z++) {
                //Iniciando a comparacao dele
                if (vetor[z] < vetor[auxiliar]) {
                    auxiliar = z;
                }
            }
            //Realiza a troca dos elementos
            if (auxiliar != i) {
                c = vetor[i];
                vetor[i] = vetor[auxiliar];
                vetor[auxiliar] = c;
            }
        }

        if (cont == 1) {
            System.out.println("SelectionSort");
            cont++;
        }
        System.out.print("[");
        for (i = 0; i < vetor.length; ++i) {
            System.out.print(" " + vetor[i] + " ");
        }
        System.out.println("]; ");

    }

    public static void main(String[] args) {

        SelectionSort execute = new SelectionSort();

        int vetor1[] = {8,4,2,1,7,5};
        int vetor2[] = {3,8,7,5,6,2};

        execute.algoritmoSelectionSort(vetor1);// esperado do vetor 1 (1,2,4,5,7,8)
        execute.algoritmoSelectionSort(vetor2);//esperado do vetor 2(2,3,5,6,7,8)   
    }
}