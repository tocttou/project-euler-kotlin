package test

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import src.utils.pow
import java.math.BigInteger
import kotlin.test.assertEquals

object PowTest : Spek({
    given("given an Int, a Long, a BigInteger") {
        val int = 8
        val long = 8L
        val bigInt = BigInteger("8")
        on("running them through pow") {
            val int3 = pow(int, 3)
            val long3 = pow(long, 3)
            val bigInt3 = pow(bigInt, 3)
            it("should be equal to the test value") {
                assertEquals(int3 as Int, 512)
                assertEquals(long3 as Long, 512L)
                assertEquals(bigInt3 as BigInteger, BigInteger("512"))
            }
        }
    }
})