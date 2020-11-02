import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws BookReadExeption {
        ArrayList<Book> Books = new ArrayList<Book>();
        for(int i = 0;i !=3 ;i++){
            Books.add(readBook());
        }
        System.out.println(Books);
    }

    public static Book readBook() throws BookReadExeption {
        Scanner in = new Scanner(System.in);
        int id;
        String title;
        int year;
        String author;
        System.out.println("Enter id of the book");
        try{
             id = Integer.parseInt(in.nextLine());
            if (id < 0) throw new BookReadExeption("id < 0");
        } catch (BookReadExeption a){
            System.out.println("id < 0");
            return null;
        }
        System.out.println("Enter title of the book");
        try{
            title = in.nextLine();
            if (title.length() < 5 || title.length() > 30) throw new BookReadExeption("Length is not valid");
        } catch (Exception a) {
            System.out.println("Length is not valid");
            return null;
        }
        System.out.println("Enter release year of the book");
        try{
            year = Integer.parseInt(in.nextLine());
            if (year < 1900 || year > 2020) throw new BookReadExeption();
        } catch (Exception f) {
            System.out.println("Year is not valid");
            return null;
        }
        System.out.println("Enter author of the book");
        try {
            author = in.nextLine();
            if (author.length() < 3 || author.length() > 30) throw new BookReadExeption();
        } catch (BookReadExeption a){
            System.out.println("Author is not valid");
            return null;
        }
        return new Book(id,title,year,author);
    }
}
