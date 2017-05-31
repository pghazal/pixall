package com.bangbang.pixall.permission

import android.Manifest


enum class PixallPermission(val androidPermission: String, val requestCode: Int) {
    CAMERA(Manifest.permission.CAMERA, 10),
    WRITE_EXTERNAL_STORAGE(Manifest.permission.WRITE_EXTERNAL_STORAGE, 11)
}