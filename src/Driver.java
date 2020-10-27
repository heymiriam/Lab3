import java.util.ArrayList;

public class Driver {


  private static Object Pawn;
  private static Object Knight;
  private static Object Bishop;
  private static Object Rook;
  private static Object Queen;
  private static Object King;


  public static void main(String[] args) {
    ArrayList<Piece> pieceArrayList= new ArrayList<>();
    pieceArrayList.add((Piece) Pawn);
    pieceArrayList.add((Piece) Knight);
    pieceArrayList.add((Piece) Bishop);
    pieceArrayList.add((Piece) Rook);
    pieceArrayList.add((Piece) Queen);
    pieceArrayList.add((Piece) King);







    p1={value=1, isWhite=true, promoted=true, newPiece=Queen};
    p2={value=1, isWhite=true, promoted=false, newPiece=null};
    p3={value=1, isWhite=false, promoted=false, newPiece=null};
    p4={value=1, isWhite=false, promoted=true, newPiece=Queen};
    p5={value=1, isWhite=true, promoted=true, newPiece=Knight};
    p1.equals(p2) should return false;
    p1.equals(p4) should return false;
    p1.equals(p5) should return false;
    p2.equals(p3) should return false;
    p4.equals(p5) should return false;
  }

}
