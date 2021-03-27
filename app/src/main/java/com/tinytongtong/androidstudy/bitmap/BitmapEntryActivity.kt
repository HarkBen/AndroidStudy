package com.tinytongtong.androidstudy.bitmap

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.tinytongtong.androidstudy.R
import com.tinytongtong.androidstudy.bitmap.compress.BitmapCompressActivity
import com.tinytongtong.androidstudy.bitmap.crop.BitmapCropActivity
import com.tinytongtong.androidstudy.bitmap.large.SubsamplingScaleImageViewActivity
import com.tinytongtong.androidstudy.bitmap.options.BitmapFactoryOptionsActivity
import com.tinytongtong.androidstudy.bitmap.tobinary.BitmapToBinaryActivity
import com.tinytongtong.androidstudy.bitmap.type.BitmapTypeActivity
import kotlinx.android.synthetic.main.activity_bitmap_entry.*

/**
 * @Description: Bitmap相关入口
 *
 * @Author wangjianzhou
 * @Date 2020/6/2 11:07 PM
 * @Version
 */
class BitmapEntryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_bitmap_entry)

        btnSubsamplingScaleImageView.setOnClickListener {
            startActivity(
                Intent(
                    this,
                    SubsamplingScaleImageViewActivity::class.java
                )
            )
        }

        btnBitmapOptions.setOnClickListener {
            startActivity(Intent(this, BitmapFactoryOptionsActivity::class.java))
        }

        btnBitmapType.setOnClickListener {
            startActivity(Intent(this, BitmapTypeActivity::class.java))
        }

        btnBitmapCompress.setOnClickListener {
            startActivity(Intent(this, BitmapCompressActivity::class.java))
        }

        btnBitmapToBinary.setOnClickListener {
            startActivity(Intent(this, BitmapToBinaryActivity::class.java))
        }

        btnBitmapGlideCrop.setOnClickListener {
            BitmapCropActivity.actionStart(this)
        }
    }
}