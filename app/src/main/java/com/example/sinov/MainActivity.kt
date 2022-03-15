package com.example.sinov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity(){
    var text: String ="в магазине <осталось 25> xvxvv "
    var tvText: TextView? = null
    var text2: String ="в магазине <осadasdталось 25> xvxvv "
    var textikki: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tvText)
        val subText:String = text.substringAfter('<')
        val subText2:String = subText.substringBefore('>')
        tvText?.setText(subText2)
        textikki = findViewById(R.id.textikki)
        val subText3:String = text2.substringAfter('<')
        val subText4:String = subText3.substringBefore('>')
        textikki?.setText(subText4)
    }

}