package alura.domain;

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
        auctionBidsFrom(auctionBid.getUser());

        if(auctionBids.isEmpty() || canGiveAuctionBid(auctionBid.getUser())){
            auctionBids.add(auctionBid);
        }
    }

    public void doubleAuctionBid(User user){

    }

    private int auctionBidsFrom(User user){
        int total = 0;
        for(AuctionBid auctionBid1 : auctionBids){
            if(auctionBid1.getUser().equals(user)) total++;
        }
        return total;
    }

    private boolean canGiveAuctionBid(User user){
        return !lastAuctionBid().getUser().equals(user) && auctionBidsFrom(user) < 5;
    }

    private AuctionBid lastAuctionBid(){
        return auctionBids.get(auctionBids.size() - 1);
    }

    public List<AuctionBid> getAuctionBids() {
        return auctionBids;
    }

    public String getDescription() {
        return description;
    }
}
