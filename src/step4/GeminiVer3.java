package step4;

import java.awt.*;
import java.util.Scanner;

// https://github.com/notlikelion/250801_flow-control/blob/main/src/step5/GeminiChatVer2Another.java
public class GeminiVer3 {
    public static void main(String[] args) {
        // 일단은 Interface, Abstract Class, Class 설계
        // -> 객체 메서드, static 메서드
        // throw, throws, return을 적절하게 사용해서. 좀 더 '프로그램'스럽게

        Chatbot chatbot = new RoleChatbot();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.print("질문을 입력하세요 : ");
            String question = sc.nextLine();
            if (question.equals("종료")) {
                System.out.println("대화 종료");
                return;
            }
            try {
                String resp = chatbot.chat(question);
                System.out.println(resp);
            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }

    }
}
