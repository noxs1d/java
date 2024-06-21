# Line Intersection

The purpose of this exercise is to train you to work with classes and methods.

Estimated workload of this exercise is _45 min_.

### Description

Please, implement the method `intersection(Line)` in class [`Line`](intersection/Line.java).
It  must return a [`Point`](intersection/Point.java) of intersection of two lines.

Note that lines are defined by linear equations: `y = k * x + b`.
Line constructor takes `k` and `b` coefficients as parameters.

If lines coincide or do not intersect, the method must return null.
It may seem surprising that we use `int` for arguments and fields of coordinates.
The point is that using `double` will bring some extra complexity we want to avoid for this basic exercise.
All tests are selected in to induce calculations without remainders.

You may check your result in class [`Main`](intersection/Main.java).

### Example

```java
public class Main {
    public static void main(String[] args) {
        Line line1 = new Line(1,1);
        Line line2 = new Line(-1,3);

        System.out.println(line1.intersection(line2)); // (1;2)
    }
}
```




# Segments

The purpose of this exercise is to train you to work with classes and methods.

Estimated workload of this exercise is _45 min_.

### Description
Please, implement the following methods of class [`Segment`](segment/Segment.java): 

* constructor with start and end points as parameters\
  Ensure that a created segment exists and is not degenerative 
  which means that the start and the end of the segment is not the same point.\
  If it is, use `throw new IllegalArgumentException()` to raise an error.
* `double length()`\
  Return length of the segment.
* `Point middle()`\
  Return a middle point of the segment.
* `Point intersection(Segment another)`\
  Return a point of the intersection of the current segment and the given one.\
  Return `null` if there is no such point.\
  Return `null` if segments are collinear.\
  Please, note that intersection point must lay on both segments.

Class [`Point`](segment/Point.java) is already there.

Hints:
* [Length reference](https://www.wikihow.com/Use-Distance-Formula-to-Find-the-Length-of-a-Line)
* [Midpoint reference](https://www.wikihow.com/Find-the-Midpoint-of-a-Line-Segment#Use-the-Midpoint-Formula)
* [Intersection reference](https://en.wikipedia.org/wiki/Line–line_intersection)
 
### Examples
You may use [Main](segment/Main.java) class to try your code.
There are some examples below.

---
Sample code:
```java
...
double length = new Segment(new Point(0, 0), new Point(3, 4)).length();
System.out.println(length);

```

Output: `5`

---
Sample code:
```java
...
Segment first = new Segment(new Point(0, 0), new Point(4, 4));
Segment second = new Segment(new Point(2, 0), new Point(0, 2));
Point intersection = first.intersection(second);

System.out.println(intersection.getX());
System.out.println(intersection.getY());

```

Output:

```
1
1
```
---
Sample code:
```java
...
Segment segment = new Segment(new Point(2, 0), new Point(0, 2));
Point midpoint = segment.middle();

System.out.println(midpoint.getX());
System.out.println(midpoint.getY());

```

Output:

```
1
1
```

---
Sample code:
```java
...
Segment first = new Segment(new Point(0, 0), new Point(4, 0));
Segment second = new Segment(new Point(2, 1), new Point(1, 2));
Point intersection = first.intersection(second);

System.out.println(intersection == null);

```

Output:

```
true
```

---



# Triangle

The purpose of this exercise is to train you to work with classes and methods.

Estimated workload of this exercise is _45 min_.

### Description

Please, implement methods of class [`Triangle`](triangle/Triangle.java):

* constructor, which has three points as parameters.\
  Consider these points as vertices of the triangle.\
  Ensure that the created triangle exists and it is not degenerative.\
  If it is, use `throw new IllegalArgumentException()` to raise an error.
* `double area()`\
  Return the area of the triangle.
* `Point centroid()`\
  Return the centroid of the triangle.

Class [`Point`](src/main/java/com/epam/rd/autotasks/triangle/Point.java) is already there.

Hints:
* [Triangle existence reference](https://en.wikipedia.org/wiki/Triangle#Existence_of_a_triangle)
* [Triangle area reference](https://en.wikipedia.org/wiki/Triangle#Computing_the_area_of_a_triangle)
* [Centroid reference](https://en.wikipedia.org/wiki/Centroid)

Please note that you may benefit from introducing more classes.
 
## Examples
You may use [Main](src/test/java/com/epam/rd/autotasks/triangle/Main.java) class to try your code.
There are some examples below.
---
Sample code:
```java
...
new Triangle(new Point(0,0), new Point(1, 0), new Point(2, 0));
```

Result: Exception because such a triangle would be degenerative.

---
Sample code:
```java
...
double area = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 4)).area();
System.out.println(area);
```

Output:

```
6
```

---
Sample code:
```java
...
Point centroid = new Triangle(new Point(0,0), new Point(3, 0), new Point(0, 3)).centroid();

System.out.println(centroid.getX());
System.out.println(centroid.getY());
```

Output:

```
1
1
```

