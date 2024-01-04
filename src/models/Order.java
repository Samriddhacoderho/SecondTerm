package models;

public class Order {
    String ordername;
    String phonenumber;
    String[] itemcode;
    int[] price;

    public Order(String ordername, String phonenumber, String[] itemcode, int[] price) {
        this.ordername = ordername;
        this.phonenumber = phonenumber;
        this.itemcode = itemcode;
        this.price = price;
    }

    public String getOrdername() {
        return ordername;
    }

    public void setOrdername(String ordername) {
        this.ordername = ordername;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public String[] getItemcode() {
        return itemcode;
    }

    public void setItemcode(String[] itemcode) {
        this.itemcode = itemcode;
    }

    public int[] getPrice() {
        return price;
    }

    public void setPrice(int[] price) {
        this.price = price;
    }

    public void Orderdescribe(){
        String here_name=this.ordername;
        String here_phonenumber=this.phonenumber;
        String[] here_items=this.itemcode;
        int[] here_price=this.price;
        int c=1;
        int total_price=0;

        System.out.println("JUJU TEES AND CLOTHING");
        System.out.println("Lazimpat Road, Kathmandu");
        System.out.println("Phone No: 01-4002160");
        System.out.println("\n\n");
        System.out.println("Bill Details:\n");
        System.out.println("Name: "+here_name);
        System.out.println("Phone Number: "+here_phonenumber+"\n");
        System.out.println("S.N********Product Code*********Price");

        for(int i=0;i<here_items.length;i++){
            System.out.println(c+"***********"+here_items[i]+"*****************"+here_price[i]);

            c=c+1;
            total_price=total_price+here_price[i];
        }
        System.out.println("\n");
        System.out.println("Total Price: "+total_price);
        System.out.println("VAT: 13%");
        System.out.println("Grand Total Price: "+(total_price+(0.13*total_price)));
        System.out.println("Thank You For Choosing Us!");
        System.out.println("-------------------------------------------------");
    }

    //So, in this method, I have used 'this' to get all fields values in this class. Then, I basically created a billing system that gives us details about company's name, location, and the order details as well. I have used for loop to access all the elements of both arrays, then, I also kept on adding price[i] to calculate the total price. After, that, I displayed the total price at first, then calculated 13% VAT, and finally gave the GRAND TOTAL PRICE!
}
