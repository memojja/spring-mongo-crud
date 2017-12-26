package mongodbsample.demo;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import lombok.Data;

@Data
@ToString
public class User {
    @Id
    private String id;
    private String name;
    private int age;
    private String email;
}
