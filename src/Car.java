import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Car {
    private String Model;
    private String Brand;
    private int Year;
    private float Price;
    private String Color;
    private int Quantity;
}