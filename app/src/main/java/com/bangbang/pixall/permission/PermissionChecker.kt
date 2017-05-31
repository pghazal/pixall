package com.bangbang.pixall.permission

import android.app.Activity
import android.content.Context
import android.content.pm.PackageManager
import android.support.v4.app.ActivityCompat
import android.support.v4.content.ContextCompat


class PermissionChecker {

    fun hasPermissionBeenGranted(context: Context, permission: PixallPermission): Boolean {
        return ContextCompat.checkSelfPermission(context, permission.androidPermission) == PackageManager.PERMISSION_GRANTED
    }

    fun askForPermission(activity: Activity, permission: PixallPermission) {
        ActivityCompat.requestPermissions(activity, arrayOf(permission.androidPermission), permission.requestCode)
    }
}