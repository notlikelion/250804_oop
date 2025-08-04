package step3;

import java.util.Random;

// throw, catch, finally
public class Solution14 {
    public static void main(String[] args) {
        try {
            Random rd = new Random();
            if (rd.nextDouble() > 0.5) {
                test();
            } else {
                test2();
            }
        } catch (CustomException ce) {
            System.out.println("커스텀 익셉션");
        } catch (Exception e) {
            System.out.println("그냥 익셉션");
        }
    }

    static void test() throws Exception {
        throw new Exception(); // new 생성해서 -> Exception을 발생시킴
        // 2 중에 하나로.
        // try catch / 시그니쳐로 올려버리던가
    }

    static void test2() throws CustomException {
        throw new CustomException();
    }
}

class CustomException extends Exception {

}
