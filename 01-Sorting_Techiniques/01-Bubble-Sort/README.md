# 🔹 Bubble Sort

Bubble Sort is a simple comparison-based sorting algorithm where adjacent elements are compared and swapped if they are in the wrong order.

---

## 📌 Idea Behind Bubble Sort

* Repeatedly compare adjacent elements
* Swap if they are in incorrect order
* After each pass, the largest element moves to the end
* Process continues until the array is sorted

---

## 🧪 Implementations

### 1️⃣ Brute Force Approach

* Always runs all passes regardless of input
* Does unnecessary comparisons even if array is already sorted

#### ⏱️ Complexity

* Time: O(n²) (Best, Average, Worst)
* Space: O(1)

---

### 2️⃣ Optimal Approach (Optimized)

* Uses a `swapped` flag
* If no swaps occur in a pass → array is already sorted
* Stops early to save time

#### ⏱️ Complexity

* Best Case: O(n) ✅
* Average/Worst: O(n²)
* Space: O(1)

---

## 🔁 Dry Run (Tracing)

Input: [5, 3, 8, 4, 2]

Pass 1:
5 > 3 → swap → [3, 5, 8, 4, 2]
8 > 4 → swap → [3, 5, 4, 8, 2]
8 > 2 → swap → [3, 5, 4, 2, 8]

Pass 2:
5 > 4 → swap → [3, 4, 5, 2, 8]
5 > 2 → swap → [3, 4, 2, 5, 8]

Pass 3:
4 > 2 → swap → [3, 2, 4, 5, 8]

Pass 4:
3 > 2 → swap → [2, 3, 4, 5, 8]

Sorted Array: [2, 3, 4, 5, 8]

---

## 🧠 Key Insights

* After every pass, the largest element settles at the end
* Inner loop reduces each time → `n - i - 1`
* Optimization avoids unnecessary work

---

## ⚖️ Brute vs Optimal

| Feature        | Brute Force | Optimal |
| -------------- | ----------- | ------- |
| Early Exit     | ❌ No        | ✅ Yes   |
| Best Case Time | O(n²)       | O(n)    |
| Efficiency     | Low         | Better  |

---

## 💻 Code Structure

* `BruteForce.java` → Basic implementation
* `Optimal.java` → Optimized using swapped flag

---

## 🚫 When NOT to Use Bubble Sort

* Large datasets
* Performance-critical applications

---

## ✅ When to Use

* Learning sorting concepts
* Small datasets
* Interview basics

---

## 🎯 Conclusion

Bubble Sort is not efficient for real-world applications, but it is important for understanding sorting fundamentals and optimization techniques.
