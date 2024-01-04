package models;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class Tshirt {
    String tshirtname;
    int productcode;
    int price;
    String brand;
    String description;
    String[] sizes;

    public Tshirt(String tshirtname, int productcode, int price, String brand, String description, String[] sizes) {
        this.tshirtname = tshirtname;
        this.productcode = productcode;
        this.price = price;
        this.brand = brand;
        this.description = description;
        this.sizes = sizes;
    }

    public String getTshirtname() {
        return tshirtname;
    }

    public void setTshirtname(String tshirtname) {
        this.tshirtname = tshirtname;
    }

    public int getProductcode() {
        return productcode;
    }

    public void setProductcode(int productcode) {
        this.productcode = productcode;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String[] getSizes() {
        return sizes;
    }

    public void setSizes(String[] sizes) {
        this.sizes = sizes;
    }


    public void TshirtDescribe(){
        String here_tshirtname=this.tshirtname;
        int here_productcode=this.productcode;
        int here_price=this.price;
        String here_brand=this.brand;
        String here_description=this.description;
        String[] here_sizes=this.sizes;

        System.out.println("Product Name: "+here_tshirtname);
        System.out.println("Product Code: "+here_productcode);
        System.out.println("Product Price: "+here_price);
        System.out.println("Product Brand: "+here_brand);
        System.out.println("Description: "+here_description);
        System.out.println("Available Sizes: "+Arrays.toString(here_sizes));
        System.out.println("\n\n");

    }
    //So, basically this class takes all the fields that were made in this class and we can acess it using 'this', as per the given format, I have then printed the details of the products, also to acess array items, I have used Arrays.toString()

}
