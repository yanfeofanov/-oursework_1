public class Employee {



    private String fullName; // ФИО сотрудников
    private int department; // Отдел сотрудников

    private float salary; // Зарплата сотрудников
    static int counter = 1; // Счетчик
    private int id;      // ID сотрудника



    public Employee(String fullName, int department, float salary) {
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
        id = counter++;
    }


    public String getFullName() {
        counter++;
        return fullName;
    }


    public float getSalary() {
        return salary;
    }



    public String toString() {
        return "Id: " + id +""+ " ФИО: " + fullName +""+ " Отдел: " + department + " Зарплата: " + salary;
    }

}
