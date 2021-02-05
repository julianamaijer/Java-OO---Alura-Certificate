package alura;

import alura.domain.AuctionBid;

import java.util.ArrayList;
import java.util.List;

public class AuctionBidFilter {

    public List<AuctionBid> filter(List<AuctionBid> auctionBids) {
        ArrayList<AuctionBid> result = new ArrayList<AuctionBid>();

        for(AuctionBid auctionBid : auctionBids) {
            if(auctionBid.getValue() > 1000 && auctionBid.getValue() < 3000)
                result.add(auctionBid);
            else if(auctionBid.getValue() > 500 && auctionBid.getValue() < 700)
                result.add(auctionBid);
            else if(auctionBid.getValue() > 5000)
                result.add(auctionBid);
        }

        return result;
    }
}

