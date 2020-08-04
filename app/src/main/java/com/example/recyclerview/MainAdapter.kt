package com.example.recyclerview

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
//number of items
class MainAdapter : RecyclerView.Adapter<CustomViewHolder> () {
    val person = listOf("Name:Mary,Age:23,D.O.B:23/6/1997,Hobby:cooking,Name:Grace,Age:22,D.O.B:20/6/1998,Hobby:swimming,Name:Jerry,Age:21,D.O.B:2/6/1999,Hobby:racing,Name:FaithAge:20,D.O.B:3/3/2000,Hobby:running,Name:Tom,Age:19,D.O.B:23/6/2001,Hobby:sleeping,Name:Jeff,Age:18,D.O.B:23/6/2002,Hobby:eating,Name:Carol,Age:18,D.O.B:21/5/2003,Hobby:wrestling,Name:Rose,Age:17,D.O.B:23/5/2003,Hobby:crafting,Name:Seth,Age:5,D.O.B:24/6/2014,Hobby:playing,Name:Zuri,Age:6,D.O.B:14/7/2013,Hobby:playing football")
    override fun getItemCount(): Int {
        return person.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CustomViewHolder {
       val layoutInflater = LayoutInflater.from(parent?.context)
        val cellForRow = layoutInflater.inflate(R.layout.person_row, parent, attachToRoot: false)
        return CustomViewHolder(cellForRow)
    }

    override fun onBindViewHolder(holder: CustomViewHolder, position: Int) {
        val person = people.get(position)
        holder?.view?.textView_person_one?.text = person
    }
}
class CustomViewHolder(val view: View): RecyclerView.ViewHolder(view){

}