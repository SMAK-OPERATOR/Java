import java.io.File;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Library library = new Library("Library title 1", Arrays.asList(new Book(1,"Title 1","Author 1"),new Book(2,"Title 2","Author 2")));
        File file = new File("1.dat");
        Library.save(library,file);
        Library library1 = Library.load(file);
        System.out.println(library1);

    }
}
