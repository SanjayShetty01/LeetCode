val strs: Array[String] = Array("flower", "flow", "flight")


object Solution {
    def longestCommonPrefix(strs: Array[String]): String = {

        val shortestWord: String = strs.minBy(_.length)
        var commonPrefix: String = shortestWord

        for (word <- strs) {
            while (!word.startsWith(commonPrefix)) {
                commonPrefix = commonPrefix.init
            }
        }

    return(commonPrefix)

    }
}

Solution.longestCommonPrefix(strs)

/* 
object Solution {
    def longestCommonPrefix(strs: Array[String]): String = {

        val n: Int = strs.minBy(_.length).length - 1
        val shortword: String = strs.minBy(_.length)

        var answer: String = ""

            for {
                i <- 0 to n
                } {
                    val allMatch = strs.forall(word => word(i) == shortword(i))
                        if (allMatch) {
                            answer += shortword(i)
                            } 
                        else {
                            answer
                            }
                }

        return(answer)
    }
}

val wrong : Array[String] = Array("Cir", "Car")

Solution.longestCommonPrefix(wrong)
 */



// val strs: List[String] = List("cir", "car")
/* val shortestWord: String = strs.minBy(_.length)
var commonPrefix: String = shortestWord

for (word <- strs) {
  while (!word.startsWith(commonPrefix)) {
    commonPrefix = commonPrefix.init
  }
}

commonPrefix
 */

