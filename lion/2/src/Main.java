import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args){
        List<School> School = new ArrayList<>();
        School School1 = new School("Address1",3,BuildingTypeEnum.GOVERNMENT,5,"Title1",
                Arrays.asList(new Teacher("Name 1",GenderEnum.MALE,25,"Subject1"),new Teacher("Name 2",GenderEnum.MALE,30,"Subject2")),
                Arrays.asList(new Student("Name 1",GenderEnum.FEMALE,13,4),new Student("Name 2",GenderEnum.FEMALE,12,2)),SchoolTypeEnum.MEDIUM);
        System.out.println(School1);
    }
}
