public class Vechile {
   private String colour;

   public String get(){
       return colour;
   }
   public void setColour(String colou){
       this.colour=colou;
   }
    int maxspd;
    public void print(){
        System.out.println("Colour :"+ colour + " Maximum speed:"+maxspd);
    }
}
