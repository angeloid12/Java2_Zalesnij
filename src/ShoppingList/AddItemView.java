package ShoppingList;
import java.util.*;

public class AddItemView {

    private AddItemService addItemService;
    public AddItemView(AddItemService addItemService){
        this.addItemService = addItemService;
    }

    public void execute(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, type the item's name that you want to add:");
        String name = scanner.nextLine();
        System.out.println("Please, type the item's description:");
        String description = scanner.nextLine();

        addItemService.add(name, description);

        System.out.println("Item " + name + " is added");
        System.out.println();
    }


}
