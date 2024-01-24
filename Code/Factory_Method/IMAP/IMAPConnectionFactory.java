package Factory_Method.IMAP;

import Factory_Method.framework.NetworkConnection;
import Factory_Method.framework.NetworkConnectionFactory;

public class IMAPConnectionFactory extends NetworkConnectionFactory{

	@Override
	public void createSocketConnection() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createInputStream() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void createOutputStream() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void connectToServer() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public NetworkConnection createConnection() {
		// TODO Auto-generated method stub
		return new IMAPConnection();
	}

}
