package com.misri.calc_android_app

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.misri.calc_android_app.databinding.ActivityCalculatorBinding


/**
 * An example full-screen activity that shows and hides the system UI (i.e.
 * status bar and navigation/system bar) with user interaction.
 */
class CalculatorActivity : AppCompatActivity() {

    private lateinit var binding: ActivityCalculatorBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityCalculatorBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val keyItemArrayList: ArrayList<KeyItem> = arrayListOf(
            KeyItem(resources.getColor(R.color.orange,theme), resources.getColor(R.color.white,theme),"C"),
            KeyItem(resources.getColor(R.color.orange,theme), resources.getColor(R.color.white,theme),"%"),
            KeyItem(resources.getColor(R.color.orange,theme), resources.getColor(R.color.white,theme),"+/-"),
            KeyItem(resources.getColor(R.color.orange,theme), resources.getColor(R.color.white,theme),"÷"),
            KeyItem(resources.getColor(R.color.white,theme), resources.getColor(R.color.black,theme),"7"),
            KeyItem(resources.getColor(R.color.white,theme), resources.getColor(R.color.black,theme),"8"),
            KeyItem(resources.getColor(R.color.white,theme), resources.getColor(R.color.black,theme),"9"),
            KeyItem(resources.getColor(R.color.orange,theme), resources.getColor(R.color.white,theme),"x"),
            KeyItem(resources.getColor(R.color.white,theme), resources.getColor(R.color.black,theme),"4"),
            KeyItem(resources.getColor(R.color.white,theme), resources.getColor(R.color.black,theme),"5"),
            KeyItem(resources.getColor(R.color.white,theme), resources.getColor(R.color.black,theme),"6"),
            KeyItem(resources.getColor(R.color.orange,theme), resources.getColor(R.color.white,theme),"-"),
            KeyItem(resources.getColor(R.color.white,theme), resources.getColor(R.color.black,theme),"1"),
            KeyItem(resources.getColor(R.color.white,theme), resources.getColor(R.color.black,theme),"2"),
            KeyItem(resources.getColor(R.color.white,theme), resources.getColor(R.color.black,theme),"3"),
            KeyItem(resources.getColor(R.color.orange,theme), resources.getColor(R.color.white,theme),"+"),
            KeyItem(resources.getColor(R.color.white,theme), resources.getColor(R.color.black,theme),"0"),
            KeyItem(resources.getColor(R.color.white,theme), resources.getColor(R.color.black,theme),"( )"),
            KeyItem(resources.getColor(R.color.white,theme), resources.getColor(R.color.black,theme),"."),
            KeyItem(resources.getColor(R.color.orange,theme), resources.getColor(R.color.white,theme),"="),

        )

        val adapter = CalculatorGridViewAdapter(this, R.id.gridSymbols, keyItemArrayList)
        binding.gridSymbols.setAdapter(adapter)
    }
}