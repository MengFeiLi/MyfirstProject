package orientedhomework.uuu;

public class Button {
    public boolean flag;

    public void setFlag(boolean flag){
        this.flag=flag;
    }
    public boolean getFlag(){
       return this.flag;
    }
    public void setOnClickListener(OnClickListener onClickListener){
        if(flag){
            onClickListener.onclick();
        }
    }

}
