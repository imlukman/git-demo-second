package springbean;

import org.springframework.beans.factory.annotation.Autowired;

public class Phone {
	private String phoneName;
	private String phoneModel;
	private Double phonePrice;	
	
	private Sim sim;


	@Autowired
	public Phone(String phoneName, String phoneModel, Double phonePrice,Sim sim) {
		this.phoneName = phoneName;
		this.phoneModel = phoneModel;
		this.phonePrice = phonePrice;
		this.sim=sim;
	}
	
	public void startCallService() {
		sim.startCallService();
	}
	public void startDataService() {
		sim.startDataService();
	}
	public void showPhoneDetails() {
		System.out.println("--- Phone details -----");
		System.out.println(this.phoneName);
		System.out.println(this.phoneModel);
		System.out.println(this.phonePrice);
	}

	public void setPhoneName(String phoneName) {
		this.phoneName = phoneName;
	}

	public void setPhoneModel(String phoneModel) {
		this.phoneModel = phoneModel;
	}

	public void setPhonePrice(Double phonePrice) {
		this.phonePrice = phonePrice;
	}

	public void setSim(Sim sim) {
		this.sim = sim;
	}

}
