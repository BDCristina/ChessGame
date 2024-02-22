package util;
import javax.swing.*;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

public class ImageUtils {
    // Metoda pentru redimensionarea imaginii la o anumită dimensiune
    public static ImageIcon resizeImage(String imagePath, int width, int height) {
        try {
            // Citirea imaginii
            BufferedImage originalImage = ImageIO.read(new File(imagePath));
            // Redimensionarea imaginii
            Image resizedImage = originalImage.getScaledInstance(width, height, Image.SCALE_SMOOTH);
            // Crearea unui ImageIcon din imaginea redimensionată
            return new ImageIcon(resizedImage);
        } catch (IOException ex) {
            ex.printStackTrace();
            return null;
        }
    }
}
