package step3;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Solution13 {
    public static void main(String[] args) throws FileNotFoundException {
        // 1. 발생 안하겠지... 뭐...
        // 2. tomcat, sentry... 에러처리하는게 이 코드 밖에.
        //  - 컨트롤러 -> 서버에서 가장 최종적으로 바깥에 있는 진입점. -> throws.
        // -> tomcat 툴이 알아서 처리해줌.
        handleFile(); // 2가지.
        // 상위로 올릴지, 본인이 try-catch할지에 대해서 선택.

        // Runtime Exception -> 시그니쳐에 포함시킬 의무 X.
    }

    // handleFile라는 메서드를 써주려면 try-catch 흐름 제어를 해줘야한다.
    static void handleFile() throws FileNotFoundException { // 시그니쳐
        // try catch로 묶었다?
        FileReader fr = new FileReader("file.txt");
        // 내가 처리 안할건데? 이 메서드를 부르는 곳에서 try catch해.
    }
}
