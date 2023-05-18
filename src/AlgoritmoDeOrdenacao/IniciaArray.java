package AlgoritmoDeOrdenacao;

import java.util.Random;

public class IniciaArray {
      Random gerar ;
    IniciaArray(){
        gerar = new Random();
    }
    public  int [] criar(int array[]){

        for(int i = 0; i < array.length ; i++){
            array[i] = gerar.nextInt(array.length * 5);

        }
        return array;

    }

    public Double [] criar(Double array[]){

        for(int i = 0; i < array.length ; i++){
            array[i] = gerar.nextDouble() * array.length * 5;

        }
        return array;

    }

}
