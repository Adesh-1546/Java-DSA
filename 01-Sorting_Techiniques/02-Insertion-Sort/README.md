# 🔹 Insertion Sort

Insertion Sort is a simple and efficient sorting algorithm that builds the sorted array one element at a time by inserting elements into their correct position.

---

## 📌 Idea Behind Insertion Sort

* Assume the first element is already sorted
* Pick the next element (`current`)
* Compare it with elements in the sorted part (left side)
* Shift larger elements to the right
* Insert the current element at the correct position

---

## 🧪 Approach

1. Start from index `1` (second element)
2. Store current element
3. Compare with previous elements
4. Shift elements greater than current
5. Insert current at correct position

---

## ⏱️ Complexity

* Best Case (already sorted): **O(n)** ✅
* Average Case: **O(n²)**
* Worst Case (reverse sorted): **O(n²)**
* Space Complexity: **O(1)** (in-place)

---

## 🔁 Dry Run (Tracing)

Input: [7, 8, 3, 1, 2]

Step 1:
i = 1 → current = 8
Compare with 7 → no shift
Array: [7, 8, 3, 1, 2]

Step 2:
i = 2 → current = 3
8 > 3 → shift → [7, 8, 8, 1, 2]
7 > 3 → shift → [7, 7, 8, 1, 2]
Insert → [3, 7, 8, 1, 2]

Step 3:
i = 3 → current = 1
Shift all → [1, 3, 7, 8, 2]

Step 4:
i = 4 → current = 2
Shift → [1, 2, 3, 7, 8]

Final Sorted Array: [1, 2, 3, 7, 8]

---

## 🧠 Key Insights

* Works like sorting playing cards in hand
* Efficient for **small or nearly sorted arrays**
* Reduces unnecessary swaps by shifting elements
* Stable sorting algorithm

---

## ⚖️ Comparison with Other Sorts

| Feature    | Bubble Sort | Insertion Sort |
| ---------- | ----------- | -------------- |
| Approach   | Swap        | Shift & Insert |
| Best Case  | O(n)        | O(n)           |
| Efficiency | Lower       | Better         |
| Use Case   | Learning    | Small datasets |

---

## 💻 Code Structure

* `Insertion_Sort.java` → Main implementation

---

## 🚫 When NOT to Use

* Large datasets
* Performance-critical systems

---

## ✅ When to Use

* Nearly sorted arrays
* Small input sizes
* When stability is required

---

## 🎯 Conclusion

Insertion Sort is more efficient than Bubble Sort in practice and is a great choice for small or partially sorted data. It also helps in understanding how advanced sorting algorithms work internally.
