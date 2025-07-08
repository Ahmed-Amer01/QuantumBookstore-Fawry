# 📚 Quantum Book Store
It is an online book store with the following: 

● It has 3 types of books

      ○ Paper book which have stock and may be shipped.
      
      ○ EBook which have a filetype and may be sent via email.
      
      ○ Showcase/Demo book which is not for sale.


  
   
● It has the following functions: 

      ○ Add a book to the inventory with some details like ISBN(just any string identifier), title, year when the book is published, price 
      
      ○ Remove and return outdated books that passed specific number of years 
      
      ○ Buy a single book providing its ISBN, quantity, email, address
      
      ○ Reduces the quantity of the book from the inventory, throw error if not available 
      
      ○ Return the paid amount. 
      
      ○ Send Paper book to the ShippingService with the address provided (no implementation required) 
      
      ○ Send EBook to MailService with the email provided (no implementation required) add field author name to the book 

Book Types:
---------------------------------------------
| Type       | Sellable | Shippable | Stock |
|------------|----------|-----------|-------|
| PaperBook  | ✅       | ✅       | ✅     |
| EBook      | ✅       | ❌       | ❌     |
| DemoBook   | ❌       | ❌       | ❌     |
---------------------------------------------

![Screenshot](https://github.com/user-attachments/assets/bf385242-8de9-4b67-8877-a93520e3c964)
