public class FirstClass {
    public static void main(String[] args) {
        String helloFirst ="Hello from FirstClass!!";
        System.out.println(helloFirst);
        Notebook notebook = new Notebook("600g", 1000);
        Notebook heavyNetbook = new Notebook("2000g", 1500);
        Notebook oldNetebook = new Notebook("1600", 500);
        System.out.println(notebook.weight +" "+ notebook.price);
        notebook.checkprice();
        System.out.println(heavyNetbook.weight +" "+ heavyNetbook.price);
        heavyNetbook.checkprice();
        System.out.println(oldNetebook.weight + " " + oldNetebook.price);
        oldNetebook.checkprice();

    }
}