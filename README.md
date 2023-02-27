: GroceryItem.java :
+ added -> line 17: GRAPEFRUIT('G', 0.50, "GrapeFruit"),//The new one 
+ modified line 27: public final char match; //Before it was String
This modification is probably a better way, instead of String I decide to use char for item product.
+ Modified other lines eg, 44 to get String.valueOf when char is find it.

: ShoppingCart.java :
+eg, line 46 added String.valueOf for getting the String representation of a char
+ lines 65, 66 instead of int I decide to have a double variable for better precision in the cart.

: Discount.java :
Lines 25, 39 the app return double instead of int. this was a decision for getting a better precision 
Lines 18,19
        //Apple, Orange, Banana, Grapefruit to 1.25
        new Discount( 1.25, GRAPEFRUIT, APPLE, ORANGE, BANANA),
I used the new discount directly get the price of 1.25 and it's the first one to execute so, when the cart is filled with that products there it goes for 1.25 

: ShoppingCartMain.java :
+ line 46: double totalPrice instead of int totalPrice
+line 47: Instead of divide everytime by 100, I decide to have a double variable. and replace the line: 
System.out.format("Price : %.02f", totalPrice); //* It was divided by 100 every time it calculates the result




