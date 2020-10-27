public class King extends Piece {

  public King(int value) {
    super(1000);
  }
  @Override
  public String toString() {
    return "King{value='" + value + '\'' + '}';
  }

//  @Override
//  public String toString() {
//    return super.toString();
//  }
  @Override
  public void move(){
    System.out.println("One square");
  }

}
