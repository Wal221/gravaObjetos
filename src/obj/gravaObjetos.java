package obj;

import Livro.Books;

import java.util.ArrayList;
import java.util.List;

public class gravaObjetos {


    public static void main(String[] args) {

        Books book = new Books("Joao e maria",12,"Jose");
        Books book1 = new Books("jose e maria",12,"otavio");
        Books book3 = new Books("luan e maria",12,"juca");

        List<Books> listaLivros = new ArrayList<>();
        listaLivros.add(book);
        listaLivros.add(book1);
        listaLivros.add(book3);
        // Grava o primeiro objeto

        // Criar uma lista para armazenar os objetos

        // Adicionar mais objetos à lista (se necessário)
        // Exemplo:
        // BiblioDAO book2 = new BiblioDAO(autor2, titulo2, area2, ano2, edicao2, numFolhas2);
        // listaLivros.add(book2);
        for (Books livro : listaLivros) {
            livro.grava();

        }

    }
}
