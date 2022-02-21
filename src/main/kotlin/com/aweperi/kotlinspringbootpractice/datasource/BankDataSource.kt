package com.aweperi.kotlinspringbootpractice.datasource

import com.aweperi.kotlinspringbootpractice.model.Bank

interface BankDataSource {
    fun getBanks() : Collection<Bank>
}