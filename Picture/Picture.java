
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
    private Square house;
    private Square window;
    private Triangle roof;
    private Square ground;
    private Triangle tree;
    private Triangle tree1;
    private Triangle tree2;

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
        house = new Square();
        house.moveHorizontal(20);
        house.changeSize(200);
        house.makeVisible();
        house.changeColor("red");

        window = new Square();
        window.changeColor("white");
        window.moveHorizontal(50);
        window.moveVertical(100);
        window.makeVisible();
        window.changeSize(30);
        

        roof = new Triangle();
        roof.changeSize(20, 200);
        roof.moveHorizontal(135);
        roof.moveVertical(15);
        roof.makeVisible();
        roof.changeColor("yellow");

        ground = new Square();
        ground.changeColor("green");
        ground.moveHorizontal(-200);
        ground.moveVertical(200);
        ground.changeSize(1000);
        ground.makeVisible();
        
        tree = new Triangle();
        tree.changeColor("blue");
        tree.changeSize(150,50);
        tree.moveVertical(100);
        tree.makeVisible();
        
        tree2 = new Triangle();
        tree2.changeColor("blue");
        tree2.changeSize(150,50);
        tree2.moveVertical(50);
        tree2.makeVisible();
        
        tree1 = new Triangle();
        tree1.changeColor("blue");
        tree1.changeSize(150,50);
        tree1.moveVertical(0);
        tree1.makeVisible();
    }

    /**
     * Change this picture to black/white display
     */
    public void setBlackAndWhite()
    {
        if(house != null)   // only if it's painted already...
        {
            house.changeColor("black");
            window.changeColor("white");
            roof.changeColor("black");
            tree.changeColor("black");
        }
    }

    /**
     * Change this picture to use color display
     */
    public void setColor()
    {
        if(house != null)   // only if it's painted already...
        {
            house.changeColor("red");
            window.changeColor("black");
            roof.changeColor("green");
            tree.changeColor("yellow");
        }
    }

}
