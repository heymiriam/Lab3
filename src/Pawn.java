public class Pawn extends Piece {
  boolean promoted;
  Piece newPiece;
  public Pawn(int value) {
    super("1");
  }
//  int value{
//    value= 1;
//    return value;
//  }

  public Pawn(int value, int pawn, int knight, int bishop, int rook, int queen, int king,
      boolean promoted, Piece newPiece) {
    super(value, pawn, knight, bishop, rook, queen, king);
    this.promoted = promoted;
    this.newPiece = newPiece;
  }

  public boolean isPromoted() {
    return promoted;
  }

  public void setPromoted(boolean promoted) {
    this.promoted = promoted;
  }

  public Piece getNewPiece() {
    return newPiece;
  }

  public void setNewPiece(Piece newPiece) {
    this.newPiece = newPiece;
  }

  @Override
  public String toString() {
    return "Pawn{value='" + value + '\'' + '}';
  }

//  @Override
//  public String toString() {
//    return super.toString();
//  }
  @Override
  public void move(){
    System.out.println("Forward 1");
  }


  public void promote(Piece newPiece){
    this.newPiece = newPiece;
  }

  @Override
  public boolean equals(Object obj) {
    return super.equals(obj);
  }

}
