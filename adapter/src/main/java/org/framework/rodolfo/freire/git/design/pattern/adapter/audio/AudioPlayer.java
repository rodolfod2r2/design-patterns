package org.framework.rodolfo.freire.git.design.pattern.adapter.audio;

import org.framework.rodolfo.freire.git.design.pattern.adapter.media.MediaAdapter;
import org.framework.rodolfo.freire.git.design.pattern.adapter.player.MediaPlayer;

public class AudioPlayer implements MediaPlayer {

    private MediaAdapter mediaAdapter;

    @Override
    public void play(String audioType, String fileName) {
        switch (audioType) {
            case "mp3" -> System.out.println("AudioPlayer - Name: " + fileName);
            case "mp4", "vlc" -> {
                mediaAdapter = new MediaAdapter(audioType);
                mediaAdapter.play(audioType, fileName);
            }
            default -> System.out.println("Invalid media. " + audioType + " format not supported");
        }
    }
}
