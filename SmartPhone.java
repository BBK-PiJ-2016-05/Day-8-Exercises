public class SmartPhone extends MobilePhone {
	public void browseWeb (String site){
		System.out.println("Opening site " + site);
	}
	
	public void findPosition (){
		System.out.println("Your GPS latitude is 51.492337");
		System.out.println("Your GPS longitude is -0.039009");
	}
}