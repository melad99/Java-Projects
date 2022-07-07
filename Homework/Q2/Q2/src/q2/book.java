
package q2;

public class book {
    private String name;
  private author author;
   private double price;
   private int qty=0;
      public book( String name, author author,double price) {     
          this.name=name;
          this.author=author;
          this.price=price;
            
      }
      public book(String name, author author,double price ,int qty){
             this.name=name;
          this.author=author;
          this.price=price;
          this.qty=qty;
      }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public author getAuthor() {
        return author;
    } 
}
