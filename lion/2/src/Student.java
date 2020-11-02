public class Student extends Human {
    protected int level;


    public Student(String name, GenderEnum gender, int age, int level) {
        super(name, gender, age);
        this.level = level;
    }

    @Override
    public String toString() {
        return "Student{" +
                "level=" + level +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public int getLevel() {
        return level;
    }

    public void setLevel(int level) {
        this.level = level;
    }
}
