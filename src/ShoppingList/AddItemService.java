package ShoppingList;

public class AddItemService {

    Database database;
    public AddItemService(Database database){
        this.database = database;
    }

    public void add(String name, String description){
        Product product = new Product();
        product.setName(name);
        product.setDescription(description);

        database.addItem(product);
    }

}
