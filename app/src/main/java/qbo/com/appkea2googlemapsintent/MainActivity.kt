package qbo.com.appkea2googlemapsintent

import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnirmaps.setOnClickListener {
            val intentmaps = Intent(Intent.ACTION_VIEW)
            intentmaps.setPackage("com.google.android.apps.maps")
            intentmaps.data = Uri.parse("geo:0,0?q=-16.510137, -68.126839")
            intentmaps.resolveActivity(packageManager)?.let {
                startActivity(intentmaps)
            }
        }
    }
}
