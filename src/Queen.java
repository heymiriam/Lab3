import javafx.scene.effect.Light.Spot;

public class Queen extends Piece {

public Queen(int value) {
  super("9");
}
  @Override
  public String toString() {
    return "Queen{value='" + value + '\'' + '}';
  }

  public Queen(int value, int pawn, int knight, int bishop, int rook, int queen, int king) {
    super(value, pawn, knight, bishop, rook, queen, king);
  }

  public Queen(String s) {
    super(s);
  }


  @Override
  public void move(){
    System.out.println("Like bishop and rook");
  }

}
