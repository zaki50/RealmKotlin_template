package org.zakky.realmkotlin.realmkotlin_template.component

import dagger.Module
import dagger.Provides
import io.realm.Realm
import io.realm.RealmConfiguration
import javax.inject.Singleton


@Module
class RealmConfigModule {
    @Provides
    fun provideRealmConfiguration(): RealmConfiguration {
        return RealmConfiguration.Builder().build()
    }
}