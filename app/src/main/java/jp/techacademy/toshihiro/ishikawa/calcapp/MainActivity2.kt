package jp.techacademy.toshihiro.ishikawa.calcapp

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.snackbar.Snackbar
import kotlinx.android.synthetic.main.activity_main2.*
import android.util.Log
import com.google.android.material.snackbar.Snackbar.*

class MainActivity2 : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        textView.text= intent.getIntExtra("VALUE1", 0).toString()

}
    }


