package abs_pac_exchand;
import music.Playable;
import music.string.Veena;
import music.wind.Saxophone;
public class interfaces1 {
	public static void main(String[] args) {
        Veena veena = new Veena();
//        veena.play();

        Saxophone sax = new Saxophone();
//        sax.play();

        Playable p;

        p = veena;
        p.play();

        p = sax;
        p.play();
    }

}
