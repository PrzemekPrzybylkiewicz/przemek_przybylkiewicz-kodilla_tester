import java.util.Scanner;

public class FirstClass {
    public static void main(String[] args) {


        Scanner sc =new Scanner(System.in);
        int rok = sc.nextInt();

        LeapYear leapYear = new LeapYear(rok);
        System.out.println(leapYear.checkLeapYear());


       /*
        String hello ="Welcome in the Cyberstore traveler";
        System.out.println(hello);

        Notebook noteBook = new Notebook(600, 1000, 2020, "500");
        Notebook heavyNotebook = new Notebook(2000, 1500, 2010,"");
        Notebook oldNotebook = new Notebook(1600, 500 , 2000,"");


            noteBook.breakLine();// metoda \n
        System.out.println(noteBook.weight+"g" +" "+ noteBook.price+"zl" +" "+noteBook.year+"r.");
        noteBook.checkprice();
        noteBook.checkWeight();
        noteBook.checkyear();
        noteBook.checkBestComp();


        noteBook.breakLine();
        System.out.println(heavyNotebook.weight +"g" +" "+ heavyNotebook.price+"zl"+" "+heavyNotebook.year+"r.");
        heavyNotebook.checkprice();
        heavyNotebook.checkWeight();
        heavyNotebook.checkyear();
        heavyNotebook.checkBestComp();

            noteBook.breakLine();
        System.out.println(oldNotebook.weight+"g" + " " + oldNotebook.price+"zl" +" "+oldNotebook.year+"r.");
        oldNotebook.checkprice();
        oldNotebook.checkWeight();
        oldNotebook.checkyear();
        oldNotebook.checkBestComp();*/
    }
}