package step1;

import ex.Student;

// 접근제어자, 캡슐화
public class Solution02 {
    public static void main(String[] args) {
        Car car = new Car(); // 같은 java 파일, 같은 경로(패키지)
        // Java가 클래스 기반임
        // 다른 클래스에서 다른 클래스를 아무런 제약 없이 변수를 수정하는게 맞나?
        // car.color // private를 걸면 '모르는 상태'
        car.name = "타요";
        Student student = new Student(); // 다른 패키지
//        student.name; // 아무것도 안한다는 것 -> 패키지 경로가 다르면 인식 안하겠다
    }
}

class Car { // Public이 아님
    private String color;
    // private, public, (default), protected
    // 외부의 접근 허한다 : public
    // 외부의 접근을 막는다 : private
    String name;
}
