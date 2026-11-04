package com.jgcamera.ultra.color

import android.hardware.camera2.params.ColorSpaceTransform
import android.hardware.camera2.params.RggbChannelVector
import android.util.Rational

object SamsungS7ColorScience {
    // 3x3 Color Correction Transform Matrix for natural skin tone warmth and rich foliage
    val S7_COLOR_TRANSFORM_MATRIX = ColorSpaceTransform(
        arrayOf(
            Rational(112, 100), Rational(-8, 100), Rational(-4, 100),
            Rational(-5, 100),  Rational(110, 100), Rational(-5, 100),
            Rational(-2, 100),  Rational(-6, 100),  Rational(108, 100)
        )
    )

    fun evaluateToneCurve(input: Float): Float {
        val x = input.coerceIn(0f, 1f)
        val a = 2.51f
        val b = 0.03f
        val c = 2.43f
        val d = 0.59f
        val e = 0.14f
        val raw = (x * (a * x + b)) / (x * (c * x + d) + e)
        val peak = (1.0f * (a * 1.0f + b)) / (1.0f * (c * 1.0f + d) + e)
        return (raw / peak).coerceIn(0f, 1f)
    }
}
