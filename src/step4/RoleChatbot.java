package step4;

public class RoleChatbot extends Chatbot {
    RoleChatbot(String apiKey) {
        // Chatbot 생성자
        super(apiKey); // 실제 구현한 RoleChatbot
    }
    // this.apiKey를 하면 Chatbot에 전달이 안됨
    // 오버라이딩이라던가 있지 않나요? 이친구가 그냥 받으면 안돼요?
}
