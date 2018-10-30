package ShoppingList;

import java.util.Optional;

public class RemoveItemService {
    private Database database;
    public RemoveItemService(Database database){
        this.database = database;
    }

    public boolean remove(String name){
        Optional<Product> foundProduct = database.findItemByName(name);
        if(foundProduct.isPresent()){
            Product product = foundProduct.get();
            return database.deleteItem(product);
        }
        return false;
    }
}
