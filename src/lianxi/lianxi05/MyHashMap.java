package lianxi.lianxi05;



public class MyHashMap  {
    private String name;
    private int password;

    public MyHashMap(String name,int password){
        this.name=name;
        this.password=password;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name=name;
    }

    public int getPassword() {
        return password;
    }

    public void setPassword(int password) {
        this.password = password;
    }

    @Override
    public String toString() {
       String student = "姓名:"+this.name+"密码:"+this.password;
        return student;
    }
}
