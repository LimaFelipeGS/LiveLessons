package quotes.common.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.relational.core.mapping.Table;

/**
 * This class stores a quote from various sources, e.g., Zippy,
 * Handey, etc.
 *
 * The {@code @Data} annotation generates all the boilerplate that is
 * normally associated with simple Plain Old Java Objects (POJOs) and
 * beans, including getters for all fields and setters for all
 * non-final fields.
 *
 * The {@code NoArgsConstructor} annotation will generate a
 * constructor with no parameters.
 */
@Entity
@Table(name = "QUOTE")
@Data
@NoArgsConstructor
public class Quote {
    /**
     * ID # of the quote (the primary key generated by the database).
     */
    @Id
    private Integer id;

    /**
     * The type of quote, e.g., Zippy = 1, Handey = 2, etc.
     */
    private Integer type;

    /**
     * A quote from some source, e.g., Zippy, Handey, etc.
     */
    private String quote;

    /**
     * The constructor initializes the fields.
     * @param quoteId ID # of the quote (the primary key)
     * @param type This is the type of quote, e.g., Zippy = 1,
     *             Handey = 2, etc.
     * @param quote A quote from some source, e.g.,
     *              Zippy, Handey, etc.
     */
    public Quote(int quoteId, int type, String quote) {
        this.id = quoteId;
        this.type = type;
        this.quote = quote;
    }
}
