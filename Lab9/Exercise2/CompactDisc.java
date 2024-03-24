package Exercise2;

import java.util.ArrayList;

public class CompactDisc implements RetailItem{
    private String tittle;
    private String artist;
    private double retailPrice;

    public CompactDisc(String tittle, String artist, double retailPrice){
        this.tittle = tittle;
        this.artist = artist;
        this.retailPrice = retailPrice;
    }

    public String getTittle(){
        return tittle;
    }

    public String getArtTist(){
        return artist;
    }

    public double getRetailPrice(){
        return retailPrice;
    }
}
