package tech.ozil.kotlinsecond

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    internal lateinit var tapMeButton: Button
    internal lateinit var alperenText: TextView
    internal lateinit var TAG: String
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        TAG="alperenozil"
        alperenText=findViewById(R.id.textViewMiddle)
        tapMeButton=findViewById(R.id.buttonOverTextViewMiddle)
        tapMeButton.setOnClickListener(View.OnClickListener {
            Log.d(TAG, "onCreate: tap")
        })
    }
}