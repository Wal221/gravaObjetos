package Livro;


import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Books implements Serializable {
    private String titulo;
    private int numPag;
    private String autor;


    public Books() {

    }

    public Books(String titulo, int numPag, String autor) {
        this.titulo = titulo;
        this.numPag = numPag;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumPag() {
        return numPag;
    }

    public void setNumPag(int numPag) {
        this.numPag = numPag;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void gravar() throws IOException {
        List <Books> livr = new ArrayList();
        livr.add(this);
        try(ObjectOutput objectOutput = new ObjectOutputStream(
                new FileOutputStream("src/arquivos/biblioteca.txt"))){

            for(Books livro: livr){
                objectOutput.writeObject(livro );
                System.out.println("Livro gravado");
            }

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao salva arquivo!!");

        }
    }

    public void ler() {
        try {
            ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("src/arquivos/biblioteca.txt"));

            List<Books> booksList = new ArrayList<>();
            boolean endOfFile = false;

            while (!endOfFile) {
                try {
                    Books book = (Books) objectInput.readObject();
                    booksList.add(book);
                } catch (EOFException e) {
                    endOfFile = true;
                }
            }

            objectInput.close();

            // Exibindo os livros
            for (Books book : booksList) {
                System.out.println(book);
            }

        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void livrosDisponiveis() throws ClassNotFoundException, FileNotFoundException, IOException {
        List<Books> books = new ArrayList<>();
        boolean endOfFile = false;

        try (ObjectInputStream objectInput = new ObjectInputStream(new FileInputStream("src/arquivos/biblioteca.txt"));
        ) {

            while (true ) {
                System.out.println(books);
                books.add((Books) objectInput.readObject());


            }

        }  catch(EOFException ex){

        }
        catch (ClassNotFoundException e) {
            endOfFile = true;
            e.printStackTrace();

        }
    }

    @Override
    public String toString() {
        return "Books{" +
                "titulo='" + titulo + '\'' +
                ", numPag=" + numPag +
                ", autor='" + autor + '\'' +
                '}';
    }
}
