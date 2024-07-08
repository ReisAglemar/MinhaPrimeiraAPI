package reis.edu.minhaAPI.domain.model;

import jakarta.persistence.*;

import java.math.BigDecimal;

@Entity(name = "tb_cards")
public class Card {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "card_number", unique = true)
    private String nunber;


    @Column(name = "card_limit", scale = 2, precision = 13)
    private BigDecimal limit;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNunber() {
        return nunber;
    }

    public void setNunber(String nunber) {
        this.nunber = nunber;
    }

    public BigDecimal getLimit() {
        return limit;
    }

    public void setLimit(BigDecimal limit) {
        this.limit = limit;
    }
}
