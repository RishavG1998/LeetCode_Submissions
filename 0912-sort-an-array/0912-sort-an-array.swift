class Solution {
    // func sortArray(_ nums: [Int]) -> [Int] {
    //     var arr = nums
    //     quickSort(&arr, 0, arr.count-1)
    //     return arr
    // }

    // private func quickSort(_ nums: inout [Int], _ low: Int, _ high: Int) {
    //     if (low >= high) {return}
    //     let pIndex = partition(&nums, low, high);
    //     quickSort(&nums, low, pIndex-1)
    //     quickSort(&nums, pIndex+1, high)
    // }

    // private func partition(_ nums: inout [Int], _ low: Int, _ high: Int) -> Int {
    //     let pivot = nums[low]
    //     var i = low
    //     var j = high
    //     while i<j {
    //         while nums[i]<=pivot && i<high { i+=1 }
    //         while nums[j]>pivot && j>low { j-=1 }
    //         if i<j {
    //             swap(&nums, i, j)
    //         }
    //     }
    //     swap(&nums, low, j)
    //     return j
    // }

    // private func swap(_ nums: inout [Int], _ a: Int, _ b: Int) {
    //     if a<0 || b<0 || a>=nums.count || b>=nums.count {
    //         return
    //     }
    //     let temp = nums[a]
    //     nums[a] = nums[b]
    //     nums[b] = temp
    // }

    func sortArray(_ nums: [Int]) -> [Int] {
        var arr = nums
        quickSort(&arr, 0, arr.count - 1)
        return arr
    }
    
    private func quickSort(_ nums: inout [Int], _ left: Int, _ right: Int) {
        if left >= right { return }
        let m: Int = left + (right - left) / 2
        let pivot = nums[m]
        let p = partition(&nums, left, right, pivot)
        quickSort(&nums, left, p - 1)
        quickSort(&nums, p, right) 
    }
    
    private func partition(_ nums: inout [Int], _ left: Int, _ right: Int, _ pivot: Int) -> Int {
        var l = left
        var r = right
        let sz = nums.count
        while l <= r {
            while l < sz && nums[l] < pivot { l += 1 }
            while r > 0  && nums[r] > pivot { r -= 1 }
            if l <= r {
                swap(&nums, l, r);
                l += 1
                r -= 1
            }
        }
        return l
    }
    private func swap(_ nums: inout [Int], _ a: Int, _ b: Int) {
        if a < 0 || b < 0 || a >= nums.count || b >= nums.count {
            return
        }
        let tmp = nums[a]
        nums[a] = nums[b]
        nums[b] = tmp
    }
}