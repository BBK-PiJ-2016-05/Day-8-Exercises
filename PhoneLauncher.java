public class PhoneLauncher {

	public static void main(String[] args) {
		PhoneLauncher launcher = new PhoneLauncher();
		launcher.launch();
	}

	public void launch() {
		SmartPhone myPhone = new SmartPhone();
		myPhone.call("07957595406");
		myPhone.call("01689851281");
		myPhone.call("02083006104");
		myPhone.call("01234340460");
		myPhone.ringAlarm("annoying");
		myPhone.playGame("snake");
		myPhone.browseWeb("www.bbc.co.uk");
		myPhone.findPosition();
		myPhone.printLastNumbers();
	}
}