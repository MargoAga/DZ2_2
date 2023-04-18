public class Main {
    public static void main(String[] args) {
       int x; //сумма на счете
        int y; //сумма пополнения
        int s; // сумма поссле пополнения
        int b; //бонус
        y=1500;
        x=50;
        if (y>=1000){
           b=y/100;
            s=x+y+b;
        }
        else {s=x+y;}
        System.out.println("ваш баланс после пополнения = " + s);
        }
    }
