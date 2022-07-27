# Паттерн адаптер


### Определение:
Адаптер — структурный шаблон проектирования,
предназначенный для организации использования функций объекта,
недоступного для модификации, через специально созданный интерфейс.


### Проблема:
У нас есть конкретный объект и нужно,
добавить ему функционал для имеющейся реализации,
при этом объект менять нельзя.


### Решение:
Создать адаптер, который наследует необходимую реализацию.
Исходный объект является полем адаптера,
чтобы конвертировать данные объекта в подходящие для реализации.


### Пример в коде:
Есть 3 типа колышков 
[_RoundPeg_](./PatternAdapter/src/round/RoundPeg.java),
[_SquarePeg_](./PatternAdapter/src/square/SquarePeg.java) и
[_TrianglePeg_](./PatternAdapter/src/triangle/TrianglePeg.java).
Каждый может помещаться только в свой тип отверстий (
[_RoundHole_](./PatternAdapter/src/round/RoundHole.java),
[_SquareHole_](./PatternAdapter/src/square/SquareHole.java) и
[_TriangleHole_](./PatternAdapter/src/triangle/TriangleHole.java))
т.к. каждая фигура имеет свой параметр (радиус круга, ширина квадрата и высота треугольника).

Допустим, мы хотим поместить круглый колышек в другие типы отверстий.
Для этого создадим 
[_RoundToSquarePegAdapter_](./PatternAdapter/src/adapter/RoundToSquarePegAdapter.java) и
[_RoundToTrianglePegAdapter_](./PatternAdapter/src/adapter/RoundToTrianglePegAdapter.java).
оба адаптера наследуют функционал от соответствующих классов (
[_SquarePeg_](./PatternAdapter/src/square/SquarePeg.java) и
[_TrianglePeg_](./PatternAdapter/src/triangle/TrianglePeg.java)).
Таким образом, в [_Main_](./PatternAdapter/src/Main.java) мы получаем вохможность передавать адаптеры в методы 
squareHole.fits(roundToSquarePegAdapter) и triangleHole.fits(roundToTrianglePegAdapter).