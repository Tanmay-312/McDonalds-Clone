import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;


public class AudioPlayer {

	private static final Map<String, File> audioFilePool = new HashMap<>();
	private static Clip clip;
	private final File audioFile;

	private AudioInputStream audioInputStream;

	private AudioPlayer(File audioFile) {
		this.audioFile = audioFile;
	}


	public static AudioPlayer newInstance(@NotNull String audioPath) {
		if (audioFilePool.get(audioPath) == null) {
			putNewAudioFile(audioPath);
		}
		return new AudioPlayer(audioFilePool.get(audioPath));
	}

	private static void putNewAudioFile(String audioPath) {
		audioFilePool.put(audioPath, createNewAudioFile(audioPath));
	}


	private static File createNewAudioFile(String audioPath) {
		return new File(audioPath);
	}

	public void play() {
		stopSound();
		createAudioInputStream();
		playSound();
	}


	private void stopSound() {
		if (clip != null) {
			clip.stop();
		}
	}

	private void createAudioInputStream() {
		try {
			audioInputStream = AudioSystem.getAudioInputStream(audioFile);
		} catch (UnsupportedAudioFileException | IOException e) {
			e.printStackTrace();
		}
	}


	private void playSound() {
		try {
			clip = AudioSystem.getClip();
			clip.open(audioInputStream);
			clip.start();
		} catch (LineUnavailableException | IOException e) {
			e.printStackTrace();
		}
	}
}
