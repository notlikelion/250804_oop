package step3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Solution12 {
    public static void main(String[] args) {
        // Exception (Error) : Exception -> 예외. -> 예외처리.
        // 오류 처리, 예외 처리 -> 흐름 제어의 일종으로 보기도 한다 => 클래스/타입 기반.
//        System.out.println(1 / 0); // NaN. +...
        // ArithmeticException // RuntimeException
        // Unchecked
//        System.out.println(1 / 0); // 숫자 계산하다보면, 혹은 외부에 입력에 따라서 발생할 수 있는 것

        // Checked -> 빌드 실행이 안된다
        // 없는 변수 호출... critical (아예 뭐 어쩔 수 없는 것)
        // java.io.FileNotFoundException
        // IOException -> Exception : 처리에 대한 준비
//        FileReader file = new FileReader("file.txt");
        // 상당히 치명적이라 우리가 선행적으로 처리를 해줬으면...

        try {
            // 숫자 계산, 내부의 값이 변화하는 과정에서 발생하는 에러는...
            // 계산기 -> 1 / 0 막을 수 있어요 없어요?
            // 프로그래밍적으로 체크해서 막을 수 있으니까 빌드(코드 변환)에서는 굳이 안건든다
            System.out.println(1 / 0); // 숫자 계산하다보면, 혹은 외부에 입력에 따라서 발생할 수 있는 것
            FileReader f = new FileReader("file.txt");
            // 파일을 다룬다, 네트워크를 다룬다 -> Checked.
        } catch (Exception ex) {
            System.err.println(ex.getMessage());
        }
    }
}
