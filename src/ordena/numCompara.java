package ordena;

public class numCompara {
    public int numCom;
    public int numTroca;


    public numCompara(){
        this.numCom =0;
        this.numTroca = 0;
    }

    public String  numeros  (){
        StringBuilder obj = new StringBuilder();
        obj.append("numero de comparações: " + numCom);
        obj.append("numero de troca " + numTroca);

        return obj.toString();
    }

}
