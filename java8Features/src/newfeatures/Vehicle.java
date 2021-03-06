package newfeatures;

public interface Vehicle {
	//by default all are abstract
	String getBrand();
	String speedUp();
	String slowDown();
	
	
	//any non abstract method must be made default to add new features
	 default String turnAlarmOn()
	{
	return "Turning the Vehicle Alarm ON.";
	}
	 
	 default String turnAlarmOff()
		{
		return "Turning the Vehicle Alarm Off.";
		}
	
	 static int getHorsePower(int rpm,int torque)
	 {
	 return (rpm*torque)/5252;
	 }
}
