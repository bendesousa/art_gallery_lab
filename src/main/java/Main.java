

public class Main {

    public static void main(String[] args){
    // create a gallery
        Gallery gallery1 = new Gallery("London Gallery", 2000);
//      Create a customer
        Customer customer = new Customer (200, "Fred");
    // add artwork to the gallery
        gallery1.addartWork(new ArtWork("Blue Sky", "John", 50, 573));
    //Customer check for artwork in the gallery
//        if (ArtWork )
    // If the artwork is found, buy it
    // Money is taken from wallet and put into till
        gallery1.acceptPayment(50);
//        System.out.println(customer.getWallet());

        gallery1.getTill();
        System.out.println(gallery1.getTill());

        System.out.println(customer.getWallet());

    }

}
