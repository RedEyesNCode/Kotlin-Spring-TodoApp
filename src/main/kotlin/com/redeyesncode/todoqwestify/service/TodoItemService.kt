package com.redeyesncode.todoqwestify.service

import com.redeyesncode.todoqwestify.exceptions.ResourceNotFoundException
import com.redeyesncode.todoqwestify.models.CustomStatusCodeModel
import com.redeyesncode.todoqwestify.models.StatusCodeModel
import com.redeyesncode.todoqwestify.models.TodoItem
import com.redeyesncode.todoqwestify.repository.TodoItemRepository
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Service
import java.time.LocalDateTime

@Service
class TodoItemService(private val todoItemRepository: TodoItemRepository) {

    fun getAllTodoItems(): ResponseEntity<Any> {
        val allItems = todoItemRepository.findAll()
        return if(allItems.isEmpty()){
            ResponseEntity.badRequest().body(StatusCodeModel(code = 400, message = "No Todo Item Found !", status =  "fail"))

        }else{
            ResponseEntity.ok().body(CustomStatusCodeModel(code = 200, message = "Todo Item Fetched Successfully !", status = "success", data = allItems))

        }
    }

    fun createTodoItem(todoItem: TodoItem): ResponseEntity<Any>{

        todoItemRepository.save(todoItem)
        return ResponseEntity.ok().body(StatusCodeModel(code = 200, message = "Todo Item Saved Successfully !", status = "success"))

    }

    fun updateTodoItem(id: Long, todoItem: TodoItem): ResponseEntity<Any> {
        if (!todoItemRepository.existsById(id)) {
            return ResponseEntity.badRequest().body(StatusCodeModel(code = 400, message = "Todo Item Not Found with ID ${id}!", status =  "fail"))
        }else{
            val updatedTodoItem = todoItemRepository.save(todoItem.copy(id = id))
            updatedTodoItem.updatedAt = LocalDateTime.now()

            return ResponseEntity.ok().body(CustomStatusCodeModel(code = 200, message = "Updated Todo Item Successfully !", status = "success", data = updatedTodoItem))
        }



    }

    fun deleteTodoItem(id: Long) :ResponseEntity<Any>  {
        if (!todoItemRepository.existsById(id)) {
            return ResponseEntity.badRequest().body(StatusCodeModel(code = 400, message = "Todo Item Not Found !", status =  "fail"))
        }else{
            todoItemRepository.deleteById(id)
            return ResponseEntity.ok().body(StatusCodeModel(code = 200, message = "Todo Item Deleted Successfully !", status =  "success"))
        }
    }
}