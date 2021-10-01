public class Employee extends Person {
 
    public Employee (String name , String lastname ,int id , String tel , String email ) {
        super(name, lastname, id, tel,email);
    }


    public String  getEmployee()
    {
        return "ID employee "+id+" Name "+name+" "+lastname;
    } 

}
