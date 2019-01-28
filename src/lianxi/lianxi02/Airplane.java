package lianxi.lianxi02;


/*
 * 表示飞机类
 */
public class Airplane {

    /*定义属性*/
    public  String num;//飞机的航班号

    /*定义有参构造，为创建的飞机进行初始化*/
    public Airplane(String numArg){
        num = numArg;
    }

    /*定义方法*/
    public  void fly(){
        System.out.println("号航班带游客到目的地");
    }

}