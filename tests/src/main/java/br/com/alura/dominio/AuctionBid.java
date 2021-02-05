package br.com.alura.dominio;

public class AuctionBid {

    private User user;
    private double value;

    public AuctionBid(User user, double value){
        this.user = user;
        this.value = value;
    }

    public double getValue() {
        return value;
    }

    public User getUser() {
        return user;
    }
}
