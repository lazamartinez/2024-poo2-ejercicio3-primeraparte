/**
 * Adaptador que permite que ThirdPartyAudioPlayer sea compatible con MusicPlayer.
 * Implementa la interfaz MusicPlayer y traduce las llamadas al método startAudio del ThirdPartyAudioPlayer.
 */
public class AudioPlayerAdapter implements MusicPlayer {

    private ThirdPartyAudioPlayer thirdPartyAudioPlayer;

    /**
     * Constructor del adaptador. 
     * Recibe una instancia de ThirdPartyAudioPlayer para delegar la reproducción de audio.
     *
     * @param thirdPartyAudioPlayer La instancia de ThirdPartyAudioPlayer que se va a adaptar.
     */
    public AudioPlayerAdapter(ThirdPartyAudioPlayer thirdPartyAudioPlayer) {
        this.thirdPartyAudioPlayer = thirdPartyAudioPlayer;
    }

    /**
     * Implementa el método playSong de la interfaz MusicPlayer.
     * Traduce la llamada al método startAudio de ThirdPartyAudioPlayer.
     *
     * @param fileName El nombre del archivo de la canción que se va a reproducir.
     */
    @Override
    public void playSong(String fileName) {
        thirdPartyAudioPlayer.startAudio(fileName);
    }
}
