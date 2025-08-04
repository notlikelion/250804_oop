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
        // 1. 요청 받은 메시지를 다듬거나 추가. Role, 가이드를 추가
        String templateMessage = handleMessage(message);
        // 2. GEMINI 통신
        String geminiResponse = callGemini(apiKey, templateMessage);
        // 3. 응답 받는 텍스트를 다듬는.
        // String changedText = changeResult(geminiResponse);
        //return changedText;
        return changeResult(geminiResponse);
    }

    private String handleMessage(String message) {
        return message;
    }

    private String callGemini(String apiKey, String text) {
        return text;
    }

    private String changeResult(String result) {
        return result;
    }
}
