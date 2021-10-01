import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        /*while (true) 
        {
            System.out.println("*** Restaurant ***");
            System.out.println("");
            System.out.println("***** Enter 0 Quit progarm *****");
            int number = in.nextInt();
            if (number == 0) {
                break;
            } 
        }*/

        Owner a = new Owner("jjaajaaaa phachara ","suansri",1,"099-223-0344","jjaajaaaa@nu.ac.th");
        Customer p = new Customer("Leon ","",1,"0990166890","Leon@nu.ac.th");
        Employee p1= new Employee("Neo ","",1,"0990131234","neo@nu.ac.th");
        Chef c1 = new Chef("Neo ","",1,"0990166890","neo@nu.ac.th");
        Menu m1 = new Menu("Noodle","Normal",45);
        Order o1 = new Order("Noodle","Extra",45,"1/09/2021",1);
        Bill b1 = new Bill(1,"Noodle","Extra",45,"1/09/2021","15.50",45);

        System.out.println("Owner name is " + a.getOwner());
        System.out.println("Customer name is "+ p.getCustomer());
        System.out.println(p1.getEmployee());
        System.out.println(c1.getChef());
        System.out.println(m1.getMenuname());
        System.out.println(o1.showOrder());
        System.out.println(b1.getBill());
        

    }
}
