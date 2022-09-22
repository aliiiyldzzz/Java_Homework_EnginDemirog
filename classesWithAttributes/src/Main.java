public class Main {

    public static void main(String[] args) {
	Product product =new Product(1,"Laptop","Asus laptop", 3000,2,"siyah");
    Product product1 = new Product();
    product1.setName("Lenovo");
    product1.setStockAmunt(1);
    product1.setPrice(5006);
    product1.setDescription("V15");
    product1.setId(2);


    ProductManager productManager = new ProductManager();
    productManager.Add(product);
    System.out.println(product.getKod());


    }
}
