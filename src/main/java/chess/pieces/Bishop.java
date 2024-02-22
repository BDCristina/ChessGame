package chess.pieces;
import util.ImageUtils;

import javax.swing.Icon;
import java.awt.Color;

public class Bishop extends Piece {
    public Bishop(Color color) {
        super(color);
    }

    @Override
    public boolean isValidMove(int fromRow, int fromCol, int toRow, int toCol) {
        // to do: de implementat logica pentru validarea mutării nebunului
        return false; //implementare temporară
    }

    @Override
    public Icon getIcon() {
        // Returneaza imaginea corespunzătoare pentru nebun
        if (color == Color.WHITE) {
            return ImageUtils.resizeImage("images/white/5.png", 75, 75);
        } else {
            return ImageUtils.resizeImage("images/black/5.png", 75, 75);
        }
    }
}
