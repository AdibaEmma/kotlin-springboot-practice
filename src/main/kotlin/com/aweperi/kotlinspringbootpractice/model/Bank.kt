package com.aweperi.kotlinspringbootpractice.model

data class Bank(
    val accountNumber: String,
    val trust: Double,
    val transactionFee: Int
)