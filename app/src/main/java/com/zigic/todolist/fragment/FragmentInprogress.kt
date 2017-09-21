package com.zigic.todolist.fragment

import android.os.Bundle
import android.support.v4.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.zigic.todolist.adapter.TodolistAdapter
import org.jetbrains.anko.AnkoContext
import org.jetbrains.anko.support.v4.ctx

/**
 * Created by zigic on 15/09/17.
 */
class FragmentInprogress : Fragment(){
    val data = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
    }

    override fun onCreateView(inflater: LayoutInflater?, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        return FragmentInprogressUI(TodolistAdapter(data)).createView(AnkoContext.create(ctx, this))
    }

}