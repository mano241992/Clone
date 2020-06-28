package java_inheritance;

public class display  {
	public void displayinfo()
	{
		System.out.println("Display information");
	}

	public void Size()
	{
		double inch =6.3;
		int cm = 16;
		System.out.println("Screen Size"+" :"+inch+"inches"+"("+cm+")");
	}
	public void resolution()
	{
		int resolve =1080;
		int solution =2340;
		System.out.println("Screen Resolution"+" :"+resolve+"*"+solution+" pixels");
	}
	public void Aspect()
	{
		double Aspec =19.5;
		int raio =9;
		System.out.println("Aspect Ratio"+" :"+Aspec+":"+raio);
	}
	public void DisplayType()
	{
		String scrtype ="IPS LCD";
		System.out.println("Display Type"+" : "+scrtype);
	}
}
