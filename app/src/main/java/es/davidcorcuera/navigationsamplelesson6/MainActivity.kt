package es.davidcorcuera.navigationsamplelesson6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import es.davidcorcuera.navigationsamplelesson6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}