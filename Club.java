import java.util.ArrayList;
import java.util.Iterator;

public class Club {
    private ArrayList<Membership> members;

    public Club() {
        members = new ArrayList<>();
    }

    public int numberOfMembers() {
        return members.size();
    }

    public void join(Membership member) {
        members.add(member);
    }

    public int joinedInMonth(int month) {
        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
            return 0;
        }

        int count = 0;
        for (Membership m : members) {
            if (m.getMonth() == month) {
                count++;
            }
        }
        return count;
    }

    public ArrayList<Membership> purge(int month, int year) {
        ArrayList<Membership> removed = new ArrayList<>();

        if (month < 1 || month > 12) {
            System.out.println("Invalid month");
            return removed;
        }

        Iterator<Membership> it = members.iterator();

        while (it.hasNext()) {
            Membership m = it.next();
            if (m.getMonth() == month && m.getYear() == year) {
                removed.add(m);
                it.remove();
            }
        }

        return removed;
    }
}
