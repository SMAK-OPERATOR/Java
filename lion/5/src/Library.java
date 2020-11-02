import com.sun.source.tree.TryTree;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Library implements Externalizable{
    String title;
    List<Book> books = new ArrayList<>();

    public Library(){}

    public Library(String title, List<Book> books) {
        this.title = title;
        this.books = books;
    }

    public static void save(Library library, File file){
        try(
                ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))
        ){
            oos.writeObject(library);

        } catch (Exception a){
            a.printStackTrace();
        }
    }

//    public void save(){
//        File file = new File("lib.txt");
//        try(
//                FileWriter fr = new FileWriter(file);
//                BufferedWriter bw = new BufferedWriter(fr);
//        ){
//            bw.write(title);
//            bw.newLine();
//            for(Book s : books){
//                bw.write(s.id + ";" + s.title + ";"  + s.author);
//                bw.newLine();
//            }
//        } catch (Exception a){
//            a.printStackTrace();
//        }
//    }
    public static Library load(File file) throws IOException, ClassNotFoundException {
        try(
                ObjectInputStream ois = new ObjectInputStream(new FileInputStream("1.dat"))
        ){
             return ((Library) ois.readObject());
        }
    }

//    public void  load(File file) {
//        file = new File("lib.txt");
//        try(
//                FileReader fr = new FileReader(file);
//                BufferedReader br = new BufferedReader(fr);
//        ){
//            this.title = br.readLine();
//            String s;
//            while((s = br.readLine() )!= null){
//                String[] arr = s.split(";");
//                books.add(new Book(
//                        Integer.parseInt(arr[0]),
//                        arr[1],
//                        arr[2]
//                ));
//            }
//        } catch (Exception a){
//            a.printStackTrace();
//        }
//    }



    @Override
    public String toString() {
        return "Library{" +
                "title='" + title + '\'' +
                ", books=" + books +
                '}';
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Book> getBooks() {
        return books;
    }

    public void setBooks(List<Book> books) {
        this.books = books;
    }


    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(title);
        out.writeObject(books);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        title = (String) in.readObject();
        books = (List<Book>) in.readObject();
    }
}
