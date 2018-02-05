package prv.zohar.kotlinstudy.obj

object Test11_1 {
    private var music: Music = Music()
    private var currentState = "pause"
    @JvmStatic
    fun main(args: Array<String>) {
        music.setMusicListener(object : MusicListener {
            override fun start() {
                currentState = "start"
            }

            override fun pause() {
                currentState = "pause"
            }

            override fun stop() {
                currentState = "stop"
            }
        })

        val a: A11 = object : A11(1), MusicListener {
            override val y: Int = 15

            override fun start() {}

            override fun pause() {}

            override fun stop() {}
        }

        val adHoc = object {
            val x = 1
            val y = 2
        }

        println("x = ${adHoc.x}, y = ${adHoc.y}")


        /* 单例模式 */
        SingleManager.printSingle()
        SingleManager.registerSingleClass(SingleClass(1))
        SingleManager.printSingle()
        SingleManager.registerSingleClass(SingleClass(2))
        SingleManager.printSingle()
    }
}