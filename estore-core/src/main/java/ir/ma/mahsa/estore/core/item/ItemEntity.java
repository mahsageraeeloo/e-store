package ir.ma.mahsa.estore.core.item;

import ir.ma.mahsa.estore.core.item.Colour;
import lombok.Data;

import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinTable;
import javax.persistence.Table;
import java.util.Set;

/**
 * @author Amir
 */
@Entity
@Table(name = "es_item")
@Data
public class ItemEntity {
    @Id
    @GeneratedValue
    private Long itemId;
    private String name;
    @ElementCollection
    @JoinTable(name = "es_item_available_colours")
    @Enumerated(EnumType.STRING)
    private Set<Colour> availableColours;
    private Long price;
}
