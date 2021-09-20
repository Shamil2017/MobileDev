public class Employee extends  Person implements hasWage,increaseWage{
    private int wage;

    public Employee(int age, boolean sex, String name, String surname, String patronic, int wage) {
        super(age, sex, name, surname, patronic);
        this.wage = wage;
    }
    @Override
    public void showInfo()
    {
        super.showInfo();
        System.out.println(wage);
    }

    public int getWage() {
        return wage;
    }


    @Override
    public void increase() {
        wage*=3;
    }
}
