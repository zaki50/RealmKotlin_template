package org.zakky.realmkotlin.realmkotlin_template

import android.app.Application
import io.realm.Realm

class MyApplication : Application() {

    val component: MainComponent = DaggerMainComponent.builder()
            .realmConfigComponent(DaggerRealmConfigComponent.create())
            .build()

    override fun onCreate() {
        super.onCreate()

        Realm.init(this)
    }

    fun inject(act: MainActivity) {
        component.inject(act)
    }
}
