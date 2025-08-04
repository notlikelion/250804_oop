package step2;

// 상속
public class Solution08 {
    public static void main(String[] args) {
        Programmer p1 = new Programmer("자바", 33);
        p1.work();
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
