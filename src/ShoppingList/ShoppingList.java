package ShoppingList;

import java.util.*;


public class ShoppingList {
    static List <String> shoppingList = new ArrayList();
    static int userNumber;

    public static void main(String[] args) {
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
                userNumber = getNumberFromUser();
            }

               switch (userNumber) {
                    case 1:
                        addItem();
                        break;
                    case 2:
                        removeItem();
                        break;
                    case 3:
                        printList();
                        break;
                    case 4:
                        System.out.println("Bye!");
                        break;
                    default:
                        System.out.println("Please, choose correct number from 1 to 4");
                }
        }
    }

    public static void addItem(){
        System.out.println("Please, type the item's name that you want to add:");
        String s = getStringFromUser();
        shoppingList.add(s);
        System.out.println("Item " + s + " is added");
    }

    public static void removeItem(){
        System.out.println("Please, type the item's name that you want to remove:");
        String s = getStringFromUser();
        if(shoppingList.contains(s)){
            shoppingList.remove(s);
            System.out.println("Item " + s + " is removed");
        } else {
            System.out.println("Item is not found");
        }
    }

    public static void printList(){
        if(shoppingList.isEmpty()){
            System.out.println("The list is empty\n");
        } else {
            System.out.println("The list contains following items:");
            for (String s : shoppingList) {
                System.out.println(s);
            }
            System.out.println();
        }
    }

    public static String getStringFromUser(){
        Scanner scanner = new Scanner(System.in);
        String userString = scanner.nextLine();
        return userString;
    }

    public static int getNumberFromUser(){
        Scanner scanner = new Scanner(System.in);
        int userNumber;
        userNumber = scanner.nextInt();
        return userNumber;
    }
}
