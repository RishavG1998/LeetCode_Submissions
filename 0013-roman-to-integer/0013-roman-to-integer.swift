class Solution { 
    func romanToInt(_ s: String) -> Int {
        let integerValue: [Character: Int] = ["I":1,"V":5,"X":10,"L":50,"C":100,"D":500,"M":1000]
        // var prevChar: Character = "'"
        // var ans = 0
        // let chars = Array(s)
        // for currentChar in chars {
        //     if let currentCharIntValue = integerValue[currentChar] {
        //         if let prevCharIntValue = integerValue[prevChar], currentCharIntValue >  prevCharIntValue {
        //             ans = ans + currentCharIntValue - (2 * prevCharIntValue)
        //         } else {
        //             ans = ans + currentCharIntValue
        //         }
        //         prevChar = currentChar
        //     }
        // }

        var prev = 0, ans = 0
        // for first iteration only zero will be added
        // from second iteration we will have two values to compare
        for char in s {
            let value = integerValue[char] ?? 0
            ans += value <= prev ? prev : -prev
            prev = value
        }
        // to add the value of the last char
        ans += prev
        return ans
    }
}