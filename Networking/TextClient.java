//Q5 Write a server program which echoes messages sent by the client. The process
//continues till the client types “END”.

import java.io.*;
import java.net.*;

public class TextClient {
  
    public static void main(String[] args) {
        try (Socket socket = new Socket("localhost", 8888)) {
            System.out.println("Connected to server");

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            BufferedReader serverReader = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter writer = new PrintWriter(socket.getOutputStream(), true);

            String message;
            do {
                System.out.print("Enter message: ");
                message = reader.readLine();

                // Send the message to the server
                writer.println(message);

                // Receive and print the echoed message from the server
                System.out.println("Server echoes: " + serverReader.readLine());
            } while (!message.equalsIgnoreCase("END"));

            System.out.println("Ending client connection");
        } catch (IOException e) {
            System.out.println("Client exception: " + e.getMessage());
            e.printStackTrace();
        }
    }
}


