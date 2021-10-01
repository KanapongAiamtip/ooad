public class Order extends Menu{

    protected int id_order;
    protected String order_datetime;

    public Order(String menu_name,String type,int menu_price,int id_order,String order_datetime)
    {
        super(menu_name,type,menu_price);
        this.order_datetime = order_datetime;
        this.id_order = id_order;
    }


   public String getOrder(){
        return id_order+" "+order_datetime;
    }

    public String showOrder()
    {
        return menu_name+" "+menu_price+" "+type;
    }
}