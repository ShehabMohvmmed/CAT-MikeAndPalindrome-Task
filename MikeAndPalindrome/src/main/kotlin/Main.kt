fun main(args: Array<String>) {
    val s = readln()
    var c = 0
    val sLength = s.length
    if(s.length in 1..15) {
        for (i in (sLength - 1) / 2 downTo 0) {
            if (s[i] == s[sLength - i - 1]) {
                continue
            } else {
                c++
            }
        }
        if (c == 1 || c <= 1 && sLength % 2 != 0) {
            println("YES")
        } else {
            println("NO")
        }
    }else{
        println("please enter string between 1 and 15 chars")
    }
}