public class StringLinkedList implements StringList {

  private StringNode head;
  private StringNode tail;
  
  private int size;
  
  public int add(String s) {
    //TODO: implement this method
    return -1;
  }
  
  public int size() {
    //TODO: implement this method
    return -1;
  }
  
  public boolean isEmpty() {
    //TODO: implement this method
    return false;
  }
  
  public void clear() {
    //TODO: implement this method
  }
  
  public void set(int i, String s) {
    //TODO: implement this method
  }
  
  public String remove(int i) {
    //TODO: implement this method
    return null;
  }
  
  public int add(int i, String s) {
    //TODO: implement this method
    return -1;
  }
  
  public int indexOf(String s) {
    //TODO: implement this method
    return -1;
  }
  
  public String get(int i) {
    //TODO: implement this method
    return null;
  }
  
  public boolean contains(String s) {
    //TODO: implement this method
    return false;
  }
  
  public String[] toArray() {
    String[] result = new String[size];
    StringNode current = head;
    for (int i = 0; current != null; i++) {
      result[i] = current.value;
      current = current.next;
    }
    return result;
  }
  
  public StringListIterator iterator() {
    //TODO: implement this method
    return null;
  }
  
  private static void SOP(String s) {
    // Simple shortcut method; mostly because I like to abbreviate 
    // System.out.println to SOP when I write on the board.
    System.out.println(s);
  }
  
  public void printList() {
    // you could use a method like this for debugging purposes.
    System.out.print("[");
    String separator = "";
    for (StringNode current = head; current != null; current = current.next) {
      System.out.print(separator);
      System.out.print("\"" + current.value + "\"");
      separator = " => ";
    }
    SOP("]\n");
  }
  
  private class NodeIterator implements StringListIterator {
    
    public String next() {
      //TODO: implement this method
      return null;
    }
    
    public boolean hasNext() {
      //TODO: implement this method
      return false;
    }
  }

  private class StringNode {
    private String value;
    private StringNode next;
    
    public StringNode(String s, StringNode n) {
      this.value = s;
      this.next = n;
    }
    
    public StringNode(String s) {
      this(s, null);
    }
  }
}