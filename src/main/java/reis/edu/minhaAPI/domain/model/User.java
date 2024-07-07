package reis.edu.minhaAPI.domain.model;

public class User {

    private String name;
    private Account account;
    private Card card;
    private News[] news;
    private Feature[] features;

    public User(String name, Account account) {
        this.name = name;
        this.account = account;
    }

    public String getName() {
        return name;
    }

    public Account getAccount() {
        return account;
    }

    public Card getCard() {
        return card;
    }

    public News[] getNews() {
        return news;
    }

    public Feature[] getFeatures() {
        return features;
    }
}
