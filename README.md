<div align="center">

# LeetCode 101

**An elite problem-solving repository documenting optimal data structure algorithms, space-time complexities, and specialized patterns across 101+ LeetCode challenges.**

[![License: MIT](https://img.shields.io/badge/License-MIT-blue.svg)](LICENSE)
[![Java](https://img.shields.io/badge/Java_21-007396?logo=openjdk&logoColor=white)](https://java.com/)
[![Algorithms](https://img.shields.io/badge/Algorithms-Optimized-success)](#)
[![Data Structures](https://img.shields.io/badge/Data_Structures-Advanced-critical)](#)

[Report Bug](https://github.com/Justinvcj/Leetcode-101/issues) * [Request Feature](https://github.com/Justinvcj/Leetcode-101/issues)

</div>

---

```
+-----------------------------------------------------------------------------+
|                     LeetCode 101 Algorithmic Patterns                       |
|                                                                             |
|  +-----------------------+  +-----------------------+  +-----------------+  |
|  | Sliding Window        |  | Two Pointers          |  | Fast & Slow     |  |
|  | O(N) Time Complexity  |  | In-Place Modification |  | Cycle Detection |  |
|  +----------+------------+  +----------+------------+  +--------+--------+  |
|             |                          |                        |           |
|             +--------------------------+------------------------+           |
|                                        v                                    |
|  +-----------------------------------------------------------------------+  |
|  |  Advanced: Graph Traversal (DFS/BFS) * Dynamic Programming * Tries    |  |
|  +-----------------------------------------------------------------------+  |
+-----------------------------------------------------------------------------+
```

> Grinding LeetCode blindly yields minimal returns. Mastery comes from recognizing underlying algorithmic patterns and writing optimal, idiomatic code.
> This repository categorizes problems by their core architectural patterns (e.g., Sliding Window, Topological Sort, Monotonic Stack), providing highly optimized Java solutions that prioritize O(1) space complexity and O(N) time complexity wherever theoretically possible.

---

## Features

- **Pattern-Based Categorization** -- Problems are organized by algorithmic patterns rather than random difficulty tags, accelerating pattern recognition.
- **Optimal Space-Time Solutions** -- Prioritizes optimal algorithms (e.g., Kadane's Algorithm, Floyd's Cycle Detection) over brute-force approaches.
- **Heavily Commented Logic** -- Source files contain embedded complexities, edge-case handling notes, and mental models for the solution.
- **Modern Java Idioms** -- Leverages modern Java features (Streams where appropriate, optimized raw arrays, Bit Manipulation).
- **Comprehensive Coverage** -- Includes Arrays, Linked Lists, Trees, Graphs, Dynamic Programming, Backtracking, and Greedy algorithms.

---

## Repository Structure

```text
Leetcode-101/
|-- Arrays_and_Hashing/
|   |-- TwoSum.java
|   `-- TopKFrequentElements.java
|-- Two_Pointers/
|   |-- ContainerWithMostWater.java
|   `-- TrappingRainWater.java
|-- Sliding_Window/
|   `-- LongestSubstringWithoutRepeating.java
|-- Trees/
|   |-- InvertBinaryTree.java
|   `-- BinaryTreeMaximumPathSum.java
|-- Dynamic_Programming/
|   `-- LongestIncreasingSubsequence.java
`-- Graphs/
    `-- CourseSchedule.java
```

---

## Getting Started

### Prerequisites

| Requirement | Version | Notes |
|---|---|---|
| [Java JDK](https://adoptium.net/) | 17+ (21 recommended) | Java compiler and runtime |

### Running a Solution

To compile and run any specific solution file:

```bash
javac Arrays_and_Hashing/TwoSum.java
java Arrays_and_Hashing.TwoSum
```

---

## Contributing

Contributions, optimizations, and new pattern additions are welcome.

1. Fork the Project
2. Create your Feature Branch (`git checkout -b feat/AddMonotonicStack`)
3. Commit your Changes (`git commit -m 'feat: add daily temperatures solution'`)
4. Push to the Branch (`git push origin feat/AddMonotonicStack`)
5. Open a Pull Request

---

## License

Distributed under the MIT License. See [LICENSE](LICENSE) for details.