public class Table{
    private static double x = 50;
    private static double y = 85;
    private static double w = 1100;
    private static double h = 35; //width of the bars
    
    public static Rectangle theGreen(){
        String colour = "#00942C";
        int layer = 0;
        Rectangle theGreen = new Rectangle(x, y, w, w/2, colour, layer);
        return theGreen;
    }

    public static Rectangle[] theBorders(){
        Rectangle[] borders = new Rectangle[4];
        String colour = "#7C1A1A";
        int layer = 2;
        borders[0] = new Rectangle(x, y, w, h, colour, layer);
        borders[1] = new Rectangle(x, y + w/2, w, h, colour, layer);
        borders[2] = new Rectangle(x-h, y, h, w/2+h, colour, layer);
        borders[3] = new Rectangle(w+h, y, h, w/2+h, colour, layer);
        return borders;
    }

    public static Ball[] thePockets(){
        Ball[] pockets = new Ball[6];
        double d = 50; // diameter
        String colour = "#000000";
        int layer = 1;
        pockets[0] = new Ball(x, y+h, d, colour, layer);
        pockets[1] = new Ball(x+(w/2), y+h, d/1.5, colour, layer);
        pockets[2] = new Ball(w+h, y+h, d, colour, layer);
        pockets[3] = new Ball(x, y+(w/2), d, colour, layer);
        pockets[4] = new Ball(x+(w/2), y+(w/2), d/1.5, colour, layer);
        pockets[5] = new Ball(w+h, y+(w/2), d, colour, layer);
        return pockets;
    }
    public static Line theLine(){
        double thic = 2;
        String colour = "WHITE";
        int layer = 1;
        return new Line(w/5, y+h, w/5, y+(w/2), thic, colour, layer);
    }
}