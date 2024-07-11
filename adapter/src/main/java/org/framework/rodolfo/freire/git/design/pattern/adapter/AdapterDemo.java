package org.framework.rodolfo.freire.git.design.pattern.adapter;

import org.framework.rodolfo.freire.git.design.pattern.adapter.audio.AudioPlayer;

public class AdapterDemo {

    public static void main(String[] args) {
        AudioPlayer audioPlayer = new AudioPlayer();
        audioPlayer.play("mp3", "How Can I Keep From Singing.mp3");
        audioPlayer.play("mp4", "Paul - Apostle of Christ.mp4");
        audioPlayer.play("vlc", "Supernatural.vlc");
        audioPlayer.play("avi", "The Chosen.avi");
    }
}
