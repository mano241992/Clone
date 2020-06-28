package java_inheritance;

public class Battery {
	public void batteryinfo()
	{
		System.out.println("Battery Information");
	}
	public void Capacity()
	{
		int cap = 4000;
		System.out.println("Capacity"+" :"+cap+"mAh");
	}
	public void batType()
	{
		String type ="Li-Polymer";
		System.out.println("Type"+ " :"+type);
	}
	public void Replace()
	{
		boolean replace = false;
		System.out.println("Type Replacement"+" :"+ replace);
	}
	public void Standby()
	{
		int hours = 251;
		char G = '2';
		System.out.println("Standby time"+" :"+hours +" Hours"+"("+G+")");
	}
	public void Charging()
	{
		String quick ="Quick,v4.0";
		System.out.println("Quick Charging"+" :"+ quick);
	}
	public void usbType()
	{
		String usb ="Yes";
		System.out.println("USB Type-C"+" :"+usb);
	}
}
