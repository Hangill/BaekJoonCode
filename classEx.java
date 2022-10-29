class A {
	public A(int x){
		System.out.println("매개변수 생성자 A");
	}
}

class B extends A {
	public B(){
        super(10);
		System.out.println("생성자 B"); // 슈퍼 클래스의 기본 생성자 B()에 대한 짝 A()가 없어 오류
	}
	public B(int x){
        super(10);
		System.out.println("매개변수 생성자B"); //생성자 A , 매개변수 생성자 B 실행된다.
	}
}


public class classEx{
    public static void main(String[] args){
		B b;
		b = new B();
	}
}
