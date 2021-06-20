package springbean;

public class Airtel implements Sim{
	@Override
	public void startCallService() {
		System.out.println("started call service using Airtel");
	}
	@Override
	public void startDataService() {
		System.out.println("started data using Airtel");
	}
}
