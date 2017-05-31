package com.bangbang.pixall.activity

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.bangbang.pixall.R
import com.bangbang.pixall.permission.PermissionChecker
import com.bangbang.pixall.permission.PixallPermission

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val permissionChecker = PermissionChecker()
        permissionChecker.askForPermission(this, PixallPermission.CAMERA)
    }
}
