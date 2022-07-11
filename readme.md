## Tasks:
#### 1) Integer type casting.
Create long variable with "first" name and "1000" value. Assign to the variable another var, int, with "second" name. Print both. Implement task in the given code snippet:


      public class IntegerTypeCasting {
          public static void main(String[] args) {
          }
      }



#### 2) Float type casting.
You will be given a float number, and your task will be to find a correct way to round this
variable to integer variable, corresponding to Math rules (requires googling). Print that variable to console. Implement
program inside a code snippet given below:


        public class FloatTypeCasting {
            public void roundNumber(float numberToBeRounded) {
            }
        }

where float numberToBeRounded - is the variable which needs to be rounded.


#### 3) PrePost increments.
You will be given a code snippet, and you task will be to get expected result by inserting correct
pre/post increment oprators to specified variables. Implement the task in the following code snippet:

        public class PrePostIncrement {
            public static void main(String[] args) {
                int a = 5;
                int b = 7;
                int c = 12;
                int d = 15;
    
                // use post-increment operator in the mathematical expression
                int x =   a   + b +   c   + d;
                System.out.println("Expected x is 40, x = " + x);
                // print the updated value of a, b, c, and d
                System.out.println("The updated value of a = " + a + ", b = " + b + ", c = " + c + " and d = " + d);
            }
        }

Expected results: x is expected to be 40, the rest but b and d to be incremented.


#### 4) Operator precedence.
Introduce changes (add brackets) to code snippets below to get expected results (for **System.out.println(firstBool && secondBool || thirdBool && fourthBool || (varSix = 5) < 0);** only adding brackets is allowed):


        public class OperatorPrecedence {
            public static void main(String[] args) {
                int first = 1;
                int second = 2;
                int eight = 3 + first * second;
                System.out.println(eight);//eight is expected to be 8
                boolean firstBool = false;
                boolean secondBool = false;
                boolean thirdBool = 1 == 1;
                boolean fourthBool = 4 <= 101;
                int varSix = 17;

                System.out.println(firstBool && secondBool || thirdBool && fourthBool || (varSix = 5) < 0);
                System.out.println(varSix);
            }
        }

Expected console output:

8

false

5
