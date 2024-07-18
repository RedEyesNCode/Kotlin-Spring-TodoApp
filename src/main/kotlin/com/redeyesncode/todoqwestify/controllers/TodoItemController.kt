package com.redeyesncode.todoqwestify.controllers

import com.redeyesncode.todoqwestify.models.TodoItem
import com.redeyesncode.todoqwestify.service.TodoItemService
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import java.net.URI

@RestController
@RequestMapping("/todos")
class TodoItemController(private val todoItemService: TodoItemService) {

    @GetMapping
    fun getAllTodoItems(): ResponseEntity<Any>  {
        return todoItemService.getAllTodoItems()
    }

    @PostMapping
    fun createTodoItem(@RequestBody todoItem: TodoItem): ResponseEntity<Any> {
       return todoItemService.createTodoItem(todoItem)
    }

    @PutMapping("/{id}")
    fun updateTodoItem(@PathVariable id: Long, @RequestBody todoItem: TodoItem): ResponseEntity<Any> {
        return todoItemService.updateTodoItem(id,todoItem)
    }

    @DeleteMapping("/{id}")
    fun deleteTodoItem(@PathVariable id: Long): ResponseEntity<Any> {
        return todoItemService.deleteTodoItem(id)
    }
}