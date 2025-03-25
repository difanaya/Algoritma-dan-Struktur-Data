package minggu4kuis;
class MenuCafeDipsy {
    String nama;
    double harga;
    String jenisMenu;
    
    public MenuCafeDipsy(String nama, double harga, String jenisMenu) {
        this.nama = nama;
        this.harga = harga;
        this.jenisMenu = jenisMenu;
    }
    
    public void display() {
        System.out.println(nama + " (" + jenisMenu + ") " + ", Rp. " + harga);
    }
    
    public double totalHarga() {
        return harga;
    }
}

class Order {
    int orderId;
    MenuCafeDipsy[] itemList;
    int jumlahPesanan;
    double orderTotal;
    
    public Order(int orderId) {
        this.orderId = orderId;
        this.itemList = new MenuCafeDipsy[20]; 
        this.jumlahPesanan = 0;
        this.orderTotal = 0;
    }
    
    public void addItem(MenuCafeDipsy item) {
        if (jumlahPesanan < itemList.length) {
            itemList[jumlahPesanan++] = item;
            orderTotal += item.totalHarga();
        } else {
            System.out.println("Order penuh, tidak bisa menambahkan item.");
        }
    }
    
    public void displayOrder() {
        System.out.println("\n================================");
        System.out.println("Order ID: " + orderId);
        System.out.println("--------------------------------");
        for (int i = 0; i < jumlahPesanan; i++) {
            System.out.printf("%-20s Rp %,.2f\n", itemList[i].nama, itemList[i].harga);
        }
        System.out.println("---------------------------------");
        System.out.printf("Total Pemesanan: Rp %,.2f\n", orderTotal);
        System.out.println("=================================");
        System.out.println("         Terima Kasih! ");
        System.out.println("=================================\n");
    }
}

class Cafe {
    String nama;
    String location;
    MenuCafeDipsy[] listMenu;
    int totalMenu;
    
    public Cafe(String nama, String location) {
        this.nama = nama;
        this.location = location;
        this.listMenu = new MenuCafeDipsy[20];
        this.totalMenu = 0;
    }
    
    public void addMenuCafeDipsy(MenuCafeDipsy item) {
        if (totalMenu < listMenu.length) {
            listMenu[totalMenu++] = item;
        } else {
            System.out.println("Menu penuh, tidak bisa menambahkan item.");
        }
    }
    
    public void displayMenu() {
        System.out.println("\n==============================");
        System.out.println("  Selamat Datang di Cafe Dipsy");
        System.out.println("        Malang, Indonesia");
        System.out.println("==============================");
        System.out.println("List Menu: ");
        System.out.println();
        for (int i = 0; i < totalMenu; i++) {
            listMenu[i].display();
        }
    }
}