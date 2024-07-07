package reis.edu.minhaAPI.domain.model;

public class Card {

    private String nunber;
    private Number limit;

    public Card() {
    }

    public String getNunber() {
        return nunber;
    }

    public void setNunber(String nunber) {
        this.nunber = nunber;
    }

    public Number getLimit() {
        return limit;
    }

    public void setLimit(Number limit) {
        this.limit = limit;
    }
}
