package org.framework.rodolfo.freire.git.design.patterns.adapter;

import org.framework.rodolfo.freire.git.design.patterns.adapter.audio.AudioPlayer;

public class AdapterPatternDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "Shoot to Thrill.mp3");
        audioPlayer.play("mp4", "Back In Black.mp4");
        audioPlayer.play("vlc", "T.N.T.vlc");
        audioPlayer.play("avi", "Thunderstruck.avi");
    }
}
