# Reporte de Calificación - Validador de Documentos (202530007615)

**Puntaje Total:** 37.5 / 50 pts

La evaluación se ha realizado teniendo en cuenta que cada actividad vale 5 puntos, y se otorgan 5 puntos adicionales basados en el orden del desarrollador y cumplimiento de la entrega.

---

### Desglose por Actividad

#### ✅ Actividad 1: Diseño Conceptual (TADs) - **2.0 / 5.0 pts**
- **Abstracción (40%):** Utiliza `interface` correctamente y no incluye lógica. (Cumple)
- **Completitud (30%):** Faltó incluir el método `vaciarLista()` y no se incluyeron los comentarios de Javadoc requeridos para los métodos (pre y post condiciones). (Parcial)
- **Clasificación (30%):** Falta identificar en comentarios si el comportamiento sugiere una estructura lineal o no lineal. (No cumple)

#### ✅ Actividad 2: Monitoreo Climático (Arreglos Estáticos) - **5.0 / 5.0 pts**
- **Uso de Índices, Delimitación y Eficiencia:** El arreglo estático fue creado correctamente. Accede al índice directamente y captura la excepción `ArrayIndexOutOfBoundsException` correctamente de acuerdo a los requisitos de la actividad.

#### ✅ Actividad 3: Sistema Bancario Legacy (Clase Vector) - **2.5 / 5.0 pts**
- **Justificación (50%):** Faltó el comentario de bloque explicando que los métodos de [Vector] son `synchronized` y por qué se escoge sobre ArrayList. (No cumple)
- **Análisis de Costo y Operatividad (50%):** Bien implementado el bloque de análisis de milisegundos y operatividad de genéricos. (Cumple)

#### ✅ Actividad 4: Validador de Documentos (Strings e Inmutabilidad) - **4.0 / 5.0 pts**
- **Manipulación y Eficiencia (60%):** Utilizó correctamente `trim()`, `toUpperCase()`, y `StringBuilder` para `reverse()`. (Cumple)
- **Concepto (40%):** Imprime en consola las referencias de memoria, pero faltó agregar la explicación conceptual requerida explícita sobre la inmutabilidad de la clase String. (Parcial)

#### ✅ Actividad 5: Reserva de Cine (Matrices) - **5.0 / 5.0 pts**
- **Modelado, Recorrido y Lógica:** Excelente. Se utilizaron los bucles for anidados correctamente, la matriz de 8x10 fue inicializada en 0 y se implementó la lógica de reserva validando el rango.

#### ✅ Actividad 6: Carrito de Compras Dinámico (ArrayList) - **3.5 / 5.0 pts**
- **Dinamismo y Operaciones (70%):** Operaciones con `ArrayList` (`add`, `remove`, `contains`) e implementación completa de [equals]. (Cumple)
- **Teoría (30%):** Faltó el comentario en el código explicando el concepto de Capacidad vs Tamaño y cómo Java redimensiona internamente el ArrayList. (No cumple)

#### ✅ Actividad 7: Historial de Navegador (Stack / Pila) - **5.0 / 5.0 pts**
- **Lógica LIFO, API Stack y Robustez:** Todos los requerimientos se cumplieron implementando `push()`, `pop()`, `peek()` e interceptando correctamenente `EmptyStackException`.

#### ✅ Actividad 8: Sistema de Tickets de Soporte (Queue / Cola) - **5.0 / 5.0 pts**
- **Lógica FIFO, Implementación y Manejo de Vacío:** Interfaz Queue y `LinkedList` bien instanciadas. Se utiliza `poll()` según se solicita y se demuestra la funcionalidad de llegada. *(Nota: Aunque falta el comentario explícito explicado la diferencia entre poll y remove que se pedía en el paso 5, se cumplieron los criterios de evaluación listados en la rúbrica)*.

#### ✅ Actividad 9: Inventario por Código (Mapas / HashMap) - **3.5 / 5.0 pts**
- **Asociación y Unicidad (70%):** Implementación correcta del mapa Llave-Valor y muestra cómo se sobreescribe el producto bajo el mismo SKU. (Cumple)
- **Eficiencia (30%):** Faltó añadir la explicación que se solicitaba que detalla cómo el acceso por [get()] es casi instantáneo O(1) y no requiere ciclos. (No cumple)

---

### Orden del Desarrollador y Formato de Entrega - **2.0 / 5.0 pts**
- **Estructura de Carpetas:** Las carpetas fueron nombradas como `Src1`, `src2`, `src3`, etc. en lugar de nombres descriptivos sugeridos (`Actividad1_TAD`, `Actividad2_Arreglos`, etc.). Además, los archivos para la Actividad 1 no incluyeron la extensión [.java] ([Cancion] e [IPlaylist] en la carpeta `Src1`).
- **README.md (Reflexión Técnica):** El archivo [README.md] carece de una breve reflexión técnica sobre la implementación de cada punto como especificaban los requerimientos del documento; solo contiene una o dos líneas generales.
