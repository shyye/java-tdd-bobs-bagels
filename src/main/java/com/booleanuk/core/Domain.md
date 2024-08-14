| Classes  | Variables                                 | Methods                           | Scenario                                      | Outcome                           |
|----------|-------------------------------------------|-----------------------------------|-----------------------------------------------|-----------------------------------|
| `Basket` | `HashMap<String, List<Integer>> products` | `add(String product)`             | Item succesfully added.                       | true                              |
|          |                                           |                                   | Item could not be added.                      | false                             |
|          |                                           |                                   | If the basket is full.                        | Error: Basket is full             |
|          |                                           | `remove(String product)`          | Item is in basket and can be removed.         | true                              |
|          |                                           |                                   | Item is not in basket and can not be removed. | false, Error: Item does not exist |
|          | `int maxCapacity`                         | `changeCapacity(int newCapacity)` | If newCapacity is more than 0.                | true                              |
|          |                                           |                                   | If newCapacity is less than 1.                | false                             |
    
