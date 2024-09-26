package buoi2;

public class Cau1 {
	
	class Vehicle {
	    private int id;
	    private boolean isImported;

	    public Vehicle() {
	        this.id = 0;
	        this.isImported = false;
	    }

	    public Vehicle(int id, boolean isImported) {
	        this.id = id;
	        this.isImported = isImported;
	    }

	    public int getId() {
	        return id;
	    }

	    public void setId(int id) {
	        this.id = id;
	    }

	    public boolean isImported() {
	        return isImported;
	    }

	    public void setImported(boolean isImported) {
	        this.isImported = isImported;
	    }

	    public void write() {
	        System.out.println("Vehicle " + (isImported ? "is imported item!" : ""));
	    }

	    public void write(int inputId) {
	        this.id = inputId;
	        System.out.println("Vehicle " + inputId + (isImported ? " is imported item!" : ""));
	    }
	}

	class Motor extends Vehicle {
	    private int maxSpeed;

	    public Motor() {
	        super();
	        this.maxSpeed = 0;
	    }

	    public Motor(int id, boolean isImported, int maxSpeed) {
	        super(id, isImported);
	        this.maxSpeed = maxSpeed;
	    }

	    public int getMaxSpeed() {
	        return maxSpeed;
	    }

	    public void setMaxSpeed(int maxSpeed) {
	        this.maxSpeed = maxSpeed;
	    }

	    @Override
	    public void write() {
	        System.out.println("Motor " + (isImported() ? "is imported item!" : ""));
	    }

	    @Override
	    public void write(int inputId) {
	        setId(inputId);
	        System.out.println("Motor " + inputId + (isImported() ? " is imported item!" : ""));
	    }
	}

	
	public class Main {
	    public static void main(String[] args) {
	        Vehicle vehicle = new Vehicle(1, true);
	        vehicle.write();
	        vehicle.write(2);

	        Motor motor = new Motor(3, true, 120);
	        motor.write();
	        motor.write(4);
	    }
}
