package ShoppingList;
import java.util.*;

public class InMemoryDB implements Database{

    private List<Product> itemList = new ArrayList<>();

    public void addItem(Product product){
        itemList.add(product);
    }
    public boolean deleteItem(Product product){
        return itemList.remove(product);
    }
    public Optional<Product> findItemByName(String name){
        for(Product product : itemList) {
            if (product.getName().equals(name)) {
                return Optional.of(product);
            }
        }
        return Optional.empty();
    }

    public List<Product> printList(){
         return new ArrayList<Product>(itemList);
    }

}
