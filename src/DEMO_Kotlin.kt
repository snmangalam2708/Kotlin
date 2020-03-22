object DEMO_Kotlin {

    fun isPalindrome(array: Array<String>): Boolean {

        var i = 0
        var c = 0
        var j = array.size - 1
        while (i < array.size - 1) {
            if (array[i] === array[j]) {
                c++
                j--
            }
            i++
        }
        return c == array.size - 1
    }

    @JvmStatic
    fun main(args: Array<String>) {
        val array = arrayOf("Is this a palindrome?", "This is a palindrome", "Is this a palindrome?")
        if (isPalindrome(array)) print("Yes") else print("No")
    }
}