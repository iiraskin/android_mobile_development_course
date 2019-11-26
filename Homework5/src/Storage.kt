package main

class Storage : IStorage {

    private val map: MutableMap<String, Any?> by lazy { mutableMapOf<String, Any?>() }

    private fun putIntoMap(key: String, value: Any?) {
        val temp = map.toMutableMap()
        temp[key] = value
        temp.toMap()
        // Не знаю, как предполагалось, как эта функция должна работать,
        // но если всё оставить как есть, то map останется пустым.
        // Поэтому добавил строчку:
        map[key] = value
    }

    override fun put(key: String, value: String): Unit = putIntoMap(key, value)

    override fun put(key: String, value: Int): Unit = putIntoMap(key, value)

    override fun put(key: String, value: Long): Unit = putIntoMap(key, value)

    override fun put(key: String, value: Char): Unit = putIntoMap(key, value)

    override fun put(key: String, value: Double): Unit = putIntoMap(key, value)

    override fun get(key: String): Any? = map[key]

}