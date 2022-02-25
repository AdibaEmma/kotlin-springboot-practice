package com.aweperi.kotlinspringbootpractice.service

import com.aweperi.kotlinspringbootpractice.datasource.BankDataSource
import com.aweperi.kotlinspringbootpractice.model.Bank
import org.springframework.stereotype.Service

@Service
class BankService(private val bankDataSource: BankDataSource) {
    fun getBanks(): Collection<Bank> {
        return bankDataSource.retrieveBanks()
    }
}