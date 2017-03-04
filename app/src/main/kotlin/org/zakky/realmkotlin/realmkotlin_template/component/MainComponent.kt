package org.zakky.realmkotlin.realmkotlin_template.component

import dagger.Component
import org.zakky.realmkotlin.realmkotlin_template.MainActivity

@RealmConfigScope
@Component(modules = arrayOf(MainModule::class), dependencies = arrayOf(RealmConfigComponent::class))
interface MainComponent {
    fun inject(act: MainActivity)
}