import java.lang.IndexOutOfBoundsException

class MyArrayList<T> {
    private var len: Int = 0
    private var buffer_len: Int = 2
    private var  buffer = arrayOfNulls<Any>(2)

    private fun extend() {
        buffer = buffer.copyOf(buffer_len * 2)
        buffer_len *= 2
    }

    fun add(t: T) {
        if (len >= buffer_len) {
            extend()
        }

        buffer[len] = t
        ++len;
    }

    fun insert(t: T, pos: Int) {
        if (pos < 0 || pos > len) {
            throw IndexOutOfBoundsException()
        }

        if (len >= buffer_len) {
            extend()
        }

        for (i in len - 1 downTo pos) {
            buffer[i + 1] = buffer[i]
        }

        buffer[pos] = t
        ++len;
    }

    fun delete(pos: Int) {
        if (pos < 0 || pos >= len) {
            throw IndexOutOfBoundsException()
        }

        for (i in pos + 1 until len - 1) {
            buffer[i - 1] = buffer[i]
        }

        --len;
    }
}