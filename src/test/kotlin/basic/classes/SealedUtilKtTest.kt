package basic.classes

import org.junit.jupiter.api.Assertions.*
import org.junit.jupiter.api.Test

internal class SealedUtilKtTest {

    @Test
    fun `에러 핸들러 테스트 케이스 b1`() {
        val str = handlerOf(Base1Error())
        assertEquals(str, "b1")
    }

    @Test
    fun `에러 핸들러 테스트 케이스 b2`() {
        val str = handlerOf(Base2Error())
        assertEquals(str, "b2")
    }

    @Test
    fun `에러 핸들러 테스트 케이스 b3`() {
        val str = handlerOf(Base3Error())
        assertEquals(str, "b3")
    }
}