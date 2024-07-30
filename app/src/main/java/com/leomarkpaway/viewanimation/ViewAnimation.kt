package com.leomarkpaway.viewanimation

import android.content.Context
import android.view.View
import android.view.animation.AnimationUtils

fun Context.startAnimation(view: View, anim: Int) =
    view.startAnimation(AnimationUtils.loadAnimation(this, anim))