package org.zakky.realmkotlin.realmkotlin_template.component

import dagger.Module
import dagger.Provides
import io.realm.Realm
import io.realm.RealmConfiguration


@Module
class MainModule {
    @Provides
    fun provideRealm(conf: RealmConfiguration): Realm {
        return Realm.getInstance(conf)
    }
}