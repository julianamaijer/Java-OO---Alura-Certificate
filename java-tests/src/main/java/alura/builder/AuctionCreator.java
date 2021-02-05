package alura.builder;

import alura.domain.Auction;
import alura.domain.AuctionBid;
import alura.domain.User;

public class AuctionCreator {

    private Auction auction;

    public AuctionCreator to(String description){
        this.auction = new Auction(description);
        return this;
    }

    public AuctionCreator auctionBid(User user, double value){
        auction.offer(new AuctionBid(user, value));
        return this;
    }

    public Auction build(){
        return auction;
    }
}
