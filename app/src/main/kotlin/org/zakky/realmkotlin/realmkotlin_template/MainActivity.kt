package org.zakky.realmkotlin.realmkotlin_template

import android.databinding.DataBindingUtil
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import io.realm.Realm
import org.zakky.realmkotlin.realmkotlin_template.databinding.ActivityMainBinding
import org.zakky.realmkotlin.realmkotlin_template.model.Person
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject lateinit var realm: Realm

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val contentView: Any = DataBindingUtil.setContentView(this, R.layout.activity_main)

        (application as MyApplication).inject(this)

        realm.executeTransaction {
            realm.createObject(Person::class.java)
        }

        Toast.makeText(this, "count: " + realm.where(Person::class.java).findAll().count(), Toast.LENGTH_SHORT).show()
    }

    override fun onDestroy() {
        super.onDestroy()

        realm.close()
    }
}
