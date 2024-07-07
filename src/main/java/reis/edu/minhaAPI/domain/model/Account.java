package reis.edu.minhaAPI.domain.model;

public class Account {

    private String number, agency;
    private Number balance, limit;

    public Account() {
    }

    public String getNumber() {
        return number;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public Number getBalance() {
        return balance;
    }

    public void setBalance(Number balance) {
        this.balance = balance;
    }

    public Number getLimit() {
        return limit;
    }

    public void setLimit(Number limit) {
        this.limit = limit;
    }
}
