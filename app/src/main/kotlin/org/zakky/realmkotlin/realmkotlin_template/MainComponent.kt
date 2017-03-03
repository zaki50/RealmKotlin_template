package org.zakky.realmkotlin.realmkotlin_template

import dagger.Component

@Component(modules = arrayOf(MainModule::class))
interface MainComponent {
    fun inject(act: MainActivity)
}