package intwquestions;

public interface DBConnections {
	public void connectToDB();
	public void commitTransaction();
	public void rollBackTransaction();
}
