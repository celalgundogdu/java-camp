package homework.polymorphism;

public class DatabaseLogger extends BaseLogger {
	
	public void log(String message) {
		System.out.println("logged to database: " + message);
	}

}