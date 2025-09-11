A variable is a named memory location that stores data.

Every variable in Java has:
-Data type – type of the data it stores
-Name (identifier) – a unique name given to the variable
-Value – the actual data stored in memory.

dataType variableName = value;

Three Type:
-Local Variables – declared inside methods/blocks.
-Instance Variables – declared inside a class but outside methods.
-Static Variables – declared with static keyword, shared across objects.

| Feature         | Local Variable           | Instance Variable             | Static Variable             |
| --------------- | ------------------------ | ----------------------------- | --------------------------- |
| Declared In     | Method/Block/Constructor | Inside class, outside methods | Inside class, with `static` |
| Default Value   | ❌ None (must initialize) | ✅ Yes                         | ✅ Yes                       |
| Scope           | Within method/block      | Per object                    | Shared across class         |
| Memory Location | Stack                    | Heap                          | Method area                 |
| Lifetime        | Method execution         | Object lifetime               | Class lifetime              |


