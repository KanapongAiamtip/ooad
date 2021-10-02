public class Menu { 
   protected String menu_name;
   protected String type;
   protected int menu_price;

   public Menu(String menu_name,String type,int menu_price)
   {
       this.menu_name = menu_name;
       this.type = type;
       this.menu_price = menu_price;
   }

   public String getMenuname()
   {
       return menu_name+" "+type+" "+menu_price+" bath";
   }
}
