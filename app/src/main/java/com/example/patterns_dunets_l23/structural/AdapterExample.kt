package com.example.patterns_dunets_l23.structural

import android.content.Context
import android.view.View
import android.widget.TextView

// Problem: input data in string format

object InputData {
    val text1 = "FooBarFooBar"
}

class App {

    fun drawView(view: View){
        println("View drawn")
    }

}

class TextAdapter() {

    fun getTextView(textData: String, context: Context): TextView {
        return TextView(context).apply{
            text = textData
        }
    }
}