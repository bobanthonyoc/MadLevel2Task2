package com.example.madlevel2task2

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.item_quiz.view.*

class QuizAdapter(val context: MainActivity, val questions: List<Quiz>) : RecyclerView.Adapter<QuizAdapter.ViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_quiz, parent, false)
        return ViewHolder(view)

    }

    override fun getItemCount(): Int {
        return questions.size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val quiz = questions[position]
        holder.setData(quiz, position)
    }

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {

        fun setData(quiz: Quiz?, position: Int) {
            itemView.tvQuestions.text = quiz!!.quizText
        }
    }

}