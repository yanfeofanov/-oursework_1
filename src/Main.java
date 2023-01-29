public class Main {



    public static void main(String[] args) {
    Employee[] emp = new Employee[5];
    emp[0] = new Employee("Иваннов Иван Иванович",1,50000);
    emp[1] = new Employee("Сидоров Игнат Петрович", 2,60000);
    emp[2] = new Employee("Власов Валентин Саныч",3,70000);
    emp[3] = new Employee("Петренко Артем Андреич",4,16000);
    emp[4] = new Employee("Крюков Вадим Закирович",2,25000);
        for (Employee e: emp) {
            System.out.println(e);
        }


    }

}