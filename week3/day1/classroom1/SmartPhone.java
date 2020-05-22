package week3.day1.classroom1;

public class SmartPhone extends AndroidPhone{

	public void connectWhatsApp()
	{
		System.out.println("Connect to WhatsApp");
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SmartPhone obj = new SmartPhone();
		
		obj.sendMsg();
		obj.makeCall();
		obj.saveContact();
		obj.takeVideo();
		obj.connectWhatsApp();
	}

}
