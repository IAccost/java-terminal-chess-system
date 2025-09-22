package chess.pieces;

import chess.ChessPiece;

public class Queen extends ChessPiece {

    public Queen(boardgame.Board board, chess.Color color) {
        super(board, color);
    }

    @Override
    public  String toString() {
        return "Q";
    }

    @Override
    public boolean[][] possibleMoves() {
        // TODO Auto-generated method stub
        return new boolean[0][];
    }
}
