package intwquestions;

public class MssqlConnection extends EstablishConnectivity{

	@Override
	public void commitTransaction() {
		System.out.println("Committed transaction");
	}

	@Override
	public void rollBackTransaction() {
		System.out.println("rollback transaction");
	}

}
