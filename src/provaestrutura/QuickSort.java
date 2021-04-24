package provaestrutura;

public class QuickSort {

    public void algoritmoQuickSort(int vetor[]) {
        quickSort(vetor, 0, vetor.length - 1);

    }
// Um método para dividir um vetor em três vetores de um conceito.
//vetor do meio esta sendo incarado apenas como o elemento pivô retornado pelo método dividir.
    private void quickSort(int[] vetor, int start, int end) {

        if (end > start) {
            int indexPivo = dividir(vetor, start, end);
            quickSort(vetor, start, indexPivo - 1);
            quickSort(vetor, indexPivo + 1, end);
        }
    }
//Ira dividir o vetor e encontrar o indice do pivô.
    private int dividir(int[] vetor, int inicio, int fim) {
        int pivo, Left, Right = fim;
        Left = inicio + 1;
        pivo = vetor[inicio];
//Vai correr o vetor ate que ultrapasse o outro ponteiro ou ate que o elemento em questão seja menor que o pivô. 
        while (Left <= Right) {
            while (Left <= Right && vetor[Left] <= pivo) {
                Left++;
            }
            // Vai correr o vetor ate que ultrapasse o outro ponteiro que o elemento em questão seja maior que o pivô
        while (Right >= Left && vetor[Right] > pivo) {
                Right--;
            }
// Caso os ponteiros ainda nao tenham se cruzado, significa que valores menores e maiores que o pivô foram localizados em ambos os lados.
         
            if (Left < Right) {
                trocar(vetor, Right, Left);
                Left++;
                Right--;
            }
        }
        trocar(vetor, inicio, Right);
        return Right;
    }
//Método para trocar dois elementos de um vetor.
    //i - Indice do elemento que sera trocado.
 // j - Indice do elemento que sera trocado.
    private void trocar(int[] vetor, int i, int j) {
        int temp = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = temp;
    }

    private static void printlnVetor(int[] vetor) {
        System.out.print("QuickSort\n");
        System.out.print("[");
        for (int num = 0; num < vetor.length; ++num) {
            System.out.print(" " + vetor[num] + " ");
        }
        System.out.println("]; ");

    }

    public static void main(String[] args) {

        QuickSort execute = new QuickSort();

        int vetor1[] = {4,7,8,2,6,9,1,0};
        int vetor2[] = {7,5,4,3,2,6,1};

        execute.algoritmoQuickSort(vetor1); //Esperado -> [0,1,2,4,6,7,8,9 ]
        execute.algoritmoQuickSort(vetor2); //Esperado -> [1,2,3,4,5,6,7]   
        printlnVetor(vetor1);
        printlnVetor(vetor2);

    }
}