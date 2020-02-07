package builderDesignPattern;

public class Computer {
	
	// required parameters
	private String HDD;
	private String RAM;
	private String CPU;
	
	// optional parameters
	private boolean isGraphicsEnabled;
	private boolean isBluetoothEnabled;
	
	/** Class Constructor */ 
	private Computer(ComputerBuilder builder) {
		this.HDD = builder.HDD;
		this.RAM = builder.RAM;
		this.CPU = builder.CPU;
		this.isGraphicsEnabled = builder.isGraphicsCardEnabled;
		this.isBluetoothEnabled = builder.isBluetoothEnabled;
	}
	
	public String getHDD() {
		return this.HDD;
	}
	
	public String getRAM() {
		return this.RAM;
	}
	
	public String getCPU() {
		return this.CPU;
	}
	
	public boolean isGraphicsCardEnabled() {
		return this.isGraphicsEnabled;
	}
	
	public boolean isBluetoothEnabled() {
		return this.isBluetoothEnabled;
	}
	
	// Builder Class
	public static class ComputerBuilder {
		
		// required parameters
		private String HDD;
		private String RAM;
		private String CPU;
		
		// optional parameters
		private boolean isGraphicsCardEnabled;
		private boolean isBluetoothEnabled;
		
		public ComputerBuilder(String hdd, String ram, String cpu) {
			this.HDD = hdd;
			this.RAM = ram;
			this.CPU = cpu;
		}
		
		public ComputerBuilder setGraphicsCardEnabled(boolean isGraphicsCardEnabled) {
			this.isGraphicsCardEnabled = isGraphicsCardEnabled;
			return this;
		}
		
		public ComputerBuilder setBluetoothEnabled(boolean isBluetoothEnabled) {
			this.isBluetoothEnabled = isBluetoothEnabled;
			return this;
		}
		
		public Computer build() {
			return new Computer(this);
		}
	}
	
}
