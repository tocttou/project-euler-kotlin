package test

import org.jetbrains.spek.api.Spek
import org.jetbrains.spek.api.dsl.given
import org.jetbrains.spek.api.dsl.it
import org.jetbrains.spek.api.dsl.on
import src.driver1
import src.driver10
import src.driver11
import src.driver12
import src.driver13
import src.driver14
import src.driver15
import src.driver16
import src.driver17
import src.driver18
import src.driver19
import src.driver2
import src.driver20
import src.driver21
import src.driver22
import src.driver23
import src.driver24
import src.driver25
import src.driver26
import src.driver27
import src.driver28
import src.driver29
import src.driver3
import src.driver30
import src.driver31
import src.driver4
import src.driver5
import src.driver6
import src.driver7
import src.driver8
import src.driver9
import java.math.BigInteger
import kotlin.test.assertEquals

object SolutionTest : Spek({
    given("a number of Solutions") {
        on("running Solution1") {
            val solution = driver1()
            it("should be equal to the test value") {
                assertEquals(233168, solution)
            }
        }
        on("running Solution2") {
            val solution = driver2()
            it("should be equal to the test value") {
                assertEquals(4613732, solution)
            }
        }
        on("running Solution3") {
            val solution = driver3()
            it("should be equal to the test value") {
                assertEquals(6857, solution)
            }
        }
        on("running Solution4") {
            val solution = driver4()
            it("should be equal to the test value") {
                assertEquals(906609, solution)
            }
        }
        on("running Solution5") {
            val solution = driver5()
            it("should be equal to the test value") {
                assertEquals(232792560, solution)
            }
        }
        on("running Solution6") {
            val solution = driver6()
            it("should be equal to the test value") {
                assertEquals(25164150, solution)
            }
        }
        on("running Solution7") {
            val solution = driver7()
            it("should be equal to the test value") {
                assertEquals(104743, solution)
            }
        }
        on("running Solution8") {
            val solution = driver8()
            it("should be equal to the test value") {
                assertEquals(23514624000, solution)
            }
        }
        on("running Solution9") {
            val solution = driver9()
            it("should be equal to the test value") {
                assertEquals(31875000, solution)
            }
        }
        on("running Solution10") {
            val solution = driver10()
            it("should be equal to the test value") {
                assertEquals(142913828922, solution)
            }
        }
        on("running Solution11") {
            val solution = driver11()
            it("should be equal to the test value") {
                assertEquals(70600674, solution)
            }
        }
        on("running Solution12") {
            val solution = driver12()
            it("should be equal to the test value") {
                assertEquals(76576500, solution)
            }
        }
        on("running Solution13") {
            val solution = driver13()
            it("should be equal to the test value") {
                assertEquals("5537376230", solution)
            }
        }
        on("running Solution14") {
            val solution = driver14()
            it("should be equal to the test value") {
                assertEquals(837799, solution)
            }
        }
        on("running Solution15") {
            val solution = driver15()
            it("should be equal to the test value") {
                assertEquals(137846528820, solution)
            }
        }
        on("running Solution16") {
            val solution = driver16()
            it("should be equal to the test value") {
                assertEquals(BigInteger("1366"), solution)
            }
        }
        on("running Solution17") {
            val solution = driver17()
            it("should be equal to the test value") {
                assertEquals(21124, solution)
            }
        }
        on("running Solution18") {
            val solution = driver18()
            it("should be equal to the test value") {
                assertEquals(1074, solution)
            }
        }
        on("running Solution19") {
            val solution = driver19()
            it("should be equal to the test value") {
                assertEquals(171, solution)
            }
        }
        on("running Solution20") {
            val solution = driver20()
            it("should be equal to the test value") {
                assertEquals(BigInteger("648"), solution)
            }
        }
        on("running Solution21") {
            val solution = driver21()
            it("should be equal to the test value") {
                assertEquals(31626, solution)
            }
        }
        on("running Solution22") {
            val solution = driver22()
            it("should be equal to the test value") {
                assertEquals(871198282, solution)
            }
        }
        on("running Solution23") {
            val solution = driver23()
            it("should be equal to the test value") {
                assertEquals(4179871, solution)
            }
        }
        on("running Solution24") {
            val solution = driver24()
            it("should be equal to the test value") {
                assertEquals("2783915460", solution)
            }
        }
        on("running Solution25") {
            val solution = driver25()
            it("should be equal to the test value") {
                assertEquals(4782, solution)
            }
        }
        on("running Solution26") {
            val solution = driver26()
            it("should be equal to the test value") {
                assertEquals(983, solution)
            }
        }
        on("running Solution27") {
            val solution = driver27()
            it("should be equal to the test value") {
                assertEquals(-59231, solution)
            }
        }
        on("running Solution28") {
            val solution = driver28()
            it("should be equal to the test value") {
                assertEquals(669171001, solution)
            }
        }
        on("running Solution29") {
            val solution = driver29()
            it("should be equal to the test value") {
                assertEquals(9183, solution)
            }
        }
        on("running Solution30") {
            val solution = driver30()
            it("should be equal to the test value") {
                assertEquals(443839, solution)
            }
        }
        on("running Solution31") {
            val solution = driver31()
            it("should be equal to the test value") {
                assertEquals(73682, solution)
            }
        }
    }
})