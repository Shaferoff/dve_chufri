import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader=new Scanner (System.in);
        int num, dig1, dig2;
        dig1 = reader.nextInt();
        dig2 = reader.nextInt();
        if (dig1>dig2){
            num = dig1*10+dig2;
            System.out.println(num);
        }
        else {
            num = dig2*10+dig1;
            System.out.println(num);
        }
    }
}