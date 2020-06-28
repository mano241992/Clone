package java_inheritance;

public class AboutSystem {
	public void sysinfo()
	{
		System.out.println("System information");
	}
	public void modelName()
	{
		String model = "Redmi Note 7 pro";
		System.out.println(model);
	}
	public void rom_Info()
	{
		System.out.println("Storage Information");
	}
	public void rom()
	{
		int rome = 6;
		System.out.println("Rom"+ " :"+rome +"GB");
		
	}
	public void ram()
	{
		int rame = 128 ;
		System.out.println("Rom"+ " :"+rame+"GB");
		
	}
	public void version()
	{
		double ver = 10.1;
		System.out.println("System version"+ " :" +ver);
		
	}
	public void processor()
	{
		String process = "Octa core(2 GHZ,Dual Core + 1.7GHZ,Hexacore)";
		System.out.println("Processor"+" :"+ process);
	}
}
