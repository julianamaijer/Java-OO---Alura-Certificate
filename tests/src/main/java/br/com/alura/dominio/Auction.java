package br.com.alura.dominio;

import java.util.ArrayList;
import java.util.List;

public class Auction {

    private String description;
    private List<AuctionBid> auctionBids;

    public Auction(String description){
        this.description = description;
        this.auctionBids = new ArrayList<AuctionBid>();
    }

    public void offer(AuctionBid auctionBid){
        auctionBids.add(auctionBid);
    }

    public List<AuctionBid> getAuctionBids() {
        return auctionBids;
    }

    public String getDescription() {
        return description;
    }
}
