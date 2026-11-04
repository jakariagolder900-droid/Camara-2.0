package com.jgcamera.ultra.hardware

import android.content.Context
import android.hardware.camera2.CameraCharacteristics
import android.hardware.camera2.CameraManager
import com.jgcamera.ultra.model.SensorCapabilities

class HardwareCapabilityDetector(private val context: Context) {
    // Inspects CameraCharacteristics to detect 50MP mode, Level 3 ZSL, RAW, OIS/EIS
}
