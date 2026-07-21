/* 3.Write a program which sends the name of a text file from the client to server and
displays the contents of the file on the client machine. If the file is not found, display an
error message.*/

import java.io.*;
import java.net.Socket;

public class FileClient {

    public static void main(String[] args) {
        String serverAddress = "localhost";
        int serverPort = 8080;

        try {
            
            Socket socket = new Socket(serverAddress, serverPort);
            System.out.println("Connected to server.");

            
            DataInputStream input = new DataInputStream(socket.getInputStream());
            DataOutputStream output = new DataOutputStream(socket.getOutputStream());

          
            String fileName = "Java.txt"; 
            output.writeUTF(fileName);
            output.flush();

           
            boolean fileExists = input.readBoolean();

            if (fileExists) {
                
                BufferedReader reader = new BufferedReader(new InputStreamReader(input));
                String line;
                System.out.println("Contents of " + fileName + ":");
                while ((line = reader.readLine()) != null) {
                    System.out.println(line);
                }
                reader.close();
            } else {
                
                System.out.println("Error: File " + fileName + " not found on the server.");
            }

           
            socket.close();
            System.out.println("Connection closed.");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

