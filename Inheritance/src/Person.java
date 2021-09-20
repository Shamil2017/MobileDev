

public abstract class Person {
    private int age;
    boolean sex;
    public String name;
    public String surname;
    public String patronic;



    public Person(int age, boolean sex, String name, String surname, String patronic) {
        this.age = age;
        this.sex = sex;
        this.name = name;
        this.surname = surname;
        this.patronic = patronic;
    }

    public  void showInfo()
    {
        System.out.println(surname+" "+name.substring(0, 1).toUpperCase()+" "+ patronic.substring(0, 1).toUpperCase() +" " + age);
    }

    public int getAge() {
        return age;
    }
}
