class Solution {
    func removeDuplicates(_ nums: inout [Int]) -> Int {
// 1M: Solution using temporary array
        // var tempNums = [Int]()
        // var uniqueElements = 0
        // for num in nums {
        //     var isNumAdded = false
        //     if !tempNums.contains(num) {
        //         tempNums.append(num)
        //         isNumAdded = true
        //     }

        //     if isNumAdded {
        //         nums[uniqueElements] = tempNums[uniqueElements]
        //         uniqueElements += 1
        //     }
        // }
        // return uniqueElements

// 2M: In-place solution
        var uniqueElements = 0
        for num in nums {
            if nums[uniqueElements] != num {
                uniqueElements += 1
                nums[uniqueElements] = num
            }
        }
        return uniqueElements + 1
    }
}