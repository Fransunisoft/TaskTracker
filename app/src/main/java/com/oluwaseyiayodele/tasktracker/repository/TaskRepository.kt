package com.oluwaseyiayodele.tasktracker.repository

import androidx.lifecycle.LiveData
import com.oluwaseyiayodele.tasktracker.database.dao.TaskDao
import com.oluwaseyiayodele.tasktracker.model.Task
import javax.inject.Inject

class TaskRepository @Inject constructor(private val dao: TaskDao) {


    suspend fun insertTask(task: Task) = dao.insertTask(task)

    suspend fun updateTask(task: Task) = dao.updateTask(task)

    suspend fun deleteTask(task: Task) = dao.deleteTask(task)

    suspend fun getTaskById(id: String) = dao.getTaskById(id)

    fun getTaskByDescendingSort() = dao.getTaskByDescendingSort()

    fun getTaskByAscendingSort(): LiveData<List<Task>> = dao.getTaskByAscendingSort()


}