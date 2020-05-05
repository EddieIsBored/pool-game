
public class Driver {
    public static void main(String[] args){
        
        int i;
        int window_width = 1280;
        int window_height = 720;

        GameArena window = new GameArena(window_width, window_height, true);

        window.addRectangle(Table.theGreen());
        for(i=0; i<4; i++){
            window.addRectangle(Table.theBorders()[i]);
        }
        for(i=0; i<6; i++){
            window.addBall(Table.thePockets()[i]);
        }
        window.addLine(Table.theLine());
    }
}