package alura.domain;

import java.util.Objects;

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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AuctionBid that = (AuctionBid) o;
        return Double.compare(that.value, value) == 0 &&
                Objects.equals(user, that.user);
    }

    @Override
    public int hashCode() {
        return Objects.hash(user, value);
    }
}
