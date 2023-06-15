package chapter9;
public class Square extends Rectangle{

    // this is how you override a method with the same signature but change the body

    @Override
  public double calculatePerimeter(){
      return sides*length;
  }

  public void print(String what){
      System.out.println("I am a " + what);
  }
}
