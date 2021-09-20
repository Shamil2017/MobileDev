import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee(19, true, "Вася", "Пупкин", "Васильевич",100 );
        employee.showInfo();
        Student student = new Student(19,false, "Алиса", "Иванова", "Игоревна", 2, "22.01");
        Doctor doctor = new Doctor(44,true,"Вагнер", "Николай", "Петрович", 200, "Терпевт");
        System.out.println(doctor);
        /*ArrayList<Person> personList = new ArrayList<>();
        personList.add(student);
        personList.add(employee);
        for (Person p:personList
             ) {
            p.showInfo();
            
        }
         */
        ArrayList<hasWage> worker = new ArrayList<>();
        worker.add(employee);
        for (hasWage e:worker
        ) {
            e.getWage();
        }

        doctor.povishenieKvalificatii(new increaseWage(){
            @Override
            public void increase()
            {

            }
        });

    }
}

