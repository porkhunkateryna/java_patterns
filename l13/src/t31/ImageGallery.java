package t31;

public class ImageGallery {

    public static void main(String[] args) {

        DisplayObject[] images = {
                // якщо виникає помилка завантаження, замініть відносний шлях на абсотютний шлях!
                new Proxy("C:/Users/katyu/IdeaProjects/l13/src/t31/resources/image1.jpeg"),
                new Proxy("C:/Users/katyu/IdeaProjects/l13/src/t31/resources/image2.jpeg"),
                new Proxy("C:/Users/katyu/IdeaProjects/l13/src/t31/resources/image3.jpeg"),
                new Proxy("C:/Users/katyu/IdeaProjects/l13/src/t31/resources/image4.jpeg"),
                new Proxy("C:/Users/katyu/IdeaProjects/l13/src/t31/resources/image5.jpeg"),
                new Proxy("C:/Users/katyu/IdeaProjects/l13/src/t31/resources/image6.jpeg"),
                new Proxy("C:/Users/katyu/IdeaProjects/l13/src/t31/resources/image7.jpeg"),
                new Proxy("C:/Users/katyu/IdeaProjects/l13/src/t31/resources/image8.jpeg"),
                new Proxy("C:/Users/katyu/IdeaProjects/l13/src/t31/resources/image9.jpeg"),
                new Proxy("C:/Users/katyu/IdeaProjects/l13/src/t31/resources/image10.jpeg"),
        };

        for (DisplayObject image : images) {
            image.display();
        }

    }

}