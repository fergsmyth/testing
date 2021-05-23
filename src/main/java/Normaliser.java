import java.text.Normalizer;

public class Normaliser {

    public String normalise(String stringToNormalise){
        return Normalizer.normalize(stringToNormalise, Normalizer.Form.NFKD);
    }
}
