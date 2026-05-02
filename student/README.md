# RDR2 Data Structures — Proyecto Estudiante

> *"We're thieves in a world that don't want us no more."* — Arthur Morgan

## Descripción

Este es tu proyecto de partida para la Práctica Grupal de Estructuras de Datos.
Contiene el modelo de dominio completo, las interfaces de los TADs, un `Main.java`
funcional y la batería de tests — todo listo para que implementes los TADs.

## Tu tarea

Implementa **todos los métodos marcados con `// TODO`** en las siguientes clases:

| Fichero | Métodos a implementar |
|---|---|
| `tad/list/LinkedList.java` | addLast, addAt, remove, get, size, isEmpty |
| `tad/queue/LinkedQueue.java` | enqueue, dequeue, peek, size, isEmpty |
| `tad/stack/LinkedStack.java` | push, pop, peek, undo, size, isEmpty |
| `tad/set/LinkedSet.java` | add, remove, contains, size, isEmpty, toList |
| `tad/tree/BinaryTree.java` | setRoot, insertLeft, insertRight, inOrder, preOrder, postOrder, contains, isEmpty + métodos recursivos privados |
| `tad/graph/AdjacencyListGraph.java` | addVertex, addEdge, hasVertex, hasEdge, bfs, dfs |

> ⚠️ **NO modifiques** `Main.java`, las interfaces `IList/IQueue/IStack/ISet/IBinaryTree/IGraph`, ni las clases del modelo.

## Reglas importantes

- **PROHIBIDO** usar `java.util.List`, `java.util.Stack`, `java.util.Queue`, etc. como estructura interna.
- El árbol binario debe usar **exclusivamente recursividad**.
- El grafo (BFS/DFS) debe ser **iterativo** usando tus propias colas y pilas. 

## Cómo saber si lo estás haciendo bien

```bash
mvn test
```

- Al **principio**: 75 tests fallan con `UnsupportedOperationException`.
- **Conforme implementas** cada TAD, los tests correspondientes pasan.
- **Al final**: 75/75 tests deben pasar.

## Cómo ejecutar el Main

```bash
mvn compile exec:java -Dexec.mainClass=ed.rdr2.Main
```

O desde NetBeans: `File → Open Project` → seleccionar `student/` → Click derecho → `Run`.

## Estructura

```
src/main/java/ed/rdr2/
├── model/           # NO tocar — ya completo
├── tad/             # Interfaces — NO tocar
│   ├── list/        # ← IMPLEMENTAR
│   ├── queue/       # ← IMPLEMENTAR
│   ├── stack/       # ← IMPLEMENTAR
│   ├── set/         # ← IMPLEMENTAR
│   ├── tree/        # ← IMPLEMENTAR (recursivo)
│   └── graph/       # ← IMPLEMENTAR (iterativo)
└── Main.java        # NO tocar
```
