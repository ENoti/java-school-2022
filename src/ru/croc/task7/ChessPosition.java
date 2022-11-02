//package ru.croc.task7;
//class ChessPosition {
//    public ChessPosition(int convertInInt, int y) {}
//    static ChessPosition parse(String position) {
//        int y = position.charAt(1) - '0';
//        CoordinateFormat X = new CoordinateFormat();
//        char x = position.charAt(0);
//        return new ChessPosition(X.ConvertInInt(x), y);
//    }
//}
package ru.croc.task7;
class ChessPosition {
    private int x, y;
    public ChessPosition(){}
    protected void parse(String position) {
        y = position.charAt(1) - '0';
        CoordinateFormat X = new CoordinateFormat();
        x = X.ConvertInInt(position.charAt(0));
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }
}
