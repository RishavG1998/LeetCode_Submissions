class Solution {
    

    func isPathCrossing(_ path: String) -> Bool {
    // 1M
        // var x = 0, y = 0
        // var coordList = [String]()
        // coordList.append("0,0")
        // for direction in path {
        //     if direction == "N" {
        //         y += 1;
        //     } else if direction == "E" {
        //         x += 1;
        //     } else if direction == "W" {
        //         x -= 1;
        //     } else if direction == "S" {
        //         y -= 1;
        //     }
        //     var presentCoord = "\(x),\(y)"
        //     if coordList.contains(presentCoord) {
        //         return true
        //     }
        //     coordList.append(presentCoord)
        // }
        // return false

    // 2M
        let directionMap: [Character: (x: Int, y: Int)] = 
            ["N": (0, 1), "E": (1, 0), "W": (-1, 0), "S": (0, -1)]
        var visited: Set<[Int]> = [[0,0]]
        var (x, y) = (0, 0)
        for direction in path {
            (x, y) = (x + directionMap[direction]!.x, y + directionMap[direction]!.y)

            // if visited.contains([x, y]) {
            //     return true
            // }

            // visited.insert([x, y])

            if !visited.insert([x, y]).inserted {
                return true
            }
        }

        return false

    // 3M
        // Point is a struct craeted below
        // var curPoint = Point(x: .zero, y: .zero)
        // var visited = Set<Point>()
        // visited.insert(curPoint)
        // for direction in path {
        //     switch direction {
        //     case "N":
        //         curPoint.y += 1
        //     case "E":
        //         curPoint.x += 1
        //     case "W":
        //         curPoint.x -= 1
        //     case "S":
        //         curPoint.y -= 1
        //     default:
        //         fatalError()
        //     }
        //     if !visited.insert(curPoint).inserted {
        //         return true
        //     }
        // }
        // return false
    }

    // 3M
    // private struct Point: Hashable {
    //     var x: Int
    //     var y: Int
    // }
}