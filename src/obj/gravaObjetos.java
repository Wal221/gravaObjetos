package obj;

import Livro.Books;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class gravaObjetos {


    public static void main(String[] args) throws IOException, ClassNotFoundException {

        Books book = new Books("Joao e maria",12,"Jose");
        Books book1 = new Books("jose e maria",12,"otavio");
        Books book3 = new Books("luan e maria",12,"juca");

       book.gravar();
       book1.gravar();
       book3.gravar();
       List<Books> livro = new ArrayList<>();
       livro.add(book);
       livro.add(book1);
       livro.add(book3);


                  livro.get(1).livrosDisponiveis();







        // Grava o primeiro objeto

        // Criar uma lista para armazenar os objetos

        // Adicionar mais objetos à lista (se necessário)
        // Exemplo:
        // BiblioDAO book2 = new BiblioDAO(autor2, titulo2, area2, ano2, edicao2, numFolhas2);
        // listaLivros.add(book2);



    }
}
