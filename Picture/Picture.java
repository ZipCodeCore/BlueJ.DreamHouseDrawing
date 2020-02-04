
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
    private Square garage;
    private Square garageDoor;
    private Square door;
    private Square frontDoor;
    private Square window;
    private Square window1;
    private Square window2;
    private Square grass;
    private Triangle roof;
    private Triangle garageRoof;
    private Triangle tree;
    private Triangle tree1;
    private Circle sun;
    private Circle doorKnob;
    private Circle bush;
    private Circle bush1;

    
    
    
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
    house.changeColor("blue");
    house.moveVertical(50);
    house.moveHorizontal(-5);
    house.changeSize(130);
    house.makeVisible();
    
    
    
    garage = new Square(); 
    garage.changeColor("blue");
    garage.moveVertical(90);
    garage.moveHorizontal(80);
    garage.changeSize(120);
    garage.makeVisible();
    
    
    garageDoor = new Square(); 
    garageDoor.changeColor("black");
    garageDoor.moveVertical(100);
    garageDoor.moveHorizontal(120);
    garageDoor.changeSize(70);
    garageDoor.makeVisible();
    
    
   
    door = new Square(); 
    door.changeColor("black");
    door.moveVertical(140);
    door.moveHorizontal(35);
    door.makeVisible();
    
    frontDoor = new Square(); 
    frontDoor.changeColor("black");
    frontDoor.moveVertical(130);
    frontDoor.moveHorizontal(35);
    frontDoor.makeVisible();
    
    
    
    window = new Square(); 
    window.changeColor("black");
    window.moveVertical(60);
    window.moveHorizontal(0);
    window.makeVisible();
    
    
    
    window1 = new Square(); 
    window1.changeColor("black");
    window1.moveVertical(60);
    window1.moveHorizontal(40);
    window1.makeVisible();
    
    
    
    window2 = new Square(); 
    window2.changeColor("black");
    window2.moveVertical(60);
    window2.moveHorizontal(90);
    window2.makeVisible();
    
    
    
    grass = new Square(); 
    grass.changeColor("green");
    grass.moveVertical(170);
    grass.moveHorizontal(-60);
    grass.changeSize(300);
    grass.makeVisible();
    
    
    
    roof = new Triangle(); 
    roof.changeColor("red");
    roof.moveVertical(5);
    roof.moveHorizontal(70);
    roof.changeSize(80,130);
    roof.makeVisible();
    
    
    
    garageRoof = new Triangle(); 
    garageRoof.changeColor("red");
    garageRoof.moveVertical(65);
    garageRoof.moveHorizontal(170);
    garageRoof.changeSize(60,80);
    garageRoof.makeVisible();
    
    
    
    tree = new Triangle(); 
    tree.changeColor("green");
    tree.moveVertical(80);
    tree.moveHorizontal(-20);
    tree.changeSize(130,30);
    tree.makeVisible();
    
    
    
    tree1 = new Triangle(); 
    tree1.changeColor("green");
    tree1.moveVertical(80);
    tree1.moveHorizontal(230);
    tree1.changeSize(130,30);
    tree1.makeVisible();
    
    
    
    sun = new Circle(); 
    sun.changeColor("yellow");
    sun.moveVertical(-60);
    sun.moveHorizontal(-20);
    sun.changeSize(80);
    sun.makeVisible();
    
    
    
    
    doorKnob = new Circle(); 
    doorKnob.changeColor("magenta");
    doorKnob.moveVertical(140);
    doorKnob.moveHorizontal(98);
    doorKnob.changeSize(5);
    doorKnob.makeVisible();
    
    
    
    bush = new Circle(); 
    bush.changeColor("green");
    bush.moveVertical(140);
    bush.moveHorizontal(40);
    bush.changeSize(30);
    bush.makeVisible();
    
    
    bush1 = new Circle(); 
    bush1.changeColor("green");
    bush1.moveVertical(140);
    bush1.moveHorizontal(115);
    bush1.changeSize(30);
    bush1.makeVisible();
        
        
        

        
    }

  

    

}
