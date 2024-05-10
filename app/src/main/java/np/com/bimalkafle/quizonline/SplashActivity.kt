import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import np.com.bimalkafle.quizonline.MainActivity
import np.com.bimalkafle.quizonline.R

class SplashActivity : AppCompatActivity() {

    private val splashDelay: Long = 3000 // Delay in milliseconds

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        // Load animations
        val logoAnimation = AnimationUtils.loadAnimation(this, R.anim.logo_animation)
        val textAnimation = AnimationUtils.loadAnimation(this, R.anim.text_animation)

        // Get views
        val ivLogo: ImageView = findViewById(R.id.iv_logo)
        val tvAppName: TextView = findViewById(R.id.tv_app_name)

        // Start animations
        ivLogo.startAnimation(logoAnimation)
        tvAppName.startAnimation(textAnimation)

        // Navigate to the main activity after the delay
        Handler().postDelayed({
            val intent = Intent(this@SplashActivity, MainActivity::class.java)
            startActivity(intent)
            finish()
        }, splashDelay)
    }
}