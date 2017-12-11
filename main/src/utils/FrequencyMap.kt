package src.utils

class FrequencyMap<K, Int>(private val b: MutableMap<K, kotlin.Int>)
    : MutableMap<K, kotlin.Int> by b {
    fun add(key: K, freq: kotlin.Int = 1) {
        b.computeIfPresent(key) { _, b -> b + freq }
        b.putIfAbsent(key, freq)
    }

    fun add(vararg pairs: Pair<K, kotlin.Int>) {
        for (pair in pairs) {
            val (key, freq) = pair
            add(key, freq)
        }
    }

    fun addAll(iter: Iterable<FrequencyMap<K, kotlin.Int>>) {
        for (i in iter) {
            for (j in i.keys) {
                add(j, i.get(j)!!)
            }
        }
    }

    fun removeFreq(key: K, freq: kotlin.Int = 1) {
        if (b.get(key) == null || freq < 1) return
        else if (b.get(key)!! - freq < 1) b.remove(key)
        b.computeIfPresent(key) { _, b -> b - freq }
    }

    override fun hashCode(): kotlin.Int {
        return super.hashCode()
    }

    override fun equals(other: Any?): Boolean {
        if (!(other is FrequencyMap<*, *>)) return false
        return generateMutableMapFromFrequencyMap(this)
            .equals(generateMutableMapFromFrequencyMap(other))
    }

    fun generateMutableMapFromFrequencyMap(obj: FrequencyMap<*, *>): MutableMap<Any?, Any?> {
        val mMap = mutableMapOf<Any?, Any?>()
        obj.forEach { t, u -> mMap.put(t, u) }
        return mMap
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