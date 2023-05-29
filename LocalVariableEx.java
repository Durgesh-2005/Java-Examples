public class LocalVariableEx {
  public void localVariable() {
    String name = "Tony";
    int marks = 99;
    System.out.println(name + " scored " + marks + "%.");
  }

  public static void main(String[] args) {
    LocalVariableEx lve = new LocalVariableEx();
    lve.localVariable();
  }
}
