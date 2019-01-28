package jihe.mystack;

public class Test {

    public static void main(String[] args) {

        //验证自定义的栈结构是否满足元素的先进后出的规则

        //创建栈结构用于对元素进行入栈和出栈的管理
        MyStack<String> stack = new MyStack<String>();

        //调用pull方法入栈元素
        stack.pull("张三");
        stack.pull("李四");
        stack.pull("王五");
        stack.pull("赵六");

        //查看栈中元素顺序
        System.out.println("栈中元素的顺序： " + stack);

        //出栈元素
        int size = stack.size();
        for(int i = 0; i < size; i++){
            String e = stack.pop();
            System.out.println("第" + (i + 1) + "次出栈的元素：" + e);
        }

    }

}
