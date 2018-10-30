package ShoppingList;
import java.util.*;

public class RemoveItemView {
    private RemoveItemService removeItemService;
    public RemoveItemView(RemoveItemService removeItemService){
        this.removeItemService = removeItemService;
    }

    public void execute(){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, type the item's name that you want to remove:");
        String name = scanner.nextLine();

        boolean tryToRemove = removeItemService.remove(name);

        if(tryToRemove){
            System.out.println("Item " + name + " is removed!");
        } else {
            System.out.println("Item is not found!");
        }
    }
}

