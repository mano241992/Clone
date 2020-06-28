package java_inheritance;

public class Redminote7 {

	public static void main(String[] args){
		
		camera zoom = new camera();
		AboutSystem system = new AboutSystem(); 
		Battery bat =new Battery();
		Design des =new Design();
		display dis=new display();
		system.sysinfo();
		system.modelName();
		system.version();
		system.rom_Info();
		system.ram();
		system.rom();
		zoom.cam_info();
		zoom.backCamera();
		zoom.FrontCamera();
		dis.displayinfo();
		dis.Aspect();
		dis.DisplayType();
		dis.Size();
		dis.resolution();
		des.desighinfo();
		des.height();
		des.Weight();
		des.width();
		des.Material();
		des.Thickness();
		des.Colours();
		bat.batteryinfo();
		bat.batType();
		bat.Capacity();
		bat.Charging();
		bat.Replace();
		bat.Standby();
		bat.usbType();
		
	}
	

}