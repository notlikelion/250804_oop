package step4;

public abstract class Chatbot implements IGemini {
    // 추상이니까 꼭 구현하는 게 의무는 아님

    @Override
    public String chat(String message) throws Exception {
        return "챗챗";
    }
}
