package es.davidcorcuera.navigationsamplelesson6

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.setupWithNavController
import es.davidcorcuera.navigationsamplelesson6.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        setSupportActionBar(binding.toolbar)

        // get NavController
        val navHostFragment =
            supportFragmentManager.findFragmentById(R.id.nav_host) as NavHostFragment
        val navController = navHostFragment.navController

        // get appBarConfiguration
        val appBarConfiguration = AppBarConfiguration(navController.graph)

        // assign NavigationUI to toolbar
        binding.toolbar
            .setupWithNavController(navController, appBarConfiguration)

    }

}