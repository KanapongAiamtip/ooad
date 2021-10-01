public class Bill  extends Order {
   
    private String bill_datatime;
    private int bill_price;
    

    public Bill(int id,String menu_name,String type,int menu_price, String order_datatimes,String bill_datatime, int bill_price){
        super(id,menu_name,type,menu_price,order_datatimes);
        this.bill_datatime = bill_datatime;
        this.bill_price = bill_price;
    }


    public String getBill() { 
        return id + " " + bill_datatime +" "+menu_name+ " " + bill_price;        
    }

    
}