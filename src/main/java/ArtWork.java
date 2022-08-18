public class ArtWork {

    private String title;
    private String artistName;
    private static int price;
    private int nft;

    public ArtWork(String title, String artistName , int price, int nft){
        this.title = title;
        this.artistName = artistName;
        this.price = price;
        this.nft = nft;
    }

    public String getTitle (){
        return title;
    }

    public void setTitle () {
        this.title= title;

    }

    public String getArtist(){
        return artistName;
    }

    public void setArtist(){
        this.artistName = artistName;
    }

    public static int getPrice(){
        return price;
    }

    public void setPrice(){
        this.price = price;
    }

    public int getNft(){
        return nft;
    }

    public void setNft(){
        this.nft = nft;
    }

}
