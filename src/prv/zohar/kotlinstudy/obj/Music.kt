package prv.zohar.kotlinstudy.obj

class Music {
    private lateinit var musicListener: MusicListener
    fun setMusicListener(musicListener: MusicListener) {
        this.musicListener = musicListener
    }
}