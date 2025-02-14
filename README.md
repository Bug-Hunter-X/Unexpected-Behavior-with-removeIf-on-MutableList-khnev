# Kotlin MutableList removeIf Bug

This repository demonstrates a subtle bug that can occur when using the `removeIf` function with a mutable list in Kotlin. The `removeIf` function iterates over the list and removes elements that satisfy the given predicate. However, if the predicate modifies the list itself, the iteration process can become unpredictable, leading to elements being skipped or removed unexpectedly.

The `bug.kt` file contains code that exhibits this issue. The `bugSolution.kt` file provides a corrected version that addresses the problem by creating a copy of the list before performing the removal operation.

## Reproduction

To reproduce the bug, simply run the `bug.kt` file. You'll observe that not all even numbers are removed from the list.

## Solution

The solution provided in `bugSolution.kt` demonstrates how to create a copy of the list before applying the `removeIf` function, thus preventing the unexpected behavior.

## Conclusion

This bug highlights the importance of understanding the side effects of predicates when using functions like `removeIf` on mutable collections. Always ensure that the predicate does not modify the collection being iterated over to avoid unpredictable results.