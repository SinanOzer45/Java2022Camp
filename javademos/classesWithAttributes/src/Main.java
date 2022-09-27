public class Main {

    public static void main(String[] args) {
        Product product = new Product(1,"Laptop","Asus Lpatop",5000,3,"Siyah");
        /*Product product = new Product(); */ //İstersek yukardaki gibi ya da bu gibi kullanabiliriz.
        product.setName("Laptop");
        product.setDescription("Asus Laptop");
        product.setId(1);
        product.setPrice(5000);
        product.setStockAmount(3);


        ProductManager productManager = new ProductManager();
        productManager.Add(product);
        System.out.println(product.getKod());
    }
}
