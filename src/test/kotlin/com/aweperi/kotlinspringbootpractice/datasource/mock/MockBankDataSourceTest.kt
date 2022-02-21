package com.aweperi.kotlinspringbootpractice.datasource.mock

import com.aweperi.kotlinspringbootpractice.datasource.BankDataSource
import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class MockBankDataSourceTest {

    @Test
    fun `should provide a collection of banks`() {
        //given

        //when
        val mockDataSource = MockBankDataSource()

        var banks = mockDataSource.getBanks()
        //then
        assertThat(banks).isNotEmpty
    }
}