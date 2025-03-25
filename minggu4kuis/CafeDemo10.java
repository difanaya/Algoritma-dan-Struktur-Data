package minggu4kuis;
public class CafeDemo10 {
    public static void main(String[] args) {
        Cafe cafe = new Cafe("Cafe Dipsy", "Malang");
        
        MenuCafeDipsy item1 = new MenuCafeDipsy("Kopi Susu Gula Aren", 20000, "Coffee");
        MenuCafeDipsy item2 = new MenuCafeDipsy("Matcha Latte", 25000, "Milk Based");
        MenuCafeDipsy item3 = new MenuCafeDipsy("Cheese Cake", 30000, "Dessert");
        
        cafe.addMenuCafeDipsy(item1);
        cafe.addMenuCafeDipsy(item2);
        cafe.addMenuCafeDipsy(item3);
        
        cafe.displayMenu();
        
        Order order = new Order(1);
        order.addItem(item1);
        order.addItem(item3);
        
        order.displayOrder();
    }
}
