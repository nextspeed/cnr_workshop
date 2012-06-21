public class Server implements TcpEventListener, CommandResultListener {

  private CommandProcessor cp;
  private TcpServer server;
  
  public Server() {
    server.addTcpEventListener(this);
    cp.addCommandEventListener(this);
  }
  
  public void MessageReceived(String msg) {
    //... do Process().....
    cp.process(msg);
  }
  
  public void resultReceived(String result) {
    //.... TCPClient send message back to caller
  }
  
}