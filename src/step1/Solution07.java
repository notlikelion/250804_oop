package step1;

public class Solution07 {
    public static void main(String[] args) {
        // final -> 변수를 상수화 -> 재할당 금지
        final String name;
        name = "OK"; // 대입 1회만 가능.
//        name = "NO"; // 바꿀 수 없음.
//        const : javascript -> 초기화까지 해줘야하는 친구
        // 불변성 (final, const, immutable...?)
        // 바뀌지 않게 안전하게 코딩하고 싶을 때 'final'을 붙인다
        // final private을 모두 붙여버리면 -> 이 데이터는 이 객체가 아예 대체되지 않은 한. 고정적이다.
        Sheep s = new Sheep();

        if (s instanceof Sheep) {
            System.out.println("양입니다");
        }

        Animal a = new Tiger(); // 부모/상위 타입에다가 상속 받은 타입을 넣어서...
        Animal b = new Lion();
        System.out.println(a);
        System.out.println(b);
        hello(a);
        hello(b);
    }

    static void hello(Animal ani) {
        System.out.println("동물!");
        if (ani instanceof Tiger) {
            System.out.println("호랑이!");
        }
        if (ani instanceof Lion) {
            System.out.println("사자!");
        }
    }

    static class Animal {

    }

    static class Tiger extends Animal {

    }

    static class Lion extends Animal {

    }
}



class Sheep {

}

class Teacher {
    // final로 고정시켜버리면, 메모리 좀 덜 먹음. 변동될 여지가 없어서. 이후에 변경이 안될 거니까...

    // 중간에 -> main -> ...
    // View -> Controller -> Service -> Persistence -> DB -> ... 역방향
    // 단계가 3~5단계. 이 중간에 누가 개발을 이상하게 해서 오염시켜버리면?

    // 두 객체가 '다르다'라고 하려면...
    // 1. 주소값이 다르면 다른가요? (메모리에 저장된 방식이 다르다)
    // 2. 들어가있는 멤버변수의 구성이 다르면 다른가요? (들어가 있는 변수값이 다르다)
    // -> 2번에 성립하지 않게 모두 final화 시켜버림.
    private final String name;

    Teacher(String name) {
        this.name = name; // 생성자에서 의무적으로 만들고...
        // setter가 필요할까요?
    }

    String getName() {
        return name;
    }

//    void setName(String name) {
//        this.name = name;
//    }
}
