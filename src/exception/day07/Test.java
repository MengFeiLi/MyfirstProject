package exception.day07;

public class Test {

    public static void main(String[] args) {
//		divide(10, 0);//在finally之前没有碰到return语句的情况
        divide(10, 0);//在finally之前碰到了return语句的情况
    }

    public static int divide(int a , int b){

        int result = 0;

        try{
            System.out.println("除之前");
            result = a / b;
            System.out.println("除之后");
            return result;
        }catch(Exception e){
            System.out.println("catch ---> " + e.getMessage());
        } finally{
            System.out.println("finally ---> ");
        }

        System.out.println("try...catch之后");
        return result;
    }

}
