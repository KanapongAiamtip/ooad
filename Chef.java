public class Chef extends Person{ 
   
    public Chef(String name , String lastname ,int id , String tel , String email ) {
        super(name, lastname, id, tel,email);
    }

    public String getChef() {
        return name+" "+lastname;
    }

}
