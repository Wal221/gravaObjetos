package Livro;


import javax.swing.*;
import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Books implements Serializable {
    private String titulo;
    private int numPag;
    private String autor;


    public Books (){

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
    public void grava(){
        try{
            ObjectOutput objectOutput = new ObjectOutputStream(new FileOutputStream("src/arquivos/biblioteca.txt",true));
            objectOutput.writeObject(this );
            System.out.println("Livro gravado");
            objectOutput.close();

        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao salva arquivo!!");

        }

    }
    public void ler(){
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
}
