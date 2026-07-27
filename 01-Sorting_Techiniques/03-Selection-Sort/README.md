# 🔹 Selection Sort

Selection Sort is a simple sorting algorithm that repeatedly selects the smallest element from the unsorted portion and places it at its correct position.

---

## 📌 Idea Behind Selection Sort

* Divide the array into **sorted** and **unsorted** parts
* Initially, the sorted part is empty
* Find the **minimum element** from the unsorted part
* Swap it with the first element of the unsorted part
* Expand the sorted portion step by step

---

## 🧪 Approach

1. Start from index `0`
2. Assume current index has the smallest element
3. Find the actual minimum element in the remaining array
4. Swap it with the current index
5. Repeat for the rest of the array

---

## ⏱️ Complexity

* Best Case: **O(n²)**
* Average Case: **O(n²)**
* Worst Case: **O(n²)**
* Space Complexity: **O(1)** (in-place)

👉 Unlike Bubble & Insertion, Selection Sort **does NOT optimize for sorted arrays**

---

## 🔁 Dry Run (Tracing)

Input: [13, 46, 24, 52, 20, 9]

Pass 1 (i = 0):
Smallest = 13
Compare → found 9 as smallest
Swap → [9, 46, 24, 52, 20, 13]

Pass 2 (i = 1):
Smallest = 46
Compare → found 13
Swap → [9, 13, 24, 52, 20, 46]

Pass 3 (i = 2):
Smallest = 24
Compare → found 20
Swap → [9, 13, 20, 52, 24, 46]

Pass 4 (i = 3):
Smallest = 52
Compare → found 24
Swap → [9, 13, 20, 24, 52, 46]

Pass 5 (i = 4):
Smallest = 52
Compare → found 46
Swap → [9, 13, 20, 24, 46, 52]

Final Sorted Array: [9, 13, 20, 24, 46, 52]

---

## 🧠 Key Insights

* Always selects the **minimum element** and places it correctly
* Number of swaps is **less than Bubble Sort**
* Still inefficient due to repeated comparisons
* Not stable (relative order may change)

---

## ⚖️ Comparison

| Feature   | Bubble Sort | Insertion Sort | Selection Sort |
| --------- | ----------- | -------------- | -------------- |
| Approach  | Swap        | Shift & Insert | Select Min     |
| Best Case | O(n)        | O(n)           | O(n²)          |
| Swaps     | Many        | Less           | Very Few       |
| Stable    | Yes         | Yes            | No             |

---

## 💻 Code Structure

* `Selection.java` → Implementation

---

## 🚫 When NOT to Use

* Large datasets
* When performance matters

---

## ✅ When to Use

* Learning sorting fundamentals
* When minimizing swaps is important

---

## 🎯 Conclusion

Selection Sort is simple and performs fewer swaps compared to Bubble Sort, but it is still inefficient due to its O(n²) time complexity. It is mainly useful for understanding sorting logic and algorithm design.
