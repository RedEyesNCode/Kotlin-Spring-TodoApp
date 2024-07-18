package com.redeyesncode.todoqwestify.models


import jakarta.persistence.*
import java.time.LocalDateTime

@Entity
@Table(name = "todo_items")
data class TodoItem(@Id
                    @GeneratedValue(strategy = GenerationType.IDENTITY)
                    val id: Long? = null,

                    @Column(nullable = false)
                    var title: String,

                    @Column
                    var description: String? = null,

                    @Column(nullable = false)
                    var completed: Boolean = false,

                    @Column(name = "created_at", updatable = false)
                    val createdAt: LocalDateTime = LocalDateTime.now(),

                    @Column(name = "updated_at")
                    var updatedAt: LocalDateTime = LocalDateTime.now() )
