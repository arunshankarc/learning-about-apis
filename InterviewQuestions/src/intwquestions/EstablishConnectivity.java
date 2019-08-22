package intwquestions;

public abstract class EstablishConnectivity implements DBConnections{
	@Override
	public void connectToDB() {
		System.out.println("Established connectivity");	
	}
}
