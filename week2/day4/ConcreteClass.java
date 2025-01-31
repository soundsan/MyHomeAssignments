package week2.day4;

public class ConcreteClass implements DataBaseConnection {
	@Override
	public void connect() {
		System.out.println("Connected Successfully");
		
	}
	@Override
	public void disconnect() {
		System.out.println("Disconnected Successfully");
		
	}
	@Override
	public void executeUpdate() {
		System.out.println("Executed successfully");
	}
	
	public static void main(String[] args) {
		ConcreteClass databaseOptions = new ConcreteClass();
		databaseOptions.connect();
		databaseOptions.disconnect();
		databaseOptions.executeUpdate();
	}

}
