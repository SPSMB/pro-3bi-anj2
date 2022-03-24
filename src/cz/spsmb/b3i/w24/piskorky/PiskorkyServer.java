package cz.spsmb.b3i.w24.piskorky;


import java.io.*;
import java.net.ConnectException;
import java.net.ServerSocket;
import java.net.SocketException;
import java.time.LocalDateTime;
//add --module-path "Y:\stemberk\verejne_zaci\javafx-sdk-17.0.1\lib" --add-modules javafx.controls,javafx.fxml
public class PiskorkyServer {
    public static PiskorkyStatus ps;

    public static void main(String[] args) throws IOException {
        PiskorkyServer.ps = new PiskorkyStatus(25);
        int port = 8081;
        int request = 0;
        while (true) {
            try (var listener = new ServerSocket(port)) {
                System.out.printf("The started on port %d, address: %s%n", port, listener.getLocalSocketAddress());

                while (true) {
                    try (var socket = listener.accept()) {
                        ServerThread st = new ServerThread(socket);
                        st.start();
                    }
                }
            }
            catch (SocketException e){
                System.out.println(e.getMessage());
                e.printStackTrace();
            }
//            catch (ConnectException e) {
//                System.out.println("connection reset ");
//            }
            catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
