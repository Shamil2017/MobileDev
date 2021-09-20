public class Doctor extends Person implements hasWage, increaseWage{
    private int wage;
    String speciality;

    public Doctor(int age, boolean sex, String name, String surname, String patronic, int wage, String speciality) {
        super(age, sex, name, surname, patronic);
        this.wage = wage;
        this.speciality = speciality;
    }
    public void povishenieKvalificatii(increaseWage incr)
    {
        incr.increase();
    }
    public int getWage() {
        return wage;
    }

    @Override
    public String toString() {

       return surname+" "+name.substring(0, 1).toUpperCase()+" "+ patronic.substring(0, 1).toUpperCase() +" " + getAge();
    }

    @Override
    public void increase() {

    }
}

