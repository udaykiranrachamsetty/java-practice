package inheritance;

public class BoxWeight extends Box{
    float weight;
    BoxWeight(int h , int w , int l , float weight){
        super(h,w,l);
        this.weight = weight;
    }

    void greetings(){
        System.out.println("hello child");
    }

}
