/**
 * Clase de un reproductor de audio de terceros.
 * Esta clase no es compatible con la interfaz MusicPlayer, pero ofrece el método startAudio para reproducir audio.
 */
public class ThirdPartyAudioPlayer {

    /**
     * Inicia la reproducción de una pista de audio.
     *
     * @param file El nombre del archivo de audio que se va a reproducir.
     */
    public void startAudio(String file) {
        System.out.println("Reproduciendo pista de audio desde ThirdPartyAudioPlayer: " + file);
    }
}
