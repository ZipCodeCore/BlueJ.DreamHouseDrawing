
/**
 * This class represents a simple picture. You can draw the picture using
 * the draw method. But wait, there's more: being an electronic picture, it
 * can be changed. You can set it to black-and-white display and back to
 * colors (only after it's been drawn, of course).
 *
 * This class was written as an early example for teaching Java with BlueJ.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 1.1  (24 May 2001)
 */
public class Picture
{
    private Square wall;
    private Square wall2;
    private Square line;
    private Triangle line2;
    private Triangle shader;
    private Square window;
    private Square window2;
    private Square door;
    private Square door2;
    private Triangle roof;
    private Triangle roof2;
    private Circle moon;
    private Circle shader2;
    private Square background;
    private Square background2;
    private Square ground;
    private Triangle tree;

    /**
     * Constructor for objects of class Picture
     */
    public Picture()
    {
        // nothing to do... instance variables are automatically set to null
    }

    /**
     * Draw this picture.
     */
    public void draw()
    {
        background = new Square();
        background.changeColor("black");
        background.moveVertical(-50);
        background.moveHorizontal(-60);
        background.changeSize(300);
        background.makeVisible();
        
        ground = new Square();
        ground.changeColor("green");
        ground.moveVertical(125);
        ground.moveHorizontal(-60);
        ground.changeSize(300);
        ground.makeVisible();
        
        roof2 = new Triangle();
        roof2.changeColor("yellow");
        roof2.changeSize(50, 230);
        roof2.moveHorizontal(35);
        roof2.moveVertical(55);
        roof2.makeVisible();
        
        background2 = new Square();
        background2.changeColor("black");
        background2.moveVertical(0);
        background2.moveHorizontal(-74);
        background2.changeSize(100);
        background2.makeVisible();
        
        
        wall2 = new Square();
        wall2.moveVertical(70);
        wall2.moveHorizontal(10);
        wall2.changeSize(120);
        wall2.makeVisible();
        
        shader = new Triangle();
        shader.changeColor("green");
        shader.changeSize(50, 170);
        shader.moveHorizontal(160);
        shader.moveVertical(190);
        shader.makeVisible();
        
        
        line = new Square();        
        line.changeColor("black");
        line.moveVertical(70);
        line.moveHorizontal(-29);
        line.changeSize(120);
        line.makeVisible();
        
        wall = new Square();
        wall.moveVertical(70);
        wall.moveHorizontal(-30);
        wall.changeSize(120);
        wall.makeVisible();
        
        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(-20);
        window.moveVertical(90);
        window.makeVisible();
        
        window2 = new Square();
        window2.changeColor("white");
        window2.moveHorizontal(40);
        window2.moveVertical(90);
        window2.makeVisible();
       
        
        door = new Square();
        door.changeColor("black");
        door.moveHorizontal(15);
        door.moveVertical(155);
        door.changeSize(20);
        door.makeVisible();
        
        door2 = new Square();
        door2.changeColor("black");
        door2.moveHorizontal(15);
        door2.moveVertical(170);
        door2.changeSize(20);
        door2.makeVisible();
        
        
        line2 = new Triangle();
        line2.changeColor("black");
        line2.changeSize(50, 140);
        line2.moveHorizontal(36);
        line2.moveVertical(55);
        line2.makeVisible();


        roof = new Triangle();
        roof.changeColor("yellow");
        roof.changeSize(50, 140);
        roof.moveHorizontal(35);
        roof.moveVertical(55);
        roof.makeVisible();
        
        
        moon = new Circle();
        moon.changeColor("white");
        moon.moveHorizontal(200);
        moon.moveVertical(-50);
        moon.changeSize(30);
        moon.makeVisible();
        
        shader2 = new Circle();
        shader2.changeColor("black");
        shader2.moveHorizontal(210);
        shader2.moveVertical(-55);
        shader2.changeSize(30);
        shader2.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("green");
        tree.changeSize(90, 20);
        tree.moveHorizontal(180);
        tree.moveVertical(80);
        tree.makeVisible();
        
        
        
        
        
        
        
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            moon.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(wall != null)   // only if it's painted already...
        {
            wall.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            moon.changeColor("yellow");
        }
    }

}
