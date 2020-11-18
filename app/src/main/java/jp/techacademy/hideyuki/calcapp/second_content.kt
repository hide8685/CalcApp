package jp.techacademy.hideyuki.calcapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_second_content.*

class second_content : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second_content)

        val value1 = intent.getIntExtra("VALUE1",0)
        val value2 = intent.getIntExtra("VALUE2",0)
        val result = intent.getIntExtra("RESULT",0)
        val fugo = intent.getStringExtra("FUGO")
        val amari = intent.getIntExtra("AMARI",0)

        if (amari == 0) {
            textView.text = "$value1 $fugo $value2 = $result"
        }else{
            textView.text = "$value1 $fugo $value2 = $result 余り $amari"
        }
    }
}