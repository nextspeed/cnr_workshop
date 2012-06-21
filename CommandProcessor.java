public class CommandProcessor {
  private CommandResultListener listener;

  public void process(String command) {
    //... do process....
    listener.resultReceived(result);
  }
  
  public void addCommandEventListener(CommandResultListener listener) {
    this.listener = listener;
  }
}