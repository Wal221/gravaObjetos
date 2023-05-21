package ordena;

import java.util.Arrays;

public class selection {
    public static  int[] selectionSort (int array []){
        int swap = 0;
        for(int i = 0; i < array.length-1; i++){
            int min = i;


            //Pode ser entendido da seguinte forma
            // cada volta ele tenta mandar um numero menor para a primeira posição posição
            // ou seja a cada momento os menor valores comparadados são jogados para aquela posição, porem
            //não e cada volta que o real valor menor sera visto na ultima posição
            for(int j = i+1; j < array.length; j++)
                if(array[j] < array[min]) {
                    min = j; // = 1 array[1] = 5 logo min recebeu 5;
                    swap = array[min]; // = 1 swap recebeu array[1] pois o min logo acima foi atualizado
                    array[min] = array[i];//array[1] = array[0] , ou seja logo na primeira volta o array[min] recebeu o maior , valo
                    //que estava na posição i =0 ;
                    array[i] = swap;//como foi guardado o valor do array na posição a frente , array na posição [0]
                    //recebe o menor valor calculado nessa volta , ja que a intenção e ordena de forma que o maior valor
                    //fique na ultima posição
                }
        }
        return array;
    }

    public static void main(String[] args) {
        int array [] = {6,5,2,4,3,1};

        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }
}
