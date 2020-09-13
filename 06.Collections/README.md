# Collections

|Class|Description|
|:-|:-|
|`ArrayBuffer`|an indexed, mutable sequence|
|`List`|a linear (linked list), immutable sequence|
|`Vector`|an indexed, immutable sequence|
|`Map`|the base `Map` (key/value pairs) class|
|`Set`|the base `Set` class|

## ArrayBuffer

- `+=`: append element
- `++=`: append elements as `List`, `Seq`, `Array`, `Vector`...
- `-=`, `--=`: ditto
- `append`, `prepend`: append/prepend element(s)
- `appendAll`, `prependAll`: like `++=`
- `clear`
- `insert(position, element)`:
- `insertAll(position, elements)`
- `remove(position, ...)`: remove elements @ positions
- `trimStart(num)`, `trimEnd(num)`: trim the starting/ending num elements

## List

Immutable. Everytime add elements, you create another `List` from the existing one.

```scala
val a = List(1,2,3)
```

- element `+:` List: prepend an element
- List `:+` element: append an element
- `++:` or `:++` or `++`: concat two List
- List.range(1, 10): create List(1, 2, 3, 4, 5, 6, 7, 8, 9)

## Vector

`Vector` is an indexed, immutable sequence.  
The operations of `Vector` are similar to `List`

## Map

```scala
import scala.collection.mutable.Map
val states = Map(
    "AK" -> "Alaska",
    "IL" -> "Illinois",
    "KY" -> "Kentucky"
)
```

- Map `++=` (key -> value)
- Map1 `++=` Map2
- Map `-=` key
- Map `--=` List(key1, key2)
- Map `--=` List(key1, key2)
- Map(key) `=` new_value: update `Map` elements

## Set

Most operations of `Set` are similar to `Map`'s

- set.add()
- set.remove()
- set.clear

## Common Sequence Method

- `map`
- `filter`
- `foreach`
- `head`
- `tail`
- `take`, `takeWhile`
- `drop`, `dropWhile`
- `reduce`

## Common Map Method

- `keys`
- `values`
- `contains`
- `transform((k, v) => ...)`: transform value
- `m.view.filterKeys(Set(2, 3)).toMap`: get values by the keys 2 and 3
- `m.take(2)`: take the first two elements
- `m.retain(func: Boolean)`: retain by func

## Tuple(not a collection)
