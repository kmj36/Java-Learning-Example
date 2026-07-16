package oop.l_MethodChaining.d_BuilderPattern;

class Dialog {
    private String title;
    private String message;
    private String positiveButtonText;
    private String negativeButtonText;
    private Runnable onPositiveClick;
    private Runnable onNegativeClick;

    protected Dialog setTitle(String title) {
        this.title = title;
        return this;
    }

    protected Dialog setMessage(String message) {
        this.message = message;
        return this;
    }

    protected Dialog setPositiveButton(String text, Runnable onClick) {
        this.positiveButtonText = text;
        this.onPositiveClick = onClick;
        return this;
    }

    protected Dialog setNegativeButton(String text, Runnable onClick) {
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

class DialogBuilder extends Dialog {
    private String title;
    private String message;

    public DialogBuilder setMessage(String newMessage) {
        this.message = newMessage;
        return this;
    }

    public DialogBuilder setTitle(String newTitle) {
        this.title = newTitle;
        return this;
    }

    public Dialog build() {
        Dialog d = new Dialog().setTitle(title).setMessage(message)
                .setPositiveButton("확인", () -> System.out.println(">> 삭제되었습니다."))
                .setNegativeButton("취소", () -> System.out.println(">> 취소되었습니다."));
        return d;
    }
}

public class BuilderPattern {
    static void main() {
        Dialog dialog = new DialogBuilder()
                .setMessage("message")
                .setTitle("title")
                .build();
        dialog.show();
    }
}
