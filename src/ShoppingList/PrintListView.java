package ShoppingList;

public class PrintListView {

    private PrintListService printListService;
    PrintListView(PrintListService printListService){
        this.printListService = printListService;
    }

    public void execute(){
        System.out.println();
        System.out.println("Shopping listcontains following items:");

        for(Product product: printListService.getItemList()){
            System.out.println(product.getName() + " [" + product.getDescription() + "]");
        }

        System.out.println();
    }

}