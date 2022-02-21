package com.aweperi.kotlinspringbootpractice.datasource.mock

import com.aweperi.kotlinspringbootpractice.datasource.BankDataSource
import com.aweperi.kotlinspringbootpractice.model.Bank
import org.springframework.stereotype.Repository

@Repository
class MockBankDataSource : BankDataSource {
    override fun getBanks(): Collection<Bank> {
        TODO("Not yet implemented")
    }
}