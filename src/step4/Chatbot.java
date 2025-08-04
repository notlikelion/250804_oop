package step4;

public abstract class Chatbot implements IGemini {
    // 추상이니까 꼭 구현하는 게 의무는 아님
    final String apiKey;

    // super
    protected Chatbot(String apiKey) {
        this.apiKey = apiKey;
    }

    @Override
    public String chat(String message) throws Exception {
        // chat -> apiKey.
        System.out.println(apiKey);
        return "챗챗";
    }
}
