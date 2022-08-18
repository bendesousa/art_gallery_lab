public class Customer {

    private String name;
    private int wallet;

    private ArtWork artwork;

    public Customer(int wallet, String customerName){
        this.wallet = wallet;
        this.name = customerName;
        this.artwork= new ArtWork("Blue Sky", "John", 50, 573);

    }


    public int getWallet(){
        return wallet;
    }

    public void setWallet(){
        this.wallet = wallet;
    }

    public String getName(){
        return this.name;
    }

    public void setName(){
        this.name = name;
    }

    public void payTill (){
            if(this.wallet > artwork.getPrice()) {
                Gallery.acceptPayment(artwork.getPrice());
                wallet -= artwork.getPrice();

            }
    }




}
