package org.framework.rodolfo.freire.git.design.patterns.adapter.media;

import org.framework.rodolfo.freire.git.design.patterns.adapter.player.AdvancedMediaPlayer;
import org.framework.rodolfo.freire.git.design.patterns.adapter.player.MediaPlayer;
import org.framework.rodolfo.freire.git.design.patterns.adapter.player.Mp4Player;
import org.framework.rodolfo.freire.git.design.patterns.adapter.player.VlcPlayer;

public class MediaAdapter implements MediaPlayer {

    private AdvancedMediaPlayer advancedMusicPlayer;

    public MediaAdapter(String audioType) {
        switch (audioType) {
            case "mp4" -> advancedMusicPlayer = new Mp4Player();
            case "vlc" -> advancedMusicPlayer = new VlcPlayer();
            default -> {
            }
        }
    }

    @Override
    public void play(String audioType, String fileName) {
        advancedMusicPlayer.player(fileName);
    }

}
