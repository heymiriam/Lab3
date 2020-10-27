import javafx.scene.effect.Light.Spot;

public class Rook extends Piece {

public Rook(int value) {
  super(5);
}

//  @Override
//  public String toString() {
//    return super.toString();
//  }

    @Override
  public String toString() {
    return "Rook{value='" + value + '\'' + '}';
  }

  public Rook(int value, int pawn, int knight, int bishop, int rook, int queen, int king) {
    super(value, pawn, knight, bishop, rook, queen, king);
  }

  public Rook(String s) {
    super(s);
  }

  @Override
  public void move(){
    System.out.println("Horizontally or vertically");
  }

}
