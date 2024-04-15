package t31;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

/**
 * Зображення
 */
public class ImageFile implements DisplayObject {

    final private BufferedImage image;

    public ImageFile(String path) {
        image = load(path);
    }

    /**
     * Показує зображення за допомогою спеціалізованої програми
     */
    public void display() {
        System.out.println("Displaying image.");
        ImageIcon icon = new ImageIcon(image);
        JLabel label = new JLabel(icon);
        JOptionPane.showMessageDialog(null, label);
    }

    /**
     * Завантажую зображення з диску
     * @param path шлях до зображення
     * @return буфер зображення
     */
    BufferedImage load(String path) {
        System.out.println("Loading image " + path + "...");
        BufferedImage image = null;
        try {
            image = ImageIO.read(new File(path));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return image;
    }


}
