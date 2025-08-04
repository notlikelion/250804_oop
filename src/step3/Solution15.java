package step3;

import java.util.Random;

// 메서드 종합편
public class Solution15 {
    public static void main(String[] args) {
        int value = chooseRandom(500);
        System.out.println("나온 값은 " + value + "입니다!");
        useVoid();
    }

    static void useVoid() {
        // return이 순수 강제종료.
        Random rd = new Random();
        while (true) {
            int result = rd.nextInt(1000);
            if (result >= 500) {
                System.out.println("500보다 크다!");
                return;
            }
            System.out.println("500보다 작음");
        }
    }

    // 타입을 줘버리면 return 강제.
    static int chooseRandom(int minimum) {
        Random rd = new Random();
        while (true) {
            int result = rd.nextInt(1000);
//            if (result < minimum) {
//                continue;
//            }
//            return result; // return 모든걸 무시하고... 뛰쳐나갑니다.
            if (result >= minimum) {
                return result;
            }
        }
    }

    // 메서드
    // 접근제어자 (static) 타입(void) 메서드명(패러미터-매개변수) (throws ...) {
    //     // ???????????????????????????
    //      // 중간에 강제 종료. return 반환.
    //     // 메서드는 그 자체로 값을 주는 역할. -> getter.
    //     // return이 되면 뒤를 바라볼 필요가? -> 일반적으로는.
    // }
}
