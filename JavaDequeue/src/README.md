# Java Dequeue - HackerRank Problem

## Problem Statement

In this problem, you are given **N** integers. You need to find the maximum number of unique integers among all the possible contiguous subarrays of size **M**.

### Input Format

- The first line of input contains two integers, **N** and **M**: the number of integers and the size of the subarray.
- The next line contains **N** space-separated integers.

### Constraints

- \(1 \leq M \leq N \leq 100,000\)
- The numbers in the array will range between \(-10^9\) and \(10^9\).

### Output Format

- Print the maximum number of unique integers among all possible contiguous subarrays of size **M**.

### Sample Input

6 3 5 3 5 2 3 2

shell
Kodu kopyala

### Sample Output

3


### Explanation

In the sample input, there are four subarrays of size **3**:

1. **[5, 3, 5]** - Has **2** unique numbers: **5**, **3**.
2. **[3, 5, 2]** - Has **3** unique numbers: **3**, **5**, **2**.
3. **[5, 2, 3]** - Has **3** unique numbers: **5**, **2**, **3**.
4. **[2, 3, 2]** - Has **2** unique numbers: **2**, **3**.

The maximum number of unique numbers among all contiguous subarrays of size **3** is **3**.

