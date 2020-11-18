package jp.techacademy.hideyuki.calcapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity :  AppCompatActivity(), View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        plus.setOnClickListener(this)
        minus.setOnClickListener(this)
        time.setOnClickListener(this)
        div.setOnClickListener(this)
    }

    override fun onClick(v: View?) {
        val intent = Intent(this, second_content::class.java)

        if(editText1.text.toString() == "" || editText2.text.toString() == ""){
            val snackbar = Snackbar.make(rootLayout , "入力に不備があります", Snackbar.LENGTH_LONG)
            snackbar.show()
            return
        }

        var num1 = editText1.text.toString().toDouble()
        var num2 = editText2.text.toString().toDouble()

        intent.putExtra("VALUE1",num1)
        intent.putExtra("VALUE2",num2)


        var result = 0.0
        var fugo = ""

        if (v != null) {
            when(v.id){
                R.id.plus -> {
                    result = num1 + num2
                    fugo = "+"
                }
                R.id.minus -> {
                    result = num1 - num2
                    fugo = "-"
                }
                R.id.time -> {
                    result = num1 * num2
                    fugo = "×"
                }
                R.id.div -> {
                    result = num1 / num2
                    fugo = "÷"
                }
            }
        }

        intent.putExtra("RESULT",result)
        intent.putExtra("FUGO",fugo)

        startActivity(intent)
    }
}