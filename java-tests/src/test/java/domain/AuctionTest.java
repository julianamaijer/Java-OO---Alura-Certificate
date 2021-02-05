package domain;

import alura.domain.Auction;
import alura.domain.AuctionBid;
import alura.domain.User;
import alura.service.Evaluator;
import org.apache.tools.ant.attribute.IfSetAttribute;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;

public class AuctionTest {

    @Test
    public void shouldReceiveOneAuctionBid(){
        Auction auction = new Auction("Macbook Pro 15");
        Assert.assertEquals(0, auction.getAuctionBids().size());

        auction.offer(new AuctionBid(new User("Steve Jobs"), 2000));

        Assert.assertEquals(1, auction.getAuctionBids().size());
        Assert.assertEquals(2000, auction.getAuctionBids().get(0).getValue(), 0.00001);
    }

    @Test
    public void shouldReceiveLotsOfAuctionBids(){
        Auction auction = new Auction("Macbook Pro 15");

        auction.offer(new AuctionBid(new User("Steve Jobs"), 2000));
        auction.offer(new AuctionBid(new User("Steve Wozniak"), 3000));

        Assert.assertEquals(2, auction.getAuctionBids().size());
        Assert.assertEquals(2000, auction.getAuctionBids().get(0).getValue(), 0.00001);
        Assert.assertEquals(3000, auction.getAuctionBids().get(1).getValue(), 0.00001);

    }

    @Test
    public void shouldNotReceiveTwoConsecutiveAuctionBidsFromTheSameUser(){
        Auction auction = new Auction("Macbook Pro 15");

        User steveJobs = new User("Steve Jobs");

        auction.offer(new AuctionBid(steveJobs, 2000));
        auction.offer(new AuctionBid(steveJobs, 3000));

        Assert.assertEquals(1, auction.getAuctionBids().size());
        Assert.assertEquals(2000.0, auction.getAuctionBids().get(0).getValue(), 0.00001);
    }

    @Test
    public void shouldNotReceiveMoreThan5AuctionBidsFromTheSameUser(){
        Auction auction = new Auction("MacBook Pro 15");
        User steveJobs = new User("Steve Jobs");
        User billGates = new User("Bill Gates");

        auction.offer(new AuctionBid(steveJobs, 2000));
        auction.offer(new AuctionBid(billGates, 3000));

        auction.offer(new AuctionBid(steveJobs, 4000));
        auction.offer(new AuctionBid(billGates, 5000));

        auction.offer(new AuctionBid(steveJobs, 6000));
        auction.offer(new AuctionBid(billGates, 7000));

        auction.offer(new AuctionBid(steveJobs, 8000));
        auction.offer(new AuctionBid(billGates, 9000));

        auction.offer(new AuctionBid(steveJobs, 10000));
        auction.offer(new AuctionBid(billGates, 11000));

        auction.offer(new AuctionBid(steveJobs, 12000));

        Assert.assertEquals(10, auction.getAuctionBids().size());
        Assert.assertEquals(11000.0, auction.getAuctionBids().get(auction.getAuctionBids().size() - 1).getValue(), 0.00001);
    }

/*    @Test
    public void shouldDoubleTheLastAuctionBid(){

        Auction auction = new Auction("MacBook Pro 15");
        User steveJobs = new User("Steve Jobs");
        User billGates = new User("Bill Gates");

        auction.offer(new AuctionBid(steveJobs, 2000));
        auction.offer(new AuctionBid(billGates, 3000));

        Assert.assertEquals(6000, auction.getAuctionBids().get(2).getValue(), 0.00001);
        
    }*/
}
