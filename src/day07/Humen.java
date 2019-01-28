package day07;

public class Humen {
	int height;
	int age;
	String sex;
	String name;
	//配偶
	Humen partner;
	
	/**
	 * 结婚
	 */
	void married(Humen h)
	{
		//同性不能结婚 
		//已婚不能结婚
		if(!this.sex.equals(h.sex) 
				&& this.partner==null && h.partner==null)
		{
			this.partner = h;
			h.partner = this;
		}
		else{
			System.out.println("不满足结婚条件");
		}
	}
	public static void main(String[] args) {
		Humen lilei =new Humen();
		lilei.name = "李类";
		lilei.sex = "男";
		
		Humen hanmeimei = new Humen();
		hanmeimei.name = "韩梅梅";
		hanmeimei.sex = "女";
		
		Humen laowang = new Humen();
		laowang.name="隔壁老王";
		laowang.sex = "男";
		
		lilei.married(hanmeimei);
		hanmeimei.married(lilei);
//		hanmeimei.married(laowang);
		
		System.out.println(lilei.partner.name);
//		System.out.println(hanmeimei.partner.name);
		
		
	}
}
