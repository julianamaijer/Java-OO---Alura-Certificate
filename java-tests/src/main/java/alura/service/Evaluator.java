package alura.service;

import alura.domain.Auction;
import alura.domain.AuctionBid;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Evaluator {

    private double higher = Double.NEGATIVE_INFINITY;
    private double lower = Double.POSITIVE_INFINITY;
    private double average;
    private List<AuctionBid> threeHighest = new ArrayList<AuctionBid>();

    public void evaluate(Auction auction){
        double total = 0;
        if(auction.getAuctionBids().size() == 0){
            throw new RuntimeException("Não é possível avaliar um leilão sem lances!");
        }
        for(AuctionBid auctionBid : auction.getAuctionBids()){
            if(auctionBid.getValue() > higher) higher = auctionBid.getValue();
            if (auctionBid.getValue() < lower) lower = auctionBid.getValue();
            total += auctionBid.getValue();
        }
        average = total / auction.getAuctionBids().size();
        if (total == 0){
            average = 0;
            return;
        }

        threeHighest = new ArrayList<AuctionBid>(auction.getAuctionBids());
        Collections.sort(threeHighest, new Comparator<AuctionBid>() {
            public int compare(AuctionBid o1, AuctionBid o2) {
                if(o1.getValue() < o2.getValue()) return 1;
                if(o1.getValue() > o2.getValue()) return -1;
                return 0;
            }
        });
        threeHighest = threeHighest.subList(0, threeHighest.size() > 3 ? 3 : threeHighest.size());
    }

    public List<AuctionBid> getThreeHighest() {
        return threeHighest;
    }

    public double getAverage() {
        return average;
    }

    public double getHigher() {
        return higher;
    }

    public double getLower() {
        return lower;
    }
}
