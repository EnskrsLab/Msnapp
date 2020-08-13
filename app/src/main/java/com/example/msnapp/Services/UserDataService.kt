package com.example.msnapp.Services

import android.graphics.Color
import com.example.msnapp.Controller.App
import java.util.*

object UserDataService {

    var id = ""
    var avatarColor = ""
    var avatarName = ""
    var email = ""
    var name = ""

    fun logout() {

        id = ""
        avatarColor = ""
        avatarName = ""
        email = ""
        name = ""

        App.prefs.authToken = ""
        App.prefs.userEmail = ""
        App.prefs.isLoggedIn = false
    }

    fun returnAvatarColor(components: String) : Int {
        //[0.4470588235294118, 0.996078431372549, 0.7372549019607844, 1]
        //0.4470588235294118 0.996078431372549 0.7372549019607844 1

        val strippedColor = components
            .replace("[", "")
            .replace("]", "")
            .replace(",", "")

        var r = 0
        var g = 0
        var b = 0

        val scanner = Scanner(strippedColor)
        if (scanner.hasNext()) {
            r = (scanner.nextDouble() * 255).toInt()
            g = (scanner.nextDouble() * 255).toInt()
            b = (scanner.nextDouble() * 255).toInt()
        }

        return Color.rgb(r,g,b)

    }
}