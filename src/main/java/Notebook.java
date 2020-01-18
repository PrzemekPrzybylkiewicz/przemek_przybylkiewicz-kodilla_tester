public class Notebook {
    String weight;
    int price;

    public Notebook(String weight, int price) {
        this.weight = weight;
        this.price = price;


    }

    public void checkprice() {
        if (this.price < 600) {
            System.out.println("this is a cheap");
        }else if((this.price >= 600) && (this.price <= 1000)) {
            System.out.println("The price is good");
        }else{
            System.out.println("This notebook is expensive");
        }
    }
}
