package org.zakky.realmkotlin.realmkotlin_template

import android.app.Application
import io.realm.Realm

class MyApplication : Application() {

    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
    }

    public fun inject(act: MainActivity) {
        DaggerMainComponent.create().inject(act)
    }
}