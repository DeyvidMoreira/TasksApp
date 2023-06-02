package com.devmasterteam.tasks.service.repository.remote

import TaskService

class TaskRepository {

    private val remote = RetrofitClient.getService(TaskService::class.java)





}