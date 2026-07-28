# 🔹 Merge Sort

Merge Sort is a **Divide and Conquer** algorithm that divides the array into smaller parts, sorts them, and then merges them back together.

---

## 📌 Idea Behind Merge Sort

1. Divide the array into two halves
2. Recursively sort both halves
3. Merge the sorted halves into one sorted array

---

## 🧪 Approach

* Find middle index
* Recursively call `mergeSort()` for left half
* Recursively call `mergeSort()` for right half
* Merge both sorted halves using `merge()`

---

## 🔁 How Recursion Works

Example: [5, 2, 8, 4, 1]

Divide:
[5, 2, 8, 4, 1]
→ [5, 2, 8] and [4, 1]
→ [5, 2] [8] and [4] [1]
→ [5] [2] [8] [4] [1]

Now merge:

[5] [2] → [2, 5]
[2, 5] [8] → [2, 5, 8]
[4] [1] → [1, 4]
[2, 5, 8] [1, 4] → [1, 2, 4, 5, 8]

---

## 🔁 Dry Run (Tracing)

Input: [5, 2, 8, 4, 1]

Step 1: Divide → [5,2,8] & [4,1]

Step 2: Divide → [5,2] & [8]

Step 3: Divide → [5] & [2]

Merge → [2,5]

Merge with [8] → [2,5,8]

Step 4: Right side → [4] & [1]

Merge → [1,4]

Final Merge → [1,2,4,5,8]

---

## ⏱️ Complexity

* Time Complexity:

  * Best: O(n log n)
  * Average: O(n log n)
  * Worst: O(n log n)

* Space Complexity:

  * O(n) (extra space for temp array)

---

## 🧠 Key Insights

* Always divides array until single elements
* Merging step is the main work
* Stable sorting algorithm
* Performs well for large datasets

---

## ⚖️ Comparison

| Feature         | Bubble | Insertion | Merge Sort |
| --------------- | ------ | --------- | ---------- |
| Time Complexity | O(n²)  | O(n²)     | O(n log n) |
| Space           | O(1)   | O(1)      | O(n)       |
| Stable          | Yes    | Yes       | Yes        |
| Use Case        | Small  | Small     | Large Data |

---

## 💻 Code Structure

* `mergeSort()` → divides array recursively
* `merge()` → merges two sorted halves

---

## 🚫 Drawbacks

* Uses extra space (not in-place)
* Slightly complex compared to basic sorts

---

## ✅ When to Use

* Large datasets
* When stable sorting is needed
* When consistent performance is required

---

## 🎯 Conclusion

Merge Sort is one of the most important sorting algorithms for interviews due to its efficiency and predictable performance. Understanding recursion and merging is key to mastering it.
