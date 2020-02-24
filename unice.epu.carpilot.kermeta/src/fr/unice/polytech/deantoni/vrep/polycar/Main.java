package fr.unice.polytech.deantoni.vrep.polycar;


public class Main {

	public static void main(String[] args) {
		
		PolyCar car = new PolyCar("127.0.0.1", 19997);
		// Lambda Runnable
		Runnable readLeftSensorsTask = () -> { 
			car.readLeftSensor();
		};
//		SCInterface.readLeftSensors.subscribe(e -> new Thread(readLeftSensorsTask).start());
		
		
		car.start();
		while(true) {car.sleep(5000);}
		
	}

}
