// Nils E Lindfors TE15 
// 2017-10-25
// 14:28
public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    public Employee(int id, String firstName, String lastName, int salary) {
        id = id;
        firstName = firstName;
        lastName = lastName;
        salary = salary;
    }
    public int getID(){
        return id;
    }
    public String getFirstName(){
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public String getName(){
        return firstName + " " + lastName;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int s){
        salary = s;
    }
    public int getAnnualSalary(){
        return salary*12;
    }
    public int raiseSalary(int percent){
        percent+=1;
        salary = salary*percent;
        return salary;
    }
    public String toString(){
        return "Employee[id="+id+","+"FirstName="+firstName+","+"LastName="+lastName+","+"Salary="+salary+"]";
    }
}
