import java.util.ArrayList;

public class Gallery {

    private String name;
    private static int till;
    private ArrayList<ArtWork> artWorks;
    private Customer customer;

    public  Gallery( String name, int till ) {
        this.name = name;
        this.till = till;
        this.artWorks = new ArrayList<>();
        this.customer = new Customer(200, "Fred");

    }

//    public static int getPrice() {
//        return price;
//    }

    public String getName (){
        return this.name;
    }

    public void setName () {
        this.name = name;
    }

    public int getTill(){
        return till;

    }

    public void addartWork (ArtWork artWork){
        this.artWorks.add(artWork);
    }

    public static void acceptPayment(int payment){
        till += payment;

    }

}
