package launcher

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import com.example.taxation.MainActivity
import com.example.taxation.R
import com.example.taxation.login_activity

class launch_activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launch_activity)

        Handler().postDelayed({
            val startAct = Intent(this@launch_activity,
                login_activity::class.java)
            startActivity(startAct)
            finish()
        },2000)

        startActivity(intent)


    }
    }
