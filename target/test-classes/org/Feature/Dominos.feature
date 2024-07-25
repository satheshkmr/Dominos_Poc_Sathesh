
   Feature: Food order from Dominos
    
    @sc1
    
 Scenario: Order food
 
     Given the user launch Dominos url
     When  the user click order online now button
     And the user click delivery radio button
     And the user enter the Area/locality in the locate me field
     And the user click VEG PIZZA in the top of the margin menu
     And the user click Margherita pizza add to cart click two Qty
     And the user click Peppy Paneer pizza add to cart click two Qty
     And the user click Primavera Gourmet-Pizza add to cart click two Qty
     And the user click BEVERAGES in the top of the margin menu
     And the user click Pepsi 475ml add to cart click twelve Qty
     When the user remove  one qty Margherita from the cart
     And the user remove six qty 475ml from the cart
     And the user verify the cart click the checkout button
     And the user view the place order page and subtotal price
     Then the user verify the address and price details click place order button
     
     
     
