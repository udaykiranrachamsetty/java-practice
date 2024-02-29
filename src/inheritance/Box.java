package inheritance;

public class Box {
    int height ;
    int width;
    int length;
    Box(int h,int w,int l){
        this.height = h;
        this.width = w;
        this.length = l;
    }
    void greetings(){
        System.out.println("hello");
    }
}
