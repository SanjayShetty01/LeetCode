// practice
val s: String = "(]"

val brackets = Map(
        "["  -> "]",
        "(" -> ")",
        "{"  -> "}"
    )

brackets.keys.forall(_.contains(']'))

var temp : Array[String] = Array()

for (c <- s){
    if(brackets.keys.forall(_.contains(c))){
        if(temp.nonEmpty && temp.last.equals(brackets.get("["))){
            temp = temp.init
        }
    }
    else{
        temp = temp :+ c.toString
    }
}

if temp.isEmpty then true else false

val c = '{'

var temp1 : Array[String] = Array()

temp1 = temp1 :+ "{"

temp1.mkString

brackets.contains(c.toString)

temp1.nonEmpty && temp1.last.equals(brackets.get(c.toString).get)
//temp1 = temp1.init

c.toString

temp1.last

brackets.get(c.toString).get

temp1.mkString

temp1.takeRight(1).mkString



object Solution {

    private val brackets = Map(
        "]"  -> "[",
        ")" -> "(",
        "}"  -> "{"
    )
    
    def isValid(s: String): Boolean = {

        var temp : Array[String] = Array()

        if(s.length % 2 == 0){
        for (c <- s){
            if(brackets.contains(c.toString)){
                if(temp.nonEmpty && temp.last.equals(brackets.get(c.toString).get)){
                    temp = temp.init
                }
            }
            
            else{
                temp = temp :+ c.toString
            }
        
        }
            return(if temp.isEmpty then true else false)

    }
    return(false)
    
    }
} 

val s1: String = "([}}])"

s1.length % 2 == 0

var temp2 : Array[String] = Array()

temp2.isEmpty

Solution.isValid(s1)


object Solution2{
    private val brackets = Map(
        "["  -> "]",
        "(" -> ")",
        "{"  -> "}"
    )

        def isValid(s: String): Boolean = {
            
            var temp: Array[String] = Array()
            
            for(c <- s){
                if(brackets.contains(c.toString)){
                    temp = temp :+ c.toString
                }else{
                    if(temp.last.equals(c)) 
                    return(false) 
                }
            }
            
            return(temp.nonEmpty)
        
        }
}

Solution2.isValid(s)