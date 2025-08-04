package step2;

// 상속
public class Solution08 {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("자바", 33);
        p1.work();
        Programmer p2 = new JavaProgrammer(44);
        p2.work(); // Programmer
    }
}

// extends
class JavaProgrammer extends Programmer {
    JavaProgrammer(int age) { // 매개변수를 전달 받아서...
        // Programmer - JavaProgrammer => 상속
        // (부모클래스)    (자식클래스)
        // (상위클래스)    (하위클래스)
        // super         this
        super("자바", age); // super() 생성자 -> Programmer 생성자
    }
}

class Programmer {
    String language;
    int age;

    void work() {
        System.out.println("일합니다");
    }

    Programmer(String language, int age) {
        this.language = language; // 생성자 - 매개변수로 전달받은 것과, 멤버변수(인스터변수)를 구분
        this.age = age;
    }
}
