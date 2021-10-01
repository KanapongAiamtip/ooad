public class Customer extends Person{ 
    
    public Customer(String name , String lastname ,int id , String tel , String email ) {
        super(name, lastname, id, tel,email);
    }

    public String getCustomer(){
        return name+" "+lastname;
    }
}


