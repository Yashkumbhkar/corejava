package in.co.rays.networking;


import java.io.*;
import java.net.*;

public class EchoServer {

	public static void main(String[] a) throws IOException {

		ServerSocket sSocket = new ServerSocket(4444);

		System.out.println("Echo Server is Started");

		Socket client = null;

		boolean flag = true;
		
		while (flag) {

			client = sSocket.accept();
		
			talk(client);
		}

		sSocket.close();

		System.out.println("Echo Server is Closed");
	}

	public static void talk(Socket client) throws IOException {

		PrintWriter out = new PrintWriter(client.getOutputStream(), true);

		BufferedReader in = new BufferedReader(new InputStreamReader(client.getInputStream()));

		String line = in.readLine();

		while (line != null) {

			System.out.println("Server Recived : " + line);

			out.println(line + " .. " + line);

			if (line.equals("Bye")) {
				break;
			}

			line = in.readLine();
		}

		out.close();
		in.close();
		client.close();
	}
}