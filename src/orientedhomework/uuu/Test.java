package orientedhomework.uuu;

public class Test {
    public static void main(String[] args) {
        Button button = new Button();
        button.setFlag(true);
        button.setOnClickListener(
                new OnClickListener() {
                    public void onclick() {
                        System.out.println("按钮被点击");
                    }
                }
        );
    }
}
