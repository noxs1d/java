
# Meet an Agent

The purpose of this exercise is to familiarize you with simple conditional statements.

Estimated workload of this exercise is _20 min_.

### Description
Please, proceed to [MeetAnAgent](src/main/java/com/epam/rd/autotasks/meetanagent/MeetAnAgent.java) class
and write a program that:
- asks for an input number,
- if the input equals to the secret password number, prints "Hello, Agent",
- otherwise, prints "Access denied".

Secret password is stored in `final static int PASSWORD`.

### Example

---
Input: `133976`

Output: `Hello, Agent`

---
Input: `711`

Output: `Access denied`

---

# Meet Strangers

The purpose of this exercise is to train you in usage of simple cycles and conditional statements.

Estimated workload of this exercise is _20 min_.

### Description

Please, proceed to [HelloStrangers](src/main/java/com/epam/rd/autotasks/meetstrangers/HelloStrangers.java) class
and write a program that:
- asks for a number - amount of strangers to meet,
- then reads stranger names line by line 
- and, finally, prints line by line "Hello, _stranger name_" for each stranger.

It is guaranteed that the input is not null.
It is guaranteed that the input of strangers count is int number.

Consider special cases: 
- If strangers count is zero, then program must print "Oh, it looks like there is no one here".
- If strangers count is negative, then program must print "Seriously? Why so negative?".

*Hint*: In case you use the Scanner class, it might be helpful sure to check strings it reads be non-empty.

### Examples

---
Input: 
```
3
Athos
Porthos
Aramis
```

Output:
```
Hello, Athos
Hello, Porthos
Hello, Aramis
```

---
Input:
```
0
```

Output:
```
Oh, it looks like there is no one here
```

---
Input:
```
-3
```

Output:
```
Seriously? Why so negative?
```

---

# Snail
The purpose of this exercise is to train you in usage of simple integer operations.

Estimated workload of this exercise is _30 min_.

### Description
Consider a snail travels up a tree `a` feet each day. Then snail slides down `b` feet each night. Height of the tree is `h` feet.

Please, proceed to [Snail](/src/main/java/com/epam/rd/autotasks/snail/Snail.java) class 
and write a program that prints number of days for the snail to reach the top of the tree.

Program reads `a`, `b`, `h` line by line. Input values are guaranteed to be positive integers.

If the snail cannot reach the top of the tree, print the message `Impossible`.

### Examples

---
Input:
```
4
2
14
```

Output:
```
6
```

---
Input:
```
4
3
10
```

Output:
```
7
```

---
Input:
```
4
4
10
```

Output:
```
Impossible
```

---
Input:
```
4
4
1
```

Output:
```
1
```

---

# Go dutch

The purpose of this exercise is to familiarize you with basic conditional and cyclic operations.

Estimated workload of this exercise is _20 minutes_.

### Description

Consider a company of friends visiting a restaurant.
They decided to equally split the bill.

Friends decided to add 10 percent of the bill total amount as tips.
Then they cover the total payment in equal parts.

Please, proceed to [GoDutch](./src/main/java/com/epam/rd/autotasks/godutch/GoDutch.java) class
and write a program that reads a bill total amount and a number of friends, and then prints part to pay.

Consider some details:
- Program must read data from System.in
- Bill total amount cannot be negative. If input value is negative, the program stops, printing: `Bill total amount cannot be negative`
- Number of friends cannot be negative or zero. If input value is, then the program stops, printing: `Number of friends cannot be negative or zero`
- Bill total amount, number of friends and part to pay are integers

### Example

Input:
```
1000  
5
```
Output:
```
220
```
# Find the maximum integer in a sequence

The purpose of this exercise is to train you to use simple loops and conditional statements.

Estimated workload of this exercise is _20 min_.

### Description

Please, proceed to [FindMaxInSeq](src/main/java/com/epam/rd/autotasks/sequence/FindMaxInSeq.java)
and write a program that reads a sequence of integer values from standard output and finds the maximum value. You must
place your solution into the `max`  method to pass tests.

Details:

- You must read sequence values until the next one is `0`. Zero value means end of the input sequence.
- The sequence is guaranteed to contain at least one value.

### Example

Input:

```
2 4 6 9 2 4 5 0
```

Output:

```
9
```

# Average

The purpose of this exercise is to train you to use simple loops and conditional statements.

Estimated workload of this exercise is _20 min_.

### Description

Please, proceed to [Average](src/main/java/com/epam/rd/autotasks/Average.java) class
and write a program that reads a sequence of integer values from standard input and finds the average value.

Details:

- You must read sequence values until the next one is `0`. Zero value means end of the input sequence.
- The sequence is guaranteed to contain at least one value.
- Average value is also an **integer**. Use **integer** operations.

### Examples

---
Input: `1 2 3 4 5 0`

Output: `3`

---
Input: `1 2 3 4 6 0`

Output: `3`

---
Input: `1 2 3 4 0 `

Output: `2`

---
Input: `1 1 9 0`

Output: `3`

---

# Pizza Split

The purpose of this exercise is to familiarize you with basic conditional and cyclic operations.

Estimated workload of this exercise is _20 minutes_.

### Description
Please, proceed to [PizzaSplit](src/main/java/com/epam/rd/autotasks/pizzasplit/PizzaSplit.java) class.
The program must read two values from `System.in`:
- number of people;
- number of pieces per pizza.

It is guaranteed that this values are positive integers.

Then the program must print the minimum number of pizzas (not zero) so that everyone has an equal number of slices and no slice is left.

### Example

---
Input: `12 8`

Output: `3`

---

# Quadratic Equation

The purpose of this exercise is to train you to design programs that need decision trees. 

Estimated workload of this exercise is _30 min_.

### Description

Please, proceed to the [QuadraticEquation](src/main/java/com/epam/rd/autotasks/QuadraticEquation.java)
class and implement a program to solve quadratic equations.

For the given quadratic equation coefficients (**ax<sup>2</sup> + bx + c = 0**),
return one or two roots of the equation if there is any in the set of real numbers.

Input value is given via `System.in`. Output value must be printed to `System.out`.

Output format is:
* *"x<sub>1</sub> x<sub>2</sub>"* (two roots in any order separated by space) if there are two roots,
* *"x"* (just the value of the root) if there is the only root,
* *"no roots"* (just a string value "no roots") if there is no root.

The `a` parameter is guaranteed to be not zero.

Hint: [Quadratic formula reference](https://en.wikipedia.org/wiki/Quadratic_formula)

### Examples

---
Input: `1 -2 1`

Output: `1`

---
Input: `2 5 -3`

Output: `-3 0.5`

---
Input: `2 2 2`

Output: `no roots`

---
