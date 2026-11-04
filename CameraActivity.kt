package com.jgcamera.ultra

import android.Manifest
import android.os.Build
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.jgcamera.ultra.engine.Camera2Controller
import com.jgcamera.ultra.hardware.HardwareCapabilityDetector
import com.jgcamera.ultra.ui.screens.CameraScreen

class CameraActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        // Request 120Hz display refresh rate on AMOLED display
        window.attributes.let { params ->
            display?.supportedModes?.maxByOrNull { it.refreshRate }?.let {
                params.preferredDisplayModeId = it.modeId
                window.attributes = params
            }
        }
        setContent {
            // Full-screen Samsung Flagship camera UI
        }
    }
}
