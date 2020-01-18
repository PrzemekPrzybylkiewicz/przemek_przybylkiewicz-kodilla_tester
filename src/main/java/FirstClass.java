public class FirstClass {
    public static void main(String[] args) {
        String hello ="Welcome in the Cyberstore traveler";
        System.out.println(hello);
        Notebook notebook = new Notebook(600, 1000, 2020);
        Notebook heavyNetbook = new Notebook(2000, 1500, 2010);
        Notebook oldNetebook = new Notebook(1600, 500 , 2000);
        System.out.println(notebook.weight+"g" +" "+ notebook.price+"zl" +" "+notebook.year+"r.");
        notebook.checkprice();
        notebook.checkWeight();
        notebook.checkBestComp();
        System.out.println(heavyNetbook.weight +"g" +" "+ heavyNetbook.price+"zl"+" "+heavyNetbook.year+"r.");
        heavyNetbook.checkprice();
        heavyNetbook.checkWeight();
        heavyNetbook.checkBestComp();
        System.out.println(oldNetebook.weight+"g" + " " + oldNetebook.price+"zl" +" "+oldNetebook.year+"r.");
        oldNetebook.checkprice();
        oldNetebook.checkWeight();
        oldNetebook.checkBestComp();


    }
}