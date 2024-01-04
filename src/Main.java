import models.Order;
import models.Tshirt;

public class Main {
    public static void main(String[] args) {
        //Task 1
        String[] sizes1={"XL","Medium","Large"};
        String[] sizes2 = {"M", "L", "XL"};
        String[] sizes3 = {"XS", "S", "M", "L"};
        String[] sizes4 = {"L", "XL", "XXL"};
        String[] sizes5 = {"S", "M", "L", "XL"};


        Tshirt tshirt1=new Tshirt("Gorkhali Batman",572,1235,"Karuna","You either die a hero or live long enough to see yourself be a villain",sizes1);
        Tshirt tshirt2 = new Tshirt("Space Explorer", 645, 1499, "Galactic Gear", "Explore the universe in style", sizes2);
        Tshirt tshirt3 = new Tshirt("Abstract Art", 489, 899, "ColorSplash", "Wear your creativity", sizes3);
        Tshirt tshirt4 = new Tshirt("Wild Tiger", 720, 1599, "WildNature", "Embrace the wild side", sizes4);
        Tshirt tshirt5 = new Tshirt("Music Vibes", 512, 1099, "SoundWave", "Let the music speak", sizes5);

        tshirt1.TshirtDescribe();
        tshirt2.TshirtDescribe();
        tshirt3.TshirtDescribe();
        tshirt4.TshirtDescribe();
        tshirt5.TshirtDescribe();


        //From the above code, I have just created 5 objects for the class Tshirt and I have filled out the required fields as well. Regarding the array field for sizes, at first I created 5 arrays filling out the sizes, and then I placed it in my object
        //Then, I used TshirtDescribe() method for each object I created and it redirected to the Tshirt Class!

        System.out.println("------------------------------------------------------------------------");

        //Task 2
        String[] itemcode1={"572","645"};
        int[] price1={1235,1499};
        String[] itemcode2={"489","720"};
        int[] price2={899,1599};
        String[] itemcode3={"512","572"};
        int[] price3={1099,1235};



        Order order1=new Order("Gopal Sharma","0486756465",itemcode1,price1);
        Order order2=new Order("Samriddha Raj Satyal","980000000",itemcode2,price2);
        Order order3=new Order("Ram Pandey","012398798",itemcode3,price3);

        order1.Orderdescribe();
        order2.Orderdescribe();
        order3.Orderdescribe();


        //In this Task, we assume that the customer has already given their order and only the bill is to be made. So, all the objects of the Order class takes ordername(customer name), phonenumber(customer's number), product code(array of String), price(array of int)
        //I created arrays just above the object creation for each object of Order Class. Then, I put it in the object, and finally called the Orderdescribe() method.



    }
}