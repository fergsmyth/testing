import java.text.Normalizer;

public class Normaliser {

    public String normalise(String input){
        return
                Normalizer
                        .normalize(input, Normalizer.Form.NFD)
                        .replaceAll("[^\\p{ASCII}]", "");
    }

}
