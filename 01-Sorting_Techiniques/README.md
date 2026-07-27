# 🔄 Sorting Techniques in Java

Sorting is one of the most fundamental concepts in Data Structures and Algorithms. It involves arranging elements in a specific order (ascending or descending).

---

## 🚀 Why Sorting is Important?

* Improves efficiency of searching algorithms (like Binary Search)
* Helps in solving complex problems (greedy, DP, etc.)
* Used in real-world applications (databases, analytics, etc.)

---

## 📚 Sorting Algorithms Covered

| Algorithm      | Time Complexity (Best) | Time Complexity (Worst) | Space    | Stable |
| -------------- | ---------------------- | ----------------------- | -------- | ------ |
| Bubble Sort    | O(n)                   | O(n²)                   | O(1)     | Yes    |
| Selection Sort | O(n²)                  | O(n²)                   | O(1)     | No     |
| Insertion Sort | O(n)                   | O(n²)                   | O(1)     | Yes    |
| Merge Sort     | O(n log n)             | O(n log n)              | O(n)     | Yes    |
| Quick Sort     | O(n log n)             | O(n²)                   | O(log n) | No     |

---

## 🧠 Key Insights

* Use **Insertion Sort** when data is nearly sorted
* Use **Merge Sort** when stability is required
* Use **Quick Sort** for faster average performance
* Avoid **Bubble & Selection Sort** in real-world large data

---

## 📊 When to Use What?

* Small dataset → Insertion Sort
* Large dataset → Merge / Quick Sort
* Stable sorting needed → Merge Sort

---

## 🎯 Goal of This Section

* Understand sorting concepts deeply
* Learn when and why to use each algorithm
* Practice writing clean and optimized code
* Prepare for coding interviews

---

## 📌 Note

Each algorithm folder contains:

* Java implementation
* Explanation
* Time & Space complexity
* Dry run (step-by-step tracing)

