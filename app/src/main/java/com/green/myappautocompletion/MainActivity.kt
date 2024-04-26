package com.green.myappautocompletion

import android.annotation.SuppressLint
import android.app.TabActivity
import android.os.Bundle
import android.view.View
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.Button
import android.widget.MultiAutoCompleteTextView
import android.widget.ViewFlipper
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.google.android.material.tabs.TabLayout

class MainActivity : TabActivity() {


    @Suppress("deprecation")
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

//        setContentView(R.layout.activity_main3)
//
//        var tabHost = this.tabHost
//
//        var tabSpec1 = tabHost.newTabSpec("TAG1").setIndicator("강아지")
//        tabSpec1.setContent(R.id.imageView1)
//        tabHost.addTab(tabSpec1)
//
//        var tabSpec2 = tabHost.newTabSpec("TAG2").setIndicator("고양이")
//        tabSpec2.setContent(R.id.imageView2)
//        tabHost.addTab(tabSpec2)
//
//        var tabSpec3 = tabHost.newTabSpec("TAG3").setIndicator("토끼")
//        tabSpec3.setContent(R.id.imageView3)
//        tabHost.addTab(tabSpec3)
//
//        var tabSpec4 = tabHost.newTabSpec("TAG4").setIndicator("말")
//        tabSpec4.setContent(R.id.imageView4)
//        tabHost.addTab(tabSpec4)
//
//        tabHost.currentTab = 0


        //아래 코드 형태로 변경

        //abActivity 클래스는 Android API 레벨 13부터 사용이 권장되지 않으며, API 레벨 21부터는 완전히 제거되었습니다.
        // 대신 Fragment 및 ViewPager와 같은 더 최신의 기술을 사용하여 탭을 구현하는 것이 좋습니다.
        // 아래는 TabLayout과 ViewPager를 사용하여 탭을 구현하는 예시입니다.


//        class MainActivity : AppCompatActivity() {
//
//            override fun onCreate(savedInstanceState: Bundle?) {
//                super.onCreate(savedInstanceState)
//                setContentView(R.layout.activity_main)
//
//                val viewPager: ViewPager = findViewById(R.id.viewPager)
//                val tabLayout: TabLayout = findViewById(R.id.tabLayout)
//
//                val adapter = TabAdapter(supportFragmentManager)
//                adapter.addFragment(DogFragment(), "강아지")
//                adapter.addFragment(CatFragment(), "고양이")
//                adapter.addFragment(RabbitFragment(), "토끼")
//                adapter.addFragment(HorseFragment(), "말")
//
//                viewPager.adapter = adapter
//                tabLayout.setupWithViewPager(viewPager)
//            }
//        }












//        var items = arrayOf("짜장", "짬뽕", "볶음밥")
//        var items = arrayOf("CSI-뉴욕", "CSI-라스베가스", "CSI-마이애미", "Friends", "Fringe", "Lost")
//
//        var auto = findViewById<AutoCompleteTextView>(R.id.autoCompleteTextView1)
//        var adapter = ArrayAdapter(this, android.R.layout.simple_dropdown_item_1line, items)
//        auto.setAdapter(adapter)
//
//        var multi = findViewById<MultiAutoCompleteTextView>(R.id.multiAutoCompleteTextView1)
//        var token = MultiAutoCompleteTextView.CommaTokenizer()
//        multi.setTokenizer(token)
//        multi.setAdapter(adapter)


//        var btnPrev : Button
//        var btnNext : Button
//        var vFlipper : ViewFlipper
//
//        btnPrev = findViewById<Button>(R.id.btnPrev)
//        btnNext = findViewById<Button>(R.id.btnNext)
//        vFlipper = findViewById<ViewFlipper>(R.id.viewFlipper1)
//
//
//
//        btnPrev.setOnClickListener {
//            vFlipper.showPrevious()
//        }
//
//
//        btnNext.setOnClickListener {
//            vFlipper.showNext()
//        }

    }
}