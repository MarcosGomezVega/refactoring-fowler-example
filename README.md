# Memoria de la Práctica de Refactorización

## 1. Información del Repositorio

**URL del repositorio GitHub:** https://github.com/MarcosGomezVega/refactoring-fowler-example.git

## 2. Histórico de Versiones y su Relación con las Refactorizaciones

No he odido extraer diretamnte el historial de refactorizaciones ya que se no hice un script que me lo hicese por lo que he puesto en la sigeuinte tabla los commits y que refactorizacion estaba 

### Commits Realizados

| Commit Hash | Mensaje                                                       | Refactorización Aplicada             |
|-------------|---------------------------------------------------------------|------------------------------------|
| `2a1d8b9`   | Mover códigos de tipo de Movie a Price                        | Move Constant                      |
| `32a795d`   | Reemplazar condicional con polimorfismo en getFrecuentRenterPoints(Rental) | Replace Conditional with Polymorphism |
| `3fd1447`   | Mover método getFrecuentRenterPoints() a Price                | Move Method                       |
| `0302094`   | Reemplazar condicional con polimorfismo en Price.getCharge(Rental) | Replace Conditional with Polymorphism |
| `596905f`   | Mover método getCharge de Movie a Price                        | Move Method                       |
| `100405e`   | Añadir clase abstracta Price y subclases para tipos de Movie  | Replace Type Code with State/Strategy |
| `c7d88be`   | Encapsular movie en Rental con método getMovie()              | Encapsulate Field                 |
| `a90cd23`   | Mover método getFrecuentRenterPoints() a Movie                | Move Method                      |
| `1689146`   | Mover método getCharge a Movie                                 | Move Method                      |
| `6bf8a3c`   | Añadir sentencia HTML y test                                   | Add Feature (no refactor específico) |
| `a7332c4`   | Cambiar método getFrecuentRenterPoints a público              | Change Method Signature           |
| `c78f106`   | Mover getFrecuentRenterPoints a Rental                         | Move Method                      |
| `7894529`   | Quitar argumento innecesario de getFrecuentRenterPoints       | Change Method Signature           |
| `6d18d21`   | Extraer método getFrecuentRenterPoints() para mejor legibilidad | Extract Method                    |
| `fbc9250`   | Cambiar firma de método a pública                              | Change Method Signature           |
| `384b224`   | Renombrar método amountFor a getChange                         | Rename Method                    |
| `07e9cb5`   | Mover método amountFor a Rental                                | Move Method                      |
| `1925569`   | Cambiar firma de amountFor para recibir solo Rental           | Change Method Signature           |
| `5afc4fe`   | Extraer método amountFor() para reducir longitud               | Extract Method                   |

---

## 3. Reflexión sobre la Práctica de Refactorización

### ¿Cómo has aplicado en la práctica tus conocimientos sobre defectos de diseño?

Durante el desarrollo, identifiqué varios *code smells* que afectaban la claridad y mantenibilidad del código:

- **Long Method**: El método `statement()` era demasiado extenso. Apliqué *Extract Method* para dividirlo en fragmentos más comprensibles.
- **Feature Envy**: La clase `Customer` accedía constantemente a datos de `Rental` y `Movie`. Utilicé *Move Method* para reubicar la lógica en las clases correspondientes.
- **Switch Statement**: Existía un `switch` basado en el tipo de película, lo cual reemplacé por polimorfismo usando el patrón *State/Strategy*.
- **Duplicate Code**: Al introducir nuevos formatos como HTML, utilicé el patrón *Template Method* para evitar duplicaciones.

### ¿Cómo has utilizado en la práctica tus conocimientos sobre métricas de calidad de código?

Para medir y mejorar la calidad del código, me enfoqué en:

- **Complejidad Ciclomática**: Logré reducirla significativamente en métodos críticos, especialmente en `statement()`, que pasó de una complejidad de 7 a 2.
- **Acoplamiento**: Se disminuyó el acoplamiento entre clases utilizando interfaces y clases abstractas como `Price`.
- **Cohesión**: Aumentó la cohesión de las clases al mover los métodos a donde tenían más sentido.
- **Tamaño de los métodos**: Todos los métodos resultantes tienen menos de 10 líneas, mejorando su legibilidad.

### ¿Cómo ha influido la cobertura de pruebas en el proceso de refactorización?

- Mantuve las pruebas originales en funcionamiento tras cada paso de refactorización. Y añadi un test al añadir el codigo Html 
- No fue necesario adoptar un enfoque TDD estricto, ya que las pruebas previas sirvieron como una red de seguridad eficaz.
- Cada refactorización fue validada de inmediato ejecutando los tests, asegurando que no se introdujeran errores.
- La cobertura se mantuvo consistentemente por encima del 80%. Mas exactamente de un 84%

### ¿Es posible automatizar completamente el proceso de refactorización con herramientas?

Aunque herramientas como Eclipse, IntelliJ o VSCode ofrecen gran apoyo para refactorizaciones básicas (*Extract Method*, *Rename*, *Move Method*...), el juicio humano sigue siendo fundamental para:

- Determinar qué parte del código requiere refactorización
- Elegir el patrón de diseño más apropiado
- Decidir si la refactorización mejora realmente la estructura

Por tanto, las herramientas automatizan tareas repetitivas, pero el análisis y la toma de decisiones estratégicas son insustituibles.

### ¿Qué relación observas entre refactorización y sistemas de control de versiones y tareas?

El uso de Git ha sido esencial durante esta práctica. Gracias al control de versiones:

- Pude hacer *commits* atómicos y descriptivos para cada cambio estructural
- Fue sencillo deshacer errores mediante `git revert`
- El historial proporciona una trazabilidad clara de las decisiones de diseño

En combinación con sistemas de control de tareas (como issues en GitHub), cada refactorización podría asociarse a una mejora específica, lo que facilita la gestión del progreso y la colaboración en equipo.

---

Este enfoque metódico me permitió aplicar refactorizaciones con seguridad y claridad, mejorando significativamente la calidad del diseño original del código.
