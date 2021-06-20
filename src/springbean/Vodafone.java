package springbean;

public class Vodafone implements Sim{
	@Override
	public void startCallService() {
		System.out.println("started call service using Vodafone");
	}
	@Override
	public void startDataService() {
		System.out.println("started data using Vodafone");
	}
}
