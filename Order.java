public class Order extends Menu{

    protected String order_datetime;

    public Order(int id ,String menu_name,String type,int menu_price, String order_datetime)
    {
        super(id,menu_name,type,menu_price);
        this.order_datetime = order_datetime;
    }


   public String getOrder(){
        return id+" "+order_datetime;
    }

    public String showOrder()
    {
        return menu_name+" "+menu_price+" "+type;
    }
}