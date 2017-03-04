package org.zakky.realmkotlin.realmkotlin_template

import dagger.Component

@RealmConfigScope
@Component(modules = arrayOf(MainModule::class), dependencies = arrayOf(RealmConfigComponent::class))
interface MainComponent {
    fun inject(act: MainActivity)
}