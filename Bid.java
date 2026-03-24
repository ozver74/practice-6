public class Bid {
    private String bidder;
    private int value;

    public Bid(String bidder, int value) {
        this.bidder = bidder;
        this.value = value;
    }

    public String getBidder() {
        return bidder;
    }

    public int getValue() {
        return value;
    }
}
