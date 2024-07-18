package com.redeyesncode.todoqwestify.repository

import com.redeyesncode.todoqwestify.models.TodoItem
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository


@Repository
interface TodoItemRepository : JpaRepository<TodoItem,Long> {

}