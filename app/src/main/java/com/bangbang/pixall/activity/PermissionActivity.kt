package com.bangbang.pixall.activity

import android.support.v7.app.AppCompatActivity
import android.widget.Toast
import com.bangbang.pixall.permission.PermissionChecker
import com.bangbang.pixall.permission.PixallPermission

open class PermissionActivity : AppCompatActivity() {

    val permissionChecker = PermissionChecker()

    override fun onResume() {
        super.onResume()
        // TODO handle deny answer
        if (!permissionChecker.hasPermissionBeenGranted(this, PixallPermission.CAMERA)) {
            permissionChecker.askForPermission(this, PixallPermission.CAMERA)
        }
    }

    override fun onRequestPermissionsResult(requestCode: Int, permissions: Array<out String>, grantResults: IntArray) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults)

        when (requestCode) {
            PixallPermission.CAMERA.requestCode -> Unit
            else -> {
                Toast.makeText(this, "L'appareil photo est nécessaire pour utiliser l'app", Toast.LENGTH_SHORT).show()
            }
        }
    }
}