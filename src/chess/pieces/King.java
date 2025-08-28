package chess.pieces;

import chess.ChessPiece;

public class King extends ChessPiece {
    public King(boardgame.Board board, chess.Color color) {
        super(board, color);
    }

    @Override
    public String toString() {
        return "K";
    }
}
