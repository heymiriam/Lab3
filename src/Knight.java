import javafx.scene.effect.Light.Spot;

public class Knight extends Piece {

public Knight(int value, int knight){
  super("2");
}
  @Override
  public String toString() {
    return "Knight{value='" + value + '\'' + '}';
  }

  public Knight(int value, int pawn, int knight, int bishop, int rook, int queen, int king) {
    super(value, pawn, knight, bishop, rook, queen, king);
  }

  public Knight(String s) {
    super(s);
  }



  //  @Override
//  public String toString() {
//    return super.toString();
//  }
  @Override
  public void move(){
    System.out.println("Like an L");
  }


  }


