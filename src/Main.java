import java.util.Arrays;

public class Main  {


    public static void main(String[] args) {

        Employee[] emp = new Employee[5];
        emp[0] = new Employee("Иваннов Иван Иванович",1,100);
        emp[1] = new Employee("Сидоров Игнат Петрович", 2,50);
        emp[2] = new Employee("Власов Валентин Саныч",3,300);
        emp[3] = new Employee("Петренко Артем Андреич",4,400);
        emp[4] = new Employee("Крюков Вадим Закирович",2,50);
        for (Employee e: emp) {
            System.out.println(e);
        }
        int day = 30;
        float max = 0;
        float min = emp[0].getSalary();
        float sum = 0;
        float averageAmount = 0;
        for (int i = 0; i < emp.length; i++) {
            if(emp[i].getSalary()==emp[i].getSalary()){
                sum+=emp[i].getSalary();
            }
                if(emp[i].getSalary()>max ){
                    max = emp[i].getSalary();
                }
                    if(emp[i].getSalary()<min ){
                        min = emp[i].getSalary();
                 }
                        if(emp[i].getSalary()==emp[i].getSalary()){
                            averageAmount+=emp[i].getSalary()/day;
                 }
        }
        System.out.println();
        System.out.printf("Средняя сумма составит %.2f рублей",averageAmount);
        System.out.println();
        System.out.println("Сотрудник с минимальной зарплатой "+min);
        System.out.println("Сотрудник с максимальной зарплатой "+max);
        System.out.println("Сумма затрат зарплаты на месяц, состовляет - "+sum+" рублей");



    }

}


