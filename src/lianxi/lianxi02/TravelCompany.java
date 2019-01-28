package lianxi.lianxi02;

/*
 * 表示旅行社的类
 */
public class TravelCompany {

    /*定义属性*/
    public String name;//表示旅行社的名字

    /*定义有参构造，用于初始化创建出来的旅游公司*/
    public TravelCompany(String nameArg){
        name = nameArg;
    }

    /*定义方法*/
    public void bookAirplane(){//表示旅行社预订航班的功能
        System.out.println("旅行社预定了航班");
    }
}
