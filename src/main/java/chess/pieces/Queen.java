package chess.pieces;
import util.ImageUtils;

import javax.swing.*;
import java.awt.Color;


public class Queen extends Piece {
    public Queen(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        // to do: de implementat logica pentru validarea mutării reginei
        return false; // implementare temporară
    }

    @Override
    public Icon getIcon() {
        // Returneaza imaginea corespunzătoare pentru regină
        if (color == Color.WHITE) {
            return ImageUtils.resizeImage("images/white/3.png", 75, 75);
        } else {
            return ImageUtils.resizeImage("images/black/3.png", 75, 75);
        }
    }
}
