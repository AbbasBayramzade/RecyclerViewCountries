package com.info.recyclerviewselfstudy2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var CountryList:ArrayList<Countries>
    private lateinit var adapter:RvAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        rv.setHasFixedSize(true)
        rv.layoutManager = LinearLayoutManager(this)

        val c1 = Countries(1,"Azerbaycan")
        val c2 = Countries(1,"Amerika")
        val c3 = Countries(1,"Irlandiya")
        val c4 = Countries(1,"Almaniya")
        val c5 = Countries(1,"Norvec")
        val c6 = Countries(1,"Azerbaycan")
        val c7 = Countries(1,"Amerika")
        val c8 = Countries(1,"Irlandiya")
        val c9 = Countries(1,"Almaniya")
        val c10 = Countries(1,"Norvec")
        val c11 = Countries(1,"Azerbaycan")
        val c12 = Countries(1,"Amerika")
        val c13 = Countries(1,"Irlandiya")
        val c14 = Countries(1,"Almaniya")
        val c15 = Countries(1,"Norvec")

        CountryList = ArrayList<Countries>()
        CountryList.add(c1)
        CountryList.add(c2)
        CountryList.add(c3)
        CountryList.add(c4)
        CountryList.add(c5)
        CountryList.add(c6)
        CountryList.add(c7)
        CountryList.add(c8)
        CountryList.add(c9)
        CountryList.add(c10)
        CountryList.add(c11)
        CountryList.add(c12)
        CountryList.add(c13)
        CountryList.add(c14)
        CountryList.add(c15)

        adapter = RvAdapter(mContext = this,CountryList)
        rv.adapter = adapter

    }
}