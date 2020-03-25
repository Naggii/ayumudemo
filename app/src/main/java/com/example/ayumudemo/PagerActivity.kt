package com.example.ayumudemo
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_page.*

class PagerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        supportActionBar?.title = "View Pager"
        supportActionBar?.setDisplayHomeAsUpEnabled(true)

        setContentView(R.layout.activity_page)

        /// フラグメントのリストを作成
        val fragmentList = arrayListOf<Fragment>(
            Sample1Fragment(),
            Sample2Fragment(),
            Sample3Fragment()
        )

        /// adapterのインスタンス生成
        val adapter = SamplePagerAdapter(supportFragmentManager, fragmentList)
        /// adapterをセット
        viewPager.adapter = adapter
    }

    override fun onSupportNavigateUp(): Boolean {
        finish()
        return super.onSupportNavigateUp()
    }
}