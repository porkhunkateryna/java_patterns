package t31;

/**
 * Кодек для стиснення відео формату Ogg
 */
public class OggCompressionCodec implements Codec {

    @Override
    public String type() {
        return "ogg";
    }
}
