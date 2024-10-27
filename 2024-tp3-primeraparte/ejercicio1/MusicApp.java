/**
 * Clase principal de la aplicación de música.
 * Permite reproducir canciones utilizando una implementación de MusicPlayer (nativo o adaptado).
 */
public class MusicApp {

    private MusicPlayer musicPlayer;

    /**
     * Constructor de la aplicación de música.
     * Recibe una instancia de MusicPlayer que será utilizada para reproducir las canciones.
     *
     * @param musicPlayer La implementación de MusicPlayer que se utilizará para reproducir canciones.
     */
    public MusicApp(MusicPlayer musicPlayer) {
        this.musicPlayer = musicPlayer;
    }

    /**
     * Reproduce una canción utilizando el MusicPlayer configurado.
     *
     * @param fileName El nombre del archivo de la canción que se va a reproducir.
     */
    public void play(String fileName) {
        musicPlayer.playSong(fileName);
    }

    /**
     * Método principal para ejecutar la aplicación de música.
     * Muestra el uso de un reproductor de música nativo y un reproductor de terceros a través del adaptador.
     *
     * @param args Argumentos de línea de comandos (no utilizados).
     */
    public static void main(String[] args) {
        // Usar un reproductor de música compatible con MusicPlayer
        MusicPlayer nativePlayer = new MusicPlayer() {
            @Override
            public void playSong(String fileName) {
                System.out.println("Reproduciendo canción: " + fileName);
            }
        };

        MusicApp app = new MusicApp(nativePlayer);
        app.play("Canción.mp3");

        // Usar el reproductor de terceros con el adaptador
        ThirdPartyAudioPlayer thirdPartyPlayer = new ThirdPartyAudioPlayer();
        MusicPlayer adaptedPlayer = new AudioPlayerAdapter(thirdPartyPlayer);

        app = new MusicApp(adaptedPlayer);
        app.play("Pista_de_audio.mp3");
    }
}
