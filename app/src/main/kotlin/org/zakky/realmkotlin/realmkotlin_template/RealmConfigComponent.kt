package org.zakky.realmkotlin.realmkotlin_template

import dagger.Component
import io.realm.RealmConfiguration
import javax.inject.Singleton

@Component(modules = arrayOf(RealmConfigModule::class))
@Singleton
interface RealmConfigComponent {
    fun getDefaultConfiguration(): RealmConfiguration
}