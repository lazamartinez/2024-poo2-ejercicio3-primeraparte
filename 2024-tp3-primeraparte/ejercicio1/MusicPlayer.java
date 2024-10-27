/**
 * Interfaz que representa un reproductor de música.
 * Permite reproducir una canción a través del método playSong.
 */
public interface MusicPlayer {

    /**
     * Reproduce una canción.
     *
     * @param fileName El nombre del archivo de la canción que se va a reproducir.
     */
    void playSong(String fileName);
}
