public class Teacher extends Human{
    protected String subject;


    public Teacher(String name, GenderEnum gender, int age, String subject) {
        super(name, gender, age);
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "subject='" + subject + '\'' +
                ", name='" + name + '\'' +
                ", gender=" + gender +
                ", age=" + age +
                '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }
}
