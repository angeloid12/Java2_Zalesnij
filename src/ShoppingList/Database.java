package ShoppingList;
import java.util.*;

public interface Database {

    void addItem(Product product);
    boolean deleteItem(Product product);
    Optional<Product> findItemByName(String name);
    List<Product> printList();


}
