import java.util.Objects;

public abstract class Piece {


  //private static Object Pawn;
  //  Piece variable = new Piece();//con esto se hace una instancia
  protected static int value;
  private int pawn;
  private int knight;
  private int bishop;
  private int rook;
  private int queen;
  private int king;
  protected static boolean isWhite;


  public Piece(int value, int pawn, int knight,int bishop, int rook, int queen, int king) {
    this.value = value;
    this.pawn = pawn;
    this.knight = knight;
    this.bishop = bishop;
    this.rook = bishop;
    this.queen = queen;
    this.king = king;
  }

  public Piece(Object value) {

  }


  public void setValue(int value) {
    this.value = value;
  }
  public int getValue() {
    return value;
  }




  public void isWhite() {
    if (!isWhite) {
      System.out.println("Not white");
    }else{
      System.out.println("It's white");
    }
  }

  public abstract void move();

  @Override
  public String toString() {
    return super.toString();
  }
//  @Override
//  public String toString() {
//    return "Pawn{value='" + value + '\'' + '}'+
//        "Knight{value='" + value + '\'' + '}'+
//        "Bishop{value='" + value + '\'' + '}'+
//        "Rook{value='" + value + '\'' + '}'+
//        "Queen{value='" + value + '\'' + '}'+
//        "King{value='" + value + '\'' + '}';
//  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Piece piece = (Piece) o;
    return value == Piece.value &&
        isWhite == piece.isWhite &&
        Objects.equals(value, Piece.value) &&
        Objects.equals(isWhite, Piece.isWhite);

  }

}

