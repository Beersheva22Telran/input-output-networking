package telran.net.application;
import java.io.*;
import java.net.*;

import telran.net.TcpServer;
public class ServerTcpExampleAppl {

	private static final int PORT = 4000;

	public static void main(String[] args) throws Exception{
		TcpServer server = new TcpServer(new ExampleProtocol(), PORT);
		server.run();
}
}
