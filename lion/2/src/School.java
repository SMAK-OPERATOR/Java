
import java.util.ArrayList;
import java.util.List;

public class School extends Building{
    private int number;
    private String title;
    private List<Teacher> teachers;
    private List<Student> students;
    private SchoolTypeEnum schoolType;

    public School(String address, int floatNumber, BuildingTypeEnum type, int number, String title, List<Teacher> teachers, List<Student> students, SchoolTypeEnum type1) {
        super(address, floatNumber, type);
        this.number = number;
        this.title = title;
        this.teachers = new ArrayList<>(teachers);
        this.students = new ArrayList<>(students);
        this.schoolType = type1;
    }

    @Override
    public String toString() {
        return "School{" +
                "number=" + number +
                ", title='" + title + '\'' +
                ", teachers=" + teachers +
                ", students=" + students +
                ", " + schoolType +
                ", address='" + address + '\'' +
                ", floatNumber=" + floatNumber +
                ", type=" + type +
                '}';
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<Teacher> getTeachers() {
        return teachers;
    }

    public void setTeachers(List<Teacher> teachers) {
        this.teachers = teachers;
    }

    public List<Student> getStudents() {
        return students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }


    public SchoolTypeEnum getSchoolType() {
        return schoolType;
    }

    public void setSchoolType(SchoolTypeEnum schoolType) {
        this.schoolType = schoolType;
    }
}
