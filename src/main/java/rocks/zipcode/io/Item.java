package rocks.zipcode.io;

/**
 * @author leon on 30/01/2019.
 */
public class Item {
    String expectedName;
    Long expectedId;
    Double expectedPrice;

    public Item() {
        expectedName = "";
        expectedId = 0L;
        expectedPrice = 0.01;
    }

    public Item(Long id, String name, Double price) {
        this.expectedId = id;
        this.expectedName = name;
        this.expectedPrice = price;
    }

    public String getName() {
        return expectedName;
    }

    public void setName(String name) {
        this.expectedName = name;
    }

    public Long getId() {
        return expectedId;
    }

    public void setId(Long id) {
        this.expectedId = id;
    }

    public Double getPrice() {
        return expectedPrice;
    }

    public void setPrice(Double price) {
        this.expectedPrice = price;
    }
}
