public class Owner extends Person{
   
    public Owner(String name , String lastname ,int id , String tel , String email ) {
        super(name, lastname, id, tel,email);
    }
    public String getOwner() 
    {
        return name+" "+lastname; 
    }
}
