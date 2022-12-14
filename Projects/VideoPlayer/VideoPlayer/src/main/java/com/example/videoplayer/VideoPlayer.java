package com.example.videoplayer;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;

import javafx.scene.layout.BorderPane;

public class VideoPlayer extends BorderPane {

    Media media;
    MediaPlayer mediaplayer;
    MediaView mediaView;
    Pane pane;

    //Video Bar
    VideoBar bar;



    public VideoPlayer(String filepath) {

        media = new Media(filepath);
        mediaplayer =new MediaPlayer(media);
        mediaView =new MediaView(mediaplayer);
        pane = new Pane();

        pane.getChildren().add(mediaView);
        setCenter(pane);

        //add Video bar here

        bar = new VideoBar(mediaplayer);
        setBottom(bar);

        mediaplayer.play();
    }
}
