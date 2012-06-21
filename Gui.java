public class Gui implements TcpEventListener {
  public Gui() {
    //..... Create GUI .....
  }
  
  public void messageReceived(String msg) {
    //.... Display response
  }
  
  public void connectBtnPressed(String serverAddress, int port) {
    //.... Connect server
    //.... TCPClient.connectServer();
  }
  
  public void sendCommandPressed(String command) {
    createServerSocket(...);
    //... TCPClient.sendMessage();
  }
  
  private void createServerSocket(...) {
    TCPServer server = new TCPServer(....);
    //if u extends Thread
    server.start();
    //if u implements Runnable
    Thread serverThread = new Thread(server);
    serverThread.start();
  }
}