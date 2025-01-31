package week2.day4;

public class JavaConnection extends MySqlConnection {
	@Override
	public void connect() {
		System.out.println("SQL connected successfully");
	}
	@Override
	public void disconnect() {
		System.out.println("SQL disconnected successfully");
	}
	@Override
	public void executeUpdate() {
	System.out.println("SQL Query executed successfully");
	}
	
	public static void main(String[] args) {
		JavaConnection sqlquery = new JavaConnection();
		sqlquery.connect();
		sqlquery.disconnect();
		sqlquery.executeQuery();
		sqlquery.executeUpdate();
	}

}
