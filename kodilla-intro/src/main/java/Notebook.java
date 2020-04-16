public class Notebook {
    int weight;
    int price;
    int year;

    public Notebook(int weight, int price, int year) {
        this.weight = weight;
        this.price = price;
        this.year = year;

    }

    public void checkprice() {
        if (this.price <= 600) {
            System.out.println("this is a cheap");
        } else if ((this.price >= 600) && (this.price <= 1000)) {
            System.out.println("The price is good");
        } else {
            System.out.println("This notebook is expensive");
        }
    }

    public void checkWeight() {
        if (this.weight <= 600) {
            System.out.println("this computer is lightweight");
        } else if ((this.weight >= 600) && (this.weight <= 1600)) {
            System.out.println("this computer is heavy");
        } else if (this.weight >= 2000) {
            System.out.println("this computer is super heavy");
        }
    }

    public void checkyear() {
        if (this.year >= 2020) {
            System.out.println("good year man");
        } else if ((this.year <= 2000) && (this.year >= 2010)) {
            System.out.println("this year, your choice");
        } else {
            System.out.println("it's too old");
        }
    }

    public void checkBestComp() {
        if ((this.price <= 1000) && (this.weight <= 1000) && (this.year >= 2015)) {
            System.out.println("that's it, buy it");
        } else if ((this.price <= 2000) && (this.weight <= 2000) && (this.year >= 2010)) {
            System.out.println("it may be useful");
        } else {
            System.out.println("don't buy this crap");
        }
    }

    public void breakLine() {
        System.out.println("");
    }
}

