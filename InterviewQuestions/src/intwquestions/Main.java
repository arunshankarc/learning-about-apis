package intwquestions;

public class Main extends MssqlConnection{
	public static void main(String[] args) {
		EstablishConnectivity connection  = new MssqlConnection();
		connection.commitTransaction();
	}
}
