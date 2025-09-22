package chess.pieces;

import chess.ChessPiece;

public class Knight extends ChessPiece {

    public Knight(boardgame.Board board, chess.Color color) {
        super(board, color);
    }

    @Override
    public  String toString() {
        return "N";
    }

    @Override
    public boolean[][] possibleMoves() {
        // TODO Auto-generated method stub
        return new boolean[0][];
    }
}
