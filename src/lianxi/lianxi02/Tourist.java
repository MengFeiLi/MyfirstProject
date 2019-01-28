package lianxi.lianxi02;

/*
 * 表示旅行者的类
 */
public class Tourist {

    //由编译器默认添加的无参构造
	/*
	public Tourist(){

	}
	*/

    public Tourist() {

    }

    //添加有参构造，为旅游者的对象进行初始化
    public Tourist(String nameArg, String numArg) {
        //nameArg和numArg称为形式参数(形参)
        //这两个参数接收创建该类对象的时候传入的名字和身份证号(实参 -> 实际参数)
        name = nameArg;//把传入的数据赋值给当前的这个对象的name属性
        num = numArg;//把传入的数据赋值给当前的这个对象的num属性
    }

    //**********************类的封装*********************
    //类的封装是用来保证数据的安全性
    /*先定义旅行者所拥有的属性*/
    private String name;//表示旅行者的姓名

    private String num;//表示旅行者的证件号

    public void setName(String nameArg) {
        name = nameArg;
    }

    public String getName() {
        return name;
    }

    public void setNum(String numArg) {
        if (numArg != null) {
            num = numArg;
        }

    }

    public String getNum() {
        return num;
    }
    //************************************************


    /*定义旅行者的方法*/
    public void book() {//表示旅行者去旅行社预订旅游路线
        System.out.println("找旅行社预订旅游路线");
    }
}