class Solution {
    func plusOne(_ digits: [Int]) -> [Int] {
        var tempDigits = digits
        tempDigits[tempDigits.count - 1] += 1
        for index in stride(from: tempDigits.count-1, to: 0, by: -1) {
            if tempDigits[index] <= 9 {
                return tempDigits
            } else {
                tempDigits[index] = 0
                tempDigits[index-1] += 1
            }
        }
        if tempDigits[0] <= 9 {
            return tempDigits
        } else {
            tempDigits[0] = 0
            tempDigits.insert(1, at: 0)
        }
        return tempDigits
    }
}