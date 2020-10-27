import javafx.scene.effect.Light.Spot;

public class Bishop extends Piece {

public Bishop(int value) {
  super(3);
}
  @Override
  public String toString() {
    return "Bishop{value='" + value + '\'' + '}';
  }

  public Bishop(int value, int pawn, int knight, int bishop, int rook, int queen, int king) {
    super(value, pawn, knight, bishop, rook, queen, king);
  }



  //  @Override
//  public String toString() {
//    return super.toString();
//  }
  @Override
  public void move(){
    System.out.println("Diagonally");
  }



}
