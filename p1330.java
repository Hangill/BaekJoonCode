import java.util.Scanner;

public class p1330 {
    
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int data1 = input.nextInt();
        int data2 = input.nextInt();

        data1 = data1-data2;

        if(data1> 0){
            System.out.print(">");
        }
        else if(data1<0){
            System.out.print("<");
        }
        else{
            System.out.print("==");
        }
        input.close();

    }

}
