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

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getFullName() {
        counter++;
        return fullName;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getDepartment() {
        return department;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public float getSalary() {
        return salary;
    }

    public void setId(int id) {

        this.id = id;
    }

    public int getId() {
        return id;
    }



    void printInfo(){
        System.out.println("Id" + id + " ФИО " +fullName+ " Отдел "+department+" Запрлата "+salary);
    }

    public String toString() {
        return "Id: " + id + " ФИО: " + fullName + " Отдел: " + department + " Зарплата: " + salary;
    }

}
