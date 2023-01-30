import java.util.Arrays;

public class Main {


    public static void main(String[] args) {


        Employee[] emp = new Employee[10];
        emp[0] = new Employee("Иваннов Иван Иванович", 1, 32680);
        emp[1] = new Employee("Сидоров Игнат Петрович", 2, 44560);
        emp[2] = new Employee("Власов Валентин Саныч", 3, 22365);
        emp[3] = new Employee("Петренко Артем Андреич", 4, 69800);
        emp[4] = new Employee("Крюков Вадим Закирович", 2, 63250);
        emp[5] = new Employee("Рюриков Александр Петрович", 3, 54320);
        emp[6] = new Employee("Карго Мануэль Евритович", 1, 16578);
        emp[7] = new Employee("Сидоров Геннадий Яковлевич", 2, 58706);
        emp[8] = new Employee("Зигмунд Альфред Васильевич", 5, 78965);
        emp[9] = new Employee("Петров Григорий Яковлев", 5, 98980);
        for (Employee e : emp) {
            System.out.println(e);
        }

        int day = 30;
        float max = 0;
        String employeeMaxSalary = "";
        String employeeMinSalary = "";
        float min = emp[0].getSalary();
        float sum = 0;
        float averageAmount = 0;

        for (int i = 0; i < emp.length; i++) {
            if (emp[i].getSalary() == emp[i].getSalary()) {
                sum += emp[i].getSalary();
            }
            if (emp[i].getSalary() > max && emp[i].getFullName() == emp[i].getFullName()) {
                employeeMaxSalary = emp[i].getFullName();
                max = emp[i].getSalary();
            }
            if (emp[i].getSalary() < min && emp[i].getFullName() == emp[i].getFullName()) {
                employeeMinSalary = emp[i].getFullName();
                min = emp[i].getSalary();
            }
            if (emp[i].getSalary() == emp[i].getSalary()) {
                averageAmount += emp[i].getSalary() / day;
            }

        }

        System.out.println();
        System.out.printf("Сумма затрат зарплаты на месяц, состовляет - %.2f рублей", sum);
        System.out.println();
        System.out.printf("Сотрудник " + String.valueOf(employeeMinSalary) + " с минимальной зарплатой %.2f рублей в месяц", min);
        System.out.println();
        System.out.printf("Сотрудник " + String.valueOf(employeeMaxSalary) + " с максимальной зарплатой %.2f рублей в месяц", max);
        System.out.println();
        System.out.printf("Средняя сумма зарплат составит %.2f рублей в месяц", averageAmount);


    }

}


