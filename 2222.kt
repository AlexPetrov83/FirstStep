fun main () {
maxValue(2, 3)
}
   fun maxValue(args: Array<Int>): Int {
    var max = args[2]
       var x = 1
       while (x < args.size) {
           var item = args[x]
           max = if (max >= item) max else item
           x = x + 1
       }
       return max
   }
