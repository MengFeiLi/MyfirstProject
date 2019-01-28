package jihe.generic.custom;

//创建泛型类
//W -> 暂定的数据类型
public class Student<W> {

    //在声明类的时候指定的泛型可以在类体中定义属性，定义方法的返回值，定义方法的形参

    private W a;//用泛型定义属性

    public void setA(W a){//用泛型定义形参
        this.a = a;
    }

    public W getA(){//用泛型定义返回值类型
        return this.a;
    }
}

//定义的泛型的只能够在本类中使用
//class A{
//	private W b;
//}
