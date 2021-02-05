import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;

import alura.AuctionBidFilter;
import alura.domain.AuctionBid;
import alura.domain.User;
import org.junit.Test;

public class AuctionBidFilterTest {

    @Test
    public void shouldSelectBetween1000And3000() {
        User joao = new User("Joao");

        AuctionBidFilter auctionBidFilter = new AuctionBidFilter();
        List<AuctionBid> result = auctionBidFilter.filter(Arrays.asList(
                new AuctionBid(joao,2000),
                new AuctionBid(joao,1000),
                new AuctionBid(joao,3000),
                new AuctionBid(joao, 800)));

        assertEquals(1, result.size());
        assertEquals(2000, result.get(0).getValue(), 0.00001);
    }

    @Test
    public void shouldSelectAuctionBidsBetween500And700() {
        User joao = new User("Joao");

        AuctionBidFilter auctionBidFilter = new AuctionBidFilter();
        List<AuctionBid> resultado = auctionBidFilter.filter(Arrays.asList(
                new AuctionBid(joao,600),
                new AuctionBid(joao,500),
                new AuctionBid(joao,700),
                new AuctionBid(joao, 800)));

        assertEquals(1, resultado.size());
        assertEquals(600, resultado.get(0).getValue(), 0.00001);
    }

    @Test
    public void shouldSelectMoreThan5000(){
        User joao = new User("Joao");

        AuctionBidFilter auctionBidFilter = new AuctionBidFilter();
        List<AuctionBid> resultado = auctionBidFilter.filter(Arrays.asList(
                new AuctionBid(joao,500),
                new AuctionBid(joao,5300),
                new AuctionBid(joao, 800)));

        assertEquals(1, resultado.size());
        assertEquals(5300, resultado.get(0).getValue(), 0.00001);
    }

    @Test
    public void deveEliminarMenoresQue500() {
        User joao = new User("Joao");

        AuctionBidFilter auctionBidFilter = new AuctionBidFilter();
        List<AuctionBid> result = auctionBidFilter.filter(Arrays.asList(
                new AuctionBid(joao,400),
                new AuctionBid(joao, 300)));

        assertEquals(0, result.size());
    }

    @Test
    public void deveEliminarEntre700E1000() {
        User joao = new User("Joao");

        AuctionBidFilter auctionBidFilter = new AuctionBidFilter();
        List<AuctionBid> result = auctionBidFilter.filter(Arrays.asList(
                new AuctionBid(joao, 800),
                new AuctionBid(joao, 1000),
                new AuctionBid(joao, 700),
                new AuctionBid(joao, 900)));

        assertEquals(0, result.size());
    }

    @Test
    public void deveEliminarEntre3000E5000() {
        User joao = new User("Joao");

        AuctionBidFilter auctionBidFilter = new AuctionBidFilter();
        List<AuctionBid> result = auctionBidFilter.filter(Arrays.asList(
                new AuctionBid(joao,4000),
                new AuctionBid(joao, 3500)));

        assertEquals(0, result.size());
    }   
}