package Bilal.java.server.data;

public class DataNotFoundException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public DataNotFoundException(int studentID) {
		super("Data  Not Found where student ID is "+ studentID);
	}

}
