import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileServer {

    public static void main(String[] args) {
        int portNumber = 8080;

        try (ServerSocket serverSocket = new ServerSocket(portNumber)) {
            System.out.println("Server is running on port " + portNumber);

            while (true) {
               
                Socket clientSocket = serverSocket.accept();
                System.out.println("Client connected.");

               
                DataInputStream input = new DataInputStream(clientSocket.getInputStream());
                DataOutputStream output = new DataOutputStream(clientSocket.getOutputStream());

               
                String fileName = input.readUTF();
                System.out.println("Received request for file: " + fileName);

                
                File file = new File(fileName);
                if (file.exists() && file.isFile()) {
                    output.writeBoolean(true); 
                    BufferedReader reader = new BufferedReader(new FileReader(file));
                    String line;
                    while ((line = reader.readLine()) != null) {
                        output.writeBytes(line + "\n");
                    }
                    reader.close();
                } else {
                    output.writeBoolean(false);
                }

               
                clientSocket.close();
                System.out.println("Client disconnected.");
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

