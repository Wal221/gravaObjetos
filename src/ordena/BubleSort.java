package ordena;

import java.lang.reflect.Array;
import java.util.Arrays;

public class BubleSort {
    public static int[] buble(int array[]) {
        int swap = 0;
        int numberTrocas = 0;
        int numberCompa = 0 ;
          numCompara number = new  numCompara();
        //Esse primeiro for , so ira da a volta quando o segundo completa as comparações
        //as comparaçoes e feita da seguinte maneira.
        //a cada volta , seja ela na primeira segundo ou terceira. E comparado a posição no qual o i se encontra
        // ou seja na primera volta sera comparado array[0] com as demais posições array[j]. como o primero for
        //so ira da a volta quando o segundo completar, logo o array[0] que no caso e o valor inicial de  i.
        //vai comparar array[0] com array[j+1]
        for (int i = 0; i < array.length; i++) {
           numberCompa++;
            //O segundo for caminha normalmente, porem ele so ira realizar a troca se e somente se a condição
            //do if abaixo for verdadeira. Logo se a comparação do if for falsa, o segundo for e incrementado
            // ficando o seguinte ja que o segundo for não foi completado  array[i] > array[j+1]
            //ressaltando novamente que o array[i] esta fixo e so ira caminha quando toda a volta do segundo for
            // ser realizada
            for (int j = 0; j < array.length; j++) {
                if (array[i] < array[j]) {
                    //A troca e feita da seguinte maneira, se o elemento na posição i for maior que o elemento na
                    // posição j, ele ira flutuar para a ultima posição, para isso necessiatamos da variavel swap
                    //para guarda o valor do array[i] no momento em que a condição if for verdadeira. Para o fazer
                    //flutuar para a proxima posição
                    numberTrocas++;

                    swap = array[i];
                    //como a intenção e ordena de forma crecente ,o array[i] = array[j] ja que o jota e um valor menor
                    //ele deve fica na posição em que se foi comparado e foi visto que ele e um valor menor
                    array[i] = array[j];

                    //como a intenção e subir os valores , para as ultimas posições , agora o array[j] = swap
                    // ja que suap guardou o maior valor comparado na volta , e o array[j] sempre estara posições acima
                    //do valor i. O array[j] recebe o maior valor para assim ficar ordenado de forma correta.
                    //imagine o seguinte se o array[j] for maior que o da posição i , não sera necessario a troca. Visto
                    //que dada a comparação e necessario trocar se o i for maior
                    array[j] = swap;
                }
            }



        }
        System.out.println("numeros de trocas de "+ numberTrocas);
        System.out.println("numeros de comparações de "+ numberCompa);


        return array;
    }

    public static void main(String[] args) {
        int array [] = {4,7,3,1,5,0};
        buble(array);

        System.out.println(Arrays.toString(array));
    }
}
