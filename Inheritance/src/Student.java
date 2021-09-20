public class Student extends  Person{
    int kurs;
    String group;

    public Student(int age, boolean sex, String name, String surname, String patronic, int kurs, String group) {
        super(age, sex, name, surname, patronic);
        this.kurs = kurs;
        this.group = group;
    }
    // ctrl +O

    @Override
    public void showInfo() {
        super.showInfo();
        System.out.println("kurs = "+kurs);
    }
}
