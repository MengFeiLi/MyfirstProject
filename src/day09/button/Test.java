package day09.button;

public class Test {

	public static void main(String[] args) {
		//创建按钮对象
		Button btn = new Button();
		//设置按钮被点击
		btn.setFlag(false);//设置为false的时候，监听器不会执行
		//给按钮绑定监听器(采用匿名内部类的方式绑定监听器)
		btn.setOnClickListener(
				new OnClickListener(){

					//此方法被称为回调方法
					@Override
					public void onClick() {
						//定义按钮被点击之后要执行的功能
						System.out.println("按钮被点击");
					}
				}
		);


	}

}
