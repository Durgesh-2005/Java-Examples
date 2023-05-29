public class InstanceVariableEx {
    String name="Vaigandla Durgesh";
    //Instance variable declaration
    public void Printname() {
        System.out.println("Name: "+ name) ;
        //Accessing the instance variable
    }
    public static void main(String[] args) {
        InstanceVariableEx ive = new InstanceVariableEx();
        ive.Printname();
    }
}
