package com.example.taxation

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.FrameLayout
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.coordinatorlayout.widget.CoordinatorLayout
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.google.android.material.navigation.NavigationView
import fragments.*
import launcher.launch_activity

class MainActivity : AppCompatActivity() {
    lateinit var drawerLayout: DrawerLayout
    lateinit var coordinatorlayout: CoordinatorLayout
    lateinit var toolbar: Toolbar
    lateinit var frameLayout: FrameLayout
    lateinit var navigation: NavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        drawerLayout = findViewById(R.id.drawer_layout)
        coordinatorlayout = findViewById(R.id.coordinator_layout)
        toolbar = findViewById(R.id.toolbar)
        frameLayout = findViewById(R.id.framelayout)
        navigation = findViewById(R.id.navigation_view)
        var previouMenuitem: MenuItem? = null
        setUptoolbar()
        openHome()


        val actionDrawerToggle = ActionBarDrawerToggle(
            this@MainActivity,
            drawerLayout,
            R.string.open_drawer,
            R.string.close_drawer
        )

        drawerLayout.addDrawerListener(actionDrawerToggle)
        actionDrawerToggle.syncState()
        navigation.setNavigationItemSelectedListener {
            if (previouMenuitem != null) {
                previouMenuitem?.isChecked = false
            }
            it.isCheckable = true
            it.isChecked = true
            previouMenuitem = it

            when (it.itemId) {
                R.id.home -> {
                    openHome()
                    drawerLayout.closeDrawers()

                }
                R.id.services -> {
                    openServices()
                    drawerLayout.closeDrawers()

                }
                R.id.careers -> {
                    openCareer()
                    drawerLayout.closeDrawers()
                }
                R.id.refer_app -> {
                    openRefer()
                    drawerLayout.closeDrawers()

                }
                R.id.blogs -> {
                    openBlog()
                    drawerLayout.closeDrawers()

                }
                R.id.calculator -> {
                    openCalculator()
                    drawerLayout.closeDrawers()

                }
                R.id.connect -> {
                    openConnect()
                    drawerLayout.closeDrawers()

                }
                R.id.about -> {
                    openAbout()
                    drawerLayout.closeDrawers()

                }


            }
            return@setNavigationItemSelectedListener true

        }

    }


    private fun setUptoolbar() {
        setSupportActionBar(toolbar)
        supportActionBar?.title = "Home"
        supportActionBar?.setHomeButtonEnabled(true)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {


        val id = item.itemId
        if (id == android.R.id.home) {
            drawerLayout.openDrawer(GravityCompat.START)
        }

        return super.onOptionsItemSelected(item)

    }

    fun openHome() {
        val fragment = home_frag()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayout, fragment)
            .addToBackStack("home_frag")
        transaction.commit()
        supportActionBar?.title = "Home"
        navigation.setCheckedItem(R.id.home)
    }

    fun openServices() {
        val fragment = services_fragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayout, fragment)
            .addToBackStack("services_fragment")
        transaction.commit()
        supportActionBar?.title = "Services"
    }

    fun openCareer() {
        val fragment = career_fragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayout, fragment)
            .addToBackStack("career_fragment")
        transaction.commit()
        supportActionBar?.title = "Career"
    }

    fun openRefer() {
        val fragment = refer_fragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayout, fragment)
            .addToBackStack("refer_fragment")
        transaction.commit()
        supportActionBar?.title = "Refer"
    }

    fun openBlog() {
        val fragment = blog_fragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayout, fragment)
            .addToBackStack("blog_fragment")
        transaction.commit()
        supportActionBar?.title = "Blogs"
    }

    fun openCalculator() {
        val fragment = calc_fragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayout, fragment)
            .addToBackStack("calc_fragment")
        transaction.commit()
        supportActionBar?.title = "Tax Calculator"
    }

    fun openConnect() {
        val fragment = connect_fragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayout, fragment)
            .addToBackStack("connect_fragment")
        transaction.commit()
        supportActionBar?.title = "Connect via CALL or MESSAGE"
    }

    fun openAbout() {
        val fragment = about_fragment()
        val transaction = supportFragmentManager.beginTransaction()
        transaction.replace(R.id.framelayout, fragment)
            .addToBackStack("about_fragment")
        transaction.commit()
        supportActionBar?.title = "About Us"
    }

    override fun onBackPressed() {
        val frag = supportFragmentManager.findFragmentById(R.id.framelayout)
        when (frag) {
            !is home_frag -> openHome()

            else -> super.onBackPressed()
        }
    }
}
