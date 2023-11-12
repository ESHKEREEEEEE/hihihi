public class item {
    String name;
    int price;
    int discount;
    public item(String name, int price, int discount){
        this.name = name;
        this.discount = discount;
        this.price = price;
    }
    public item(String name){
        this.name = name;
    }
    public item(){
        this.name = "";
        this.discount = 0;
        this.price = 0;
    }
    public void print() {
        System.out.println("Name: " + name + ", Discount: " + discount + ", Price:" + price);
    }
    public String get_name() {
        return this.name;
    }
    public int get_price() {
        return this.price;
    }
    public int get_discount() {
        return this.discount;
    }
    public void set_name(String name) {
        this.name = name;
    }
    public void set_price(int price) {
        this.price = price;
    }
    public void set_discount(int discount) {
        this.discount = discount;
    }
}


