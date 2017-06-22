A type conversion is a conversion of one data type to another, such as an int to a double. The compiler automatically performs several common conversions between int and double types, such automatic conversion known as implicit conversion.

For an arithmetic operator like + or *, if either operand is a double, the other is automatically converted to double, and then a floating-point operation is performed.
For assignment =, the right side type is converted to the left side type.
int-to-double conversion is straightforward: 25 becomes 25.0.

double-to-int conversion just drops the fraction: 4.9 becomes 4.

A common error is to accidentally perform integer division when floating-point division was intended.

A programmer can precede an expression with (type)expression to convert the expression's value to the indicated type. For example, if myIntVar is 7, then (double)myIntVar converts int 7 to double 7.0.
Such explicit conversion by the programmer of one type to another is known as type casting.

A common error is to cast the entire result of integer division, rather than the operands, thus not obtaining the desired floating-point division. For example, (double)((5 + 10) / 2) yields 7.0 (integer division yields 7, then converted to 7.0) rather than 7.5.

(double)10/(double)4 = 2.5 vs (double)(10/4) = 2.0