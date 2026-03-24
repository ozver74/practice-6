public class Lot {
    private int lotNumber;
    private String description;
    private Bid highestBid;

    public Lot(int number, String desc) {
        lotNumber = number;
        description = desc;
    }

    public boolean bidFor(Bid bid) {
        if (highestBid == null || bid.getValue() > highestBid.getValue()) {
            highestBid = bid;
            return true;
        }
        return false;
    }

    public Bid getHighestBid() {
        return highestBid;
    }

    public int getNumber() {
        return lotNumber;
    }

    public String getDescription() {
        return description;
    }
}
