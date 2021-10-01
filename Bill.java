public class Bill  extends Order {
   
    private int id_Bill;
    private String bill_datatime;
    private int bill_price;
    

    public Bill(String menu_name,String type,int menu_price,int id_order,String order_datetime,int id_Bill,String bill_datatime,int bill_price){
        super(menu_name,type,menu_price,id_order,order_datetime);
        this.id_Bill = id_Bill;
        this.bill_datatime = bill_datatime;
        this.bill_price = bill_price;
    }


    public String getBill() { 
        return id_Bill+ " " + bill_datatime +" "+menu_name+ " " + bill_price;        
    }

    
}