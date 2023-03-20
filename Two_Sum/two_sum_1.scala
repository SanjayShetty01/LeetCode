// Brute Force using indices

object Solution {
    def twoSum(nums: Array[Int], target: Int): Array[Int] = {
                val indices = nums.indices
        for {i <- indices; j <- indices} {
            if (i != j && nums(i) + nums(j) == target) return Array(i, j)
        }

        Array()
    }
}