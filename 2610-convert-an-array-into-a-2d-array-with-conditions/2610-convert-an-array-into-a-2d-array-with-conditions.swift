class Solution {
    func findMatrix(_ nums: [Int]) -> [[Int]] {
        var dict = [Int: Int]()
        var result = [[Int]]()
        
        for num in nums {
            let current = dict[num, default: .zero]
            if result.count == current {
                result.append([])
            }
            result[current].append(num)
            dict[num] = current + 1
        }
        return result
    }
}