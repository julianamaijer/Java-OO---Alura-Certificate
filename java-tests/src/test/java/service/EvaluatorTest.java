package service;

import alura.builder.AuctionCreator;
import alura.domain.Auction;
import alura.domain.AuctionBid;
import alura.domain.User;
import alura.service.Evaluator;
import org.junit.*;

import java.util.List;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.hasItems;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

public class EvaluatorTest {

    private Evaluator evaluator;
    private User joao;
    private User jose;
    private User maria;

    @Before
    public void createEvaluator(){
        this.evaluator = new Evaluator();
        this.joao = new User("João");
        this.jose = new User("José");
        this.maria = new User("Maria");
    }

    //utilizado para testes de integração:
    @After
    public void finaliza() {
        System.out.println("fim");
    }

    //executado uma vez antes de todos os testes
    @BeforeClass
    public static void testandoBeforeClass() {
        System.out.println("before class");
    }

    //executado uma vez depois de todos os testes
    @AfterClass
    public static void testandoAfterClass() {
        System.out.println("after class");
    }

    @Test(expected = RuntimeException.class)
    public void shouldNotEvaluteAuctionsWithNoAuctionBid(){
        Auction auction = new AuctionCreator().to("New Playstation 3").build();
        evaluator.evaluate(auction);
        Assert.fail();
    }

    @Test
    public void shouldUnderstandAuctionBidsInCrescentOrder() {

        Auction auction = new Auction("New Playstation 3");

        auction.offer(new AuctionBid(joao, 250.0));
        auction.offer(new AuctionBid(jose, 300.0));
        auction.offer(new AuctionBid(maria, 400.0));

        evaluator.evaluate(auction);

        double higherExpected = 400;
        double lowerExpected = 250;

        //delta: diferença do valor aceitável
        assertEquals(higherExpected, evaluator.getHigher(),  0.00001);
        //assertEquals(lowerExpected, evaluator.getLower(),  0.000010);
        assertThat(evaluator.getLower(), equalTo(250.0));
    }

    @Test
    public void shouldUnderstandAuctionBidsWithOnlyOneAuctionBid() {

        Auction auction = new Auction("New Playstation 3");

        auction.offer(new AuctionBid(joao, 1000.0));

        evaluator.evaluate(auction);

        //delta: diferença do valor aceitável
        assertEquals(1000, evaluator.getHigher(),  0.00001);
        assertEquals(1000, evaluator.getLower(),  0.00001);
    }

    @Test
    public void shouldCalculateAverage(){

        Auction auction = new Auction("New Playstation 3");

        auction.offer(new AuctionBid(joao, 200.0));
        auction.offer(new AuctionBid(jose, 300.0));
        auction.offer(new AuctionBid(maria, 400.0));

        evaluator.evaluate(auction);

        assertEquals(300, evaluator.getAverage(), 0.000010);
    }

    @Test
    public void shouldGetZeroForAverage(){

        Auction auction = new Auction("New Playstation 3");

        evaluator.evaluate(auction);

        assertEquals(0, evaluator.getAverage(), 0.000010);
    }

    @Test
    public void shouldFindThreeHighestUsers(){

        //boa prática:
        Auction auction = new AuctionCreator().to("New Playstation 3")
                .auctionBid(joao, 100.0)
                .auctionBid(maria, 200.0)
                .auctionBid(joao, 300.0)
                .auctionBid(maria, 400.0)
                .build();

        evaluator.evaluate(auction);

        List<AuctionBid> threeHighest = evaluator.getThreeHighest();
        assertEquals(3, threeHighest.size());
        assertEquals(400, threeHighest.get(0).getValue(), 0.000010);
        assertEquals(300, threeHighest.get(1).getValue(), 0.000010);
        assertEquals(200, threeHighest.get(2).getValue(), 0.00001);

    }

    @Test
    public void shouldFindThreeHighestUsersInListOfFive(){
        Auction auction = new AuctionCreator().to("New Playstation 3")
                .auctionBid(joao, 100.0)
                .auctionBid(maria, 200.0)
                .auctionBid(joao, 300.0)
                .auctionBid(maria, 400.0)
                .auctionBid(joao, 350.0)
                .build();

        evaluator.evaluate(auction);

        List<AuctionBid> threeHighest = evaluator.getThreeHighest();
        assertEquals(3, threeHighest.size());

        //Hamcrest:
        assertThat(threeHighest, hasItems(
                new AuctionBid(maria, 400),
                new AuctionBid(joao, 350),
                new AuctionBid(joao, 300)
        ));
/*        assertEquals(400, threeHighest.get(0).getValue(), 0.000010);
        assertEquals(350, threeHighest.get(1).getValue(), 0.000010);
        assertEquals(300, threeHighest.get(2).getValue(), 0.00001);*/

    }

    @Test
    public void shouldFindThreeHighestUsersInListOfTwo(){

        Auction auction = new Auction("New Playstation 3");

        auction.offer(new AuctionBid(joao, 300.0));
        auction.offer(new AuctionBid(maria, 400.0));

        evaluator.evaluate(auction);

        List<AuctionBid> threeHighest = evaluator.getThreeHighest();
        assertEquals(2, threeHighest.size());
        assertEquals(400, threeHighest.get(0).getValue(), 0.000010);
        assertEquals(300, threeHighest.get(1).getValue(), 0.000010);
    }

    @Test
    public void emptyList(){

        Auction auction = new Auction("New Playstation 3");

        evaluator.evaluate(auction);

        List<AuctionBid> threeHighest = evaluator.getThreeHighest();

        assertEquals(0, threeHighest.size());
    }

    @Test
    public void shouldUnderstandAuctionBidsWithRandomNumbers(){

        Auction auction = new Auction("New Playstation 3");

        auction.offer(new AuctionBid(joao, 200.0));
        auction.offer(new AuctionBid(maria, 450.0));
        auction.offer(new AuctionBid(jose, 120.0));
        auction.offer(new AuctionBid(maria, 700.0));
        auction.offer(new AuctionBid(jose, 630.0));
        auction.offer(new AuctionBid(maria, 230.0));

        evaluator.evaluate(auction);

        assertEquals(120, evaluator.getLower(), 0.00001);
        assertEquals(700, evaluator.getHigher(), 0.00001);

    }

    @Test
    public void shouldUnderstandAuctionBidsInAscendingOrder() {

        Auction auction = new Auction("New Playstation 3");

        auction.offer(new AuctionBid(joao, 400.0));
        auction.offer(new AuctionBid(jose, 300.0));
        auction.offer(new AuctionBid(maria, 200.0));
        auction.offer(new AuctionBid(joao, 100.0));

        evaluator.evaluate(auction);

        //delta: diferença do valor aceitável
        assertEquals(400, evaluator.getHigher(),  0.00001);
        assertEquals(100, evaluator.getLower(),  0.000010);
    }
}
