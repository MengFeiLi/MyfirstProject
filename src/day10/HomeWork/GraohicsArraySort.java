package day10.HomeWork;

public class GraohicsArraySort {
	public static void sortBySize(Graphics[] gra)
	{
		for(int i = 0; i<gra.length;i++)
		{
			for(int j=0;j<gra.length-1-i;j++)
			{
				if(gra[j].size()>gra[j+1].size())
				{
					Graphics temp = gra[j];
					gra[j] =gra[j+1];
					gra[j+1] =temp; 
				}
			}
		}
	}
	
	public static void sortByArea(Graphics[] gra)
	{
		for(int i = 0; i<gra.length;i++)
		{
			for(int j=0;j<gra.length-1-i;j++)
			{
				if(gra[j].area()>gra[j+1].area())
				{
					Graphics temp = gra[j];
					gra[j] =gra[j+1];
					gra[j+1] =temp; 
				}
			}
		}
	}
}
