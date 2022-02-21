package com.aweperi.kotlinspringbootpractice.datasource.mock

import com.aweperi.kotlinspringbootpractice.datasource.BankDataSource
import com.aweperi.kotlinspringbootpractice.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    val banks = listOf(
        Bank("1234", 2.5, 5),
        Bank("3343", 8.0, 10),
        Bank("7794", 15.0, 25)
    )
    override fun getBanks(): Collection<Bank> = banks
}