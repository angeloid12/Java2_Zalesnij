package ShoppingList;

import java.util.*;


public class ShoppingList {

    static List <Product> shoppingList = new ArrayList();
    static int userNumber;

    public static void main(String[] args) {

        Database database = new InMemoryDB();

        AddItemService addItemService = new AddItemService(database);
        RemoveItemService removeItemService = new RemoveItemService(database);
        PrintListService printListService = new PrintListService(database);

        AddItemView addItemView = new AddItemView(addItemService);
        RemoveItemView removeItemView = new RemoveItemView(removeItemService);
        PrintListView printListView = new PrintListView(printListService);

        System.out.println("Welcome to the shopping list!" );
        while(userNumber != 4) {
            System.out.println("Please, press key 1-4 to choose the action!");
            System.out.println("1: Add item");
            System.out.println("2: Remove item");
            System.out.println("3: Print item list");
            System.out.println("4: End the program");

            try{
             userNumber = getNumberFromUser();
            } catch (Exception ex){
                System.out.println("Please, choose correct number from 1 to 4");
                continue;
            }

               switch (userNumber) {
                    case 1:
                        addItemView.execute();
                        break;
                    case 2:
                        removeItemView.execute();
                        break;
                    case 3:
                        printListView.execute();
                        break;
                    case 4:
                        System.out.println("Bye!");
                        break;
                    default:
                        System.out.println("Please, choose correct number from 1 to 4");
                }
        }
    }

    public static int getNumberFromUser(){
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        userNumber = scanner.nextInt();
        return userNumber;
    }
}
