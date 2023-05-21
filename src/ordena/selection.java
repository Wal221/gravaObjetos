package ordena;

import java.util.Arrays;

public class selection {
    public static  int[] selectionSort (int array []){
        int swap = 0;
        for(int i = 0; i < array.length-1; i++){
            int min = i;

            for(int j = i+1; j < array.length; j++)
                if(array[j] < array[min])  min = j;
            /**
             *  cuidado, as seguintes operações abaixo , so serão executadas assim que o segundo for completar a volta
             *  perceba que não a nenhuma chave no segundo for e no if.
             */

            swap = array[min]; // = 1 swap recebeu array[1] pois o min logo acima foi atualizado
            array[min] = array[i];//array[1] = array[0] , ou seja logo na primeira volta o array[min] recebeu o maior , valo
            //que estava na posição i;
            array[i] = swap;//como foi guardado o valor do array na posição a frente , array na posição [0]
                    //recebe o menor valor calculado nessa volta , ja que a intenção e ordena de forma que o maior valor
                    //fique na ultima posição

        }
        return array;
    }

    public static void main(String[] args) {
        int array [] = {6,5,2,4,3,1};

        selectionSort(array);
        System.out.println(Arrays.toString(array));

    }
}
