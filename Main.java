public class Main {
    public static void main(String[] args){
      
        Owner a = new Owner("jjaajaaaa phachara ","suansri",1,"099-223-0344","jjaajaaaa@nu.ac.th");
        Customer p = new Customer("Leon ","",1,"0990166890","Leon@nu.ac.th");
        Employee p1= new Employee("Neo ","",1,"0990131234","neo@nu.ac.th");
        Chef c1 = new Chef("phuwin ","",1,"0990166890","phuwin@nu.ac.th");
        Menu m1 = new Menu("Noodle","Normal",45);
        Menu m2 = new Menu("Pad Thai","Normal",50);
        Order o1 = new Order("Noodle","Extra",45,1,"15.50");
        Bill b1 = new Bill("Noodle","Extra",45,1,"15.50",1,"15.50",45);
        System.out.println("Owner name is " + a.getOwner());
        System.out.println("Customer name is "+ p.getCustomer());
        System.out.println("Employee name is "+p1.getEmployee());
        System.out.println("Cher name is "+c1.getChef());
        System.out.println(m1.getMenuname());
        System.out.println(m2.getMenuname());
        System.out.println("Order is "+o1.showOrder());
        System.out.println(b1.getBill());
    }
}
