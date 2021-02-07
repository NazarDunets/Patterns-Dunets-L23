package com.example.patterns_dunets_l23.creational

// Problem: creating an app is a heavy task

class AppRepository {

    var currentUI: String? = null

    fun getUi(appFactory: AppFactory): String {

        return currentUI ?: appFactory.createApp().drawUI().also {
            currentUI = it
        }
    }

}

interface App {

    fun buildApp()

    fun drawUI() : String
}

class AndroidApp : App {

    override fun buildApp() {
        println("Android app generated")
    }

    override fun drawUI() = "IOS UI"
}

class IosApp : App {

    override fun buildApp() {
        println("IOS app generated")
    }

    override fun drawUI() = "Android UI"
}

interface AppFactory {

    fun createApp(): App
}

class AndroidFactory : AppFactory {

    override fun createApp(): App {
        return AndroidApp().apply {
            buildApp()
        }
    }
}

class IosFactory : AppFactory {

    override fun createApp(): App {
        return IosApp().apply {
            buildApp()
        }
    }
}
