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
                assertEquals(solution, 233168)
            }
        }
        on("running Solution2") {
            val solution = driver2()
            it("should be equal to the test value") {
                assertEquals(solution, 4613732)
            }
        }
        on("running Solution3") {
            val solution = driver3()
            it("should be equal to the test value") {
                assertEquals(solution, 6857)
            }
        }
        on("running Solution4") {
            val solution = driver4()
            it("should be equal to the test value") {
                assertEquals(solution, 906609)
            }
        }
        on("running Solution5") {
            val solution = driver5()
            it("should be equal to the test value") {
                assertEquals(solution, 232792560)
            }
        }
        on("running Solution6") {
            val solution = driver6()
            it("should be equal to the test value") {
                assertEquals(solution, 25164150)
            }
        }
        on("running Solution7") {
            val solution = driver7()
            it("should be equal to the test value") {
                assertEquals(solution, 104743)
            }
        }
        on("running Solution8") {
            val solution = driver8()
            it("should be equal to the test value") {
                assertEquals(solution, 23514624000)
            }
        }
        on("running Solution9") {
            val solution = driver9()
            it("should be equal to the test value") {
                assertEquals(solution, 31875000)
            }
        }
        on("running Solution10") {
            val solution = driver10()
            it("should be equal to the test value") {
                assertEquals(solution, 142913828922)
            }
        }
        on("running Solution11") {
            val solution = driver11()
            it("should be equal to the test value") {
                assertEquals(solution, 70600674)
            }
        }
        on("running Solution12") {
            val solution = driver12()
            it("should be equal to the test value") {
                assertEquals(solution, 76576500)
            }
        }
        on("running Solution13") {
            val solution = driver13()
            it("should be equal to the test value") {
                assert(solution == "5537376230")
            }
        }
        on("running Solution14") {
            val solution = driver14()
            it("should be equal to the test value") {
                assertEquals(solution, 837799)
            }
        }
        on("running Solution15") {
            val solution = driver15()
            it("should be equal to the test value") {
                assertEquals(solution, 137846528820)
            }
        }
        on("running Solution16") {
            val solution = driver16()
            it("should be equal to the test value") {
                assertEquals(solution, BigInteger("1366"))
            }
        }
        on("running Solution17") {
            val solution = driver17()
            it("should be equal to the test value") {
                assertEquals(solution, 21124)
            }
        }
        on("running Solution18") {
            val solution = driver18()
            it("should be equal to the test value") {
                assertEquals(solution, 1074)
            }
        }
        on("running Solution19") {
            val solution = driver19()
            it("should be equal to the test value") {
                assertEquals(solution, 171)
            }
        }
        on("running Solution20") {
            val solution = driver20()
            it("should be equal to the test value") {
                assertEquals(solution, BigInteger("648"))
            }
        }
        on("running Solution21") {
            val solution = driver21()
            it("should be equal to the test value") {
                assertEquals(solution, 31626)
            }
        }
        on("running Solution22") {
            val solution = driver22()
            it("should be equal to the test value") {
                assertEquals(solution, 871198282)
            }
        }
        on("running Solution23") {
            val solution = driver23()
            it("should be equal to the test value") {
                assertEquals(solution, 4179871)
            }
        }
        on("running Solution24") {
            val solution = driver24()
            it("should be equal to the test value") {
                assertEquals(solution, "2783915460")
            }
        }
        on("running Solution25") {
            val solution = driver25()
            it("should be equal to the test value") {
                assertEquals(solution, 4782)
            }
        }
        on("running Solution26") {
            val solution = driver26()
            it("should be equal to the test value") {
                assertEquals(solution, 983)
            }
        }
        on("running Solution27") {
            val solution = driver27()
            it("should be equal to the test value") {
                assertEquals(solution, -59231)
            }
        }
        on("running Solution28") {
            val solution = driver28()
            it("should be equal to the test value") {
                assertEquals(solution, 669171001)
            }
        }
        on("running Solution29") {
            val solution = driver29()
            it("should be equal to the test value") {
                assertEquals(solution, 9183)
            }
        }
        on("running Solution30") {
            val solution = driver30()
            it("should be equal to the test value") {
                assertEquals(solution, 443839)
            }
        }
    }
})