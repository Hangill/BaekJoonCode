import java.util.Scanner;

public class Main {
    //백준 문제 제출시 Main이라는 클래스여야지 컴파일 에러가 발생하지 않는다.

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int data =input.nextInt();

        if(data>=90){
            System.out.print('A');
        }
        else if(data>=80){
            System.out.print('B');
        }
        else if(data>=70){
            System.out.print('C');
        }
        else if(data>=60){
            System.out.print('D');
        }
        else{
            System.out.print('F');
        }
        
        input.close();
    }
}
