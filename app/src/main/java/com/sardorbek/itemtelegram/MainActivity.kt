package com.sardorbek.itemtelegram

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_main.*
import java.lang.reflect.Member

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initView()
        val member = prepareMemberList()
        refreshAdapter(member)

        val model = ArrayList<Model>()
        model.add(Model(R.drawable.saparoge,"Damas","Nima qilayabsan ","09:29","13"))
        model.add(Model(R.drawable.izz,"Jamshid","Ishlar qale ","10:12","36"))
        model.add(Model(R.drawable.jorabek,"Jo'rabek","Juma muborak oshna  ","22:19","1"))
        model.add(Model(R.drawable.saparoge,"G'olibjon","bugun kelasanmi soat 10 bo'ldi ","21:23","10"))
        model.add(Model(R.drawable.izz,"Izzatillo","Assalomu Alaykum do'stim ","22:14","7"))
        model.add(Model(R.drawable.saparoge,"Akaxonlar","Toqqa boradigonla bomi eee ","12:34","65"))
        model.add(Model(R.drawable.imag5,"Shumchol","Kuchli sel oqizib kettti ","01:04","3"))
        model.add(Model(R.drawable.image6,"VodiyBozor","bo'rka moshina ","12:34","2"))
        model.add(Model(R.drawable.saparoge,"Telegram","Your ","01:06","12"))
        model.add(Model(R.drawable.saparoge,"Animal_shop","bizda oldinkakku narxi 200$ ","12:34","3"))
        model.add(Model(R.drawable.bmw,"BMW","new electronik car ","08:34","1"))
        model.add(Model(R.drawable.izz,"Izzatillo","Assalomu Alaykum do'stim ","22:14","7"))
        model.add(Model(R.drawable.saparoge,"Akaxonlar","Toqqa boradigonla bomi eee ","12:34","65"))
        model.add(Model(R.drawable.imag5,"Shumchol","Kuchli sel oqizib kettti ","01:04","3"))
        model.add(Model(R.drawable.image6,"VodiyBozor","bo'rka moshina ","12:34","2"))
        model.add(Model(R.drawable.saparoge,"Telegram","Your ","01:06","12"))


        val adapter = AdapterVertical(model)
        recyclerVertical.adapter =adapter
        recyclerVertical.layoutManager = LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false)
    }

    private fun initView(){
        recycler_view.layoutManager = LinearLayoutManager(this
            ,LinearLayoutManager.HORIZONTAL,false)
    }
    private fun refreshAdapter(member: List<com.sardorbek.itemtelegram.Member>){
        val adapter = CustomAdapter(member)
        recycler_view.adapter = adapter
    }



    private fun prepareMemberList():List<com.sardorbek.itemtelegram.Member>{
        val member = ArrayList<com.sardorbek.itemtelegram.Member>(
        )


            member.add(Member("Chats"))
            member.add(Member("Group"))
            member.add(Member("Frends"))
            member.add(Member("Animals"))
            member.add(Member("Birds"))
            member.add(Member("Cars"))
            member.add(Member("Family"))
            member.add(Member("Countries"))
            member.add(Member("Movies"))
            member.add(Member("Home"))
            member.add(Member("Chats"))

        return member

    }

}