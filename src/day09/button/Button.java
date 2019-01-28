package day09.button;

public class Button {

	private boolean flag;//表示按钮是否被点击

	public void setFlag(boolean flag){
		this.flag = flag;
	}

	public boolean getFlag(){
		return this.flag;
	}

	//提供一方法，用于监听按钮被点击
	//给按钮对象绑定监听器，用于监测按钮被点击之后应该执行的功能
	public void setOnClickListener(OnClickListener listener){
		if(flag){//当按钮被点击，调用监听器指定按钮被点击之后要执行的功能
			listener.onClick();//接口回调
		}
	}

}
