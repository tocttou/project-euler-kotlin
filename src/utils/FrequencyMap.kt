package utils

class FrequencyMap<K, Int>(private val b: MutableMap<K, kotlin.Int>)
    : MutableMap<K, kotlin.Int> by b {
    fun add(key: K, freq: kotlin.Int) {
        b.computeIfPresent(key) { _, b -> b + freq }
        b.putIfAbsent(key, freq)
    }

    fun add(vararg pairs: Pair<K, kotlin.Int>) {
        for (pair in pairs) {
            val (key, freq) = pair
            add(key, freq)
        }
    }
}

fun <K, Int> frequencyMapOf(vararg pairs: Pair<K, kotlin.Int>): FrequencyMap<K, kotlin.Int> {
    val mMap = mutableMapOf<K, kotlin.Int>()
    val freqMap = FrequencyMap<K, kotlin.Int>(mMap)
    for (pair in pairs) {
        freqMap.add(pair)
    }
    return freqMap
}