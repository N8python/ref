# Example:
```scala
val myPointer = &(3)
~myPointer // 3
def incPointer(x: &[Int]) = x := ~x + 1
incPointer(myPointer)
~myPointer // 4
```
