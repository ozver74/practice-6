import java.util.ArrayList;

public class Auction {
    private ArrayList<Lot> lots;

    public Auction() {
        lots = new ArrayList<>();
    }

    public void enterLot(String description) {
        lots.add(new Lot(lots.size() + 1, description));
    }

    public void makeABid(int lotNumber, String bidder, int value) {
        Lot lot = getLot(lotNumber);
        if (lot != null) {
            lot.bidFor(new Bid(bidder, value)); // anonymous object ✅
        }
    }

    public Lot getLot(int number) {
        for (Lot lot : lots) {
            if (lot.getNumber() == number) {
                return lot;
            }
        }
        return null;
    }

    public void close() {
        for (Lot lot : lots) {
            Bid bid = lot.getHighestBid();

            if (bid != null) {
                System.out.println("Lot " + lot.getNumber() +
                        " sold to " + bid.getBidder() +
                        " for $" + bid.getValue());
            } else {
                System.out.println("Lot " + lot.getNumber() + " unsold");
            }
        }
    }

    public ArrayList<Lot> getUnsold() {
        ArrayList<Lot> unsold = new ArrayList<>();

        for (Lot lot : lots) {
            if (lot.getHighestBid() == null) {
                unsold.add(lot);
            }
        }

        return unsold;
    }

    public Lot removeLot(int number) {
        for (Lot lot : lots) {
            if (lot.getNumber() == number) {
                lots.remove(lot);
                return lot;
            }
        }
        return null;
    }
}
