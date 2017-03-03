package org.zakky.realmkotlin.realmkotlin_template

import dagger.Module
import dagger.Provides
import io.realm.Realm
import io.realm.RealmConfiguration
import javax.inject.Singleton


@Module
class MainModule {
    @Provides
    //@Singleton
    fun provideRealmConfiguration(): RealmConfiguration {
        return RealmConfiguration.Builder().build()
    }

    @Provides
    fun provideRealm(conf: RealmConfiguration): Realm {
        return Realm.getInstance(conf)
    }
}