package oop.k_MethodChaining.b_DialogExample;

class Dialog {
    private String title;
    private String message;
    private String positiveButtonText;
    private String negativeButtonText;
    private Runnable onPositiveClick;
    private Runnable onNegativeClick;

    public Dialog setTitle(String title) {
        this.title = title;
        return this;
    }

    public Dialog setMessage(String message) {
        this.message = message;
        return this;
    }

    public Dialog setPositiveButton(String text, Runnable onClick) {
        this.positiveButtonText = text;
        this.onPositiveClick = onClick;
        return this;
    }

    public Dialog setNegativeButton(String text, Runnable onClick) {
        this.negativeButtonText = text;
        this.onNegativeClick = onClick;
        return this;
    }

    public void show() {
        System.out.println("=======================");
        System.out.println("[제목] " + title);
        System.out.println("[내용] " + message);
        System.out.println("-----------------------");
        if (positiveButtonText != null) {
            System.out.println("(" + positiveButtonText + ")");
        }
        if (negativeButtonText != null) {
            System.out.println("(" + negativeButtonText + ")");
        }
        System.out.println("=======================");

        // 실제로는 버튼 클릭 이벤트가 발생했을 때 호출되지만,
        // 여기서는 예제이므로 바로 실행해봄
        if (onPositiveClick != null) {
            onPositiveClick.run();
        }
    }
}

public class DialogExample {
    static void main() {
        new Dialog()
                .setTitle("삭제 확인")
                .setMessage("정말 삭제하시겠습니까?")
                .setPositiveButton("확인", () -> System.out.println(">> 삭제되었습니다."))
                .setNegativeButton("취소", () -> System.out.println(">> 취소되었습니다."))
                .show();
    }
}