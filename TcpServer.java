public class TcpServer extends Thread or implements Runnable {

  private TcpEventListener listener;

  public TcpServer(int port) {
    //....
  }

  public void addTcpEventListener(TcpEventListener listener) {
    //....
  }
  
  @Override
  public void run() {
    startServerSocket();
  }

  private void startServerSocket(....) {
    //.... while(....) wait for response from client
    while(....) {
      //when message received 
      listener.messageReceived(...);
    }
  }

}