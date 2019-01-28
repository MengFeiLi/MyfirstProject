public class O  extends Man{

    public O (String name, int age) {
        super(name, age);
    }
    public static void main(String[] args) {
        sleep("小狗");

        String aaa = sleep();
        System.out.println(aaa);


    }

    public static String sleep() {
        System.out.println("我要睡觉了11");
        return "李梦飞";
    }

    public static void sleep(String name) {
        System.out.println(name+"我要睡觉了22");
    }


}
