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

// boshqasi
package com.example.sinov

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
// bitta matndi ikki hil joyini kesib olamiz
class MainActivity : AppCompatActivity(){
    var text: String ="в магазине <осталось 25> xvxvkldfjgs <dkgjd> df dgv "
    var tvText: TextView? = null // birinchi textni idsi
    var textikki: TextView? = null // ikkinchi textni idsi

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvText = findViewById(R.id.tvText) // birinchi textni id ordali topyapmiz
        textikki = findViewById(R.id.textikki) // ikkinchi textni id ordali topyapmiz
        val subText:String = text.substringAfter('<')
        val subText2:String = subText.substringBefore('>')
        val subText3:String = text.substringAfter('>')
        val subText4:String = subText3.substringAfter('<')
        val subText5:String = subText4.substringBefore('>')
        textikki?.setText(subText5)
        tvText?.setText(subText2)
    }

}
