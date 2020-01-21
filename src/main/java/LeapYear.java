public class LeapYear {
    boolean x=true;
    int year;

    public LeapYear (int year){
        this.year = year;
    }
    public boolean checkLeapYear() {
        int y= this.year % 4;
        if (y == 0){
            y= this.year % 100;
            if (y!=0){
                 y = this.year % 400;
                 if(y == 0){
                     x=true;
                 }
             }else {
                 x=false;
             }
         }else {
             x =false;
         }
        if(x){
        System.out.println(this.year+ " " +" to rok przestępny");
        } else{
            System.out.println(this.year+ " " +"Rok jest nie przestępny");
        }
    return x;
        }
    }

