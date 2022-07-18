package ani.saikou.settings

import java.io.Serializable

data class PlayerSettings(
    //Video
    var videoInfo: Boolean = true,
    var defaultSpeed: Int = 5,
    var cursedSpeeds: Boolean = false,
    var resize: Int = 0,
    var primaryColor: Int = 4,
    var secondaryColor: Int = 0,
    var outline: Int = 0,
    var font: Int = 0,
    var fontSize: Int = 20,
    var locale: Int = 0,

    //Auto
    var autoPlay: Boolean = true,
    var autoSkipFiller: Boolean = false,

    //Update Progress
    var askIndividual: Boolean = true,
    var updateForH: Boolean = false,
    var watchPercentage: Float = 0.8f,

    //Behaviour
    var alwaysContinue: Boolean = true,
    var focusPause: Boolean = true,
    var gestures: Boolean = true,
    var doubleTap: Boolean = true,
    var seekTime: Int = 10,
    var skipTime: Int = 85,
    var cast: Boolean = false,
    var pip: Boolean = true,
    var alwaysMinimize: Boolean = false,
) : Serializable
