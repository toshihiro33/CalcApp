package jp.techacademy.toshihiro.ishikawa.calcapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import com.google.android.material.snackbar.Snackbar.*
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity(),View.OnClickListener {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        button1.setOnClickListener(this)
        button2.setOnClickListener(this)
        button3.setOnClickListener(this)
        button4.setOnClickListener(this)

    }

    override fun onClick(v: View) {
        if (v.id==R.id.button1){
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(
                "VALUE1",
                editText1.text.toString().toDouble() +editText2.text.toString().toDouble()
            )
            startActivity(intent)
           }else if(v.id==R.id.button2) {
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(
                "VALUE1",
                Integer.parseInt(editText1.text.toString()) - Integer.parseInt(editText2.text.toString())
            )
            startActivity(intent)
            Log.d("kotlintest",(editText1.text.toString()).toInt())
            }else if(v.id==R.id.button3){
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(
                "VALUE1",
                Integer.parseInt(editText1.text.toString()) * Integer.parseInt(editText2.text.toString())
            )
            startActivity(intent)}else if(v.id==R.id.button4){
            val intent = Intent(this, MainActivity2::class.java)
            intent.putExtra(
                "VALUE1",
                Integer.parseInt(editText1.text.toString()) / Integer.parseInt(editText2.text.toString())
            )
            startActivity(intent)}

        }

    }

