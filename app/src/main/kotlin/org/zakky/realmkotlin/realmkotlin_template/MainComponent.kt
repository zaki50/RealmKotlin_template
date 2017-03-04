package org.zakky.realmkotlin.realmkotlin_template

import dagger.Component

@RealmConfig
@Component(modules = arrayOf(MainModule::class), dependencies = arrayOf(RealmConfigComponent::class))
interface MainComponent {
    fun inject(act: MainActivity)
}