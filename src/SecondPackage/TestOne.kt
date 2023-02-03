fun twoSum(nums: IntArray): IntArray {
    for (i in nums.indices){
        for (j in i+1 until nums.size){
            if (nums[i] + nums[j] == 9){
                return intArrayOf(i, j)
            }
        }
    }
    return intArrayOf()
}

fun main() {
    val ara = IntArray(4)
    ara[0] = 2
    ara[1] = 7
    ara[2] = 11
    ara[3] = 15

    println(twoSum(ara))
}