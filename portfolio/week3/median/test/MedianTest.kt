// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here
    "Singular list is exact value" {
        val numbers = listOf<Float>(9.0f)
        median(numbers) shouldBe (9)
    }
    "Double list is average" {
        val numbers = listOf<Float>(9.0f,11.0f)
        median(numbers) shouldBe (10)
    }
    "Test with reversed list" {
        val numbers = listOf<Float>(15.0f, 9f, 12.0f)
        median(numbers) shouldBe (12)
    }
    "Test with random order" {
        val numbers = listOf<Float>(0.0f, 15.0f, 9.0f, 13.0f)
        median(numbers) shouldBe (11)
    }
})
