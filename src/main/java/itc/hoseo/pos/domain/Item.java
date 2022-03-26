package itc.hoseo.pos.domain;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Item {
    private Integer id;
    private String name;
    private Integer price;
    private Integer stockQuantity;

    public void addStock(int stock){
        stockQuantity+=stock;
    }
    public void removeStock(int stock){
        stockQuantity-=stock;
    }

}
