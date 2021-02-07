package com.example.patterns_dunets_l23.structural

// Problem: streaming a video is a complicated process

class VideoStreamer {

    fun streamVideo (url: String) {

        val video = VideoSource().getVideo(url)

        val bitrate = BitrateReader().getBitrate()

        val decodedVideo = CompressionCodec().decode(video, bitrate)

        AudioMixer().mixAudio(decodedVideo)

        VideoPlayer().play(decodedVideo)
    }
}

class VideoPlayer {

    fun play(video: String) {}
}

class VideoSource {

    fun getVideo(url: String) = "newVideo"
}

class BitrateReader {

    fun getBitrate(): Int = 128
}

class CompressionCodec {

    fun decode(video: String, bitrate: Int) = "decodedVideo"
}

class AudioMixer {

    fun mixAudio(video: String) {}
}