package ShoppingList;

import java.util.List;

public class PrintListService {

    private Database database;
    public PrintListService(Database database) {
        this.database = database;
    }

    public List<Product> getItemList(){
        return database.printList();
    }
}
