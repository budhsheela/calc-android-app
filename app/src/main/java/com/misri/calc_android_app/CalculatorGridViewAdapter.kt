package com.misri.calc_android_app

import android.R
import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import com.misri.calc_android_app.databinding.CardItemBinding


class CalculatorGridViewAdapter(context: Context, resource: Int, objects: MutableList<KeyItem>) :
    ArrayAdapter<KeyItem>(context, resource, objects) {
        lateinit var cardItemBinding: CardItemBinding
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var row = convertView

        if (row == null) {
            val inflater = context.getSystemService(Context.LAYOUT_INFLATER_SERVICE) as LayoutInflater
            cardItemBinding = CardItemBinding.inflate(inflater, parent, false)
            row = cardItemBinding.root
        } else {
            cardItemBinding = CardItemBinding.bind(row)
        }
        val keyItem = getItem(position)
        keyItem?.let {
            cardItemBinding.txtKeyElement.text = keyItem!!.key
            cardItemBinding.txtKeyElement.setBackgroundColor(keyItem!!.backgroundColor)
            cardItemBinding.txtKeyElement.setTextColor(keyItem!!.textColor)
        }
        return row
    }
}