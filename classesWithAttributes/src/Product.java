public class Product {

    public Product(int id, String name, String desciription, double price, int stockAmount, String renk){
        System.out.println("Yapıcı method çalıştı.");
        this.id=id;
        this.name=name;
        this.stockAmunt=stockAmount;
        this.price=price;
        this.description=desciription;
        this.kod=kod;
        this.renk=renk;

    }

    public Product(){

    }


    private int id;
    private String name;
    private String description;
    private double price;
    private int stockAmunt;
    private String renk;
    private String kod;

    public int getId(){
        return id;
    }

    public void setId(int id){
        id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getStockAmunt() {
        return stockAmunt;
    }

    public void setStockAmunt(int stockAmunt) {
        this.stockAmunt = stockAmunt;
    }

    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public String getKod() {
        return kod;
    }

    public void setKod(String kod) {
        this.kod = kod;
    }
}
