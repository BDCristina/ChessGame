package chess.pieces;
import util.ImageUtils;

import javax.swing.*;
import java.awt.Color;

public class King extends Piece {
    public King(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        // to do: de implementat logica pentru validarea mutării regelui
        return false; //  implementare temporară
    }

    @Override
    public Icon getIcon() {
        // Returneaza imaginea corespunzătoare pentru rege
        if (color == Color.WHITE) {
            return ImageUtils.resizeImage("images/white/4.png", 75, 75);
        } else {
            return ImageUtils.resizeImage("images/black/4.png", 75, 75);
        }
    }
}
